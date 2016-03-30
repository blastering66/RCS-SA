package id.tech.htctools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import id.tech.adapters.Rest_Adapter;
import id.tech.models.PojoAbsensi;
import id.tech.models.PojoHistoryNotif;
import id.tech.models.PojoIssue;
import id.tech.models.PojoUpdatebranding;
import id.tech.util.Parameter_Collections;
import id.tech.util.RowData_History_Absensi;
import id.tech.util.RowData_History_Branding;
import id.tech.util.RowData_History_Issue;
import id.tech.util.RowData_Notif;
import id.tech.util.ServiceHandlerJSON;
import common.view.SlidingTabLayout;
import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HistorySlidingTabsFragment extends Fragment {
	static ArrayList<RowData_History_Absensi> data_Absensi;
	static ArrayList<RowData_History_Branding> data_Branding;
	static ArrayList<RowData_History_Issue> data_Issue;
	static ArrayList<RowData_Notif> data_Notif;
	ServiceHandlerJSON sh;
	SharedPreferences spf;
	String id_pegawai;

	private SlidingTabLayout mSlidingTableLayout;
	private ViewPager mViewPager;
	private List<SamplePagerItem> mTabs = new ArrayList<HistorySlidingTabsFragment.SamplePagerItem>();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		spf = getActivity().getSharedPreferences(Parameter_Collections.SH_NAME,
				Context.MODE_PRIVATE);
		id_pegawai = spf.getString(Parameter_Collections.SH_ID_PEGAWAI, "");
		
		new Async_GetAllHistory().execute();		

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater
				.inflate(R.layout.test_fragment_sample, container, false);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onViewCreated(view, savedInstanceState);
		mViewPager = (ViewPager) view.findViewById(R.id.viewpager);		

		mSlidingTableLayout = (SlidingTabLayout) view
				.findViewById(R.id.sliding_tabs);
		
		
	}

	class SampleFragmentPagerAdapter extends FragmentPagerAdapter {

		public SampleFragmentPagerAdapter(FragmentManager fm) {
			// TODO Auto-generated constructor stub
			super(fm);
		}

		@Override
		public Fragment getItem(int posisi) {
			// TODO Auto-generated method stub
			return mTabs.get(posisi).createFragment(posisi);

		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return mTabs.size();
		}

		@Override
		public CharSequence getPageTitle(int position) {
			// TODO Auto-generated method stub
			return mTabs.get(position).getTitle();
		}
	}

	static class SamplePagerItem {
		private final CharSequence mTitle;

		SamplePagerItem(CharSequence title) {
			mTitle = title;
		}

		Fragment createFragment(int posisi) {
			return ContentFragment.newInstance(mTitle, posisi, data_Absensi,
					data_Branding, data_Issue, data_Notif);
		}

		CharSequence getTitle() {
			return mTitle;
		}

	}

	public class Async_GetAllHistory extends AsyncTask<Void, Void, Void> {
		DialogFragmentProgress pDialog;
		String cCode, cMessage;
		@Override
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			super.onPreExecute();
			data_Absensi = new ArrayList<RowData_History_Absensi>();
			data_Branding = new ArrayList<RowData_History_Branding>();
			data_Issue = new ArrayList<RowData_History_Issue>();
			data_Notif = new ArrayList<RowData_Notif>();
			
			pDialog = new DialogFragmentProgress();
			pDialog.show(getChildFragmentManager(), "");
			
			
		}

		@Override
		protected Void doInBackground(Void... params) {
			// TODO Auto-generated method stub
			try {
				sh = new ServiceHandlerJSON();

				getData_Absensi();
				getData_Branding();
				getData_Issue();
				getData_Notif();
			} catch (Exception e) {

			}
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
			pDialog.dismiss();

			mTabs.add(new SamplePagerItem("History Absen"));
			mTabs.add(new SamplePagerItem("History Branding"));
			mTabs.add(new SamplePagerItem("History Issue"));
			mTabs.add(new SamplePagerItem("History Notifikasi"));
			
			mViewPager.setAdapter(new SampleFragmentPagerAdapter(
					getChildFragmentManager()));
			mSlidingTableLayout.setViewPager(mViewPager);
		}

		private void getData_Absensi() {
			Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
					.baseUrl(Parameter_Collections.URL_BASE).build();
			Rest_Adapter adapter = retrofit.create(Rest_Adapter.class);

			Call<PojoAbsensi> call = adapter.absensi_pegawai(id_pegawai);

			try{
				Response<PojoAbsensi> response = call.execute();
				if(response.isSuccess()){
					if(response.body().getJsonCode().equals("1")){
						if(response.body().getData() != null){
							for(int i=0; i < response.body().getData().size(); i++){
								String nama_pegawai = response.body().getData().get(i).getNamaPegawai();
								String jam = response.body().getData().get(i).getJamAbsensi();
								String tgl = response.body().getData().get(i).getTanggalAbsensi();
								String tipe_absen = response.body().getData().get(i).getTipeAbsensi();
								data_Absensi.add(new RowData_History_Absensi(nama_pegawai, jam, tgl, tipe_absen));

							}

						}
						Log.e("Log Absensi", response.body().getData().toString());
					}

				}
			}catch (IOException e){

			}

//			JSONObject jobj = sh.json_get_history_absen(id_pegawai);
//			Log.e("Log Absensi", jobj.toString());
//			try{
//				cCode = jobj.getString(Parameter_Collections.TAG_JSON_CODE);
//				if (cCode.equals("1")) {
//					JSONArray jArray = jobj
//							.getJSONArray(Parameter_Collections.TAG_DATA);
//					for (int i = 0; i < jArray.length(); i++) {
//						JSONObject c = jArray.getJSONObject(i);
//						String nama_pegawai = c.getString(Parameter_Collections.TAG_NAMA_PEGAWAI);
//						String jam = c.getString(Parameter_Collections.TAG_JAM_ABSENSI);
//						String tgl = c.getString(Parameter_Collections.TAG_TGL_ABSENSI);
//						String tipe_absen = c.getString(Parameter_Collections.TAG_TIPE_ABSENSI);
//						data_Absensi.add(new RowData_History_Absensi(nama_pegawai, jam, tgl, tipe_absen));
//					}
//				}else{
//					//kosong
//				}
//			}catch(JSONException e){
//			}

		}

		private void getData_Branding() {
			Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
					.baseUrl(Parameter_Collections.URL_BASE).build();
			Rest_Adapter adapter = retrofit.create(Rest_Adapter.class);

			Call<PojoUpdatebranding> call = adapter.updatebranding_pegawai(id_pegawai);

			try{
				Response<PojoUpdatebranding> response = call.execute();
				if(response.isSuccess()){
					if(response.body().getJsonCode().equals("1")){
						if(response.body().getData() != null){
							for(int i=0; i < response.body().getData().size(); i++){
								String nama_toko = response.body().getData().get(i).getNamaToko();
								String jam = response.body().getData().get(i).getJamBuat();
								String tgl = response.body().getData().get(i).getCreatedDate();
								String keterangan = response.body().getData().get(i).getKeteranganUpdateBranding();
								data_Branding.add(new RowData_History_Branding(nama_toko, jam, tgl, keterangan));
							}

						}
						Log.e("Log branding", response.body().getData().toString());
					}

				}
			}catch (IOException e){

			}

//			JSONObject jobj = sh.json_get_history_branding(id_pegawai);
//			Log.e("Log Branding", jobj.toString());
//			try{
//				cCode = jobj.getString(Parameter_Collections.TAG_JSON_CODE);
//				if (cCode.equals("1")) {
//					JSONArray jArray = jobj
//							.getJSONArray(Parameter_Collections.TAG_DATA);
//					for (int i = 0; i < jArray.length(); i++) {
//						JSONObject c = jArray.getJSONObject(i);
//						String nama_toko = c.getString(Parameter_Collections.TAG_NAMA_TOKO);
//						String jam = c.getString(Parameter_Collections.TAG_JAM_BUAT);
//						String tgl = c.getString(Parameter_Collections.TAG_TGL_BUAT);
//						String keterangan = c.getString(Parameter_Collections.TAG_KET_UPDATE_BRAND);
//						data_Branding.add(new RowData_History_Branding(nama_toko, jam, tgl, keterangan));
//					}
//				}else{
//				}
//			}catch(JSONException e){
//			}

		}

		private void getData_Issue() {
			Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
					.baseUrl(Parameter_Collections.URL_BASE).build();
			Rest_Adapter adapter = retrofit.create(Rest_Adapter.class);

			Call<PojoIssue> call = adapter.issue_pegawai(id_pegawai);

			try{
				Response<PojoIssue> response = call.execute();
				if(response.isSuccess()){
					if(response.body().getJsonCode().equals("1")){
						if(response.body().getData() != null){
							for(int i=0; i < response.body().getData().size(); i++){
								String nama_toko = response.body().getData().get(i).getNamaToko();
								String jam = response.body().getData().get(i).getJamBuat();
								String tgl = response.body().getData().get(i).getTanggalBuat();
								String pesan = response.body().getData().get(i).getPesanIssue();
								String brand = response.body().getData().get(i).getBrand();
								data_Issue.add(new RowData_History_Issue(nama_toko, brand, jam, tgl, pesan));
							}

						}
						Log.e("Log issue", response.body().getData().toString());
					}

				}
			}catch (IOException e){

			}

//			JSONObject jobj = sh.json_get_history_issue(id_pegawai);
//			Log.e("Log Issue", jobj.toString());
//			try{
//				cCode = jobj.getString(Parameter_Collections.TAG_JSON_CODE);
//				if (cCode.equals("1")) {
//					JSONArray jArray = jobj
//							.getJSONArray(Parameter_Collections.TAG_DATA);
//					for (int i = 0; i < jArray.length(); i++) {
//						JSONObject c = jArray.getJSONObject(i);
//						String nama_toko = c.getString(Parameter_Collections.TAG_NAMA_TOKO);
//						String jam = c.getString(Parameter_Collections.TAG_JAM_BUAT);
//						String tgl = c.getString(Parameter_Collections.TAG_TGL_BUAT);
//						String pesan = c.getString(Parameter_Collections.TAG_PESAN_ISSUE);
//						String brand = c.getString(Parameter_Collections.TAG_BRAND);
//						data_Issue.add(new RowData_History_Issue(nama_toko, brand, jam, tgl, pesan));
//
//					}
//				}else{
//					//kosong
//				}
//			}catch(JSONException e){
//
//			}

		}

		private void getData_Notif() {
			Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
					.baseUrl(Parameter_Collections.URL_BASE).build();
			Rest_Adapter adapter = retrofit.create(Rest_Adapter.class);

			Call<PojoHistoryNotif> call = adapter.notification_all("pesan");

			try{
				Response<PojoHistoryNotif> response = call.execute();
				if(response.isSuccess()){
					if(response.body().getJsonCode().equals("1")){
						if(response.body().getData() != null){
							for(int i=0; i < response.body().getData().size(); i++){
								String id = response.body().getData().get(i).getIdPesan();
								String judul = response.body().getData().get(i).getJudulPesan();
								String pesan = response.body().getData().get(i).getPesan();
								data_Notif.add(new RowData_Notif(id, judul, pesan));
							}

						}
						Log.e("Log Notif", response.body().getData().toString());
					}

				}
			}catch (IOException e){

			}

//			JSONObject jObj = sh.json_get_allnotif();
//			Log.e("Log SH notif", jObj.toString());
//
//			try {
//				cCode = jObj.getString(Parameter_Collections.TAG_JSON_CODE);
//				if (cCode.equals("1")) {
//					JSONArray jArray = jObj
//							.getJSONArray(Parameter_Collections.TAG_DATA);
//					for (int i = 0; i < jArray.length(); i++) {
//						JSONObject c = jArray.getJSONObject(i);
//						String id = c
//								.getString(Parameter_Collections.TAG_ID_PESAN);
//						String judul = c
//								.getString(Parameter_Collections.TAG_JUDUL_PESAN);
//						String pesan = c
//								.getString(Parameter_Collections.TAG_PESAN);
//
//						data_Notif.add(new RowData_Notif(id, judul, pesan));
//					}
//				} else {
//					// NO Data
//					cMessage = jObj
//							.getString(Parameter_Collections.TAG_JSON_ERROR_MESSAGE);
//				}
//			} catch (JSONException e) {
//				cMessage = e.getMessage().toString();
//			}

			// data_Notif.add(new RowData_Notif("", "Judul Pesan 1", "Isinya"));
			// data_Notif.add(new RowData_Notif("", "Judul Pesan 2", "Isinya"));
			// data_Notif.add(new RowData_Notif("", "Judul Pesan 3 ",
			// "Isinya"));
			// data_Notif.add(new RowData_Notif("", "Judul Pesan 4", "Isinya"));
		}
	}

}
