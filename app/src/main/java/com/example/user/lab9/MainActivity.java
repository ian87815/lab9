package com.example.user.lab9;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected EditText editText;
    protected EditText editText2;
    protected RadioButton radioButton;
    protected RadioButton radioButton2;
    protected RadioGroup radioGroup;
    protected Button button;
    protected TextView textView4;
    protected TextView textView5;

    int gender = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        editText=(EditText) findViewById(R.id.editText);
        editText2=(EditText) findViewById(R.id.editText2);
        radioButton=(RadioButton) findViewById(R.id.radioButton);
        radioButton2=(RadioButton) findViewById(R.id.radioButton2);
        radioGroup=(RadioGroup) findViewById(R.id.radioGroup);
        button=(Button) findViewById(R.id.button);
        textView4=(TextView) findViewById(R.id.textView4);
        textView5=(TextView) findViewById(R.id.textView5);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (radioGroup.getCheckedRadioButtonId()) {
                    case R.id.radioButton:
                        gender=1;
                        break;
                    case R.id.radioButton2:
                        gender=2;
                        break;
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                runAsyncTask();
            }
        });
    }
    private void runAsyncTask() {
        new AsyncTask<Void,Integer,Boolean>() {
            private ProgressDialog dialog = new ProgressDialog(MainActivity.this);
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                dialog.setMessage("計算中....");
                dialog.setCancelable(false);
                dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                dialog.show();
            }
            @Override
            protected Boolean doInBackground(Void...voids) {
                int progress
            }
        }
    }
}
