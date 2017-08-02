package com.cybertiger.cyberportfolio;

import android.os.Bundle;
import android.app.ListActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;

public class SketchCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listSketches = getListView();
        ArrayAdapter<Sketches> listAdapter = new ArrayAdapter<Sketches>(this, android.R.layout.simple_list_item_1, Sketches.sktch);
        listSketches.setAdapter(listAdapter);
    }
    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(SketchCategoryActivity.this, SketchActivity.class);
        intent.putExtra(SketchActivity.EXTRA_SKETCH_NO, (int) id);
        startActivity(intent);
    }
}
