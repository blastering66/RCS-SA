package id.tech.htctools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import id.tech.adapters.Rest_Adapter;
import id.tech.htctools.R;
import id.tech.models.PojoProfile;
import id.tech.models.PojoProfileTarget;
import id.tech.models.PojoStockStore;
import id.tech.util.GPSTracker;
import id.tech.util.Parameter_Collections;
import id.tech.util.RecyclerAdapter_MenuUtama;
import id.tech.util.RecyclerAdapter_Slider;
import id.tech.util.RecyclerItemClickListener;
import id.tech.util.RowData_Produk;
import id.tech.util.ServiceHandlerJSON;
import id.tech.util.SimpleDividerItemDecoration;
import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnItemTouchListener;
import android.support.v7.widget.RecyclerView.State;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MenuUtama_WP extends ActionBarActivity {
	RecyclerView rv, rv_slider;
	RecyclerView.Adapter adapter, adapter_slider;
	RecyclerView.LayoutManager layoutManager, layoutManager_slider;
	RecyclerView.ItemDecoration decoration;
	ImageView img_logout;
	private SharedPreferences sp;

	ActionBarDrawerToggle mDrawerToggle;
	DrawerLayout Drawer;
	
	Bundle currentState;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
//		 setContentView(R.layout.activity_menuutama_wp);
		setContentView(R.layout.main);

		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
				.permitAll().build();
		StrictMode.setThreadPolicy(policy);

		ActionBar ac = getSupportActionBar();
		ac.hide();

		sp = getSharedPreferences(Parameter_Collections.SH_NAME,
				Context.MODE_PRIVATE);

		rv_slider = (RecyclerView) findViewById(R.id.slider_content);
		Drawer = (DrawerLayout) findViewById(R.id.drawer_layout);



		if (savedInstanceState == null) {
			currentState = savedInstanceState;
			new AsyncTask_LoadProfile_Retrofit().execute();


			FragmentManager fm = getSupportFragmentManager();
			Fragment fragment = new Fragment_MenuUtama();
			fm.beginTransaction().replace(R.id.frame_container, fragment)
					.commit();

		}

	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		if (currentState == null) {
//			new AsyncTask_LoadProfile().execute();

		}
		new AsyncTask_LoadProfile_Retrofit().execute();

		Drawer.openDrawer(Gravity.START);
	}

	private class AsyncTask_LoadProfile_Retrofit extends AsyncTask<Void, Void, Void> {
		DialogFragmentProgress pDialog;
		String result, cCode, cNama_Pegawai, cUrl_ImgProfilePic, cTarget,
				cAchievement;
		int total_D_300, total_D_616, total_D_816, total_D_C, total_flyer,
				total_O_820D, total_O_M7C, total_O_E8, total_O_M8, total_O_M9,
				total_O_Max, total_O_Mini, total_O_V, total_WP,
				total_WP_8X = 0;

		boolean available_D_300, available_D_616, available_D_816,
				available_D_C, available_flyer, available_O_820D,
				available_O_M7C, available_O_E8, available_O_M8,
				available_O_M9, available_O_Max, available_O_Mini,
				available_O_V, available_WP, available_WP_8X = false;

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			Toast.makeText(getApplicationContext(), "Loading Data", Toast.LENGTH_SHORT).show();
		}

		@Override
		protected Void doInBackground(Void... voids) {
			Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
					.baseUrl(Parameter_Collections.URL_BASE).build();

			Rest_Adapter adapter = retrofit.create(Rest_Adapter.class);
			String id_pegawai = sp.getString(Parameter_Collections.SH_ID_PEGAWAI, "");

			Call<PojoProfile> call = adapter.profile(id_pegawai);
			try{

				Response<PojoProfile> response = call.execute();

				if(response.isSuccess()){
					cCode = response.body().getJsonCode();

					if (cCode.equals("1")) {
						cNama_Pegawai = response.body().getData().getNamaPegawai();

//						String img_no_data = response.body().getData().getImages();
						List<PojoProfile.Image> imgnya= response.body().getData().getImages();

						if(imgnya == null){
							cUrl_ImgProfilePic = "";

						}else{
							cUrl_ImgProfilePic = Parameter_Collections.URL_GAMBAR_THUMB + imgnya.get(0).getNamaImage();
						}


					} else {

					}

				}

				Call<PojoProfileTarget> call_target = adapter.profile_target(id_pegawai, "true");
				Response<PojoProfileTarget> response_target = call_target.execute();
				if(response_target.isSuccess()){
					if(response_target.body().getJsonCode().equals("1")){
						if(response_target.body().getData().size() > 0){
							PojoProfileTarget.Datum datum= response_target.body().getData().get(0);

							cTarget = datum.getJumlahTarget();
							cAchievement = datum.getTotalPenjualan();
						}
					}
				}

				Call<PojoStockStore> call_stock = adapter.cek_stock(sp.getString(
						Parameter_Collections.SH_KODE_TOKO, ""),"false");
				Response<PojoStockStore> stockResponse = call_stock.execute();
				if(stockResponse.isSuccess()){
					if(stockResponse.body().getJsonCode().equals("1")){
						if(stockResponse.body().getData().size()>0){
							for(int i= 0;i < stockResponse.body().getData().size();i++ ){
								String nama_produk = stockResponse.body().getData().get(i).getNamaProduk();
								String status_produk = stockResponse.body().getData().get(i).getStatusProduk();
								if (status_produk.equals("1")) {
									if (nama_produk.contains(Parameter_Collections.TIPE_D_300)) {
										available_D_300 = true;
										total_D_300 += 1;
									} else if (nama_produk.contains(Parameter_Collections.TIPE_D_616)) {
										available_D_616 = true;
										total_D_616 += 1;
									} else if (nama_produk.contains(Parameter_Collections.TIPE_D_816)) {
										available_D_816 = true;
										total_D_816 += 1;
									}else if (nama_produk.contains(Parameter_Collections.TIPE_D_C)) {
										available_D_C = true;
										total_D_C += 1;
									}else if (nama_produk.contains(Parameter_Collections.TIPE_FLYER)) {
										available_flyer = true;
										total_flyer += 1;
									}else if (nama_produk.contains(Parameter_Collections.TIPE_O_820D)) {
										available_O_820D = true;
										total_O_820D += 1;
									}else if (nama_produk.contains(Parameter_Collections.TIPE_O_E8)) {
										available_O_E8 = true;
										total_O_E8 += 1;
									}else if (nama_produk.contains(Parameter_Collections.TIPE_O_M7C)) {
										available_O_M7C = true;
										total_O_M7C += 1;
									}else if (nama_produk.contains(Parameter_Collections.TIPE_O_M8)) {
										available_O_M8 = true;
										total_O_M8 += 1;
									}else if (nama_produk.contains(Parameter_Collections.TIPE_O_M9)) {
										available_O_M9 = true;
										total_O_M9 += 1;
									}else if (nama_produk.contains(Parameter_Collections.TIPE_O_Max)) {
										available_O_Max = true;
										total_O_Max += 1;
									}else if (nama_produk.contains(Parameter_Collections.TIPE_O_Mini)) {
										available_O_Mini = true;
										total_O_Mini += 1;
									}else if (nama_produk.contains(Parameter_Collections.TIPE_WP)) {
										available_WP = true;
										total_WP += 1;
									}else if (nama_produk.contains(Parameter_Collections.TIPE_WP_8X)) {
										available_WP_8X = true;
										total_WP_8X += 1;
									}


								}
							}

						}
					}
				}

				adapter_slider = new RecyclerAdapter_Slider(cNama_Pegawai,
						cTarget, cAchievement, cUrl_ImgProfilePic,
						available_D_300, total_D_300, available_D_616, total_D_616,
						available_D_816, total_D_816, available_D_C, total_D_C,
						available_flyer, total_flyer, available_O_820D, total_O_820D,
						available_O_M7C, total_O_M7C, available_O_E8, total_O_E8,
						available_O_M8, total_O_M8,available_O_M9, total_O_M9,
						available_O_Max, total_O_Max, available_O_Mini, total_O_Mini, available_O_V, total_O_V,
						available_WP, total_WP, available_WP_8X, total_WP_8X);

			}catch (IOException e){

			}


			return null;
		}

		@Override
		protected void onPostExecute(Void aVoid) {
			super.onPostExecute(aVoid);

			if(currentState == null){

				layoutManager_slider = new LinearLayoutManager(getApplicationContext());
				rv_slider.setLayoutManager(layoutManager_slider);
				rv_slider.setAdapter(adapter_slider);
				Drawer.openDrawer(Gravity.START);
			}

		}
	}

	private class AsyncTask_LoadProfile extends AsyncTask<Void, Void, Void> {
		DialogFragmentProgress pDialog;
		String result, cCode, cNama_Pegawai, cUrl_ImgProfilePic, cTarget,
				cAchievement;

		int total_D_300, total_D_616, total_D_816, total_D_C, total_flyer,
				total_O_820D, total_O_M7C, total_O_E8, total_O_M8, total_O_M9,
				total_O_Max, total_O_Mini, total_O_V, total_WP,
				total_WP_8X = 0;

		boolean available_D_300, available_D_616, available_D_816,
				available_D_C, available_flyer, available_O_820D,
				available_O_M7C, available_O_E8, available_O_M8,
				available_O_M9, available_O_Max, available_O_Mini,
				available_O_V, available_WP, available_WP_8X = false;

		@Override
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			super.onPreExecute();
//			pDialog = new DialogFragmentProgress();
//			pDialog.show(getSupportFragmentManager(), "");
			Toast.makeText(getApplicationContext(), "Loading Data", Toast.LENGTH_SHORT).show();
			
		}

		@Override
		protected Void doInBackground(Void... params) {
			// TODO Auto-generated method stub
			try {

				ServiceHandlerJSON sh = new ServiceHandlerJSON();
				JSONObject jObj = sh.json_get_pic_profile(sp.getString(
						Parameter_Collections.SH_ID_PEGAWAI, ""));
				JSONObject jObj_Info = sh.json_get_target_info(sp.getString(
						Parameter_Collections.SH_ID_PEGAWAI, ""));

				cCode = jObj.getString(Parameter_Collections.TAG_JSON_CODE);

				if (cCode.equals("1")) {
					JSONObject jObj_Data = jObj
							.getJSONObject(Parameter_Collections.TAG_DATA);
					cNama_Pegawai = jObj_Data
							.getString(Parameter_Collections.TAG_NAMA_PEGAWAI);

					String img_no_data = jObj_Data.getString(Parameter_Collections.TAG_ARRAY_IMAGES);
					
					if(img_no_data.equals("no data")){
						cUrl_ImgProfilePic = "";
						
					}else{
						JSONArray jArray_Data = jObj_Data
								.getJSONArray(Parameter_Collections.TAG_ARRAY_IMAGES);
						for (int i = 0; i < jArray_Data.length(); i++) {
							JSONObject c = jArray_Data.getJSONObject(i);

							cUrl_ImgProfilePic = Parameter_Collections.URL_GAMBAR_THUMB
									+ c.getString(Parameter_Collections.TAG_NAMA_IMAGE);
						}
					}
					
					
				} else {

				}

				String cCode_Info = jObj_Info
						.getString(Parameter_Collections.TAG_JSON_CODE);
				if (cCode_Info.equals("1")) {
					String cCode_Message = jObj_Info.getString(Parameter_Collections.TAG_DATA);
					if(!cCode_Message.equals("no data")){
						JSONArray jArray_Info = jObj_Info
								.getJSONArray(Parameter_Collections.TAG_DATA);
						for (int i = 0; i < jArray_Info.length(); i++) {
							JSONObject c = jArray_Info.getJSONObject(i);

							cTarget = c.getString(Parameter_Collections.TAG_TARGET);
							cAchievement = c
									.getString(Parameter_Collections.TAG_TOTAL_PENJUALAN);
						}
					}
					
				}

				if (sp.getBoolean(Parameter_Collections.SH_ABSENTED, false)) {
					JSONObject jObj_Stok = sh.json_cek_stok(sp.getString(
							Parameter_Collections.SH_KODE_TOKO, ""));

					Log.e("result cek produk", jObj_Stok.toString());

					cCode = jObj_Stok.getString(Parameter_Collections.TAG_DATA);
					if (!cCode.equals("no data")) {
						JSONArray jArray = jObj_Stok
								.getJSONArray(Parameter_Collections.TAG_DATA);

						// data = new ArrayList<RowData_Produk>();
						// total_stok = jArray.length();
						// total_penjualan = 0;

						for (int i = 0; i < jArray.length(); i++) {
							JSONObject c = jArray.getJSONObject(i);
							String id_produk_toko = c
									.getString(Parameter_Collections.TAG_ID_PRODUK_TOKO);

							String nama_produk = c
									.getString(Parameter_Collections.TAG_NAMA_PRODUK);
							String harga_produk = c
									.getString(Parameter_Collections.TAG_KODE_TOKO);
							String imei_produk = c
									.getString(Parameter_Collections.TAG_IMEI);
							String imei2_produk = c
									.getString(Parameter_Collections.TAG_IMEI2);
							String status_produk = c
									.getString(Parameter_Collections.TAG_STATUS_PRODUK);

							if (status_produk.equals("1")) {
								if (nama_produk.contains(Parameter_Collections.TIPE_D_300)) {
									available_D_300 = true;
									total_D_300 += 1;									
								} else if (nama_produk.contains(Parameter_Collections.TIPE_D_616)) {
									available_D_616 = true;
									total_D_616 += 1;
								} else if (nama_produk.contains(Parameter_Collections.TIPE_D_816)) {
									available_D_816 = true;
									total_D_816 += 1;
								}else if (nama_produk.contains(Parameter_Collections.TIPE_D_C)) {
									available_D_C = true;
									total_D_C += 1;
								}else if (nama_produk.contains(Parameter_Collections.TIPE_FLYER)) {
									available_flyer = true;
									total_flyer += 1;
								}else if (nama_produk.contains(Parameter_Collections.TIPE_O_820D)) {
									available_O_820D = true;
									total_O_820D += 1;
								}else if (nama_produk.contains(Parameter_Collections.TIPE_O_E8)) {
									available_O_E8 = true;
									total_O_E8 += 1;
								}else if (nama_produk.contains(Parameter_Collections.TIPE_O_M7C)) {
									available_O_M7C = true;
									total_O_M7C += 1;
								}else if (nama_produk.contains(Parameter_Collections.TIPE_O_M8)) {
									available_O_M8 = true;
									total_O_M8 += 1;
								}else if (nama_produk.contains(Parameter_Collections.TIPE_O_M9)) {
									available_O_M9 = true;
									total_O_M9 += 1;
								}else if (nama_produk.contains(Parameter_Collections.TIPE_O_Max)) {
									available_O_Max = true;
									total_O_Max += 1;
								}else if (nama_produk.contains(Parameter_Collections.TIPE_O_Mini)) {
									available_O_Mini = true;
									total_O_Mini += 1;
								}else if (nama_produk.contains(Parameter_Collections.TIPE_WP)) {
									available_WP = true;
									total_WP += 1;
								}else if (nama_produk.contains(Parameter_Collections.TIPE_WP_8X)) {
									available_WP_8X = true;
									total_WP_8X += 1;
								}
								
								
							}

							// data.add(new
							// RowData_Produk(id_produk_toko,nama_produk,
							// harga_produk,
							// imei_produk,imei2_produk, status_produk));
						}
					}

				}

				adapter_slider = new RecyclerAdapter_Slider(cNama_Pegawai,
						cTarget, cAchievement, cUrl_ImgProfilePic,
						available_D_300, total_D_300, available_D_616, total_D_616,
						available_D_816, total_D_816, available_D_C, total_D_C,
						available_flyer, total_flyer, available_O_820D, total_O_820D,
						available_O_M7C, total_O_M7C, available_O_E8, total_O_E8,
						available_O_M8, total_O_M8,available_O_M9, total_O_M9,
						available_O_Max, total_O_Max, available_O_Mini, total_O_Mini, available_O_V, total_O_V,
						available_WP, total_WP, available_WP_8X, total_WP_8X);
				
				
				Log.e("", "");
//				else if (nama_produk.contains(Parameter_Collections.TIPE_D_C)) {
//					available_D_C = true;
//					total_D_C += 1;
//				}else if (nama_produk.contains(Parameter_Collections.TIPE_FLYER)) {
//					available_flyer = true;
//					total_flyer += 1;
//				}else if (nama_produk.contains(Parameter_Collections.TIPE_O_820D)) {
//					available_O_820D = true;
//					total_O_820D += 1;
//				}else if (nama_produk.contains(Parameter_Collections.TIPE_O_E8)) {
//					available_O_E8 = true;
//					total_O_E8 += 1;
//				}else if (nama_produk.contains(Parameter_Collections.TIPE_O_M7C)) {
//					available_O_M7C = true;
//					total_O_M7C += 1;
//				}else if (nama_produk.contains(Parameter_Collections.TIPE_O_M8)) {
//					available_O_M8 = true;
//					total_O_M8 += 1;
//				}else if (nama_produk.contains(Parameter_Collections.TIPE_O_M9)) {
//					available_O_M9 = true;
//					total_O_M9 += 1;
//				}else if (nama_produk.contains(Parameter_Collections.TIPE_O_Max)) {
//					available_O_Max = true;
//					total_O_Max += 1;
//				}else if (nama_produk.contains(Parameter_Collections.TIPE_O_Mini)) {
//					available_O_Mini = true;
//					total_O_Mini += 1;
//				}

			} catch (Exception e) {

			}
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
//			pDialog.dismiss();

			FragmentManager fm = getSupportFragmentManager();
			Fragment fragment = new Fragment_MenuUtama();

			fm.beginTransaction().replace(R.id.frame_container, fragment)
					.commit();
			
			
//editted for kalbe


			layoutManager_slider = new LinearLayoutManager(getApplicationContext());
			rv_slider.setLayoutManager(layoutManager_slider);
			rv_slider.setAdapter(adapter_slider);
			Drawer.openDrawer(Gravity.START);
		}
	}

}
