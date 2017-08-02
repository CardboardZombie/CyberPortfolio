package com.cybertiger.cyberportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SketchActivity extends AppCompatActivity {

    public static final String EXTRA_SKETCH_NO = "sketchNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sketch);

        //Get the Sketch from the intent
        int sketchNo = (Integer)getIntent().getExtras().get(EXTRA_SKETCH_NO);
        Sketches sketch = Sketches.sktch[sketchNo];

        //Poupulate the sketch image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(sketch.getImageId());
        photo.setContentDescription(sketch.getName());

        //Populate the Sketch Name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(sketch.getName());

        //Populate the Sketch Description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(sketch.getDesc());


    }
}
