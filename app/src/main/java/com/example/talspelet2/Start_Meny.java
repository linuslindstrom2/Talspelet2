package com.example.talspelet2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start_Meny extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_meny);
    }


    final Button PlayButton = findViewById(R.id.Play);

    PlayButton.setOnClickListener (new View.OnClickListener() {

        public void onClick(View view) {
            view.setContentView(R.layout.val_meny);
        }

    });


}
//    final Button knappensnamnidennafil = findViewById(R.id.namnpåknappixml);
//    knappensnamnidennafil.setOnClickListener (new View.OnClickListener() {
//        public void onClick(View view) {
//            setContentView(R.layout.namnpånyvy);
//        }
//    });