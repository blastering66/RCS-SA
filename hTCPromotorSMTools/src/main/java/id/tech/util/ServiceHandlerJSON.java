package id.tech.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

public class ServiceHandlerJSON {
	private List<NameValuePair> params;
	private JSONObject jObj;
	private String result, url;
	private DefaultHttpClient hClient;
	private HttpEntity hEntity;
	private HttpResponse hResponse;

	public ServiceHandlerJSON() {
		// TODO Auto-generated constructor stub
		hClient = new DefaultHttpClient();
		hEntity = null;
		hResponse = null;
		params = null;
	}

	public JSONObject json_absen(String kode_toko,String id_pegawai, String longitude, String latitude, String jenis_absen){
		try{
			params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair(Parameter_Collections.KIND, Parameter_Collections.KIND_ABSEN ));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_KODE_TOKO, kode_toko));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_ID_PEGAWAI, id_pegawai));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_LONGITUDE_ABSENSI, longitude));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_LATITUDE_ABSENSI, latitude));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_TIPE_ABSENSI, jenis_absen));
			url = Parameter_Collections.URL_INSERT + URLEncodedUtils.format(params, Parameter_Collections.UTF);
			
			HttpPost hPost = new HttpPost(url);
			hResponse = hClient.execute(hPost);
			hEntity = hResponse.getEntity();
			result = EntityUtils.toString(hEntity);
			
			jObj = new JSONObject(result);
		}catch (JSONException e) {

		} catch (UnsupportedEncodingException e) {

		} catch (ClientProtocolException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return jObj;
	}
	
	public JSONObject json_absen_istirahat(String kode_toko,String id_pegawai, String longitude, String latitude, String jenis_absen){
		try{
			params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair(Parameter_Collections.KIND, Parameter_Collections.KIND_ISTIRAHAT ));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_KODE_TOKO, kode_toko));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_ID_PEGAWAI, id_pegawai));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_LONGITUDE_ABSENSI, longitude));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_LATITUDE_ABSENSI, latitude));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_TIPE_ABSENSI, jenis_absen));
			url = Parameter_Collections.URL_INSERT + URLEncodedUtils.format(params, Parameter_Collections.UTF);
			
			HttpPost hPost = new HttpPost(url);
			hResponse = hClient.execute(hPost);
			hEntity = hResponse.getEntity();
			result = EntityUtils.toString(hEntity);
			
			jObj = new JSONObject(result);
		}catch (JSONException e) {

		} catch (UnsupportedEncodingException e) {

		} catch (ClientProtocolException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return jObj;
	}
	
	public JSONObject json_login(String username, String password){
		try{
			params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair(Parameter_Collections.KIND, Parameter_Collections.KIND_LOGIN_MOBILE));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_USERNAME, username));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_PASSWORD, password));
			
			url = Parameter_Collections.URL_LOGIN + URLEncodedUtils.format(params, Parameter_Collections.UTF);
			
			HttpGet hGet = new HttpGet(url);
			hResponse = hClient.execute(hGet);
			hEntity = hResponse.getEntity();
			result = EntityUtils.toString(hEntity);
			
			jObj = new JSONObject(result);
		}catch (JSONException e) {

		} catch (UnsupportedEncodingException e) {

		} catch (ClientProtocolException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return jObj;
	}
	
	public JSONObject json_cek_stok(String kode_toko){
		try{
			params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair(Parameter_Collections.KIND, Parameter_Collections.KIND_GET_PRODUK));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_KODE_TOKO, kode_toko));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_KODE_TODAY, "false"));
			
			url = Parameter_Collections.URL_GET + URLEncodedUtils.format(params, Parameter_Collections.UTF);
			
			HttpGet hGet = new HttpGet(url);
			hResponse = hClient.execute(hGet);
			hEntity = hResponse.getEntity();
			result = EntityUtils.toString(hEntity);
			
			jObj = new JSONObject(result);
		}catch (JSONException e) {

		} catch (UnsupportedEncodingException e) {

		} catch (ClientProtocolException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return jObj;
	}
	
	public JSONObject json_get_alltoko(){
		try{
			params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair(Parameter_Collections.KIND, Parameter_Collections.KIND_GET_INFOTOKO));
						
			url = Parameter_Collections.URL_GET + URLEncodedUtils.format(params, Parameter_Collections.UTF);
			
			HttpGet hGet = new HttpGet(url);
			hResponse = hClient.execute(hGet);
			hEntity = hResponse.getEntity();
			result = EntityUtils.toString(hEntity);
			
			jObj = new JSONObject(result);
		}catch (JSONException e) {

		} catch (UnsupportedEncodingException e) {

		} catch (ClientProtocolException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return jObj;
	}
	
	public JSONObject json_get_tokoinfo(String kode_toko){
		try{
			params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair(Parameter_Collections.KIND, Parameter_Collections.KIND_GET_INFOTOKO));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_KODE_TOKO, kode_toko));
			
			url = Parameter_Collections.URL_GET + URLEncodedUtils.format(params, Parameter_Collections.UTF);
			
			HttpGet hGet = new HttpGet(url);
			hResponse = hClient.execute(hGet);
			hEntity = hResponse.getEntity();
			result = EntityUtils.toString(hEntity);
			
			jObj = new JSONObject(result);
		}catch (JSONException e) {

		} catch (UnsupportedEncodingException e) {

		} catch (ClientProtocolException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return jObj;
	}
	
	public JSONObject json_update_tokoinfo(String id_toko, String alamat_toko, 
			String deskripsi_toko, String area_toko, String tlp_toko, String kota_toko){
		try{
			params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair(Parameter_Collections.KIND, Parameter_Collections.KIND_UPDATE_INFOTOKO));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_ID_TOKO,id_toko));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_ALAMAT_TOKO,alamat_toko));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_UPDATE_DESC_TOKO,deskripsi_toko));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_UPDATE_AREA_TOKO,area_toko));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_TLP_TOKO,tlp_toko));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_KOTA_TOKO,kota_toko));			
			
			url = Parameter_Collections.URL_UPDATE + URLEncodedUtils.format(params, Parameter_Collections.UTF);
			
			HttpGet hGet = new HttpGet(url);
			hResponse = hClient.execute(hGet);
			hEntity = hResponse.getEntity();
			result = EntityUtils.toString(hEntity);
			
			jObj = new JSONObject(result);
		}catch (JSONException e) {

		} catch (UnsupportedEncodingException e) {

		} catch (ClientProtocolException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return jObj;
	}
	
	public JSONObject json_cek_notif(){
		try{
			params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair(Parameter_Collections.KIND, Parameter_Collections.KIND_NOTIF));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_NOTIF_TODAY, Parameter_Collections.TAG_NOTIF_TODAY_TRUE));
			
			url = Parameter_Collections.URL_GET + URLEncodedUtils.format(params, Parameter_Collections.UTF);
			
			HttpGet hGet = new HttpGet(url);
			hResponse = hClient.execute(hGet);
			hEntity = hResponse.getEntity();
			result = EntityUtils.toString(hEntity);

			Log.e("url", url);
			Log.e("result", result);
			jObj = new JSONObject(result);
		}catch (JSONException e) {

		} catch (UnsupportedEncodingException e) {

		} catch (ClientProtocolException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return jObj;
	}
	
	public JSONObject json_get_allnotif(){
		try{
			params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair(Parameter_Collections.KIND, Parameter_Collections.KIND_NOTIF));			
			
			url = Parameter_Collections.URL_GET + URLEncodedUtils.format(params, Parameter_Collections.UTF);
			
			HttpGet hGet = new HttpGet(url);
			hResponse = hClient.execute(hGet);
			hEntity = hResponse.getEntity();
			result = EntityUtils.toString(hEntity);

//			Log.e("url", url);
//			Log.e("result", result);
			jObj = new JSONObject(result);
		}catch (JSONException e) {

		} catch (UnsupportedEncodingException e) {

		} catch (ClientProtocolException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return jObj;
	}
	
	public JSONObject json_get_history_absen(String id_pegawai){
		try{
			params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair(Parameter_Collections.KIND, Parameter_Collections.KIND_ABSEN));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_ID_PEGAWAI, id_pegawai));
			
			url = Parameter_Collections.URL_GET + URLEncodedUtils.format(params, Parameter_Collections.UTF);
			
			HttpGet hGet = new HttpGet(url);
			hResponse = hClient.execute(hGet);
			hEntity = hResponse.getEntity();
			result = EntityUtils.toString(hEntity);

