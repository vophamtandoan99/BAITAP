package com.example.btth1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {
        Button btnDangky;
        EditText edtEmail,editPass;
        FirebaseAuth mAuthencation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuthencation= FirebaseAuth.getInstance();
        mapping();

    }
        private  void  Dangky(){
            String email = edtEmail.getText().toString();
            String password = editPass.getText().toString();
            mAuthencation.creat(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(MainActivity.this,"Đăng ký thành công",Toast.LENGTH_SHORT).show();

                    }
                    else {
                        Toast.makeText(MainActivity.this,"Đăng ký thất bại",Toast.LENGTH_SHORT).show();
                    }

                }
            });


    }
    private  void mapping () {
        btnDangky = (Button) findViewById(R.id.btn_dangky);
        edtEmail = (EditText) findViewById(R.id.et_name);
        editPass = (EditText) findViewById(R.id.et_pass);
    }
}
