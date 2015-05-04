package com.example.danny.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity {
    //TODO: delete this line and tag
    private final String TAG = "mainActivity";

    private double first_value = 0;
    private Boolean first_value_instantiated = false;
    private Boolean second_value_instantiated = false;
    private Boolean operation_stated = false;
    private double second_value = 0;
    private StringBuilder text = new StringBuilder();
    private TextView edit_text;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        edit_text = (TextView) findViewById(R.id.textField);
        edit_text.setText("0");

        Button button_delete = (Button) findViewById(R.id.deleteButton);
        button_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_value_instantiated = false;
                second_value_instantiated = false;
                operation_stated = false;
                text.delete(0, text.length());
                text.append(0);
                edit_text.setText(text);
                first_value = 0;
                second_value = 0;
            }
        });

        Button button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(operation_stated && second_value_instantiated == false){
                    second_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(0);
                    edit_text.setText(text);
                }
                else if(operation_stated && second_value_instantiated){
                    text.append(0);
                    edit_text.setText(text);
                }
                else if (first_value_instantiated) {
                    text.append(0);
                    edit_text.setText(text);
                }
                else{
                    first_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(0);
                    edit_text.setText(text);
                }
            }
        });

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                if(operation_stated && second_value_instantiated == false){
                    Log.d(TAG," first if button 1, operation_stated and !secondValue");
                    second_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(1);
                    edit_text.setText(text);
                }
                else if(operation_stated && second_value_instantiated){
                    text.append(1);
                    edit_text.setText(text);
                }
                else if (first_value_instantiated) {
                    text.append(1);
                    edit_text.setText(text);
                }
                else{
                    Log.d(TAG,"else, number 1");
                    first_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(1);
                    edit_text.setText(text);
                }
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                if(operation_stated && second_value_instantiated == false){
                    second_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(2);
                    edit_text.setText(text);
                }
                else if(operation_stated && second_value_instantiated){
                    text.append(2);
                    edit_text.setText(text);
                }
                else if (first_value_instantiated) {
                    text.append(2);
                    edit_text.setText(text);
                }
                else{
                    Log.d(TAG,"else, number 1");
                    first_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(2);
                    edit_text.setText(text);
                }
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                if(operation_stated && second_value_instantiated == false){
                    second_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(3);
                    edit_text.setText(text);
                }
                else if(operation_stated && second_value_instantiated){
                    text.append(3);
                    edit_text.setText(text);
                }
                else if (first_value_instantiated) {
                    text.append(3);
                    edit_text.setText(text);
                }
                else{
                    first_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(3);
                    edit_text.setText(text);
                }
            }
        });

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                if(operation_stated && second_value_instantiated == false){
                    second_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(4);
                    edit_text.setText(text);
                }
                else if(operation_stated && second_value_instantiated){
                    text.append(4);
                    edit_text.setText(text);
                }
                else if (first_value_instantiated) {
                    text.append(4);
                    edit_text.setText(text);
                }
                else{
                    first_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(4);
                    edit_text.setText(text);
                }
            }
        });

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                if(operation_stated && second_value_instantiated == false){
                    second_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(5);
                    edit_text.setText(text);
                }
                else if(operation_stated && second_value_instantiated){
                    text.append(5);
                    edit_text.setText(text);
                }
                else if (first_value_instantiated) {
                    text.append(5);
                    edit_text.setText(text);
                }
                else{
                    first_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(5);
                    edit_text.setText(text);
                }
            }
        });

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                if(operation_stated && second_value_instantiated == false){
                    second_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(6);
                    edit_text.setText(text);
                }
                else if(operation_stated && second_value_instantiated){
                    text.append(6);
                    edit_text.setText(text);
                }
                else if (first_value_instantiated) {
                    text.append(6);
                    edit_text.setText(text);
                }
                else{
                    first_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(6);
                    edit_text.setText(text);
                }
            }
        });

        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                if(operation_stated && second_value_instantiated == false){
                    second_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(7);
                    edit_text.setText(text);
                }
                else if(operation_stated && second_value_instantiated){
                    text.append(7);
                    edit_text.setText(text);
                }
                else if (first_value_instantiated) {
                    text.append(7);
                    edit_text.setText(text);
                }
                else{
                    first_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(7);
                    edit_text.setText(text);
                }
            }
        });

        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                if(operation_stated && second_value_instantiated == false){
                    second_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(8);
                    edit_text.setText(text);
                }
                else if(operation_stated && second_value_instantiated){
                    text.append(8);
                    edit_text.setText(text);
                }
                else if (first_value_instantiated) {
                    text.append(8);
                    edit_text.setText(text);
                }
                else{
                    first_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(8);
                    edit_text.setText(text);
                }
            }
        });

        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                if(operation_stated && second_value_instantiated == false){
                    second_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(9);
                    edit_text.setText(text);
                }
                else if(operation_stated && second_value_instantiated){
                    text.append(9);
                    edit_text.setText(text);
                }
                else if (first_value_instantiated) {
                    text.append(9);
                    edit_text.setText(text);
                }
                else{
                    first_value_instantiated = true;
                    text.delete(0, text.length());
                    text.append(9);
                    edit_text.setText(text);
                }
            }
        });

        Button button_addition = (Button) findViewById(R.id.button_addition);
        button_addition.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){

                if(operation_stated){
                    second_value = Double.parseDouble(text.toString());
                    first_value += second_value;
                    text.delete(0, text.length());
                    text.append(formatDouble(first_value) + " +");
                    edit_text.setText(text);
                    second_value_instantiated = false;

                }
                else if(first_value_instantiated){
                    Log.d(TAG, "last else if addition");
                    first_value = Double.parseDouble(text.toString());
                    text.delete(0, text.length());
                    text.append("+");
                    edit_text.setText(text);
                    operation_stated = true;
                    operation = "add";
                }
            }
        });

        Button button_subtraction = (Button) findViewById(R.id.button_subtraction);
        button_subtraction.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                if( first_value_instantiated && second_value_instantiated){
                    first_value = first_value + second_value;
                    text.delete(0, text.length());
                    text.append(first_value);
                    edit_text.setText(text);
                    second_value_instantiated = false;
                    operation_stated = false;
                }
                else if(first_value_instantiated){
                    first_value = Double.parseDouble(text.toString());
                    text.delete(0, text.length());
                    text.append("+");
                    edit_text.setText(text);
                    operation_stated = true;
                }
            }
        });

        Button button_multiplication = (Button) findViewById(R.id.button_multiplication);
        button_multiplication.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                if(first_value_instantiated){
                    text.append(0);
                }
            }
        });

        Button button_division = (Button) findViewById(R.id.button_division);
        button_division.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                if(first_value_instantiated){
                    text.append(0);
                }
            }
        });

        Button button_equals = (Button) findViewById(R.id.button_equals);
        button_equals.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                if(!second_value_instantiated || !operation_stated){
                    first_value = Double.parseDouble(text.toString());
                    text.delete(0, text.length());
                    text.append(formatDouble(first_value));
                    edit_text.setText(text);
                }
                else if( operation.equals("add")){
                    second_value = Double.parseDouble(text.toString());
                    first_value += second_value;
                    text.delete(0, text.length());
                    text.append(formatDouble(first_value));
                    edit_text.setText(text);
                    second_value_instantiated = false;
                    operation_stated = false;
                } else if (operation.equals("minus")) {
                    second_value = Double.parseDouble(text.toString());
                    first_value -= second_value;
                    text.delete(0, text.length());
                    text.append(formatDouble(first_value));
                    edit_text.setText(text);
                    second_value_instantiated = false;
                    operation_stated = false;
                }
                else if(operation.equals("times")){
                    second_value = Double.parseDouble(text.toString());
                    first_value *= second_value;
                    text.delete(0, text.length());
                    text.append(formatDouble(first_value));
                    edit_text.setText(text);
                    second_value_instantiated = false;
                    operation_stated = false;
                } else if (operation.equals("divide")) {
                    second_value = Double.parseDouble(text.toString());
                    first_value = first_value / second_value;
                    text.delete(0, text.length());
                    text.append(formatDouble(first_value));
                    edit_text.setText(text);
                    second_value_instantiated = false;
                    operation_stated = false;

                }
            }
        });

        Button button_decimal = (Button) findViewById(R.id.button_decimal);
        button_decimal.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                first_value_instantiated = true;
                text.append(".");
                edit_text.setText(text);

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private String formatDouble(double value){
        if(value == (int)value){
            return String.format("%d", (int)value);
        }
        else {
            return String.format("%s", value);
        }
    }

}
