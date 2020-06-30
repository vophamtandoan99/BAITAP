package com.example.kiemtra;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton cau11, cau12, cau13, cau14;
    RadioButton cau21, cau22, cau23, cau24;
    RadioButton cau31, cau32, cau33, cau34;
    RadioButton cau41, cau42, cau43, cau44;
    RadioButton cau51, cau52, cau53, cau54;
    Button ketqua, lamlai;
    RadioGroup RadioG1, RadioG2, RadioG3, RadioG4, RadioG5;
    int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                cau11 = (RadioButton) findViewById(R.id.RB11);
                cau12 = (RadioButton) findViewById(R.id.RB12);
                cau13 = (RadioButton) findViewById(R.id.RB13);
                cau14 = (RadioButton) findViewById(R.id.RB14);
                cau21 = (RadioButton) findViewById(R.id.RB21);
                cau22 = (RadioButton) findViewById(R.id.RB22);
                cau23 = (RadioButton) findViewById(R.id.RB23);
                cau24 = (RadioButton) findViewById(R.id.RB24);
                cau31 = (RadioButton) findViewById(R.id.RB31);
                cau32 = (RadioButton) findViewById(R.id.RB32);
                cau33 = (RadioButton) findViewById(R.id.RB33);
                cau34 = (RadioButton) findViewById(R.id.RB34);
                cau41 = (RadioButton) findViewById(R.id.RB41);
                cau42 = (RadioButton) findViewById(R.id.RB42);
                cau43 = (RadioButton) findViewById(R.id.RB43);
                cau44 = (RadioButton) findViewById(R.id.RB44);
                cau51 = (RadioButton) findViewById(R.id.RB51);
                cau52 = (RadioButton) findViewById(R.id.RB52);
                cau53 = (RadioButton) findViewById(R.id.RB53);
                cau54 = (RadioButton) findViewById(R.id.RB54);

                RadioG1 = (RadioGroup) findViewById(R.id.RG1);
                RadioG2 = (RadioGroup) findViewById(R.id.RG2);
                RadioG3 = (RadioGroup) findViewById(R.id.RG3);
                RadioG4 = (RadioGroup) findViewById(R.id.RG4);
                RadioG5 = (RadioGroup) findViewById(R.id.RG5);

                ketqua = (Button) findViewById(R.id.kq);
                lamlai = (Button) findViewById(R.id.ll);
            }
            public void ketqua(View v)
            {
                if(cau12.isChecked())
                    a+=2;
                if (cau23.isChecked())
                    a+=2;
                if(cau34.isChecked())
                    a+=2;
                if(cau41.isChecked())
                    a+=2;
                if(cau51.isChecked())
                    a+=2;
                AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
                ab.setTitle("KẾT QUẢ BÀI THI ĐẠT ĐƯỢC");
                ab.setMessage(a+"/10");
                ab.show();
                a=0;
            }
            public void lamlai(View view){
                if(view.getId() == R.id.ll){
                AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
                ab.setMessage("Bạn có muốn làm lại bài thi?");
                ab.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    RadioG1.clearCheck();
                    RadioG2.clearCheck();
                    RadioG3.clearCheck();
                    RadioG4.clearCheck();
                    RadioG5.clearCheck();
                }
             });
                ab.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            ab.show();

        }

    }
}
