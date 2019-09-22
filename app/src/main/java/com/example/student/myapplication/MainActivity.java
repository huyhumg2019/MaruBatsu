package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
int iCount =0;
    int a[] = new int[8];
    Button button[]  = new Button[9];
    TextView text;
    Button reset;
boolean flag =true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button[0] = findViewById(R.id.button0);
        button[1] = findViewById(R.id.button1);
        button[2] = findViewById(R.id.button2);
        button[3] = findViewById(R.id.button3);
        button[4] = findViewById(R.id.button4);
        button[5] = findViewById(R.id.button5);
        button[6] = findViewById(R.id.button6);
        button[7] = findViewById(R.id.button7);
        button[8] = findViewById(R.id.button8);

        button[0].setOnClickListener(this);
        button[1].setOnClickListener(this);
        button[2].setOnClickListener(this);
        button[3].setOnClickListener(this);
        button[4].setOnClickListener(this);
        button[5].setOnClickListener(this);
        button[6].setOnClickListener(this);
        button[7].setOnClickListener(this);
        button[8].setOnClickListener(this);
        text = findViewById(R.id.text);

        reset =findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0;i<9;i++){
                    button[i].setText("");
                }

                iCount = 0;

            }
        });
        for (int i=0;i<9;i++){
            button[i].setTextSize(40);

        }

        }


    @Override
    public void onClick(View v) {
        if (((Button)v).getText().toString().length()==0){
            if (iCount%2==0){
                ((Button)v).setText("O");


            } else {
                ((Button)v).setText("X");


              }
     }
            else{
            return;
        }
        //flag=true;

//        String strButton0 = button[0].getText().toString();
//        String strButton1 = button[1].getText().toString();
//        String strButton2 = button[2].getText().toString();
        String[] strButton = new String[9];
        for (int i=0;i<9;i++){
            strButton[i] = button[i].getText().toString();
        }
        if (strButton[0].length()>0) {
            if (strButton[0].equals(strButton[1]) && strButton[1].equals(strButton[2])) {
                if (iCount % 2 == 0) {
                    text.setText("O 勝つ");
                } else {
                    text.setText("X  勝つ");
                }
            }}


            if (strButton[0].length() > 0) {
                if (strButton[0].equals(strButton[4]) && strButton[4].equals(strButton[8])) {
                    if (iCount % 2 == 0) {
                        text.setText("O 勝つ");
                    } else {
                        text.setText("X  勝つ");
                    }
                }
            }
            if (strButton[0].length() > 0) {
                if (strButton[0].equals(strButton[3]) && strButton[3].equals(strButton[6])) {
                    if (iCount % 2 == 0) {
                        text.setText("O 勝つ");
                    } else {
                        text.setText("X  勝つ");
                    }
                }
            }
            if (strButton[1].length() > 0) {
                if (strButton[1].equals(strButton[4]) && strButton[4].equals(strButton[7])) {
                    if (iCount % 2 == 0) {
                        text.setText("O 勝つ");
                    } else {
                        text.setText("X  勝つ");
                    }
                }
            }
            if (strButton[2].length() > 0) {

                if (strButton[2].equals(strButton[4]) && strButton[4].equals(strButton[6])) {
                    if (iCount % 2 == 0) {
                        text.setText("O 勝つ");
                    } else {
                        text.setText("X  勝つ");
                    }
                }
            }
            if (strButton[3].length() > 0) {
                if (strButton[3].equals(strButton[4]) && strButton[4].equals(strButton[5])) {
                    if (iCount % 2 == 0) {
                        text.setText("O 勝つ");
                    } else {
                        text.setText("X  勝つ");
                    }
                }
            }
            if (strButton[2].length() > 0) {
                if (strButton[2].equals(strButton[5]) && strButton[5].equals(strButton[8])) {
                    if (iCount % 2 == 0) {
                        text.setText("O 勝つ");
                    } else {
                        text.setText("X  勝つ");
                    }
                }
            }
            if (strButton[6].length() > 0) {
                if (strButton[6].equals(strButton[7]) && strButton[7].equals(strButton[8])) {
                    if (iCount % 2 == 0) {
                        text.setText("O 勝つ");
                    } else {
                        text.setText("X  勝つ");
                    }
                }
            }
        iCount++;

        }

    }






