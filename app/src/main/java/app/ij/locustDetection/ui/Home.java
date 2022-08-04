package app.ij.locustDetection.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import app.ij.locustDetection.MainActivity;
import locustDetection.R;


public class Home extends AppCompatActivity {


        private Object FloatingActionButton;
        @Override
        protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

                View buttonFirst = findViewById(R.id.button_first);

        buttonFirst.setOnClickListener (new View.OnClickListener(){
                                                @Override
                                                public void onClick(View v) {
                                                        Intent i = new Intent(getApplicationContext(),MainActivity.class);
                                                        startActivity(i);

                                                }

        });

        }


        }