//			Log.e("url", url);
//			Log.e("result", result);
			jObj = new JSONObject(result);
		}catch (JSONException e) {

		} catch (UnsupportedEncodingException e) {

		} catch (ClientProtocolException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return jObj;
	}
	
	public JSONObject json_get_history_branding(String id_pegawai){
		try{
			params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair(Parameter_Collections.KIND, Parameter_Collections.KIND_UPDATE_BRAND));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_ID_PEGAWAI, id_pegawai));
			
			url = Parameter_Collections.URL_GET + URLEncodedUtils.format(params, Parameter_Collections.UTF);
			
			HttpGet hGet = new HttpGet(url);
			hResponse = hClient.execute(hGet);
			hEntity = hResponse.getEntity();
			result = EntityUtils.toString(hEntity);

//			Log.e("url", url);
//			Log.e("result", result);
			jObj = new JSONObject(result);
		}catch (JSONException e) {

		} catch (UnsupportedEncodingException e) {

		} catch (ClientProtocolException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return jObj;
	}
	
	public JSONObject json_get_history_issue(String id_pegawai){
		try{
			params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair(Parameter_Collections.KIND, Parameter_Collections.KIND_ISSUE));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_ID_PEGAWAI, id_pegawai));
			
			url = Parameter_Collections.URL_GET + URLEncodedUtils.format(params, Parameter_Collections.UTF);
			
			HttpGet hGet = new HttpGet(url);
			hResponse = hClient.execute(hGet);
			hEntity = hResponse.getEntity();
			result = EntityUtils.toString(hEntity);

