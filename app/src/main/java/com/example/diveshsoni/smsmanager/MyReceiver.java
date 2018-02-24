package com.example.diveshsoni.smsmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Bundle bundle = intent.getExtras();
        Object[]pdus =(Object[])bundle.get("pdus");
        @SuppressWarnings("deprecation") SmsMessage message = SmsMessage.createFromPdu((byte[])pdus[0]);
        Log.i("com.example", message.getMessageBody());
        Log.i("Divesh", message.getOriginatingAddress());
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
