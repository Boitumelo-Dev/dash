package com.skrn.dash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);
        Button login = (Button) findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                // Handle the click event
                Toast.makeText(MainActivity.this, "Login successful!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,ClientDashboardActivity.class);
                startActivity(i);
          }});

    }
}