package com.example.musicshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView saleTextViiew;
ImageView imageSale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        saleTextViiew= findViewById(R.id.sale_text_view);
        saleTextViiew.bringToFront();
    }

    @Override
    protected void onStart() {
        super.onStart();
        saleTextViiew.bringToFront();
        imageSale = findViewById(R.id.saleImageView);
        imageSale.getBackground();
    }
}
