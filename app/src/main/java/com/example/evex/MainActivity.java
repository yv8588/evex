package com.example.evex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
public class MainActivity extends AppCompatActivity {
    ImageView iv1, iv2, iv3;
    Button btnr, btn1, btn2, btn3;
    TextView tv1, tv2, tv3, tv4, tv5, tv6;
    EditText et1, et2, et3;
    int x = 0;
    int y = 0;
    int now = 0;
    int count = 0;
    int sum = 0;
    String s1;
    Random rnd = new Random();
    int time=Toast.LENGTH_SHORT;
    String write=" הכנס מספר" ;
    Context context = getApplicationContext();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        btnr = (Button) findViewById(R.id.btnr);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 = (ImageView) findViewById(R.id.iv2);
        iv3 = (ImageView) findViewById(R.id.iV3);
    }



        public void click1 (View view){
        x = rnd.nextInt(99) + 1;
        y = rnd.nextInt(99) + 1;
        tv1.setText(x);
        tv4.setText(y);
        s1 = et1.getText().toString();
        if (s1 == "") {
            Toast.makeText(context, write, time).show();
        }
        now = Integer.parseInt(s1);
        sum = x + y;
        if (now == (sum)) {
            count++;
            iv1.setImageResource(R.drawable.tick2);
        }
        else{
            iv1.setImageResource(R.drawable.x1);
        }
    }


        public void click2 (View view){
        tv2.setText(sum);
        y = rnd.nextInt(99) + 1;
        tv5.setText(y);
        s1 = et2.getText().toString();
        if (s1 == "") {
            Toast.makeText(context, write, time).show();
        }
        now = Integer.parseInt(s1);
        sum = sum + y;
        if (now == (sum)) {
            count++;
            iv2.setImageResource(R.drawable.tick2);

        }
        else {
            iv2.setImageResource(R.drawable.x1);
        }
        }


        public void click3 (View view){
        tv3.setText(sum);
        y = rnd.nextInt(99) + 1;
        tv6.setText(y);
        s1 = et3.getText().toString();
        if (s1 == "") {
            Toast.makeText(context, write, time).show();
        }
        now = Integer.parseInt(s1);
        sum = sum + y;
        if (now == (sum)) {
            count++;
            iv3.setImageResource(R.drawable.tick2);

        }
        else{
            iv3.setImageResource(R.drawable.x1);
        }
    }

    public void reset(View view) {
        sum=0;
        iv1.setImageResource(R.drawable.nothing1);
        iv2.setImageResource(R.drawable.nothing1);
        iv3.setImageResource(R.drawable.nothing1);
        tv1.setText("");
        tv2.setText("");
        tv3.setText("");
        tv4.setText("");
        tv5.setText("");
        tv6.setText("");
        
    }
}



