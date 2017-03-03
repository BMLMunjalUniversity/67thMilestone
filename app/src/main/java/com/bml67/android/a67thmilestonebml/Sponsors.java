package com.bml67.android.a67thmilestonebml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Sponsors extends AppCompatActivity {


    String[] countries = new String[] {
            "Title Sponsor",
            "Associate Title Sponsor",
            "Co presented by",
            "Secured by",
            "Media partner",
            "Workshop partner",
            "Powered By",
            "In Association With",
            "Event Curated By",
            "Gifting Partner",
            "Online Magazine \n Partner",
            "Official Recording \n Partner",
            "Talent Partner",
            "Content Partner",
            "Outreach Partner",
            "Technology Partner",
            "Youth Partner",
            "Photography Partner",
            "Videography Partner",
            "Programming Partner",
            "Knowledge Partner",
            "Food Partner",
            "Hospitality Partner",
            "Social cause partner",
            "News Partner",
            "Online Media Partners","","","","","","","",
            "Events Partner","","","","","","","","","","","","","","","","","","","","",""
    };

    int[] flags = new int[]{
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            R.drawable.a4,
            R.drawable.a5,
            R.drawable.a6,
            R.drawable.a7,
            R.drawable.a8,
            R.drawable.a9,
            R.drawable.a10,
            R.drawable.a11,
            R.drawable.a12,
            R.drawable.a13,
            R.drawable.a14,
            R.drawable.a15,
            R.drawable.a16,
            R.drawable.a17,
            R.drawable.a18,
            R.drawable.a19,
            R.drawable.a20,
            R.drawable.a21,
            R.drawable.a22,
            R.drawable.a23,
            R.drawable.a24,
            R.drawable.a25,
            R.drawable.a26_1,
            R.drawable.a27,
            R.drawable.a28,
            R.drawable.a29,
            R.drawable.a30,
            R.drawable.a31,
            R.drawable.a32,
            R.drawable.a33,
            R.drawable.a34,
            R.drawable.a35,
            R.drawable.a37,
            R.drawable.a38,
            R.drawable.a40,
            R.drawable.a50,
            R.drawable.a51,
            R.drawable.a52,
            R.drawable.a53,
            R.drawable.a55,
            R.drawable.a56,
            R.drawable.a57,
            R.drawable.a58,
            R.drawable.a59,
            R.drawable.a60,
            R.drawable.a61,
            R.drawable.a62,
            R.drawable.a63,
            R.drawable.a64,
            R.drawable.a65,
            R.drawable.a66,
               };



    ListView listView;

    @Override


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sponsors);

        listView = (ListView)findViewById(R.id.listview);

        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for(int i=0;i<54;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("name", "" + countries[i]);
            hm.put("flag", Integer.toString(flags[i])

            );
            aList.add(hm);
        }


        String[] from = { "flag","name" };


        int[] to = { R.id.flag,R.id.name};

        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.textviews, from, to);


        ListView listView = ( ListView ) findViewById(R.id.listview);

        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent sponsers = new Intent(Intent.ACTION_VIEW);
                switch(position) {
                    case 0:

                        sponsers.setData(Uri.parse("http://www.heromotocorp.com/en-in/"));
                        startActivity(sponsers);
                        break;
                    case 1:

                        sponsers.setData(Uri.parse("https://nationalinsuranceindia.nic.co.in/portal/page/portal/Corporate/Home"));
                        startActivity(sponsers);
                        break;
                    case 2:

                        sponsers.setData(Uri.parse("https://www.yesbank.in/"));
                        startActivity(sponsers);
                        break;
                    case 3:

                        sponsers.setData(Uri.parse("http://lionmanpower.com/"));
                        startActivity(sponsers);
                        break;
                    case 4:

                        sponsers.setData(Uri.parse("https://swarajyamag.com/"));
                        startActivity(sponsers);
                        break;
                    case 5:

                        sponsers.setData(Uri.parse("http://www.i3indyatechnologies.com/"));
                        startActivity(sponsers);
                        break;
                    case 6:
                        sponsers.setData(Uri.parse("http://www.mtvindia.com/campusdiaries/"));
                        startActivity(sponsers);

                        break;
                    case 7:

                        sponsers.setData(Uri.parse("http://www.vh1.com/"));
                        startActivity(sponsers);

                        break;
                    case 8:

                        sponsers.setData(Uri.parse("https://www.facebook.com/EminenceGroupOfEntertainment/"));
                        startActivity(sponsers);
                        break;
                    case 9:

                        sponsers.setData(Uri.parse("http://www.grabon.in/"));
                        startActivity(sponsers);
                        break;
                    case 10:

                        sponsers.setData(Uri.parse("http://www.fashionlady.in/"));
                        startActivity(sponsers);
                        break;
                    case 11:

                        sponsers.setData(Uri.parse("http://www.resonancestudios.in/"));
                        startActivity(sponsers);
                        break;
                    case 12:

                        sponsers.setData(Uri.parse("http://mtvindia.com/labs/"));
                        startActivity(sponsers);
                        break;
                    case 13:

                        sponsers.setData(Uri.parse("http://atkt.in/"));
                        startActivity(sponsers);
                        break;
                    case 14:

                        sponsers.setData(Uri.parse("http://www.iamin.in/"));
                        startActivity(sponsers);
                        break;
                    case 15:

                        sponsers.setData(Uri.parse("http://www.faadooengineers.com/"));
                        startActivity(sponsers);
                        break;
                    case 16:

                        sponsers.setData(Uri.parse("https://www.facebook.com/TheGrapeWine"));
                        startActivity(sponsers);
                        break;
                    case 17:

                        sponsers.setData(Uri.parse("http://www.dcop.in/"));
                        startActivity(sponsers);
                        break;
                    case 18:

                        sponsers.setData(Uri.parse("https://www.facebook.com/2linep/"));
                        startActivity(sponsers);
                        break;
                    case 19:

                        sponsers.setData(Uri.parse("https://www.hackerearth.com/"));
                        startActivity(sponsers);
                        break;
                    case 20:

                        sponsers.setData(Uri.parse("https://www.tnine.io/"));
                        startActivity(sponsers);
                        break;

                    case 21:

                        sponsers.setData(Uri.parse("http://www.compass-usa.com/"));
                        startActivity(sponsers);
                        break;
                    case 22:

                        sponsers.setData(Uri.parse("https://regency.hyatt.com/en/hyattregency.html"));
                        startActivity(sponsers);
                        break;
                    case 23:

                        sponsers.setData(Uri.parse("http://happyglobe.org.in/"));
                        startActivity(sponsers);
                        break;
                    case 24:

                        sponsers.setData(Uri.parse("http://www.bhaskar.com/"));
                        startActivity(sponsers);
                        break;

                    case 25:

                        sponsers.setData(Uri.parse("https://allevents.in/"));
                        startActivity(sponsers);
                        break;
                    case 26:

                        sponsers.setData(Uri.parse("http://beingstudent.com/"));
                        startActivity(sponsers);
                        break;
                    case 27:

                        sponsers.setData(Uri.parse("https://www.brainbuxa.com/"));
                        startActivity(sponsers);
                        break;
                    case 28:

                        sponsers.setData(Uri.parse("https://buddybits.com/"));
                        startActivity(sponsers);
                        break;
                    case 29:

                        sponsers.setData(Uri.parse("http://campusdrift.com/"));
                        startActivity(sponsers);
                        break;
                    case 30:

                        sponsers.setData(Uri.parse("http://collegedunia.com/"));
                        startActivity(sponsers);
                        break;
                    case 31:

                        sponsers.setData(Uri.parse("http://www.fuccha.in/"));
                        startActivity(sponsers);
                        break;
                    case 32:

                        sponsers.setData(Uri.parse("http://www.igniteengineers.com/"));
                        startActivity(sponsers);
                        break;
                    case 33:

                        sponsers.setData(Uri.parse("http://abraxaslifestyle.com/"));
                        startActivity(sponsers);
                        break;
                    case 34:

                        sponsers.setData(Uri.parse("http://www.abraxasnu.com/"));
                        startActivity(sponsers);
                        break;

                    case 35:

                        sponsers.setData(Uri.parse("https://www.bikamp.com/"));
                        startActivity(sponsers);
                        break;
                    case 36:

                        sponsers.setData(Uri.parse("http://www.britannicaindia.com/"));
                        startActivity(sponsers);
                        break;
                    case 37:

                        sponsers.setData(Uri.parse("http://www.careers360.com/"));
                        startActivity(sponsers);
                        break;
                    case 38:

                        sponsers.setData(Uri.parse("http://www.chhaon.in/chhaon-theatre-group/"));
                        startActivity(sponsers);
                        break;
                    case 39:

                        sponsers.setData(Uri.parse("http://duxpress.in/"));
                        startActivity(sponsers);
                        break;
                    case 40:

                        sponsers.setData(Uri.parse("http://edibleroutes.com/"));
                        startActivity(sponsers);
                        break;
                    case 41:

                        sponsers.setData(Uri.parse("http://futureforward.in/"));
                        startActivity(sponsers);
                        break;
                    case 42:

                        sponsers.setData(Uri.parse("http://www.hollister.com/"));
                        startActivity(sponsers);
                        break;
                    case 43:

                        sponsers.setData(Uri.parse("http://www.i3indyatechnologies.com/"));
                        startActivity(sponsers);
                        break;
                    case 44:

                        sponsers.setData(Uri.parse("http://www.maahidesignstudio.com/"));
                        startActivity(sponsers);
                        break;
                    case 45:

                        sponsers.setData(Uri.parse("http://www.modelingindia.com/"));
                        startActivity(sponsers);
                        break;
                    case 46:

                        sponsers.setData(Uri.parse("http://ohcampus.com/"));
                        startActivity(sponsers);
                        break;
                    case 47:

                        sponsers.setData(Uri.parse("https://www.robosapi.com/"));
                        startActivity(sponsers);
                        break;
                    case 48:

                        sponsers.setData(Uri.parse("http://www.bml67.com/sponsors.php#!"));
                        startActivity(sponsers);
                        break;
                    case 49:

                        sponsers.setData(Uri.parse("http://www.bml67.com/sponsors.php#!"));
                        startActivity(sponsers);
                        break;
                    case 50:

                        sponsers.setData(Uri.parse("http://in.sodexo.com/home.html"));
                        startActivity(sponsers);
                        break;
                    case 51:

                        sponsers.setData(Uri.parse("http://srijan.net/"));
                        startActivity(sponsers);
                        break;
                    case 52:

                        sponsers.setData(Uri.parse("http://www.bml67.com/img/sponsors/vaani.png"));
                        startActivity(sponsers);
                        break;
                    case 53:

                        sponsers.setData(Uri.parse("https://www.xoxoday.com/"));
                        startActivity(sponsers);
                        break;


                }
            }
        });



    }
}
