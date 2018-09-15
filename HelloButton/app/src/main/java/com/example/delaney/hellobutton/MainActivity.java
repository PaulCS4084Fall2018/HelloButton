package com.example.delaney.hellobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCounter = 0;
    private TextView mMessageTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
       //This method is called when the app launches
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Code that you add goes after the setContentView call
        mMessageTextView = findViewById(R.id.message_textview);

        final Button resetButton = findViewById(R.id.reset_button);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter = 0;
                updateView();
            }
        });


        // temp area
       // mMessageTextView.setText("Paul is cool");

        //Log.d("HB", "This is a log cat log. Logs are important!");

        // Example crash
       // mMessageTextView = findViewById(0);
        //mMessageTextView.setText("This will crash!");


    }
    public void handleDecrement(View view){
        mCounter -=1;
        updateView();


    }

    public void handleIncrement(View view){
        mCounter +=1;
        updateView();
    }
    private void updateView(){
        mMessageTextView.setText(getString(R.string.message_format,mCounter));

    }
}
