package com.isco.calculatorandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Stack;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonZero;
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private Button buttonPlus;
    private Button buttonRest;
    private Button buttonTimes;
    private Button buttonDivision;
    private Button buttonClear;
    private Button buttonEquals;
    private Button buttonDot;

     TextView edtNumber;

    double mValueOne, mValueTwo;
    boolean addition, subtract, multiplication, division;


    int sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonZero = (Button) findViewById(R.id.zero);
        buttonOne = (Button) findViewById(R.id.one);
        buttonTwo = (Button) findViewById(R.id.two);
        buttonThree = (Button) findViewById(R.id.three);
        buttonFour = (Button) findViewById(R.id.four);
        buttonFive = (Button) findViewById(R.id.five);
        buttonSix = (Button) findViewById(R.id.six);
        buttonSeven = (Button) findViewById(R.id.seven);
        buttonEight = (Button) findViewById(R.id.eight);
        buttonNine = (Button) findViewById(R.id.nine);
        buttonPlus = (Button) findViewById(R.id.plus);
        buttonRest = (Button) findViewById(R.id.rest);
        buttonTimes = (Button) findViewById(R.id.times);;
        buttonDivision= (Button) findViewById(R.id.division);;
        buttonClear = (Button) findViewById(R.id.clear);
        buttonEquals = (Button) findViewById(R.id.equals);
        buttonDot = (Button) findViewById(R.id.dot);


        edtNumber = (TextView) findViewById(R.id.text);
        buttonZero.setOnClickListener(this);
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonRest.setOnClickListener(this);
        buttonTimes.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);
        buttonDot.setOnClickListener(this);

    }


    public void reset(){
        if(sign ==1){
            edtNumber.setText("");
        }
    }



    @Override
    public void onClick(View view) {


        Button b = (Button) view;



        switch (b.getId()) {
            case R.id.zero:

                reset();

                edtNumber.setText(edtNumber.getText() + "0");
                break;
            case R.id.one:
                reset();

                edtNumber.setText(edtNumber.getText() + "1");
                break;
            case R.id.two:
                reset();
                edtNumber.setText(edtNumber.getText() + "2");

                break;
            case R.id.three:
                reset();
                edtNumber.setText(edtNumber.getText() + "3");

                break;
            case R.id.four:
                reset();
                edtNumber.setText(edtNumber.getText() + "4");

                break;
            case R.id.five:
                reset();
                edtNumber.setText(edtNumber.getText() + "5");

                break;
            case R.id.six:
                reset();
                edtNumber.setText(edtNumber.getText() + "6");

                break;
            case R.id.seven:
                reset();
                edtNumber.setText(edtNumber.getText() + "7");

                break;

            case R.id.eight:
                reset();
                edtNumber.setText(edtNumber.getText() + "8");

                break;

            case R.id.nine:
                reset();
                edtNumber.setText(edtNumber.getText() + "9");
                break;

            case R.id.dot:
                reset();
                edtNumber.setText(edtNumber.getText() + ".");
                break;

            case R.id.plus:

                if (edtNumber.getText().equals("")) {
                    edtNumber.setText("");
                } else {
                    mValueOne = Double.parseDouble(edtNumber.getText() + "");
                    addition = true;
                    edtNumber.setText(null);
                }

                break;

            case R.id.rest:

                if (edtNumber.getText().equals("")) {
                    edtNumber.setText("");
                } else {
                    mValueOne = Float.parseFloat(edtNumber.getText() + "");
                    subtract = true;
                    edtNumber.setText(null);
                }

                break;

            case R.id.times:

                if (edtNumber.getText().equals("")) {
                    edtNumber.setText("");
                } else {
                    mValueOne = Float.parseFloat(edtNumber.getText() + "");
                    multiplication = true;
                    edtNumber.setText(null);
                }

                break;

            case R.id.division:
                if (edtNumber.getText().equals("")) {
                    edtNumber.setText("");
                } else {
                    mValueOne = Float.parseFloat(edtNumber.getText() + "");
                    division = true;
                    edtNumber.setText(null);
                }
                break;

                case R.id.equals:

                mValueTwo = Double.parseDouble(edtNumber.getText() + "");

                if (addition == true) {
                    edtNumber.setText(mValueOne + mValueTwo + "");
                    addition = false;
                    sign=1;
                    break;
                }

                if (subtract == true) {
                    edtNumber.setText(mValueOne - mValueTwo + "");
                    subtract = false;
                    sign=1;
                    break;
                }

                if (multiplication == true) {
                    edtNumber.setText(mValueOne * mValueTwo + "");
                    multiplication = false;
                    break;
                }
                if (division == true) {
                    edtNumber.setText(mValueOne / mValueTwo + "");
                    division = false;

                }

                break;

                case R.id.clear:
                    edtNumber.setText("");
                break;

            default:
                break;
        }



    }
}

