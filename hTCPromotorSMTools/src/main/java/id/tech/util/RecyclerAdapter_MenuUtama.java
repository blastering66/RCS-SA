package id.tech.util;

import id.tech.htctools.CekProduk_Activity;
import id.tech.htctools.DialogAbsen;
import id.tech.htctools.DialogChooserInputPennjualan;
import id.tech.htctools.DialogChooserInputStok;
import id.tech.htctools.DialogHargaProduk;
import id.tech.htctools.DialogLocationConfirmation;
import id.tech.htctools.DialogPindahToko;
import id.tech.htctools.HistoryNotification_Activity;
import id.tech.htctools.History_Activity;
import id.tech.htctools.InfoToko_Activity;
import id.tech.htctools.Issue_Activity;
import id.tech.htctools.Login_Activity;
import id.tech.htctools.MenuUtama_Activity;
import id.tech.htctools.ScanAbsen_Activity;
import id.tech.htctools.ScanInputProduk_Activity;
import id.tech.htctools.UpdateBranding_Activity;
import id.tech.htctools.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import android.widget.Toast;

public class RecyclerAdapter_MenuUtama extends
		RecyclerView.Adapter<RecyclerAdapter_MenuUtama.ViewHolder> {
	private Context context;
	private SharedPreferences sh;
	private Activity activity;

	public RecyclerAdapter_MenuUtama(Context context, Activity activity) {
		// TODO Auto-generated constructor stub
		this.context = context;
		sh = this.context.getSharedPreferences(Parameter_Collections.SH_NAME,
				Context.MODE_PRIVATE);
		this.activity = activity;
		
	}

	private void showToast(String txt, Context ctx) {
		Toast.makeText(ctx, txt, Toast.LENGTH_SHORT).show();

	}

	public class ViewHolder extends RecyclerView.ViewHolder implements
			OnClickListener {
		public TextView tv_label;
		public ImageView img;
		public View wrapper;
		private Activity activity;

		public ViewHolder(View v, Activity activity) {
			super(v);
			tv_label = (TextView) v.findViewById(R.id.txt_label);
			img = (ImageView) v.findViewById(R.id.img);
			wrapper = (View) v.findViewById(R.id.wrapper);
			wrapper.setOnClickListener(this);

			this.activity = activity;
			// harga_produk = (TextView) v.findViewById(R.id.tv_harga_produk);
			// imei_produk = (TextView) v.findViewById(R.id.tv_imei_produk);
			// status_produk = (TextView) v.findViewById(R.id.tv_status_produk);
		}

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			// Toast.makeText(, "position = " + getAdapterPosition(),
			// Toast.LENGTH_SHORT).show();

			switch (getAdapterPosition()) {
			case 0:
				Intent load0 = new Intent(v.getContext(), DialogAbsen.class);
				v.getContext().startActivity(load0);

				break;
			case 1:
				if (sh.getBoolean(Parameter_Collections.SH_ABSENTED, false)) {
//					Intent load = new Intent(v.getContext(),
//							ScanInputProduk_Activity.class);
//					v.getContext().startActivity(load);
					
					//update dialog pindah toko
//					Intent load = new Intent(v.getContext(), DialogChooserInputStok.class);
//					v.getContext().startActivity(load);
					Intent load = new Intent(v.getContext(), DialogPindahToko.class);
					load.putExtra(Parameter_Collections.EXTRA_PINDAHTOKO_INPUTSTOK, true);
					v.getContext().startActivity(load);
					
				} else {
					showToast("Please absent first", v.getContext());
				}
				break;
			case 2:
				if (sh.getBoolean(Parameter_Collections.SH_ABSENTED, false)) {
//					Intent load = new Intent(v.getContext(),
//							CekProduk_Activity.class);
					Intent load = new Intent(v.getContext(),
							InfoToko_Activity.class);
					v.getContext().startActivity(load);
				} else {
					showToast("Please absent first", v.getContext());
				}

				break;
			case 3:

				if (sh.getBoolean(Parameter_Collections.SH_ABSENTED, false)) {
//					Intent load = new Intent(v.getContext(),
//							DialogHargaProduk.class);
//					v.getContext().startActivity(load);
					
					//edit update pindah toko
//					Intent load = new Intent(v.getContext(),
//							DialogChooserInputPennjualan.class);
					Intent load = new Intent(v.getContext(), DialogPindahToko.class);
					load.putExtra(Parameter_Collections.EXTRA_PINDAHTOKO_INPUTSTOK, false);
					v.getContext().startActivity(load);
				} else {
					showToast("Please absent first", v.getContext());
				}
				break;
			case 4:
				Intent loadUpdateBranding_Activity = new Intent(v.getContext(),
						UpdateBranding_Activity.class);
				v.getContext().startActivity(loadUpdateBranding_Activity);
				break;
			case 5:
				Intent loadIssue_Activity = new Intent(v.getContext(),
						Issue_Activity.class);
				v.getContext().startActivity(loadIssue_Activity);
				break;
			case 6:
				Intent loadHistory_Activity = new Intent(v.getContext(),
						History_Activity.class);
				v.getContext().startActivity(loadHistory_Activity);
						
//				Intent loadHistory_Activity = new Intent(v.getContext(),
//						HistoryNotification_Activity.class);
//				v.getContext().startActivity(loadHistory_Activity);
				
				
//				sh.edit().clear().commit();
//				showToast("Logged Out", context);
//				tv_label.setText("Login");
//
//				Intent load = new Intent(v.getContext(), Login_Activity.class);
//				v.getContext().startActivity(load);
//				activity.finish();

				break;

			default:
				break;
			}
		}

	}

	@Override
	public int getItemCount() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public void onBindViewHolder(ViewHolder arg0, int arg1) {
		// TODO Auto-generated method stub
		switch (arg1) {
		case 0:
			arg0.img.setImageResource(R.drawable.menu_wp_absen);
			arg0.wrapper.setBackgroundColor(context.getResources().getColor(
					R.color.color_wp_darkblue));
			arg0.tv_label.setText("Absen");
//			arg0.tv_label.setText("Absent");
			break;

		case 1:
			arg0.img.setImageResource(R.drawable.menu_wp_input_stok);
			arg0.wrapper.setBackgroundColor(context.getResources().getColor(
					R.color.color_wp_darkgreen));
			arg0.tv_label.setText("Input Stok");
//			arg0.tv_label.setText("Input Stock");
			break;
		case 2:
			arg0.img.setImageResource(R.drawable.menu_wp_cek_stok);
			arg0.wrapper.setBackgroundColor(context.getResources().getColor(
					R.color.color_wp_darkorange));
			arg0.tv_label.setText("Info Toko");
//			arg0.tv_label.setText("Request Stock");
			break;
		case 3:
			arg0.img.setImageResource(R.drawable.menu_wp_penjualan);
			arg0.wrapper.setBackgroundColor(context.getResources().getColor(
					R.color.color_wp_darkpurple));
			arg0.tv_label.setText("Input Penjualan");
//			arg0.tv_label.setText("Promo Plan");
			break;
		case 4:
			arg0.img.setImageResource(R.drawable.menu_wp_branding);
			arg0.wrapper.setBackgroundColor(context.getResources().getColor(
					R.color.color_wp_darkblue));
			arg0.tv_label.setText("Update Branding");
//			arg0.tv_label.setText("Promo Activity");
			break;
		case 5:
			arg0.img.setImageResource(R.drawable.menu_wp_issue);
			arg0.wrapper.setBackgroundColor(context.getResources().getColor(
					R.color.color_wp_darkgreen));
			arg0.tv_label.setText("Issue");
//			arg0.tv_label.setText("Issue Competitor");
			break;
		case 6:
			arg0.img.setImageResource(R.drawable.menu_wp_history);
			arg0.wrapper.setBackgroundColor(context.getResources().getColor(
					R.color.color_wp_darkorange));
//			arg0.tv_label.setText("Logout");
			arg0.tv_label.setText("All History");
//			arg0.tv_label.setText("Update POP / POSM");
			break;
		case 7:

			// arg0.img.setScaleType(ScaleType.CENTER_INSIDE);
//			arg0.img.setImageResource(R.drawable.htc);
//			arg0.wrapper.setBackgroundColor(context.getResources().getColor(
//					R.color.bg_white));
//			arg0.tv_label.setText("Notification History");
//			arg0.tv_label.setText(sh.getString(Parameter_Collections.SH_JABATAN_PEGAWAI, ""));
//			arg0.tv_label.setTextColor(context.getResources().getColor(R.color.primaryColorDark));
			break;

		default:
			break;
		}

	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		View v = LayoutInflater.from(arg0.getContext()).inflate(
				R.layout.item_menuutama_wp, arg0, false);
		ViewHolder viewholder = new ViewHolder(v, this.activity);
		return viewholder;
	}

}
