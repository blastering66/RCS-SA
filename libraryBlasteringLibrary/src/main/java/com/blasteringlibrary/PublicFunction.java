package com.blasteringlibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.Toast;

public class PublicFunction {

	static LocationManager locMan;
	 static LocationListener locListener;
	 static Location loc;
	 static double lat,longi;
	 static boolean statusGPS_ON;
	 
	 public static boolean getGPSStatus(Context ctx){
		 locMan = (LocationManager)ctx.getSystemService(Context.LOCATION_SERVICE);
		 statusGPS_ON = locMan.isProviderEnabled(LocationManager.GPS_PROVIDER);
		 
		 return statusGPS_ON;
	 }
	 
	 public static int getWidthScreen(Context ctx){
		 DisplayMetrics display = ctx.getResources().getDisplayMetrics();
		 
		 return display.widthPixels;
	 }
	 
	 public static int getheightScreen(Context ctx){
		 DisplayMetrics display = ctx.getResources().getDisplayMetrics();
		 
		 return display.heightPixels;
	 }
	 
	 public static String getCurrentTime(){
		 Calendar c = Calendar.getInstance();
		 Date date = c.getTime();
		 String timeNow = new SimpleDateFormat("HH:mm:ss").format(date);
		 
		 return timeNow;
	 }
	 
	 public static String getCurrentDate(){
		 Calendar c = Calendar.getInstance();
		 Date date = c.getTime();
		 
		 String dateNow = new SimpleDateFormat("dd-MM-yyyy").format(date);
		 
		 return dateNow;
	 }

	public static double[] getLocationDevice(Context ctx) {		
		locMan = (LocationManager) ctx
				.getSystemService(Context.LOCATION_SERVICE);
		locListener = new LocationListener() {

			@Override
			public void onStatusChanged(String provider, int status,
					Bundle extras) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onProviderEnabled(String provider) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onProviderDisabled(String provider) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onLocationChanged(Location location) {
				// TODO Auto-generated method stub
				locMan.removeUpdates(locListener);
			}
		};

		try {
			if (!locMan.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
					&& !locMan.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
				Toast.makeText(ctx,
						"cant initialize your position", Toast.LENGTH_LONG)
						.show();
				locMan.removeUpdates(locListener);
			} else if (locMan
					.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
					&& locMan.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
//				Toast.makeText(ctx,
//						"initializing your position", Toast.LENGTH_LONG).show();
				locMan.requestLocationUpdates(LocationManager.GPS_PROVIDER,
						60000, 1, locListener);
				Log.e("Load Location by GPS	", "");
				loc = locMan.getLastKnownLocation(LocationManager.GPS_PROVIDER);
			} else if (locMan.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
//				Toast.makeText(ctx,
//						"initializing your position", Toast.LENGTH_LONG).show();
				locMan.requestLocationUpdates(LocationManager.GPS_PROVIDER,
						60000, 1, locListener);
				Log.e("Load Location by GPS	", "");
				loc = locMan.getLastKnownLocation(LocationManager.GPS_PROVIDER);
			} else if (locMan
					.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {
//				Toast.makeText(ctx,
//						"initializing your position", Toast.LENGTH_LONG).show();
				locMan.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,
						60000, 1, locListener);
				Log.e("Load Location by Network	", "");
				loc = locMan
						.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);

			}

		} catch (Exception e) {
			Log.e("Error", e.getMessage().toString());
		}
		
		try{
			Log.e("Location = ", "Latitude =" + String.valueOf(loc.getLatitude())
					+ "Longitude =" + String.valueOf(loc.getLongitude()));
			
			lat = loc.getLatitude();
			longi =  loc.getLongitude();
		}catch(NullPointerException e){
//			Toast.makeText(ctx,
//					"Please Turn On Your GPS", Toast.LENGTH_LONG)
//					.show();
			lat = 0;
			longi = 0;
		}catch (Exception e) {
			// TODO: handle exception
		}

		
		
		return new double[] {lat, longi};

	}
}
