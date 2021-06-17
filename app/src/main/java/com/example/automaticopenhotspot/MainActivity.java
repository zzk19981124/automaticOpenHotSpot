package com.example.automaticopenhotspot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "MainActivity";
    private Button main_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        main_btn =findViewById(R.id.main_btn);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_btn:
                Log.d(TAG, "onClick: ");
                //搁置
                break;
            default:
                break;
        }
    }
}