package com.example.wismer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class tresMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres_menu);


        Button burritoBowlButton = (Button)findViewById(R.id.BurritoBowl);
        burritoBowlButton.setOnClickListener(burritoBowlListener);


        Button saladButton = (Button)findViewById(R.id.SaladButton);
        saladButton.setOnClickListener(saladListener);


        Button quesadillaButton = (Button)findViewById(R.id.QuesadillaButton);
        quesadillaButton.setOnClickListener(quesadillaListener);


        Button tacoButton = (Button)findViewById(R.id.TacoButton);
        tacoButton.setOnClickListener(tacoListener);


        Button nachoButton = (Button)findViewById(R.id.NachoButton);
        nachoButton.setOnClickListener(nachoListener);


        Button burritoButton = (Button)findViewById(R.id.BurritoButton);
        burritoButton.setOnClickListener(burritoListener);


        Button backButton = (Button)findViewById(R.id.TresBackButton);
        backButton.setOnClickListener(backListener);


        Button nextButton = (Button)findViewById(R.id.tresNextButton);
        nextButton.setOnClickListener(nextListener);
    }

    View.OnClickListener burritoBowlListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to burritoBowl
            Intent intent = new Intent(this, customization.class);
            startActivity(intent);
        }
    };

    View.OnClickListener saladListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to the salad
            Intent intent = new Intent(this, customization.class);
            startActivity(intent);
        }
    };

    View.OnClickListener quesadillaListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to quesadilla
            Intent intent = new Intent(this, customization.class);
            startActivity(intent);
        }
    };

    View.OnClickListener tacoListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to taco
            Intent intent = new Intent(this, customization.class);
            startActivity(intent);
        }
    };

    View.OnClickListener nachoListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to nacho
            Intent intent = new Intent(this, customization.class);
            startActivity(intent);
        }
    };

    View.OnClickListener burritoListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to the burrito
            Intent intent = new Intent(this, customization.class);
            startActivity(intent);
        }
    };

    View.OnClickListener backListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to homepage
            Intent intent = new Intent(this, homepage.class);
            startActivity(intent);
        }
    };

    View.OnClickListener nextListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to payment
            Intent intent = new Intent(this, payment.class);
            startActivity(intent);
        }
    };
}