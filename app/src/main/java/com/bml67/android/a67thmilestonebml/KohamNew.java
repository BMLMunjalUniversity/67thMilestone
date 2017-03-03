package com.bml67.android.a67thmilestonebml;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.style.TextAlignment;

public class KohamNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koham_new);
        DocumentView documentView = new DocumentView(this, DocumentView.PLAIN_TEXT);  // Support plain text
        documentView.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
    }
    public void openfb(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/bmukoham/"));
        startActivity(intent);

    }
    public void opentwitter(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/koham17"));
        startActivity(intent);

    }
    public void openswarajya(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://swarajyamag.com"));
        startActivity(intent);

    }
    public void opensrijan(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://srijan.net/"));
        startActivity(intent);

    }
}
