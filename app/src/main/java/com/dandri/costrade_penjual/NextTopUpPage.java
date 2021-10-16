package com.dandri.costrade_penjual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NextTopUpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_top_up_page);

        ImageButton Kembali = (ImageButton)
                findViewById(R.id.imageButtonKembaliNextTopUp);

        Kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(NextTopUpPage.this, TopUpPage.class);
                startActivity(i);
            }
        });
    }
}