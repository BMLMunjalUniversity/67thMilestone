package com.bml67.android.a67thmilestonebml;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.StringTokenizer;


class favoritelistadapter extends ArrayAdapter<String> {

    private String[] name;
    private String[] time;
    private String[] place;
    private Activity context;

    favoritelistadapter(Activity context, String[] name, String[] time,String[] place) {
        super(context, R.layout.favouritelist, name);
        this.context = context;
        this.name = name;
        this.time = time;
        this.place = place;
    }

    favoritelistadapter(Activity context) {
        super(context, R.layout.favouritelist);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.favouritelist, null, true);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.name);
        TextView textViewtime = (TextView) listViewItem.findViewById(R.id.time1);
        TextView textviewplace = (TextView) listViewItem.findViewById(R.id.place);
        TextView textviewdate = (TextView) listViewItem.findViewById(R.id.date);
        textViewName.setText(name[position]);
        time[position] = time[position].replace("-","/");
        StringTokenizer st =new StringTokenizer(time[position] + " "," ");
        String date ="1";
        if(st.hasMoreTokens()) {
            date = st.nextToken();
        }
        if(st.hasMoreTokens()) {
            String x= st.nextToken();
            x=st.nextToken();
        }
        if(st.hasMoreTokens()) {
            textViewtime.setText(textViewtime.getText() + " " + st.nextToken());
        }
        textviewplace.setText(textviewplace.getText() + " " + place[position]);
        textviewdate.setText(date);
        return listViewItem;
    }
    String rowdetails(View view)
    {
        LinearLayout ll = (LinearLayout) view.getParent().getParent();
        TextView name = (TextView) ll.findViewById(R.id.name);
        return name.getText().toString();
    }
}
