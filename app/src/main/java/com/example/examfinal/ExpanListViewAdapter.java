package com.example.examfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Map;

public class ExpanListViewAdapter extends BaseExpandableListAdapter {
    private ArrayList<String> listCat;
    private Map<String,ArrayList<String>> mapChild;
    private Context context;

    public ExpanListViewAdapter(ArrayList<String> listCat, Map<String, ArrayList<String>> mapChild, Context context) {
        this.listCat = listCat;
        this.mapChild = mapChild;
        this.context = context;
    }

    @Override
    public int getGroupCount() {
        return listCat.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return mapChild.get(listCat.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listCat.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return mapChild.get(listCat.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String titCtegoria = (String) getGroup(groupPosition);
        convertView = LayoutInflater.from(context).inflate(R.layout.ext_list_view, null);
        TextView tvGroup= (TextView) convertView.findViewById(R.id.tvGroup);
        tvGroup.setText(titCtegoria);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String item = (String) getChild(groupPosition, childPosition);
        convertView = LayoutInflater.from(context).inflate(R.layout.ext_list_view_child, null);
        TextView tvChild= (TextView) convertView.findViewById(R.id.tvChild);
        tvChild.setText(item);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
