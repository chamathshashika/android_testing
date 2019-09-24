package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class working_with_Button extends AppCompatActivity {

    private EditText editText1, editText2;
    private Button buttonSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_working_with__button);

        addListenerOnButton();
    }

    private void addListenerOnButton() {

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        buttonSum = (Button) findViewById(R.id.button_sum);

        buttonSum.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                String val1 = editText1.getText().toString();
                String val2 = editText2.getText().toString();

                int a  = Integer.parseInt(val1);
                int b  = Integer.parseInt(val2);
                int sum = a+b;

                Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG).show();
            }


        });
    }
}
