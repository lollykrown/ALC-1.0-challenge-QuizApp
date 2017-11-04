package com.example.android.main2activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.android.quizapp.R;

public class Main2Activity extends AppCompatActivity {

    private Button mGoBackButton;

    private String ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9, ans10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mGoBackButton = (Button) findViewById(R.id.go_back_button);

        mGoBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
    }


    public void onRadioAns1Clicked (View view) {
        //is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans_1a:
                if (checked)
                     ans1 = "Correct!";
                break;
            case R.id.ans_1b:
                if (checked)
                    ans1 = "Wrong! The answer is A. (56)";
                break;
            case R.id.ans_1c:
                if (checked)
                    ans1 = "Wrong! The answer is A. (56)";
                break;
        }
    }

    public void onRadioAns2Clicked (View view) {
        //is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans_2a:
                if (checked)
                    ans2 = "Wrong! The answer is B. (Nile)";
                break;
            case R.id.ans_2b:
                if (checked)
                    ans2 = "Correct!";
                break;
            case R.id.ans_2c:
                if (checked)
                    ans2 = "Wrong! The answer is B. (Nile)";
                break;
        }
    }

    public void onRadioAns3Clicked (View view) {
        //is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans_3a:
                if (checked)
                    ans3 = "Wrong! The answer is C. (Kilimanjaro)";
                break;
            case R.id.ans_3b:
                if (checked)
                    ans3 = "Wrong! The answer is C. (Kilimanjaro)";
                break;
            case R.id.ans_3c:
                if (checked)
                    ans3 = "Correct!";
                break;
        }
    }

    public void onRadioAns4Clicked (View view) {
        //is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans_4a:
                if (checked)
                    ans4 = "Wrong! The answer is B. (Ethiopia)";
                break;
            case R.id.ans_4b:
                if (checked)
                    ans4 = "Correct!";
                break;
            case R.id.ans_4c:
                if (checked)
                    ans4 = "Wrong! The answer is B. (Ethiopia)";
                break;
        }
    }

    public void onRadioAns5Clicked (View view) {
        //is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans_5a:
                if (checked)
                    ans5 = "Correct!";
                break;
            case R.id.ans_5b:
                if (checked)
                    ans5 = "Wrong! The answer is A. (Nigeria)";
                break;
            case R.id.ans_5c:
                if (checked)
                    ans5 = "Wrong! The answer is A. (Nigeria)";
                break;
        }
    }

    public void onRadioAns6Clicked (View view) {
        //is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans_6a:
                if (checked)
                    ans6 = "Wrong! The answer is B. (1923)";
                break;
            case R.id.ans_6b:
                if (checked)
                    ans6 = "Correct!";
                break;
            case R.id.ans_6c:
                if (checked)
                    ans6 = "Wrong! The answer is B. (1923)";
                break;
        }
    }

    public void onRadioAns7Clicked (View view) {
        //is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans_7a:
                if (checked)
                    ans7 = "Wrong! The answer is C. (1976)";
                break;
            case R.id.ans_7b:
                if (checked)
                    ans7 = "Wrong! The answer is C. (1976)";
                break;
            case R.id.ans_7c:
                if (checked)
                    ans7 = "Correct!";
                break;
        }
    }

    public void onRadioAns8Clicked (View view) {
        //is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans_8a:
                if (checked)
                    ans8 = "Wrong! The answer is B. (Nigeria)";
                break;
            case R.id.ans_8b:
                if (checked)
                    ans8 = "Correct!";
                break;
            case R.id.ans_8c:
                if (checked)
                    ans8 = "Wrong! The answer is B. (Nigeria)";
                break;
        }
    }

    public void onRadioAns9Clicked (View view) {
        //is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans_9a:
                if (checked)
                    ans9 = "Correct!";
                break;
            case R.id.ans_9b:
                if (checked)
                    ans9 = "Wrong! The answer is A. (1963)";
                break;
            case R.id.ans_9c:
                if (checked)
                    ans9 = "Wrong! The answer is A. (1963)";
                break;
        }
    }

    public void onRadioAns10Clicked (View view) {
        //is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //check which radio button was clicked
        switch (view.getId()) {
            case R.id.ans_10a:
                if (checked)
                    ans10 = "Wrong! The answer is B. (Nigeria)";
                break;
            case R.id.ans_10b:
                if (checked)
                    ans10 = "Correct!";
                break;
            case R.id.ans_10c:
                if (checked)
                    ans10 = "Wrong! The answer is B. (Nigeria)";
                break;
        }
    }

    public void getFinalAnswer(View view) {

        String finalResult = createFinalResult(ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9, ans10);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Your Quiz result.");
        intent.putExtra(Intent.EXTRA_TEXT, "\"This is the total results of your quiz. \n\n\"" + finalResult);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

        displayMessage(finalResult);
    }
//
//    public void onClear(View v) {
//        radioGroup1.clearCheck();
//    }

    private String createFinalResult(String a1, String a2, String a3, String a4, String a5, String a6, String a7, String a8,
                                     String a9, String a10) {
        String finalResult = "1. " + a1;
        finalResult += "\n2. " + a2;
        finalResult += "\n3. " + a3;
        finalResult += "\n4. " + a4;
        finalResult += "\n5. " + a5;
        finalResult += "\n6. " + a6;
        finalResult += "\n7. " + a7;
        finalResult += "\n8. " + a8;
        finalResult += "\n9. " + a9;
        finalResult += "\n10. " + a10;
        return finalResult;
    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.answer_textview);
        priceTextView.setText(message);
    }
}