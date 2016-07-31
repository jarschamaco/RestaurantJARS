package com.facci.restaurantjars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityJARS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_jars);
    }
    public void OnClick1 (View v){
        Toast.makeText(MainActivityJARS.this,"Postre de frutas",Toast.LENGTH_LONG).show();
    }
    public void OnClick2 (View v){
        Toast.makeText(MainActivityJARS.this,"Torta de chocolate francesa",Toast.LENGTH_LONG).show();
    }
    public void OnClick3 (View v){
        Toast.makeText(MainActivityJARS.this,"Torta de chocolate",Toast.LENGTH_LONG).show();
    }
    public void OnClick4 (View v){
        Toast.makeText(MainActivityJARS.this,"Higos con queso",Toast.LENGTH_LONG).show();
    }
    public void OnClick5 (View v){
        Toast.makeText(MainActivityJARS.this,"Pastel de queso",Toast.LENGTH_LONG).show();
    }
    public void OnClick6 (View v){
        Toast.makeText(MainActivityJARS.this,"Tiramisú",Toast.LENGTH_LONG).show();
    }
    public void OnClick7 (View v){
        Toast.makeText(MainActivityJARS.this,"Dulces de manjar",Toast.LENGTH_LONG).show();
    }
}
