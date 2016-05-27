package com.cdgk.toolbardemo;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //*******到底提交木有*******//
        ((Button)findViewById(R.id.btn_toolbar)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ToolbarActivity.class);
                startActivity(intent);
            }
        });
        ((Button)findViewById(R.id.btn_actionbar)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ActionbarActivity.class);
                startActivity(intent);
            }
        });
        ((Button)findViewById(R.id.btn_custom_actionbar)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, CustomActionbarActivity.class);
                startActivity(intent);
            }
        });
    }
}
