package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    

    public void sum(View view){
        TextView firstTextView =(TextView) findViewById(
                R.id.first_input_text_view);
        TextView secondTextView =(TextView) findViewById(
                R.id.second_input_text_view);
        int first= Integer.parseInt(firstTextView.getText().toString());
        int second=Integer.parseInt(secondTextView.getText().toString());
        double result=first+second;
        display(result);
    }
    public void difference(View view){
        TextView firstTextView =(TextView) findViewById(
                R.id.first_input_text_view);
        TextView secondTextView =(TextView) findViewById(
                R.id.second_input_text_view);
        double first= Integer.parseInt(firstTextView.getText().toString());
        int second=Integer.parseInt(secondTextView.getText().toString());
        double result=first-second;
        display(result);
    }
    public void product(View view){
        TextView firstTextView =(TextView) findViewById(
                R.id.first_input_text_view);
        TextView secondTextView =(TextView) findViewById(
                R.id.second_input_text_view);
        double first= Integer.parseInt(firstTextView.getText().toString());
        int second=Integer.parseInt(secondTextView.getText().toString());
        double result=first*second;
        display(result);
    }
    public void division(View view){
        TextView firstTextView =(TextView) findViewById(
                R.id.first_input_text_view);
        TextView secondTextView =(TextView) findViewById(
                R.id.second_input_text_view);
        double first= Integer.parseInt(firstTextView.getText().toString());
        int second=Integer.parseInt(secondTextView.getText().toString());
        double result=first/second;
        display(result);
    }

    private void display(double number){
        TextView resultTextView =(TextView) findViewById(
                R.id.result_text_view);
        resultTextView.setText(" "+ number);
    }

}