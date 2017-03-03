package com.bml67.android.a67thmilestonebml;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class NotificationActivity extends AppCompatActivity {

    favouritesdatabase fd;
    fdhandler fdh;
    favoritelistadapter fla;
    ListView favouritelist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        fdh = new fdhandler(this,null,null,1);
        //fd = new favouritesdatabase("Test1","23rd February | 12:00 pm","x");
        //fdh.addfavouriteevent(fd);
        String[] name = fdh.retrievename();
        String[] time = fdh.retrievetime();
        String[] place = fdh.retrieveplace();
        if(name !=null)
        {
            fla = new favoritelistadapter(this,name,time,place);
        }
        else
        {
            fla = new favoritelistadapter(this);
        }
        favouritelist = (ListView) findViewById(R.id.listview);
        favouritelist.setAdapter(fla);
    }

    public void add(View view){
        Intent i = new Intent(this, EventsActivity.class);
        startActivity(i);
    }
    public void delete(View view)
    {
        String name2 = fla.rowdetails(view);
        TextView name = (TextView) findViewById(R.id.name);
        Toast.makeText(this,"Event "+name2+"Deleted from your favourite list",Toast.LENGTH_LONG).show();
        fdh.deleteEvent(name2);
        String[] name1 = fdh.retrievename();
        String[] time = fdh.retrievetime();
        String[] place = fdh.retrieveplace();
        if(name1 !=null)
        {
            fla = new favoritelistadapter(this,name1,time,place);
        }
        else
        {
            fla = new favoritelistadapter(this);
        }
        favouritelist.setAdapter(fla);
    }
}
