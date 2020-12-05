package com.example.wismer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class grill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grill);

        Button steakButton = (Button)findViewById(R.id.SteakButton);
        steakButton.setOnClickListener(steakListener);


        Button burgerButton = (Button)findViewById(R.id.BurgerButton);
        burgerButton.setOnClickListener(burgerListener);


        Button gCheeseButton = (Button)findViewById(R.id.GCheeseButton);
        gCheeseButton.setOnClickListener(gCheeseListener);


        Button chBurgerButton = (Button)findViewById(R.id.ChBurger);
        chBurgerButton.setOnClickListener(chBurgerListener);


        Button chickSandButton = (Button)findViewById(R.id.ChickenSandButton);
        chickSandButton.setOnClickListener(chickSandListener);


        Button veganCutButton = (Button)findViewById(R.id.veganCutletButton);
        veganCutButton.setOnClickListener(veganCutListener);


        Button bBurgerButton = (Button)findViewById(R.id.BeanBurgerButton);
        bBurgerButton.setOnClickListener(bBurgerListener);


        Button vBurgerButton = (Button)findViewById(R.id.VeganBurgerButton);
        vBurgerButton.setOnClickListener(vBurgerListener);


        Button dcBurgerButton = (Button)findViewById(R.id.DCBurgerButton);
        dcBurgerButton.setOnClickListener(dcBurgerListener);


        Button chickChSteakButton = (Button)findViewById(R.id.ChickenSteakButton);
        chickChSteakButton.setOnClickListener(chickChSteakListener);


        Button backButton = (Button)findViewById(R.id.BackGrillHomeButton);
        backButton.setOnClickListener(backListener);


        Button nextButton = (Button)findViewById(R.id.GrillNext);
        nextButton.setOnClickListener(nextListener);
    }

    View.OnClickListener steakListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to cheeseSteak
            Intent intent = new Intent(this, customization.class);
            startActivity(intent);
        }
    };

    View.OnClickListener burgerListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to the burger
            Intent intent = new Intent(this, customization.class);
            startActivity(intent);
        }
    };

    View.OnClickListener gCheeseListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to gCheese
            Intent intent = new Intent(this, customization.class);
            startActivity(intent);
        }
    };

    View.OnClickListener chBurgerListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to chBurger
            Intent intent = new Intent(this, customization.class);
            startActivity(intent);
        }
    };

    View.OnClickListener chickSandListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to chickSand
            Intent intent = new Intent(this, customization.class);
            startActivity(intent);
        }
    };

    View.OnClickListener veganCutListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to the veganCut
            Intent intent = new Intent(this, customization.class);
            startActivity(intent);
        }
    };

    View.OnClickListener bBurgerListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to bBurger
            Intent intent = new Intent(this, customization.class);
            startActivity(intent);
        }
    };

    View.OnClickListener vBurgerListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to vBurger
            Intent intent = new Intent(this, customization.class);
            startActivity(intent);
        }
    };

    View.OnClickListener dcBurgerListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to dcBurger
            Intent intent = new Intent(this, customization.class);
            startActivity(intent);
        }
    };

    View.OnClickListener chickChSteakListener = new View.OnClickListener() {
        public void onClick(View v){
            //Change the page to the chickChSteak
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