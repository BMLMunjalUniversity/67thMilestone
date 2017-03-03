package com.bml67.android.a67thmilestonebml;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Developers extends AppCompatActivity {

    // Array of strings storing country names
    String[] countries = new String[] {
            "Naman Khetawat",
            "Ashutosh Yadav",
            "Piyush Kandoi",
            "Vaibhav Singh",
            "Mohit Verma",
            "Mann Khatri",
            "Devesh Bharadwaj",
            "Mohit Khotani",
            "Abhya Yadav",
            "Sneha Agarwal",
            "Abhishek Lomsh",
            "Mohit Sharma",

    };

    String[] countries1 = new String[] {
            "Computer Science",
            "Computer Science and Engineering",
            "Computer Science",
            "Computer Science",
            "Computer Science and Engineering",
            "Computer Science and Engineering",
            "Computer Science and Engineering",
            "Computer Science and Engineering",
            "Computer Science",
            "Computer Science and Engineering",
            "Computer Science and Engineering",
            "Computer Science and Engineering",

    };

    // Array of integers points to images stored in /res/drawable-ldpi/
    int[] flags = new int[]{
            R.drawable.naman,
            R.drawable.ashutosh,
            R.drawable.piyush,
            R.drawable.vaibhavsingh,
            R.drawable.verma,
            R.drawable.mann,
            R.drawable.devesh,
            R.drawable.mk,
            R.drawable.abhya,
            R.drawable.unknown,
            R.drawable.abhishek,
            R.drawable.mohits,

               };



    /** Called when the activity is first created. */
    ListView listView;

    @Override


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.developersview);

        listView = (ListView)findViewById(R.id.listview);
        // Each row in the list stores country name, currency and flag
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for(int i=0;i<12;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("name", "" + countries[i]);
            hm.put("name1", "" + countries1[i]);
            hm.put("flag", Integer.toString(flags[i])
            );
            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = { "flag","name","name1" };
        // Ids of views in textview
        int[] to = { R.id.imageviewd,R.id.textviewd,R.id.textview2d};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.developersactifity, from, to);
        // Getting a reference to listview of main.xml layout file
        ListView listView = ( ListView ) findViewById(R.id.listview);

        // Setting the adapter to the listView
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent sponsers = new Intent(Intent.ACTION_VIEW);
                switch(position) {
                    case 0:

                        Intent facebookIntent = getOpenFacebookIntent(getApplicationContext());
                        startActivity(facebookIntent);
                        break;
                    case 1:

                        Intent facebookIntent3 = getOpenFacebookIntent3(getApplicationContext());
                        startActivity(facebookIntent3);
                        break;
                    case 2:

                        Intent facebookIntent1 = getOpenFacebookIntent1(getApplicationContext());
                        startActivity(facebookIntent1);
                        break;
                    case 3:

                        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/vaibhavsingh97/"));
                        startActivity(intent);
                        break;
                    case 4:

                        Intent facebookIntent6 = getOpenFacebookIntent6(getApplicationContext());
                        startActivity(facebookIntent6);
                        break;
                    case 5:


                        break;
                    case 6:

                        Intent facebookIntent4 = getOpenFacebookIntent4(getApplicationContext());
                        startActivity(facebookIntent4);
                        break;
                    case 7:

                        Intent facebookIntent5 = getOpenFacebookIntent5(getApplicationContext());
                        startActivity(facebookIntent5);
                        break;
                    case 8:

                        Intent facebookIntent2 = getOpenFacebookIntent2(getApplicationContext());
                        startActivity(facebookIntent2);
                        break;
                    case 9:

                        Intent facebookIntent7 = getOpenFacebookIntent7(getApplicationContext());
                        startActivity(facebookIntent7);
                        break;
                    case 10:

                        Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/abhishek-lomsh-05a235b3"));
                        startActivity(intent1);
                        break;
                    case 11:

                        Intent facebookIntent9 = getOpenFacebookIntent9(getApplicationContext());
                        startActivity(facebookIntent9);
                        break;




                }
            }
        });



    }


    public static Intent getOpenFacebookIntent(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100001271340292"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/100001271340292"));
        }
    }

    public static Intent getOpenFacebookIntent8(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100001530824102"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/100001530824102"));
        }
    }

    public static Intent getOpenFacebookIntent9(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100001728440296"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/100001728440296"));
        }
    }





    public static Intent getOpenFacebookIntent1(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100002251915865"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/100002251915865"));
        }
    }



    public static Intent getOpenFacebookIntent2(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100011346482828"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/100011346482828"));
        }
    }



    public static Intent getOpenFacebookIntent3(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100010162151690"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/100010162151690"));
        }
    }



    public static Intent getOpenFacebookIntent4(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100003149929302"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/100003149929302"));
        }
    }



    public static Intent getOpenFacebookIntent5(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100001561611521"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/100001561611521"));
        }
    }



    public static Intent getOpenFacebookIntent6(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100001029931520"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/100001029931520"));
        }
    }



    public static Intent getOpenFacebookIntent7(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100009541044160"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/100009541044160"));
        }
    }



}
