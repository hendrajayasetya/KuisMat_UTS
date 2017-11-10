package com.example.hjs.kuismat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.miftah.kuismatematika.R;

import static java.lang.Math.random;

public class MainActivity extends AppCompatActivity {
    double angka1;
    double angka2;
    int opr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SoalBaru(View view) {
        EditText Ang1 = (EditText) findViewById(R.id.Angka1);
        EditText Oper = (EditText) findViewById(R.id.Operator);
        EditText Ang2 = (EditText) findViewById(R.id.Angka2);

        String[] ar = {"+","-", "*", "/"};

        int rd1;
        int rd2;
        int rd3;
        rd1 = (int)(Math.random()*100);
        rd2 = (int)(Math.random()*100+1);
        rd3 = (int)(Math.random()*4);
        String e1 = String.valueOf(rd1);
        String e2 = String.valueOf(rd2);

        Ang1.setText(e1);
        Ang2.setText(e2);
        Oper.setText(ar[rd3]);

        angka1 = rd1;
        angka2 = rd2;
        opr = rd3;

    }

    public void CekJwb(View view) {
        EditText inpJwb = (EditText)findViewById(R.id.Input);
        EditText hasil = (EditText)findViewById(R.id.BenarSalah);
        TextView jwbB = (TextView)findViewById(R.id.Benar);
        TextView jwbS = (TextView)findViewById(R.id.Salah);

        String Jwb = inpJwb.getText().toString();
        int ang3 = Integer.parseInt(Jwb);
        String in = String.valueOf(ang3);
        String[] sb = {"Jawaban Anda Benar", "Jawaban Anda Salah"};
        int rd4;
        rd4 = (int)(Math.random()*100);
        String e3 = String.valueOf(rd4);

        if(opr==0){
            double hasil1 = angka1+angka2;
            String a = String.valueOf(hasil1);

            if(ang3==hasil1){
                hasil.setText(sb[0]);
                jwbB.setText(a);
                jwbS.setText(e3);
            }
            else {
                hasil.setText(sb[1]);
                jwbB.setText(a);
                jwbS.setText(in);
            }

        }
        if(opr==1){
            double hasil1 = angka1-angka2;
            String a = String.valueOf(hasil1);

            if(ang3==hasil1){
                hasil.setText(sb[0]);
                jwbB.setText(a);
                jwbS.setText(e3);
            }
            else {
                hasil.setText(sb[1]);
                jwbB.setText(a);
                jwbS.setText(in);
            }

        }
        if(opr==2){
            double hasil1 = angka1*angka2;
            String a = String.valueOf(hasil1);

            if(ang3==hasil1){
                hasil.setText(sb[0]);
                jwbB.setText(a);
                jwbS.setText(e3);
            }
            else {
                hasil.setText(sb[1]);
                jwbB.setText(a);
                jwbS.setText(in);
            }

        }
        if(opr==3){
            double hasil1 = angka1/angka2;
            String a = String.valueOf(hasil1);

            if(ang3==hasil1){
                hasil.setText(sb[0]);
                jwbB.setText(a);
                jwbS.setText(e3);
            }
            else {
                hasil.setText(sb[1]);
                jwbB.setText(a);
                jwbS.setText(in);
            }

        }

    }
}
