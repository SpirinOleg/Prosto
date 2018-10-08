package com.example.a123.prosto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView pole1 = findViewById(R.id.tv_pole1);
        TextView pole2 = findViewById(R.id.tv_pole2);

        Bundle element = getIntent().getExtras();
        Car car;
        if(element != null) {
            car = element.getParcelable(Car.class.getSimpleName());

            pole1.setText(car.getName());
            pole2.setText(car.getMarka());

        }
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
