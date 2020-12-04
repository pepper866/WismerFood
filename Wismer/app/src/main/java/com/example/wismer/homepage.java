package com.example.wismer;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;

import android.os.Bundle;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button grillButton = (Button)findViewById(R.id.GrillButton);
        grillButton.setOnClickListener(grillListener);


        Button tresButton = (Button)findViewById(R.id.TresButton);
        grillButton.setOnClickListener(tresListener);


        Button jasminButton = (Button)findViewById(R.id.jasminbutton);
        grillButton.setOnClickListener(jasminListener);


        Button subButton = (Button)findViewById(R.id.subButton);
        grillButton.setOnClickListener(subListener);
    }

    View.OnClickListener grillListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to the Grill
            Intent intent = new Intent(FirstActivity.this, grill.class);
            startActivity(intent);
        }
    };

    View.OnClickListener tresListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to the Grill
            Intent intent = new Intent(FirstActivity.this, tresMenu.class);
            startActivity(intent);
        }
    };

    View.OnClickListener jasminListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to the Grill
            Intent intent = new Intent(FirstActivity.this, jasminMenu.class);
            startActivity(intent);
        }
    };

    View.OnClickListener subListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to the Grill
            Intent intent = new Intent(FirstActivity.this, subMenu.class);
            startActivity(intent);
        }
    };
}