package br.com.caelum.exemploservico;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ToastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		context.startService(new Intent(context, ToastService.class));
	}
	
}
