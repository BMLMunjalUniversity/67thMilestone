package com.bml67.android.a67thmilestonebml;
        import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.multidex.MultiDex;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.support.v7.app.NotificationCompat.Builder;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.bml67.android.a67thmilestonebml.app.Config;
import com.bml67.android.a67thmilestonebml.util.NotificationUtils;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    //GridView gridview = (GridView) findViewById(R.id.grid_view);
    private static final String TAG = MainActivity.class.getSimpleName();
    private BroadcastReceiver mRegistrationBroadcastReceiver;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MultiDex.install(this);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        if (mRegistrationBroadcastReceiver != null){
            Log.d("Bradcast Reciver","true");
        }
        // register GCM registration complete receiver
        LocalBroadcastManager.getInstance(this).registerReceiver(mRegistrationBroadcastReceiver,
                new IntentFilter(Config.REGISTRATION_COMPLETE));

        // register new push message receiver
        // by doing this, the activity will be notified each time a new message arrives
        LocalBroadcastManager.getInstance(MainActivity.this).registerReceiver(mRegistrationBroadcastReceiver,
                new IntentFilter(Config.PUSH_NOTIFICATION));

        // clear the notification area when the app is opened
        NotificationUtils.clearNotifications(getApplicationContext());
        mRegistrationBroadcastReceiver = new BroadcastReceiver() {

            @Override
            public void onReceive(Context context, Intent intent) {

                // checking for type intent filter
                if (intent.getAction().equals(Config.REGISTRATION_COMPLETE)) {
                    // gcm successfully registered
                    // now subscribe to `global` topic to receive app wide notifications
                    FirebaseMessaging.getInstance().subscribeToTopic(Config.TOPIC_GLOBAL);
                    Log.d("registration","yes");
                    displayFirebaseRegId();

                }
                if (intent.getAction().equals(Config.PUSH_NOTIFICATION)) {
                    // new push notification is received

                    String message = intent.getStringExtra("message");
                    String title = intent.getStringExtra("title");

                    Toast.makeText(getApplicationContext(), "Push notification: " + message, Toast.LENGTH_LONG).show();

                    NotificationCompat.Builder b = (Builder) new Builder(MainActivity.this)
                            .setSmallIcon(R.mipmap.ic_launcher)
                            .setContentTitle(title)
                            .setContentText(message);

                    NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                    notificationManager.notify(1, b.build());
                }
                else {
                    Toast.makeText(getApplicationContext(),"c,mnsakc",Toast.LENGTH_LONG).show();
                }
            }
        };

        displayFirebaseRegId();

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, AboutUsNew.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_facebookui) {

            Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/67milestone/"));
            startActivity(i);

        }
        else if (id == R.id.nav_instagramui) {

            Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/67thmilestone/"));
            startActivity(i);

        }


        else if (id == R.id.nav_register) {

            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://bml67.com/register/"));
            startActivity(intent);

        }else if (id == R.id.nav_aboutus) {

            Intent intent = new Intent(this, AboutUsNew.class);
            startActivity(intent);

        }
        else if (id == R.id.nav_sponsers) {

            Intent intent = new Intent(this, Sponsors.class);
            startActivity(intent);

        }

        else if (id == R.id.nav_About_the_fest) {

            Intent intent = new Intent(this, AboutTheFestActivity.class);
            startActivity(intent);

        }
        else if (id == R.id.nav_disclaimer) {

            Intent intent = new Intent(this, DisclaimerActivity.class);
            startActivity(intent);

        }
        else if (id == R.id.nav_developers) {

            Intent intent = new Intent(this, Developers.class);
            startActivity(intent);

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void events(View view){

        Intent intent = new Intent(this, EventsActivity.class);
        //intent.putExtra(EXTRA_MESSAGE,Result);
        startActivity(intent);

    }

    public void schedule(View view){

        Intent intent = new Intent(this, ScheduleActivity.class);
        //intent.putExtra(EXTRA_MESSAGE,Result);
        startActivity(intent);

    }

    public void maps(View view){

        Intent intent = new Intent(this, MapsActivity.class);
        //intent.putExtra(EXTRA_MESSAGE,Result);
        startActivity(intent);

    }

    public void notification(View view){

        Intent intent = new Intent(this, NotificationActivity.class);
        //intent.putExtra(EXTRA_MESSAGE,Result);
        startActivity(intent);

    }

    public void aboutus(View view){

        Intent intent = new Intent(this, AboutUsActivity.class);
        //intent.putExtra(EXTRA_MESSAGE,Result);
        startActivity(intent);

    }

    public void contacts(View view){

        Intent intent = new Intent(this, ContactsActivity.class);
        //intent.putExtra(EXTRA_MESSAGE,Result);
        startActivity(intent);

    }
    public void openKoham(View view){

        Intent intent = new Intent(this, KohamNew.class);
        //intent.putExtra(EXTRA_MESSAGE,Result);
        startActivity(intent);

    }
    public void openMyTalk(View view){

        Intent intent = new Intent(this, MyTalkNew.class);
        //intent.putExtra(EXTRA_MESSAGE,Result);
        startActivity(intent);

    }
    public void openP(View view){

        Intent intent = new Intent(this, Parikrama.class);
        //intent.putExtra(EXTRA_MESSAGE,Result);
        startActivity(intent);

    }
    public void openEH(View view){

        Intent intent = new Intent(this, Eh.class);
        //intent.putExtra(EXTRA_MESSAGE,Result);
        startActivity(intent);

    }
    public void openLTP(View view){

        Intent intent = new Intent(this, Laughter_t_p.class);
        //intent.putExtra(EXTRA_MESSAGE,Result);
        startActivity(intent);

    }

    private void displayFirebaseRegId() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences(Config.SHARED_PREF, 0);
        String regId = pref.getString("regId", null);

        Log.e(TAG, "Firebase reg id: " + regId);

        //if (!TextUtils.isEmpty(regId))
        //txtRegId.setText("Firebase Reg Id: " + regId);
        //else
        //txtRegId.setText("Firebase Reg Id is not received yet!");
    }

    @Override
    protected void onResume() {
        super.onResume();

        // register GCM registration complete receiver
        LocalBroadcastManager.getInstance(this).registerReceiver(mRegistrationBroadcastReceiver,
                new IntentFilter(Config.REGISTRATION_COMPLETE));

        // register new push message receiver
        // by doing this, the activity will be notified each time a new message arrives
        LocalBroadcastManager.getInstance(this).registerReceiver(mRegistrationBroadcastReceiver,
                new IntentFilter(Config.PUSH_NOTIFICATION));

        // clear the notification area when the app is opened
        NotificationUtils.clearNotifications(getApplicationContext());
    }

    @Override
    protected void onPause() {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(mRegistrationBroadcastReceiver);
        super.onPause();
    }

}

