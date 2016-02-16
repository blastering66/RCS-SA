package id.tech.htctools;

import java.util.Calendar;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.util.Log;

public class Notif_Service extends Service{
	Intent myIntent;
	PendingIntent alarmIntent;
	AlarmManager alarams;
	SharedPreferences sp;
	String cContactId;
	Intent activate;
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
//		sp =  = getSharedPreferences(ParameterCollections.SHARED_PREF_NAME,
//				Context.MODE_PRIVATE);
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		myIntent = intent;
		
		Calendar c = Calendar.getInstance();
		activate = new Intent(Notif_Service.this, NotifBroadcastReceiver.class);
		activate.putExtra("code", "1");
		
		alarmIntent = PendingIntent.getBroadcast(getApplicationContext(), 111, activate,PendingIntent.FLAG_CANCEL_CURRENT);
		
		alarams = (AlarmManager)getSystemService(ALARM_SERVICE);
		alarams.setRepeating(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(),
				 1000 * 60 * 60, alarmIntent);
		Log.e("Service Started", "");
		
		return Service.START_STICKY;
	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

}
