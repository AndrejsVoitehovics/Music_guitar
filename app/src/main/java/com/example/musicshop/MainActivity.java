package com.example.musicshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView saleTextViiew;
    ImageView imageSale;

    Button plusButton;
    Button minusButon;
    TextView quantityTextView;
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        saleTextViiew = findViewById(R.id.sale_text_view);
        saleTextViiew.bringToFront();
    }

    @Override
    protected void onStart() {
        super.onStart();
        quantityTextView = findViewById(R.id.quantity);
        plusButton = findViewById(R.id.plus_button);
        minusButon = findViewById(R.id.minus_button);
        saleTextViiew.bringToFront();
        imageSale = findViewById(R.id.saleImageView);
        imageSale.getBackground();
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity++;
                quantityTextView.setText(String.valueOf(quantity));
            }
        });

        minusButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity--;
                if (quantity<0){
                    quantity=0;
                }
                quantityTextView.setText(String.valueOf(quantity));
            }
        });

    }

}
