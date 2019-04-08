package com.example.labka2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private Button catCounter;
    private TextView counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = findViewById(R.id.count);
        catCounter = findViewById(R.id.button_counter);
        catCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setText("Кількість котиків: " + ++count);
            }
        });
        LinearLayout linearContainer = findViewById(R.id.linearContainer);
        LayoutInflater ltInflater = getLayoutInflater();
        View view = ltInflater.inflate(R.layout.list_item, linearContainer, false);
        LayoutParams lp = view.getLayoutParams();
        linearContainer.addView(view);
    }

    public void sayHi(View view) {
        TextView greeting = findViewById(R.id.hi);
        EditText catName = findViewById(R.id.editText);

        greeting.setText("Привіт " + catName.getText());
        greeting.setVisibility(View.VISIBLE);
        greeting.animate().rotationXBy(270);
    }

    public void listClick(View view) {
        TextView text = findViewById(R.id.add_text);
        text.setText("Button was pressed!");
        Button thisButton = findViewById(R.id.add_button);
        thisButton.setText("Don't click me anymore");
    }
}
