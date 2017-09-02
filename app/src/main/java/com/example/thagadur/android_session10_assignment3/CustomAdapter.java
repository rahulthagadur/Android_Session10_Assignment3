package com.example.thagadur.android_session10_assignment3;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.data;
import static android.R.attr.textScaleX;

/**
 * Created by Thagadur on 8/30/2017.
 */


public class CustomAdapter extends BaseAdapter {

    Activity activity;
    ListModel tempValues = null;
    private ArrayList data;
    private static LayoutInflater inflater = null;

    public CustomAdapter(Activity versionFragment, ArrayList<ListModel> customArrayList) {
        data = customArrayList;
        activity = versionFragment;
        /***********  Layout inflator to call external xml layout () ***********/
        inflater = (LayoutInflater) activity.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //return the data size (Arralist size )
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    //Declare a holder class
    @Override
    public long getItemId(int i) {
        return 0;
    }

    public static class ViewHolder {
        public TextView vName;
        public TextView vId;
        public ImageView imageId;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vi = view;
        ViewHolder holder;

        if (view == null) {
            //Get the TextView ID with respective holder ID and name
            vi = inflater.inflate(R.layout.tabitem, null);
            holder = new ViewHolder();
            holder.vName = (TextView) vi.findViewById(R.id.version_name);
            holder.vId = (TextView) vi.findViewById(R.id.version_id);
            holder.imageId = (ImageView) vi.findViewById(R.id.image_view);
            vi.setTag(holder);

        } else
            holder = (ViewHolder) vi.getTag();

        if (data.size() < 0) {
            holder.vName.setText("No data");
        } else {
            //setting the text tabbed text items
            tempValues = null;
            tempValues = (ListModel) data.get(i);
            holder.vName.setText(tempValues.getvName());
            holder.vId.setText(tempValues.getvId());
            holder.imageId.setImageResource(tempValues.getImageId());
        }
        return vi;
    }
}
