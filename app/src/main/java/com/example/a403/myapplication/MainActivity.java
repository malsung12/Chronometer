package com.example.a403.myapplication;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

import static android.R.attr.button;
import static android.R.attr.visible;
import static com.example.a403.myapplication.R.id.calendarView5;
import static com.example.a403.myapplication.R.id.chronometer3;
import static com.example.a403.myapplication.R.id.radioButton3;
import static com.example.a403.myapplication.R.id.radioButton4;
import static com.example.a403.myapplication.R.id.text;
import static com.example.a403.myapplication.R.id.textView;
import static com.example.a403.myapplication.R.id.timePicker4;

public class MainActivity extends AppCompatActivity {

    Chronometer chronometer3;
    Button button2;
    Button button3;
    RadioButton radioButton3;
    RadioButton radioButton4;
    TimePicker timePicker4;
    CalendarView calendarView5;
    TextView textView;
    RadioGroup rg;
    FrameLayout frame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("시간 예약");

        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton) findViewById(R.id.radioButton4);
        timePicker4 = (TimePicker) findViewById(R.id.timePicker4);
        calendarView5 = (CalendarView) findViewById(R.id.calendarView5);
        textView = (TextView) findViewById(R.id.textView);
        rg = (RadioGroup) findViewById(R.id.rg);
        frame = (FrameLayout) findViewById(R.id.frame);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer3.setBase(SystemClock.elapsedRealtime());
                chronometer3.start();
                chronometer3.setTextColor(Color.RED);
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if(checkedId == R.id.radioButton3) {
                    frame.setVisibility(View.VISIBLE);
                    calendarView5.setVisibility(View.VISIBLE);
                    timePicker4.setVisibility(View.INVISIBLE);
                }
                if(checkedId == R.id.radioButton4) {
                    frame.setVisibility(View.VISIBLE);
                    timePicker4.setVisibility(View.VISIBLE);
                    calendarView5.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}
