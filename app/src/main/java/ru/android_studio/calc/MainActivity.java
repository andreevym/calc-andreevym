package ru.android_studio.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_4).setOnClickListener(this);
        findViewById(R.id.btn_5).setOnClickListener(this);
        findViewById(R.id.btn_6).setOnClickListener(this);
        findViewById(R.id.btn_7).setOnClickListener(this);
        findViewById(R.id.btn_8).setOnClickListener(this);
        findViewById(R.id.btn_9).setOnClickListener(this);
        findViewById(R.id.btn_minus).setOnClickListener(this);
        findViewById(R.id.btn_plus).setOnClickListener(this);
        findViewById(R.id.btn_c).setOnClickListener(this);

        result = (TextView) findViewById(R.id.result);
    }
    TextView result;


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                String text1 = result.getText() + "1";
                result.setText(text1);
                break;
            case R.id.btn_2:
                String text2 = result.getText() + "2";
                result.setText(text2);
                break;
            case R.id.btn_3:
                String text3 = result.getText() + "3";
                result.setText(text3);
                break;
            case R.id.btn_4:
                String text4 = result.getText() + "4";
                result.setText(text4);
                break;
            case R.id.btn_5:
                String text5 = result.getText() + "5";
                result.setText(text5);
                break;
            case R.id.btn_6:
                String text6 = result.getText() + "6";
                result.setText(text6);
                break;
            case R.id.btn_7:
                String text7 = result.getText() + "7";
                result.setText(text7);
                break;
            case R.id.btn_8:
                String text8 = result.getText() + "8";
                result.setText(text8);
                break;
            case R.id.btn_9:
                String text9 = result.getText() + "9";
                result.setText(text9);
                break;
            case R.id.btn_minus:
                String textM = result.getText() + "-";
                result.setText(textM);
                break;
            case R.id.btn_plus:
                String textP = result.getText() + "+";
                result.setText(textP);
                break;
            case R.id.btn_result:
                String textR = result.getText() + "+";
                result.setText(textR);
                break;
            case R.id.btn_c:
                result.setText("");
                break;

            default:
                Toast.makeText(this, "unknown", Toast.LENGTH_LONG).show();
                break;
        }

    }
}
