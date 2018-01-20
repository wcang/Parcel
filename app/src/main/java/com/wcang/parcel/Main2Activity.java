package com.wcang.parcel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView) findViewById(R.id.txtDisplay);

        Intent intent = getIntent();

        if (intent != null && intent.hasExtra("vehicle")) {
            Vehicle vehicle = (Vehicle) intent.getParcelableExtra("vehicle");
            textView.setText("Vehicle model " + vehicle.model + " year " + vehicle.year);
        }
    }
}
