package com.confusedbox.screenrecorder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootCompleteReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().compareTo(Intent.ACTION_BOOT_COMPLETED)==0||intent.getAction().compareTo(Intent.ACTION_REBOOT)==0) {
           Intent activityIntent= new Intent(context,MainActivity.class);
           activityIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(activityIntent);
        }
    }
}
