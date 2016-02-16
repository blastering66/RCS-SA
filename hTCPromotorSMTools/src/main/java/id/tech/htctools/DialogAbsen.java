package id.tech.htctools;

import id.tech.htctools.R;
import id.tech.util.GPSTracker;
import id.tech.util.Parameter_Collections;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class DialogAbsen extends FragmentActivity {
	Button radio_masuk, radio_pulang;
	Button radio_istirahat_mulai, radio_istirahat_selesai;
	SharedPreferences sh;

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.layout_dialog_absen);
		sh = getSharedPreferences(Parameter_Collections.SH_NAME,
				Context.MODE_PRIVATE);

		radio_masuk = (Button) findViewById(R.id.radio_masuk);
		radio_pulang = (Button) findViewById(R.id.radio_pulang);
		
		radio_istirahat_mulai = (Button) findViewById(R.id.radio_out_istirahat);
		radio_istirahat_selesai = (Button) findViewById(R.id.radio_in_istirahat);

		radio_pulang.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (sh.getBoolean(Parameter_Collections.SH_ABSENTED, false)) {
					Intent load = new Intent(getApplicationContext(),
							ScanAbsen_Activity.class);
					load.putExtra(Parameter_Collections.SH_ID_PEGAWAI, sh
							.getString(Parameter_Collections.SH_ID_PEGAWAI, ""));
					load.putExtra(Parameter_Collections.EXTRA_ABSENSI, "2");

					
					startActivity(load);
					finish();

				} else {
					Toast.makeText(getApplicationContext(),
							"Please Login First", Toast.LENGTH_LONG).show();
				}

			}
		});

		radio_masuk.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (!sh.getBoolean(Parameter_Collections.SH_ABSENTED, false)) {
					Intent load = new Intent(getApplicationContext(),
							ScanAbsen_Activity.class);
					load.putExtra(Parameter_Collections.SH_ID_PEGAWAI, sh
							.getString(Parameter_Collections.SH_ID_PEGAWAI,
									""));
					load.putExtra(Parameter_Collections.EXTRA_ABSENSI, "1");
					
					startActivity(load);
					finish();
				} else {
					Toast.makeText(getApplicationContext(),
							"Please Logout First", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		radio_istirahat_mulai.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (sh.getBoolean(Parameter_Collections.SH_ABSENTED, false)) {
					Intent load = new Intent(getApplicationContext(),
							ScanIstirahat_Activity.class);
					load.putExtra(Parameter_Collections.SH_ID_PEGAWAI, sh
							.getString(Parameter_Collections.SH_ID_PEGAWAI, ""));
					load.putExtra(Parameter_Collections.EXTRA_ABSENSI, "1");

					
					startActivity(load);
					finish();

				} else {
					Toast.makeText(getApplicationContext(),
							"Please Login First", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		radio_istirahat_selesai.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (sh.getBoolean(Parameter_Collections.SH_ABSENTED, false)) {
					Intent load = new Intent(getApplicationContext(),
							ScanIstirahat_Activity.class);
					load.putExtra(Parameter_Collections.SH_ID_PEGAWAI, sh
							.getString(Parameter_Collections.SH_ID_PEGAWAI, ""));
					load.putExtra(Parameter_Collections.EXTRA_ABSENSI, "2");

					
					startActivity(load);
					finish();

				} else {
					Toast.makeText(getApplicationContext(),
							"Please Login First", Toast.LENGTH_LONG).show();
				}
			}
		});
	}

}
