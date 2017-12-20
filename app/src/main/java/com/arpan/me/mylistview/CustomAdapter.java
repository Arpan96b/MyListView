package com.arpan.me.mylistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by me on 12/17/2017.
 */

public class CustomAdapter extends BaseAdapter {

    int[] flags;
    String[] Animal_Name;
    Context context;
            private LayoutInflater inflater;
            CustomAdapter(Context context,String[] Animal_Name,int[] flags ){

                this.context=context;
                this.Animal_Name=Animal_Name;
                this.flags=flags;

            }

    @Override
    public int getCount() {
        return Animal_Name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){

          inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
             convertView =   inflater.inflate(R.layout.simple_view,parent,false);

        }

           ImageView imageView = (ImageView) convertView.findViewById(R.id.lion);
        TextView textView = (TextView) convertView.findViewById(R.id.AnimalId);
        imageView.setImageResource(flags[position]);
        textView.setText(Animal_Name[position]);


        return convertView;
    }
}
