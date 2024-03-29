package com.yusufkaratasli.hesapmakinesi;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView mySonuc;
    EditText  mySayi1;
    EditText mySayi2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        mySonuc = findViewById(R.id.sonuc);
        mySayi1 = findViewById(R.id.sayi1);
        mySayi2 = findViewById(R.id.sayi2);

    }

    public void toplam(View view){
       if (mySayi1.getText().toString().matches("") || mySayi2.getText().toString().matches("")){
           mySonuc.setText("enter number");
       }
       else {
           int number1 =  Integer.parseInt(mySayi1.getText().toString());
           int number2 = Integer.parseInt(mySayi2.getText().toString());

           int result = number1 + number2;
           mySonuc.setText("Sonuç" + "=" + String.valueOf(result));
       }
    }
    public void cikarma(View view){
        if (mySayi1.getText().toString().matches("") || mySayi2.getText().toString().matches("")){
            mySonuc.setText("enter number");
        }
        else{
            int number1= Integer.parseInt(mySayi1.getText().toString());
            int number2= Integer.parseInt(mySayi2.getText().toString());

            int result = number1 - number2;
            mySonuc.setText("sonuç" + "=" + String.valueOf(result));
        }
    }

    public void carpma(View view){
        if (mySayi1.getText().toString().matches("") || mySayi1.getText().toString().matches("")){
            mySonuc.setText("enter number");
        }
        else{
            int number1= Integer.parseInt(mySayi1.getText().toString());
            int number2= Integer.parseInt(mySayi2.getText().toString());

            int result = number1 * number2;

            mySonuc.setText("sonuç" + "=" + String.valueOf(result));
        }
    }


    public void bolme(View view){
        if (mySayi1.getText().toString().matches("") || mySayi1.getText().toString().matches("")){
            mySonuc.setText("enter number");
        }
        else {
            int number1= Integer.parseInt(mySayi1.getText().toString());
            int number2= Integer.parseInt(mySayi2.getText().toString());

            if (number2==0){
                mySonuc.setText("Lütfen 2. sayınızı sıfır girmeyiniz!!! ");
            }
            else{
                int result = number1+number2;
                mySonuc.setText("sonuç" + "=" + String.valueOf(result));
            }
        }
    }

    public void karekok(View view){
        if (mySayi1.getText().toString().matches("") || mySayi2.getText().toString().matches("")){
            mySonuc.setText("enter number");
        }
        else{
            int number1 = Integer.parseInt(mySayi1.getText().toString());
            int number2 = Integer.parseInt(mySayi2.getText().toString());

            int result = number1 + number2;
            int karekok = (int) Math.sqrt(result);

            mySonuc.setText(String.valueOf(result)+"'ın kare kökü"+"="+karekok);
        }
    }

    public void kare(View view){
        if (mySayi1.getText().toString().matches("") || mySayi2.getText().toString().matches("")){
            mySonuc.setText("enter number");
        }
        else{
            int number1 = Integer.parseInt(mySayi1.getText().toString());
            int number2 = Integer.parseInt(mySayi2.getText().toString());

            int carpma = 1;
            for (int i = 0 ; i < number2 ; i++){
                carpma = carpma * number1 ;
            }
            int result = carpma;
            mySonuc.setText(number1 + "^" + number2 + " " + "sonucu" + "=" + carpma );
        }
    }
}



