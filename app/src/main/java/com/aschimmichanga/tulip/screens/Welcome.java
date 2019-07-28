package com.aschimmichanga.tulip.screens;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aschimmichanga.tulip.R;

public class Welcome extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ConstraintLayout bg = findViewById(R.id.background);
        bg.setBackgroundResource(R.drawable.default_gradient);
    }

    public void goToSignInScreen (View v)
    {
        Intent intent = new Intent (this, SignIn.class);
        startActivity(intent);
    }

    public void goToMakeAccountScreen (View v)
    {
        Intent intent = new Intent (this, MakeAccount.class);
        startActivity(intent);
    }
}
