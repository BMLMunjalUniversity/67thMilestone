package com.bml67.android.a67thmilestonebml;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Student on 20/2/2017.
 */

public class ContactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);


        ImageView email_Aayush = (ImageView) findViewById(R.id.email_Aayush);
        email_Aayush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"aayush.nagpal.14cse@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_Aayush = (ImageView) findViewById(R.id.call_Aayush);
        call_Aayush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("09729322096");
            }
        });
        ImageView email_Ranveer = (ImageView) findViewById(R.id.email_Ranveer);
        email_Ranveer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"ranveer.singh.14cse@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_Ranveer = (ImageView) findViewById(R.id.call_Ranveer);
        call_Ranveer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("08295553025");
            }
        });
        ImageView email_Shreyas = (ImageView) findViewById(R.id.email_Shreyash);
        email_Shreyas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"shreyas.bhardwaj.14bc@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_Shreyas = (ImageView) findViewById(R.id.call_Shreyash);
        call_Shreyas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("08496007347");
            }
        });
        ImageView email_Tushar = (ImageView) findViewById(R.id.email_Tushar);
        email_Tushar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"tushar.bhatia.15csc@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_Tushar = (ImageView) findViewById(R.id.call_Tushar);
        call_Tushar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("09779433340");
            }
        });
        ImageView email_Manav = (ImageView) findViewById(R.id.email_Manav);
        email_Manav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"manav.gupta.15cse@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_Manav = (ImageView) findViewById(R.id.call_Manav);
        call_Manav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("09478609450");
            }
        });
        ImageView email_Sankalp = (ImageView) findViewById(R.id.email_Sankalp);
        email_Sankalp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"sankalp.pasricha.15csc@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_sankalp = (ImageView) findViewById(R.id.call_Sankalp);
        call_sankalp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("08864951990");
            }
        });
        ImageView email_yash = (ImageView) findViewById(R.id.email_Yashaarth);
        email_yash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"yashaarth.todi.14me@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_yash = (ImageView) findViewById(R.id.call_Yashaarth);
        call_yash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("07666676466");
            }
        });
        ImageView email_saurav = (ImageView) findViewById(R.id.email_Saurav);
        email_saurav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"saurav.verma.14cse@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_saurav = (ImageView) findViewById(R.id.call_Saurav);
        call_saurav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("08005644870");
            }
        });
        ImageView email_anand = (ImageView) findViewById(R.id.email_Anand);
        email_anand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"anand.akshay.15cse@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_anand = (ImageView) findViewById(R.id.call_Anand);
        call_anand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("09779139101");
            }
        });

        ImageView email_v = (ImageView) findViewById(R.id.email_Vaibhav_Singh);
        email_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"vaibhav.singh.14cse@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_v = (ImageView) findViewById(R.id.call_Vaibhav_Singh);
        call_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("07082077548");
            }
        });
        ImageView email_am = (ImageView) findViewById(R.id.email_Akshat);
        email_am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"akshat.mittal.15cse@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_Akshat = (ImageView) findViewById(R.id.call_Akshat);
        call_Akshat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("09871810789");
            }
        });
        ImageView email_Shashank = (ImageView) findViewById(R.id.email_Shashank);
        email_Shashank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"shashank.pandey.14me@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_Shashank = (ImageView) findViewById(R.id.call_Shashank);
        call_Shashank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("08607965845");
            }
        });
        ImageView email_Sanket = (ImageView) findViewById(R.id.email_Sanket);
        email_Sanket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"sanket.tantia.14cse@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_Sanket = (ImageView) findViewById(R.id.call_Sanket);
        call_Sanket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("09143516432");
            }
        });
        ImageView email_Sanchita = (ImageView) findViewById(R.id.email_Sanchita);
        email_Sanchita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"sanchita.gupta.14cse@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_Sanchita = (ImageView) findViewById(R.id.call_Sanchita);
        call_Sanchita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("09891414752");
            }
        });
        ImageView email_Ashish = (ImageView) findViewById(R.id.email_Ashish);
        email_Ashish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"ashish.goyal.14cse@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_Ashish = (ImageView) findViewById(R.id.call_Ashish);
        call_Ashish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("08010599268");
            }
        });
        ImageView email_Rishi = (ImageView) findViewById(R.id.email_Rishi);
        email_Rishi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"rishi.raj.14cs@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_Rishi = (ImageView) findViewById(R.id.call_Rishi);
        call_Rishi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("07839500426");
            }
        });
        ImageView email_Vaibhav_Goyel = (ImageView) findViewById(R.id.email_Vaibhav_Goyel);
        email_Vaibhav_Goyel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"vaibhav.goyal.14cse@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_Vaibhav_Goyel = (ImageView) findViewById(R.id.call_Vaibhav_Goyel);
        call_Vaibhav_Goyel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("08295870921");
            }
        });
        ImageView email_Ansh = (ImageView) findViewById(R.id.email_Ansh);
        email_Ansh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"ansh.gupta.14cse@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_Ansh = (ImageView) findViewById(R.id.call_Ansh);
        call_Ansh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("09915588846");
            }
        });

        ImageView email_YashRaj = (ImageView) findViewById(R.id.email_YashRaj);
        email_YashRaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"yash.raj.14me@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_YashRaj = (ImageView) findViewById(R.id.call_YashRaj);
        call_YashRaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("09996592611");
            }
        });
        ImageView email_Suyash = (ImageView) findViewById(R.id.email_Suyash);
        email_Suyash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] addresses = {"suyash.agarwal.15cse@bml.edu.in"};

                String subject = "Fest";
                composeEmail(addresses, subject);

            }
        });

        ImageView call_Suyash = (ImageView) findViewById(R.id.call_Suyash);
        call_Suyash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("07080863484");
            }
        });


//        ImageView call_Subeh = (ImageView) findViewById(R.id.call_Subeh);
//        call_Subeh.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                dialPhoneNumber("09450565779");
//            }
//        }
//        );
    }



    private void composeEmail(String[] addresses, String subject) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setType("*//*");
        intent.setData(Uri.parse("mailto:help@bml67.com"));     //only e-mail apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);


        if(intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    private void dialPhoneNumber ( String phoneNumber ) {
        Intent intent = new Intent ( Intent.ACTION_DIAL);
        intent . setData ( Uri . parse ( "tel:" + phoneNumber ));
        if ( intent . resolveActivity ( getPackageManager ()) != null) {
            startActivity ( intent );
        }

    }
}
