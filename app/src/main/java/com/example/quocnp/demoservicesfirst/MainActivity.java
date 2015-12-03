package com.example.quocnp.demoservicesfirst;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnStartServices;
    private Button mBtnStopServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewsId();
        setOnClickViews();
    }

    private void setOnClickViews() {
        mBtnStartServices.setOnClickListener(this);
        mBtnStopServices.setOnClickListener(this);
    }

    private void initViewsId() {
        mBtnStartServices = (Button) findViewById(R.id.btnStart);
        mBtnStopServices = (Button) findViewById(R.id.btnStop);
    }

    /**
     * method start services
     *
     * @param view view
     */
    public void startServices(View view) {
        startService(new Intent(getBaseContext(), MyService.class));
    }

    /**
     * Method stop services
     */
    public void stopServices(View view) {
        stopService(new Intent(getBaseContext(), MyService.class));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnStart:
                startServices(v);
                break;
            case R.id.btnStop:
                stopServices(v);
                break;
        }
    }
}
