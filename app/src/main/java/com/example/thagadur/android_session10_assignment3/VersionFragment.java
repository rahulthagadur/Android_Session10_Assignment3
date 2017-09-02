package com.example.thagadur.android_session10_assignment3;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Thagadur on 8/30/2017.
 */

public class VersionFragment extends ListFragment {
    //Declared the object
    CustomAdapter customAdapter;
    ListView listView;
    public ArrayList<ListModel> customArrayList = new ArrayList<ListModel>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_activity, container, false);
        listView = (ListView) view.findViewById(android.R.id.list);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setListData();
        customAdapter = new CustomAdapter(getActivity(), customArrayList);
        setListAdapter(customAdapter);
    }

    //add the items to the arraylist using setter method in the model.
    private void setListData() {
        for (int i = 0; i < Ipsum.image_id.length; i++) {
            final ListModel addDetails = new ListModel();
            addDetails.setvName(Ipsum.version_name[i]);
            addDetails.setvId(Ipsum.description[i]);
            addDetails.setImageId(Ipsum.image_id[i]);
            customArrayList.add(addDetails);
        }
    }

}