//			Log.e("url", url);
//			Log.e("result", result);
			jObj = new JSONObject(result);
		}catch (JSONException e) {

		} catch (UnsupportedEncodingException e) {

		} catch (ClientProtocolException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return jObj;
	}
	
	public JSONObject json_input_produk(String cSn , String cImei1 , String cImei2 , 
			String cEsn , String cNamaProduk , String cWarnaProduk , 
			String cKeterangan , String cKodeToko , String cIdPegawai , 
			String cLongitude , String cLatitude){
		try{
			params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair(Parameter_Collections.KIND, Parameter_Collections.KIND_PRODUK));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_PRODUK_SN, cSn));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_IMEI, cImei1));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_IMEI2, cImei2));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_PRODUK_ESN, cEsn));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_NAMA_PRODUK, cNamaProduk));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_WARNA_PRODUK, cWarnaProduk));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_KET_PRODUK, cKeterangan));
			
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_KODE_TOKO, cKodeToko));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_ID_PEGAWAI, cIdPegawai));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_LAT_PRODUK, cLatitude));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_LONG_PRODUK, cLongitude));
			
			
			url = Parameter_Collections.URL_INSERT+ URLEncodedUtils.format(params, Parameter_Collections.UTF);
			
//			HttpGet hGet = new HttpGet(url);
			HttpPost hPost = new HttpPost(url);
