package com.example.cheackboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox acheckBox,jchechBox,phcheckbox,pycheckbox,ucheckbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        acheckBox=findViewById(R.id.androidCheckBox);
        acheckBox.setOnClickListener(this);
        jchechBox=findViewById(R.id.javaCheckBox);
        jchechBox.setOnClickListener(this);
        phcheckbox=findViewById(R.id.phpcheckBox);
        phcheckbox.setOnClickListener(this);
        pycheckbox=findViewById(R.id.pythoncheckBox);
        pycheckbox.setOnClickListener(this);
        ucheckbox=findViewById(R.id.unitycheckBox);
        ucheckbox.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.androidCheckBox:
                if (acheckBox.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Android",Toast.LENGTH_SHORT);
                }
                break;
            case R.id.javaCheckBox:
                if (jchechBox.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Java",Toast.LENGTH_SHORT);
                }
                break;
            case R.id.phpcheckBox:
                if (phcheckbox.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"PHP",Toast.LENGTH_SHORT);
                }
                break;
            case R.id.pythoncheckBox:
                if (pycheckbox.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Python",Toast.LENGTH_SHORT);
                }
                break;
            case R.id.unitycheckBox:
                if (ucheckbox.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Unity",Toast.LENGTH_SHORT);
                }
                break;
        }
    }
}
