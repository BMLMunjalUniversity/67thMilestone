package com.bml67.android.a67thmilestonebml;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Handler;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;


public class MyService extends Service {
    public MyService() {
    }
    fdhandler fdh;
    String[] name;
    int nhandle[]=new int[40];
    Handler mHandler;
    @Override
    public int onStartCommand(final Intent intent, int flags, int startId) {
        mHandler = new android.os.Handler();
        ping();
        return START_STICKY;
    }

    private void ping() {
        try {
            Intent i1 = new Intent(getApplicationContext(), NotificationActivity.class);
            fdh = new fdhandler(getApplicationContext(), null, null, 1);
            name = fdh.retrievename();
            int yeari, monthi, minutei, date1i, houri;
            String[] time = fdh.retrievetime();

            String currentdatetime = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss", Locale.US).format(new Date());
            int l = time.length;
            StringTokenizer st = new StringTokenizer(currentdatetime + " ", " ");
            String date = st.nextToken();
            String time1 = st.nextToken();
            StringTokenizer st1 = new StringTokenizer(date + "-", "-");
            int year = Integer.parseInt(st1.nextToken());
            int month = Integer.parseInt(st1.nextToken());
            int date1 = Integer.parseInt(st1.nextToken());
            st1 = new StringTokenizer(time1 + "-", "-");
            int hour = Integer.parseInt(st1.nextToken());
            int minute = Integer.parseInt(st1.nextToken());
            int second = Integer.parseInt(st1.nextToken());
            for (int i = 0; i < l; i++) {
                time[i].replace("-","/");
                st1 = new StringTokenizer(time[i] + " ", " ");
                String d = st1.nextToken();//
                String t = st1.nextToken();
                t=st1.nextToken();
                t=st1.nextToken();
                yeari = 2017;
                monthi = 2;
                String x1 = st1.nextToken();
                st1 = new StringTokenizer(t + ":", ":");
                houri = Integer.parseInt(st1.nextToken());
                if (x1.charAt(0)=='p')
                {
                    houri+=12;
                }
                minutei = Integer.parseInt(st1.nextToken());
                if (year == yeari && (month == monthi||month == 3) && date1 == Integer.parseInt(d.substring(0,2))) {
                    if (hour == houri) {
                        if (minutei - minute <= 5 && minutei-minute>0) {
                            if (nhandle[i] != 1) {
                                notificate(getApplicationContext(), i1, i);
                            }
                        }
                    } else if (hour < houri) {
                        if (minute - minutei >= 55) {
                            if (nhandle[i] != 1) {
                                notificate(getApplicationContext(), i1, i);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.e("Error", "In onStartCommand");
            e.printStackTrace();
        }
        scheduleNext();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;    }
    public void notificate(Context context, Intent i, int pos)
    {
        long a[] = {500,500,500,500};
        NotificationCompat.Builder n=new NotificationCompat.Builder(context);
        n.setContentTitle("67 Milestone");
        n.setContentText("The Event "+name[pos]+" is going to start");
        n.setSmallIcon(R.mipmap.ic_launcher);
        n.setAutoCancel(true);
        n.setVibrate(a);
        n.setWhen(System.currentTimeMillis());
        n.setTicker("Event notification");
        n.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));
        NotificationManager NM=(NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        PendingIntent pi = PendingIntent.getActivity(context, 0, i,PendingIntent.FLAG_UPDATE_CURRENT);
        n.setContentIntent(pi);
        NM.notify(0,n.build());
        nhandle[pos]=1;
    }

    private void scheduleNext() {
        mHandler.postDelayed(new Runnable() {
            public void run() { ping(); }
        }, 60000);
    }
}

