package com.isco.calculatorandroid;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Matcher;


import com.fathzer.soft.javaluator.DoubleEvaluator;
import com.fathzer.soft.javaluator.Function;
import com.fathzer.soft.javaluator.Parameters;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    //Button variables declaration
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
    private Button buttonSubstract;
    private Button buttonTimes;
    private Button buttonDivision;
    private Button buttonClear;
    private Button buttonEquals;
    private Button buttonDot;
    private Button buttonPercentage;
    private Button buttonNegative;
    private Button buttonPi;



    private Button buttonSquareRoot;
    private Button buttonSine;
    private Button buttonParenthesis;
    private Button buttonParenthesisClose;




    int calculation;

    //variable holds textview from view file
    TextView edtNumber;

    //Holds values to perform operations
    Integer mValueOne, mValueTwo;
    Float mValueOneFloat, mValueTwoFloat;

    //Boolean variables
    //variables to check which operation is being used
    boolean addition, subtract, multiplication, division, decimal, percentage, make_negative, squareRoot, sin;

    boolean parenthesis;

    //variable to reset text once a sign is pressed
    int sign;

    //On App creation this runs
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Bring Button elements from views using its ID
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
        buttonSubstract = (Button) findViewById(R.id.substract);
        buttonTimes = (Button) findViewById(R.id.times);
        buttonDivision = (Button) findViewById(R.id.division);
        buttonClear = (Button) findViewById(R.id.clear);
        buttonEquals = (Button) findViewById(R.id.equals);
        buttonDot = (Button) findViewById(R.id.dot);
        buttonPercentage = (Button) findViewById(R.id.percentage);
        buttonNegative = (Button) findViewById(R.id.make_negative);
        buttonPi = (Button) findViewById(R.id.pi);


        buttonSquareRoot = (Button) findViewById(R.id.sqrt);
        buttonSine = (Button) findViewById(R.id.sin);
        buttonParenthesis = (Button) findViewById(R.id.parenthesis);
        buttonParenthesisClose = (Button) findViewById(R.id.close);


        //Bring Text element from views using its ID
        edtNumber = (TextView) findViewById(R.id.text);

        //set Listener on button click
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
        buttonSubstract.setOnClickListener(this);
        buttonTimes.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonPercentage.setOnClickListener(this);
        buttonNegative.setOnClickListener(this);
        buttonPi.setOnClickListener(this);


        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
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
            buttonSubstract.setOnClickListener(this);
            buttonTimes.setOnClickListener(this);
            buttonDivision.setOnClickListener(this);
            buttonClear.setOnClickListener(this);
            buttonEquals.setOnClickListener(this);
            buttonDot.setOnClickListener(this);
            buttonPercentage.setOnClickListener(this);
            buttonNegative.setOnClickListener(this);
            buttonParenthesis.setOnClickListener(this);
            buttonSquareRoot.setOnClickListener(this);
            buttonSine.setOnClickListener(this);
            buttonParenthesis.setOnClickListener(this);
            buttonParenthesisClose.setOnClickListener(this);
            buttonPi.setOnClickListener(this);
        }



    }


    //RESET method to reset text after the equal sign has been called and result showed, next click will reset the listeners
    public void reset() {
        if (sign == 1) {
            edtNumber.setText("");
        }
    }


    //On click listener action
    @Override
    public void onClick(View view) {
        //variable b brings clicked button
        Button b = (Button) view;
         String eq = "";


        //Switch statement that acts when the ID matches
        switch (b.getId()) {
            //Each case appends text to the textview
            case R.id.zero:

                reset();
                edtNumber.setText(edtNumber.getText() + "0");
                sign = 0;

                break;
            case R.id.one:

                reset();
                edtNumber.setText(edtNumber.getText() + "1");
                sign = 0;

                break;
            case R.id.two:

                reset();
                edtNumber.setText(edtNumber.getText() + "2");
                sign = 0;

                break;
            case R.id.three:

                reset();
                edtNumber.setText(edtNumber.getText() + "3");
                sign = 0;

                break;
            case R.id.four:

                reset();
                edtNumber.setText(edtNumber.getText() + "4");
                sign = 0;

                break;
            case R.id.five:

                reset();
                edtNumber.setText(edtNumber.getText() + "5");
                sign = 0;

                break;
            case R.id.six:

                reset();
                edtNumber.setText(edtNumber.getText() + "6");
                sign = 0;

                break;
            case R.id.seven:

                reset();
                edtNumber.setText(edtNumber.getText() + "7");
                sign = 0;

                break;
            case R.id.eight:

                reset();
                edtNumber.setText(edtNumber.getText() + "8");
                sign = 0;

                break;
            case R.id.nine:

                reset();
                edtNumber.setText(edtNumber.getText() + "9");
                sign = 0;

                break;

            case R.id.pi:

                reset();
                //float set= Float.parseFloat(edtNumber.getText() + "3.14");
                edtNumber.setText("3.14");
                mValueOneFloat =3.14f;
                decimal=true;
                sign = 0;

                break;
            case R.id.dot:

                reset();
                edtNumber.setText(edtNumber.getText() + ".");
                sign = 0;

                break;
// ############################## Make Negative ##############################

            case R.id.make_negative:

                if (edtNumber.getText().toString().contains("-") && edtNumber.getText().toString().charAt(0) == '-') {

                    edtNumber.setText(null);
                    sign = 1;
                }

                reset();
                edtNumber.setText(edtNumber.getText() + "-");
                sign = 0;

                make_negative = true;
                break;

// ############################## ADDITION ##############################
            case R.id.plus:


                if(parenthesis){
                    addition=false;
                    edtNumber.setText(edtNumber.getText()+"+");
                    sign=0;
                    break;
                }

                //When plus button clicked this logic is performed

                //
                if (edtNumber.getText().equals("")) {
                    edtNumber.setText("");
                } else if(!edtNumber.getText().equals("(")) {

                    //edtNumber.getText();

                    if (edtNumber.getText().toString().contains(".")) {
                        mValueOneFloat = Float.parseFloat(edtNumber.getText() + "");

                        decimal = true;
                    } else {
                        mValueOne = Integer.parseInt(edtNumber.getText() + "");
                        decimal = false;
                    }

                    addition = true;
                    edtNumber.setText(null);
                }

                break;

// ############################## SUBSTRACT ##############################
            case R.id.substract:

                if(parenthesis){
                    addition=false;
                    edtNumber.setText(edtNumber.getText()+"-");
                    sign=0;
                    break;
                }

                if (edtNumber.getText().equals("")) {
                    edtNumber.setText("");
                } else if(!edtNumber.getText().equals("(")){

                    //edtNumber.getText();

                    if (edtNumber.getText().toString().contains(".")) {
                        mValueOneFloat = Float.parseFloat(edtNumber.getText() + "");

                        decimal = true;
                    } else {
                        mValueOne = Integer.parseInt(edtNumber.getText() + "");
                    }

                    subtract = true;
                    edtNumber.setText(null);
                }

                break;
// ############################## MULTIPLICATION ##############################

            case R.id.times:


                if(parenthesis){

                    sign=1;
                    break;
                }

                if (edtNumber.getText().equals("")) {
                    edtNumber.setText("");
                } else {

                    //edtNumber.getText();

                    if (edtNumber.getText().toString().contains(".")) {
                        mValueOneFloat = Float.parseFloat(edtNumber.getText() + "");

                        decimal = true;
                    } else {
                        mValueOne = Integer.parseInt(edtNumber.getText() + "");
                    }

                    multiplication = true;
                    edtNumber.setText(null);
                }
                break;

// ############################## DIVISION ##############################

            case R.id.division:

                if(parenthesis){

                    sign=1;
                    break;
                }

                if (edtNumber.getText().equals("")) {
                    edtNumber.setText("");
                } else {

                    //edtNumber.getText();

                    if (edtNumber.getText().toString().contains(".")) {
                        mValueOneFloat = Float.parseFloat(edtNumber.getText() + "");

                        decimal = true;
                    } else {
                        mValueOne = Integer.parseInt(edtNumber.getText() + "");
                    }

                    division = true;
                    edtNumber.setText(null);
                }

                break;


// ############################## Percentage ##############################

            case R.id.percentage:


                if(parenthesis){

                    sign=1;
                    break;
                }

                if (edtNumber.getText().equals("")) {
                    edtNumber.setText("");
                } else {

                    //edtNumber.getText();

                    if (edtNumber.getText().toString().contains(".")) {
                        mValueOneFloat = Float.parseFloat(edtNumber.getText() + "");

                        decimal = true;
                    } else {
                        mValueOne = Integer.parseInt(edtNumber.getText() + "");
                    }

                    percentage = true;
                    edtNumber.setText(null);
                }

                break;
// ############################## SquareRoot ##############################

            case R.id.sqrt:

                if(parenthesis){

                    sign=1;
                    break;
                }

                if (TextUtils.isEmpty(edtNumber.getText())) {
                    edtNumber.setHint("\u221A");
                    squareRoot = true;
                    edtNumber.setText(null);
                }

//                if (edtNumber.getText().equals("")) {
//                    edtNumber.setHint("\u221A");
//                }
                // !TextUtils.isEmpty(edtNumber.getText())
                if (!TextUtils.isEmpty(edtNumber.getText())) {
                    double newNum = Double.parseDouble(edtNumber.getText() + "");
                    newNum = Math.sqrt(newNum);
                    edtNumber.setText(newNum + "");
                    //sign=1;
                    squareRoot = false;
                    break;
                }


//

//                }
                break;

// ############################## Parenthesis ##############################

           case R.id.parenthesis:

               edtNumber.setText(edtNumber.getText()+"(");
               parenthesis = true;

               break;

// ############################## ParenthesisClose ##############################

            case R.id.close:

                edtNumber.setText(edtNumber.getText()+")");
                parenthesis = true;

                break;

// ############################## EQUALS ##############################

            case R.id.equals:

                if (parenthesis == true) {

                    CalculateParenthesis calc= new CalculateParenthesis();
                    calculation = calc.calculate2(edtNumber.getText()+"");
                    edtNumber.setText( calculation + "");
                    parenthesis = false;
                    sign = 1;

                    break;
                }



                //If equals is pressed while textview has no text it sets text to "" (empty) and hint to'0'
                //It will also break the case and get ready for a new click
                if (edtNumber.getText().equals("")) {
                    edtNumber.setText("");
                    edtNumber.setHint("0");
                    break;
                }


                //Logic for user Input

                //if user input before clicking the sign was a float number, goes inside
                if (decimal) {//==float

                    //if the new input after the sign clicked does not contains a '.' parses the text to a int
                    //and then converts from int to float type
                    //and assigns it to mValueTwoFloat
                    if (!edtNumber.getText().toString().contains(".")) {
                        mValueTwoFloat = (float) (Integer.parseInt(edtNumber.getText() + ""));
                    }


                    //if the new input contains a '.' in its text it will be assign to mValueTwoFloat

                    else {
                        mValueTwoFloat = Float.parseFloat(edtNumber.getText() + "");
                    }

                }

                //if user input before clicking the sign was an int number, goes inside
                if (!decimal) {//is integer

                    //if the new input after the sign clicked contains a '.' parses the text to a float type
                    //and then converts the first input to a float
                    //and assigns it to mValueOneFloat
                    //mValueTwoFloat has the second input
                    if (edtNumber.getText().toString().contains(".")) {
                        // mValueTwoFloat = Float.parseFloat(edtNumber.getText() + "");
                        mValueTwoFloat = Float.parseFloat(edtNumber.getText() + "");
                        mValueOneFloat = (float) mValueOne;
                        decimal = true;
                    }

                    //if the new input does not contains a '.' in its text it will be assign to mValueTwo as a int

                    else {
                        mValueTwo = Integer.parseInt(edtNumber.getText() + "");
                    }
                }




// ############################## Addition ##############################


                if (addition == true) {

                    if (decimal) {
                        edtNumber.setText(mValueOneFloat + mValueTwoFloat + "");
                    } else {
                        edtNumber.setText(mValueOne + mValueTwo + "");
                    }

                    addition = false;
                    sign = 1;
                    break;
                }

// ############################## SUBSTRACTION ##############################

                if (subtract == true) {

                    if (decimal) {
                        edtNumber.setText(mValueOneFloat - mValueTwoFloat + "");
                    } else {
                        edtNumber.setText(mValueOne - mValueTwo + "");
                    }

                    subtract = false;
                    sign = 1;
                    break;
                }

                if (multiplication == true) {

                    if (decimal) {
                        edtNumber.setText(mValueOneFloat * mValueTwoFloat + "");
                    } else {
                        edtNumber.setText(mValueOne * mValueTwo + "");
                    }

                    multiplication = false;
                    sign = 1;
                    break;
                }
// ############################## Division ##############################


                if (division == true) {

                    if (decimal) {
                        edtNumber.setText(mValueOneFloat / mValueTwoFloat + "");
                    } else {
                        edtNumber.setText(mValueOne / mValueTwo + "");
                    }

                    division = false;
                    sign = 1;
                    break;
                }

// ############################## Percentage ##############################


                if (percentage == true) {

                    if (decimal) {

                        mValueOneFloat = (mValueOneFloat / 100.0f);
                        edtNumber.setText(mValueOneFloat * mValueTwoFloat + "");
                    } else {
                        float newNum = (float) mValueOne;
                        float newNum2 = (float) mValueTwo;
                        double total = ((newNum / 100.0f) * newNum2);
                        total = Math.floor(total);
                        edtNumber.setText(total + "");
                    }

                    percentage = false;
                    sign = 1;
                    break;
                }


                if (make_negative == true) {

                    edtNumber.setText(edtNumber.getText());

                    percentage = false;
                    sign = 1;
                    break;
                }


                if (squareRoot == true) {

                    if (decimal) {

                        Double newNum = Math.sqrt(mValueTwoFloat);
                        edtNumber.setText((Math.floor(newNum)) + "");
                    } else {

//                            float newNum= (float)mValueOne;
//                            float newNum2= (float)mValueTwo;
//                            double total= ((newNum/100.0f) * newNum2);
//                            total = Math.floor(total);
//                            edtNumber.setText(total + "");

                        Double newNum = Math.sqrt(mValueTwo);

                        edtNumber.setText(newNum + "");
                    }

                    percentage = false;
                    sign = 1;
                    break;
                }


//                if (sin == true) {
//
//                    if (decimal) {
//                        //sine();
//                        Double newNum = ;
//                        edtNumber.setText((Math.floor(newNum)) + "");
//                    } else {
//
////                            float newNum= (float)mValueOne;
////                            float newNum2= (float)mValueTwo;
////                            double total= ((newNum/100.0f) * newNum2);
////                            total = Math.floor(total);
////                            edtNumber.setText(total + "");
//
//                        Double newNum = Math.sqrt(mValueTwo);
//
//                        edtNumber.setText(newNum + "");
//                    }
//
//                    percentage = false;
//                    sign = 1;
//                    break;
//                }



                break;
            case R.id.clear:
                edtNumber.setText("");
                edtNumber.setHint("0");
                decimal = false;

                break;

            default:
                break;
        }


    }

//
//    public void getSine(View view){
//        TextView num = (TextView) findViewById(R.id.text);
//
//        if(num.getText().toString().equals("")){
//            num.setHint("sin(");
//
//        }
//        else{
//            Integer newNum= Integer.parseInt(num.getText()+"");
//            Function sine= new Function("sine", newNum);
//            Double num2 = Math.sin(Double.parseDouble(num.getText()+""));
//            num.setText(num2 + "");
//        }
//
//    }


}

