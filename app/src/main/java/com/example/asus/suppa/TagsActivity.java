package com.example.asus.suppa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.asus.suppa.adapters.tagsAdapter;
import com.example.asus.suppa.models.TagsModel;

import java.util.ArrayList;

public class TagsActivity extends AppCompatActivity implements View.OnClickListener{

    private final String TAG = "TagsActivity";
    private ArrayList<TagsModel> dataModels;
    private ListView listView;
    private tagsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tags);

        listView= (ListView) findViewById(R.id.tagsListView);
    }

    @Override
    public void onStart() {
        super.onStart();
        dataModels= new ArrayList<>();
        dataModels.add(new TagsModel("id","pass tag here", "tag desc"));
        dataModels.add(new TagsModel("id","pass tag here", "tag desc"));
        dataModels.add(new TagsModel("id","pass tag here", "tag desc"));
        dataModels.add(new TagsModel("id","pass tag here", "tag desc"));
        dataModels.add(new TagsModel("id","pass tag here", "tag desc"));
        dataModels.add(new TagsModel("id","pass tag here", "tag desc"));
        dataModels.add(new TagsModel("id","pass tag here", "tag desc"));
        dataModels.add(new TagsModel("id","pass tag here", "tag desc"));
        dataModels.add(new TagsModel("id","pass tag here", "tag desc"));
        dataModels.add(new TagsModel("id","pass tag here", "tag desc"));
        dataModels.add(new TagsModel("id","pass tag here", "tag desc"));
        dataModels.add(new TagsModel("id","pass tag here", "tag desc"));
        dataModels.add(new TagsModel("id","pass tag here", "tag desc"));

        adapter = new tagsAdapter(dataModels,this);
        listView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {

    }
}
