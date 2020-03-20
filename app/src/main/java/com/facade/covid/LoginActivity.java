package com.facade.covid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signIn(View view) {
        goToSituationPage();
    }

    public void goToSituationPage() {
        Intent listIntent = new Intent(this, ListActivity.class);
        startActivity(listIntent);
    }
}