//			hResponse = hClient.execute(hGet);
			hResponse = hClient.execute(hPost);
			hEntity = hResponse.getEntity();
			result = EntityUtils.toString(hEntity);
			
			jObj = new JSONObject(result);
			Log.e("input stok", jObj.toString());
		}catch (JSONException e) {

		} catch (UnsupportedEncodingException e) {

		} catch (ClientProtocolException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return jObj;
	}
	
	public JSONObject json_transfer_stok(String id_produk_toko , String cImei1 , String id_pegawai, 
			String kode_toko_awal , String kode_toko_akhir, 
			String cLongitude , String cLatitude){
		try{
			params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair(Parameter_Collections.KIND, Parameter_Collections.KIND_TRANSFER_PRODUK));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_ID_PRODUK_TOKO, id_produk_toko));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_IMEI, cImei1));
			params.add(new BasicNameValuePair(Parameter_Collections.SH_ID_PEGAWAI, id_pegawai));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_KODE_TOKO_AWAL, kode_toko_awal));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_KODE_TOKO_AKHIR, kode_toko_akhir));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_LONG_PRODUK_PINDAH, cLongitude));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_LAT_PRODUK_PINDAH, cLatitude));
			
			url = Parameter_Collections.URL_INSERT+ URLEncodedUtils.format(params, Parameter_Collections.UTF);
			
			HttpGet hGet = new HttpGet(url);
//			HttpPost hPost = new HttpPost(url);
			hResponse = hClient.execute(hGet);
//			hResponse = hClient.execute(hPost);
			hEntity = hResponse.getEntity();
			result = EntityUtils.toString(hEntity);
			
			jObj = new JSONObject(result);
			Log.e("input stok", jObj.toString());
		}catch (JSONException e) {

		} catch (UnsupportedEncodingException e) {

		} catch (ClientProtocolException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return jObj;
	}
	
	public JSONObject json_load_produktipe(){
		try{
			params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair(Parameter_Collections.KIND, Parameter_Collections.KIND_PRODUK));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_LIST_TIPE, "true"));			
			
			url = Parameter_Collections.URL_GET + URLEncodedUtils.format(params, Parameter_Collections.UTF);
			
			HttpGet hGet = new HttpGet(url);
			hResponse = hClient.execute(hGet);
			hEntity = hResponse.getEntity();
			result = EntityUtils.toString(hEntity);
			
			jObj = new JSONObject(result);
		}catch (JSONException e) {

		} catch (UnsupportedEncodingException e) {

		} catch (ClientProtocolException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return jObj;
	}
	
	public JSONObject json_get_pic_profile(String id_pegawai){
		try{
			params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair(Parameter_Collections.KIND, Parameter_Collections.KIND_PIC_PROFILE));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_ID_PEGAWAI, id_pegawai));
						
			url = Parameter_Collections.URL_GET+ URLEncodedUtils.format(params, Parameter_Collections.UTF);
			
			HttpGet hGet = new HttpGet(url);
			hResponse = hClient.execute(hGet);
			hEntity = hResponse.getEntity();
			result = EntityUtils.toString(hEntity);
			
			jObj = new JSONObject(result);
		}catch (JSONException e) {

		} catch (UnsupportedEncodingException e) {

		} catch (ClientProtocolException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return jObj;
	}
	
	public JSONObject json_get_target_info(String id_pegawai){
		try{
			params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair(Parameter_Collections.KIND, Parameter_Collections.KIND_TARGET));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_ID_PEGAWAI, id_pegawai));
			params.add(new BasicNameValuePair(Parameter_Collections.TAG_KODE_TODAY, "true"));
						
			url = Parameter_Collections.URL_GET+ URLEncodedUtils.format(params, Parameter_Collections.UTF);
			
			HttpGet hGet = new HttpGet(url);
			hResponse = hClient.execute(hGet);
			hEntity = hResponse.getEntity();
			result = EntityUtils.toString(hEntity);
			
			jObj = new JSONObject(result);
		}catch (JSONException e) {

		} catch (UnsupportedEncodingException e) {

		} catch (ClientProtocolException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return jObj;
	}
}
