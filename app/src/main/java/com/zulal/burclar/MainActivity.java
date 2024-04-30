package com.zulal.burclar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edit1;
    private TextView text1;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = findViewById(R.id.edit1);
        text1 = findViewById(R.id.text1);
        b1 = findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                determineZodiacSign();
            }
        });
    }

    private void determineZodiacSign() {
        String userInput = edit1.getText().toString();
        String zodiacSign = getZodiacSign(userInput);

        if (zodiacSign != null) {
            text1.setText("SENİN BURCUN: " + zodiacSign);
        } else {
            text1.setText(" lütfen dogum ayinizi giriniz.");
        }
    }

    private String getZodiacSign(String month) {
        switch (month) {
            case "mart":
                return "Koc";
            case "nisan":
                return "boga";
            case "mayis":
                return "ikizler";

            default:
                return null;
        }
    }
}
