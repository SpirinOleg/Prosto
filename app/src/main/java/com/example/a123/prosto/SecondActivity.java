package com.example.a123.prosto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


    }


    public void onClick(View view) {
        EditText pole1 = findViewById(R.id.et_pole1);
        EditText pole2 = findViewById(R.id.et_pole2);

        String name = pole1.getText().toString();
        String marka = pole2.getText().toString();

        Car car = new Car(name, marka);

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(Car.class.getSimpleName(), car);
        startActivity(intent);
    }
}
