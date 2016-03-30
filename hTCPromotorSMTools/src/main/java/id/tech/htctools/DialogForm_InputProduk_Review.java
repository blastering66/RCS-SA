package id.tech.htctools;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import id.tech.util.Parameter_Collections;
import id.tech.util.ServiceHandlerJSON;

public class DialogForm_InputProduk_Review extends FragmentActivity {
	Button btn_submit;
	TextView tv_label, tv_keterangan_error;
	EditText ed_Sn, ed_Imei1, ed_Imei2, ed_Esn;
	// EditText ed_NamaProduk, ed_WarnaProduk,ed_Keterangan;
	TableLayout table_Form;
	boolean ada_di_db;
	SharedPreferences spf;

	AutoCompleteTextView auto_namaProduk, auto_warnaProduk,
			auto_keteranganProduk,ed_Others;

	String cSn,cImei1,cImei2,cEsn,nama_produk, cWarnaProduk, cKeterangan, cKodeToko,cIdPegawai,
			cLongitude, cLatitude;

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.layout_dialog_input_produk_review);

		spf = getSharedPreferences(Parameter_Collections.SH_NAME,
				Context.MODE_PRIVATE);
		ada_di_db = getIntent().getBooleanExtra("ada_di_db", false);

		cSn = getIntent().getStringExtra("cSn");
		cImei1 = getIntent().getStringExtra("cImei1");
		cImei2 = getIntent().getStringExtra("cImei2");
		cEsn = getIntent().getStringExtra("cEsn");
		nama_produk = getIntent().getStringExtra("nama_produk");
		cWarnaProduk = getIntent().getStringExtra("cWarnaProduk");
		cKeterangan = getIntent().getStringExtra("cKeterangan");
		cKodeToko = getIntent().getStringExtra("cKodeToko");
		cIdPegawai = getIntent().getStringExtra("cIdPegawai");
		cLongitude = getIntent().getStringExtra("cLongitude");
		cLatitude = getIntent().getStringExtra("cLatitude");

		getALlView();
	}

	private class Async_SubmitProduk extends AsyncTask<Void, Void, Void> {

		private String row_count, json_code, error_message;
		DialogFragmentProgress dialogProgress;

		@Override
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			super.onPreExecute();
			dialogProgress = new DialogFragmentProgress();
			dialogProgress.show(getSupportFragmentManager(), "");

			cSn = ed_Sn.getText().toString();
			cImei1 = ed_Imei1.getText().toString();
			cImei2 = ed_Imei2.getText().toString();
			cEsn = ed_Esn.getText().toString();

			cWarnaProduk = auto_warnaProduk.getText().toString();
			cKeterangan = auto_keteranganProduk.getText().toString();

			if(spf.getBoolean(Parameter_Collections.SH_PINDAH_TOKO, false)){
				cKodeToko = spf.getString(Parameter_Collections.SH_KODE_TOKO_SEMENTARA, "");
			}else{
				cKodeToko = spf.getString(Parameter_Collections.SH_KODE_TOKO, "");
			}

			cIdPegawai = spf.getString(Parameter_Collections.SH_ID_PEGAWAI, "");
			// cLongitude = "106.8151608";
			// cLatitude = "-6.3025544";
			cLongitude = spf.getString(Parameter_Collections.TAG_LONGITUDE_NOW,
					"0.0");
			cLatitude = spf.getString(Parameter_Collections.TAG_LATITUDE_NOW,
					"0.0");


		}

		@Override
		protected Void doInBackground(Void... params) {
			// TODO Auto-generated method stub
//			ServiceHandlerJSON sh = new ServiceHandlerJSON();
//			JSONObject jObj = sh.json_input_produk(cSn, cImei1, cImei2, cEsn,
//					nama_produk, cWarnaProduk, cKeterangan, cKodeToko,
//					cIdPegawai, cLongitude, cLatitude);
			JSONObject jObj = null;


			try {

				json_code = jObj.getString(Parameter_Collections.TAG_JSON_CODE);

				if (json_code.equals("1")) {
					row_count = jObj
							.getString(Parameter_Collections.TAG_ROWCOUNT);
				} else {
					error_message = jObj
							.getString(Parameter_Collections.TAG_JSON_ERROR_MESSAGE);
				}

			} catch (JSONException e) {

			}
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
			dialogProgress.dismiss();
			if (json_code.equals("1")) {
				if (row_count.equals("1")) {
					DialogLocationConfirmation dialog = new DialogLocationConfirmation(
							getApplicationContext(), "Input Success", 9);
					dialog.setCancelable(false);
					dialog.show(getSupportFragmentManager(), "");

					// Toast.makeText(getApplicationContext(), "Input Success",
					// Toast.LENGTH_LONG).show();
					// finish();
				} else {
					DialogLocationConfirmation dialog = new DialogLocationConfirmation(
							getApplicationContext(),
							"Somethine wrong please contact administator", 9);
					dialog.setCancelable(false);
					dialog.show(getSupportFragmentManager(), "");

					// Toast.makeText(getApplicationContext(),
					// "Somethine wrong please contact administator",
					// Toast.LENGTH_LONG).show();
					// finish();
				}
			} else {
				DialogLocationConfirmation dialog = new DialogLocationConfirmation(
						getApplicationContext(), error_message, 9);
				dialog.setCancelable(false);
				dialog.show(getSupportFragmentManager(), "");
			}
		}
	}

	private void getALlView() {
		ed_Sn = (EditText) findViewById(R.id.ed_form_sn);
		ed_Imei1 = (EditText) findViewById(R.id.ed_form_imei);
		ed_Imei2 = (EditText) findViewById(R.id.ed_form_imei2);
		ed_Esn = (EditText) findViewById(R.id.ed_form_esn);

		btn_submit = (Button) findViewById(R.id.btn_submit);
		ed_Others = (AutoCompleteTextView)findViewById(R.id.ed_others);

		auto_warnaProduk = (AutoCompleteTextView) findViewById(R.id.autocomplete_warna_produk);
		auto_keteranganProduk = (AutoCompleteTextView) findViewById(R.id.autocomplete_ket_produk);

		// load imeinya langsung
		ed_Imei1.setText(getIntent().getStringExtra("cImei1"));
		ed_Sn.setText(getIntent().getStringExtra("cSn"));
		ed_Imei2.setText(getIntent().getStringExtra("cImei2"));
		ed_Esn.setText(getIntent().getStringExtra("cEsn"));
		ed_Others.setText(getIntent().getStringExtra("nama_produk"));
		auto_warnaProduk.setText(getIntent().getStringExtra("cWarnaProduk"));
		auto_keteranganProduk.setText(getIntent().getStringExtra("cKeterangan"));

		btn_submit.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				new Async_SubmitProduk().execute();
			}
		});
	}

}
