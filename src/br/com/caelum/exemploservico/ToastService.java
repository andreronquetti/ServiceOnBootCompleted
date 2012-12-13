package br.com.caelum.exemploservico;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class ToastService extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
	
	@Override
	public void onCreate() {
		super.onCreate();
		
		Toast.makeText(this, "Call Service", Toast.LENGTH_LONG).show();
		Toast.makeText(this, "Call Service", Toast.LENGTH_LONG).show();
		Toast.makeText(this, "Call Service", Toast.LENGTH_LONG).show();
		Toast.makeText(this, "Call Service", Toast.LENGTH_LONG).show();
		Toast.makeText(this, "Call Service", Toast.LENGTH_LONG).show();
	}
	
}
