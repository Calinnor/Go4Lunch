package com.cirederf.go4lunch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class StartActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        this.startCorrectActivity();
    }

    @Override
    public int getFragmentLayout() {
        return R.layout.activity_start;
    }

    private void startCorrectActivity() {
        this.startLogin();
    }

    private void startLogin(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}