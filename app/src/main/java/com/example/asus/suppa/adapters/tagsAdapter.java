package com.example.asus.suppa.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.asus.suppa.R;
import com.example.asus.suppa.models.TagsModel;

import java.util.ArrayList;

public class tagsAdapter  extends ArrayAdapter<TagsModel> implements View.OnClickListener{
    String TAG="";

    private ArrayList<TagsModel> dataSet;//create array object list
    Context mContext;

    // View lookup cache
    private static class ViewHolder {
        String id;
        TextView tag;
        TextView desc;
        String tagimage;
    }

    public tagsAdapter(ArrayList<TagsModel> data, Context context) {
        super(context, R.layout.row_tags_item, data);
        this.dataSet = data;
        this.mContext=context;
    }

    @Override
    public void onClick(View v) {
        int position=(Integer) v.getTag();
        Object object= getItem(position);
        TagsModel dataModel=(TagsModel) object;
        switch (v.getId())
        {

        }
    }
    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        TagsModel dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        tagsAdapter.ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new tagsAdapter.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_tags_item, parent, false);


            viewHolder.tag = (TextView) convertView.findViewById(R.id.tag);
            viewHolder.desc = (TextView) convertView.findViewById(R.id.description);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (tagsAdapter.ViewHolder) convertView.getTag();
            result=convertView;
        }

        Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        result.startAnimation(animation);
        lastPosition = position;

        viewHolder.tag.setText(dataModel.getTag());
        viewHolder.desc.setText(dataModel.getDesc());

        // Return the completed view to render on screen
        return convertView;
    }


}
