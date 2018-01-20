package com.wcang.parcel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mBtnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnSend = (Button) findViewById(R.id.button);
        mBtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                Vehicle vehicle = new Vehicle();
                vehicle.model = "Fiat";
                vehicle.year = 1999;
                intent.putExtra("vehicle", vehicle);
                startActivity(intent);
            }
        });
    }
}
