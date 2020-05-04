package com.example.newstudio;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button add_button;
    Button sub_button;
    Button multi_button;
    Button div_button;

    TextView result;
    int ans=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.editTextfno);
        num2 = (EditText) findViewById(R.id.editTextlno);
        add_button = (Button) findViewById(R.id.buttonadd);
        sub_button = (Button) findViewById(R.id.buttonsub);
        multi_button = (Button) findViewById(R.id.buttonmul);
        div_button = (Button) findViewById(R.id.buttondiv);
        result = (TextView) findViewById(R.id.textViewresult);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double sum = number1 + number2;
                result.setText(Double.toString(sum));

            }
        });
        sub_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double sum = number1 - number2;
                result.setText(Double.toString(sum));
            }
        });
        multi_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double sum = number1 * number2;
                result.setText(Double.toString(sum));
            }
        });
        div_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double sum = number1 / number2;
                result.setText(Double.toString(sum));
            }
        });
    }
}
