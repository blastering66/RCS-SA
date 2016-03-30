package id.tech.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

import com.pkmmte.circularimageview.CircularImageView;
import id.tech.htctools.R;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter_Slider extends RecyclerView.Adapter<RecyclerAdapter_Slider.ViewHolder>{
	private Context context;
	private SharedPreferences sh;
	private Activity activity;
	private String nama, target, achievement, url;
	
	private boolean d_300, d_616,d_816, d_c, d_flyer,o_820d, o_m7c, o_e8, o_m8, o_m9, o_max, o_mini, o_v, wp, wp_8x;
	private int total_d_300, total_d_616, total_d_816,  total_d_c, total_d_flyer, total_o_820d, 
		total_o_m7c, total_o_e8, total_o_m8, total_o_m9, total_o_max, total_o_mini, total_o_v,total_wp, total_wp_8x;
	
	public RecyclerAdapter_Slider(Context context, Activity activity) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.activity = activity; 	
	}
	
	public RecyclerAdapter_Slider(String nama, String target, String achievement, String url,
			boolean d_300,int total_d_300, boolean d_616, int total_d_616, boolean d_816, int total_d_816,
			boolean d_c,int total_d_c,boolean d_flyer,int total_flyer, boolean o_820d, int total_o_820d, 
			boolean o_m7c, int total_o_m7c, boolean o_e8,int total_o_e8,boolean o_m8, int total_o_m8, boolean o_m9, int total_o_m9,
			boolean o_max, int total_o_max,boolean o_mini, int total_o_mini,boolean o_v, int total_o_v,
			boolean wp, int total_wp, boolean wp_8x, int total_wp_8x) {
		// TODO Auto-generated constructor stub
			this.nama = nama;
			this.target = target;
			this.achievement = achievement;
			this.url = url;
			
			this.d_300 = d_300;
			this.d_616 = d_616;
			this.d_816 = d_816;
			this.d_c = d_c;
			this.d_flyer = d_flyer;
			this.o_820d = o_820d;
			this.o_m7c = o_m7c;
			this.o_e8 = o_e8;
			this.o_m8 = o_m8;
			this.o_m9 = o_m9;
			this.o_max = o_max;
			this.o_mini = o_mini;
			this.o_v = o_v;
			this.wp = wp;
			this.wp_8x = wp_8x;
			
			this.total_d_300 = total_d_300;
			this.total_d_616 = total_d_616;
			this.total_d_816 = total_d_816;
			this.total_d_c = total_d_c;
			this.total_d_flyer = total_flyer;
			this.total_o_820d = total_o_820d;
			this.total_o_m7c = total_o_m7c;
			this.total_o_e8 = total_o_e8;
			this.total_o_m8 = total_o_m8;
			this.total_o_m9 = total_o_m9;
			this.total_o_max = total_o_max;
			this.total_o_mini = total_o_mini;
			this.total_o_v = total_o_v;
			this.total_wp = total_wp;
			this.total_wp_8x = total_wp_8x;
	}

	public class ViewHolder extends RecyclerView.ViewHolder implements
			OnClickListener {
		public TextView tv_nama, tv_target, tv_achivement;
		public ImageView img;
		private CircularImageView circularImageView;
		private Activity activity;
		
		View wrapper_D_300, wrapper_D_616, wrapper_D_816, wrapper_D_Flyer, wrapper_D_C, wrapper_O_820D, wrapper_O_M7C,
			wrapper_O_E8, wrapper_O_M8, wrapper_O_M9, wrapper_O_MAX,wrapper_O_MINI, wrapper_O_V, wrapper_WP, wrapper_WP_8X;
		
		TextView tv_D_300, tv_D_616, tv_D_816, tv_D_Flyer,tv_D_C, tv_O_820D, tv_O_M7C,tv_O_E8, tv_O_M8,tv_O_M9, tv_O_MAX, 
		tv_O_MINI, tv_O_V, tv_WP, tv_WP_8X;

		public ViewHolder(View v, Activity activity) {
			super(v);
			tv_nama = (TextView) v.findViewById(R.id.tv_nama);
			tv_target = (TextView) v.findViewById(R.id.tv_target);
			tv_achivement = (TextView) v.findViewById(R.id.tv_achievement);
			img = (ImageView) v.findViewById(R.id.img);	
			circularImageView = (CircularImageView)v.findViewById(R.id.img_profile);
			
			wrapper_D_300 = (View)v.findViewById(R.id.wrapper_d_300);
			wrapper_D_616 = (View)v.findViewById(R.id.wrapper_d_616);
			wrapper_D_816 = (View)v.findViewById(R.id.wrapper_d_816);
			wrapper_D_C  = (View)v.findViewById(R.id.wrapper_d_c);
			wrapper_D_Flyer  = (View)v.findViewById(R.id.wrapper_d_flyer);
			wrapper_O_820D= (View)v.findViewById(R.id.wrapper_o_820);
			wrapper_O_M7C= (View)v.findViewById(R.id.wrapper_o_m7c);
			wrapper_O_E8= (View)v.findViewById(R.id.wrapper_o_e8);
			wrapper_O_M8= (View)v.findViewById(R.id.wrapper_o_m8);
			wrapper_O_M9= (View)v.findViewById(R.id.wrapper_o_m9);
			wrapper_O_MAX= (View)v.findViewById(R.id.wrapper_o_max);
			wrapper_O_MINI= (View)v.findViewById(R.id.wrapper_o_mini);
			wrapper_O_V= (View)v.findViewById(R.id.wrapper_o_v);
			wrapper_WP= (View)v.findViewById(R.id.wrapper_wp);
			wrapper_WP_8X= (View)v.findViewById(R.id.wrapper_wp_8x);
			
			tv_D_300 = (TextView)v.findViewById(R.id.tv_stok_d_300);
			tv_D_616= (TextView)v.findViewById(R.id.tv_stok_d_616);
			tv_D_816 = (TextView)v.findViewById(R.id.tv_stok_d_816);
			tv_D_C = (TextView)v.findViewById(R.id.tv_stok_d_c);
			tv_D_Flyer = (TextView)v.findViewById(R.id.tv_stok_d_flyer);
			tv_O_820D = (TextView)v.findViewById(R.id.tv_stok_o_820);
			tv_O_M7C = (TextView)v.findViewById(R.id.tv_stok_o_m7c);
			tv_O_E8 = (TextView)v.findViewById(R.id.tv_stok_o_e8);
			tv_O_M8 = (TextView)v.findViewById(R.id.tv_stok_o_m8);
			tv_O_M9 = (TextView)v.findViewById(R.id.tv_stok_o_m9);
			tv_O_MAX = (TextView)v.findViewById(R.id.tv_stok_o_max);
			tv_O_MINI = (TextView)v.findViewById(R.id.tv_stok_o_mini);
			tv_O_V= (TextView)v.findViewById(R.id.tv_stok_o_v);
			tv_WP= (TextView)v.findViewById(R.id.tv_stok_wp);
			tv_WP_8X= (TextView)v.findViewById(R.id.tv_stok_wp_8x);

			this.activity = activity;
			// harga_produk = (TextView) v.findViewById(R.id.tv_harga_produk);
			// imei_produk = (TextView) v.findViewById(R.id.tv_imei_produk);
			// status_produk = (TextView) v.findViewById(R.id.tv_status_produk);
		}

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
		}

		
	}


	@Override
	public int getItemCount() {
		// TODO Auto-generated method stub
		return 1;
	}

	public Bitmap getBitmapFromURL(String src) {
	    try {
	        java.net.URL url = new java.net.URL(src);
	        HttpURLConnection connection = (HttpURLConnection) url
	                .openConnection();
	        connection.setDoInput(true);
	        connection.connect();
	        InputStream input = connection.getInputStream();
	        Bitmap myBitmap = BitmapFactory.decodeStream(input);
	        return myBitmap;
	    } catch (IOException e) {
	        e.printStackTrace();
	        return null;
	    }
	}
	
	@Override
	public void onBindViewHolder(ViewHolder arg0, int arg1) {
		// TODO Auto-generated method stub
		if(url.equals("")){
			arg0.circularImageView.setImageResource(R.drawable.img_profile_test);
		}else{
			Bitmap b = getBitmapFromURL(url);
			arg0.circularImageView.setImageBitmap(b);
		}
		arg0.tv_nama.setText(nama);
		
		if(target == null){
			arg0.tv_target.setText("No Target");
		}else{
			arg0.tv_target.setText(target + " Unit");
		}
		
		if(achievement == null){
			arg0.tv_achivement.setText("No Achievement");
		}else{
			arg0.tv_achivement.setText(achievement + " Unit");
		}
		
		
		if (d_300) {
			arg0.wrapper_D_300.setVisibility(View.VISIBLE);
			arg0.tv_D_300.setText(String.valueOf(total_d_300) + " Unit");											
		}
		
		if (d_616) {
			arg0.wrapper_D_616.setVisibility(View.VISIBLE);
			arg0.tv_D_616.setText(String.valueOf(total_d_616)+ " Unit");
		} 
		
		if (d_816) {
			arg0.wrapper_D_816.setVisibility(View.VISIBLE);
			arg0.tv_D_816.setText(String.valueOf(total_d_816)+ " Unit");			 
		} 
		
		if (d_c) {
			arg0.wrapper_D_C.setVisibility(View.VISIBLE);
			arg0.tv_D_C.setText(String.valueOf(total_d_c)+ " Unit");
		}
		
		if (d_flyer) {
			arg0.wrapper_D_Flyer.setVisibility(View.VISIBLE);
			arg0.tv_D_Flyer.setText(String.valueOf(total_d_flyer)+ " Unit");			 
		}
		
		if (o_820d) {
			arg0.wrapper_O_820D.setVisibility(View.VISIBLE);
			arg0.tv_O_820D.setText(String.valueOf(total_o_820d)+ " Unit");
		}
		
		if (o_m7c) {
			arg0.wrapper_O_M7C.setVisibility(View.VISIBLE);
			arg0.tv_O_M7C.setText(String.valueOf(total_o_m7c)+ " Unit");			 
		}
		
		if (o_e8) {
			arg0.wrapper_O_E8.setVisibility(View.VISIBLE);
			arg0.tv_O_E8.setText(String.valueOf(total_o_e8)+ " Unit");
		}
		
		if (o_m8) {
			arg0.wrapper_O_M8.setVisibility(View.VISIBLE);
			arg0.tv_O_M8.setText(String.valueOf(total_o_m8)+ " Unit");			 
		}
		
		if (o_m9) {
			arg0.wrapper_O_M9.setVisibility(View.VISIBLE);
			arg0.tv_O_M9.setText(String.valueOf(total_o_m9)+ " Unit");			 
		}
		
		if (o_max) {
			arg0.wrapper_O_MAX.setVisibility(View.VISIBLE);
			arg0.tv_O_MAX.setText(String.valueOf(total_o_max)+ " Unit");			 
		}
		
		if (o_mini) {
			arg0.wrapper_O_MINI.setVisibility(View.VISIBLE);
			arg0.tv_O_MINI.setText(String.valueOf(total_o_mini)+ " Unit");			 
		}
		
		if (o_v) {
			arg0.wrapper_O_V.setVisibility(View.VISIBLE);
			arg0.tv_O_V.setText(String.valueOf(total_o_v)+ " Unit");			 
		}
		
		if (wp) {
			arg0.wrapper_WP.setVisibility(View.VISIBLE);
			arg0.tv_WP.setText(String.valueOf(total_wp)+ " Unit");			 
		}
		
		if (wp_8x) {
			arg0.wrapper_WP_8X.setVisibility(View.VISIBLE);
			arg0.tv_WP_8X.setText(String.valueOf(total_wp_8x)+ " Unit");			 
		}
		
	}


	@Override
	public ViewHolder onCreateViewHolder(ViewGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		View v = LayoutInflater.from(arg0.getContext()).inflate(
				R.layout.layout_profile, arg0, false);
		ViewHolder viewholder = new ViewHolder(v, this.activity);
		return viewholder;
	}

	
}
