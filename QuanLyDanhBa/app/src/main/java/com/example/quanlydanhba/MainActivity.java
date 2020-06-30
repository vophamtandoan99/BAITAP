package com.example.quanlydanhba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import Adapter_Contact.ContactAdapter;
import model.Contact;

public class MainActivity extends AppCompatActivity  {
    private List<Contact> arrayContact;
    private ContactAdapter adapter;
    private EditText edtName;
    private EditText edtNumber;
    private RadioButton rbtnMale;
    private RadioButton rbtnFemale;
    private Button btnAddcontact;
    private ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setVidget();
        arrayContact = new ArrayList<>();
        adapter = new ContactAdapter(this ,R.layout.item_contact_listview,arrayContact);
        lvContact.setAdapter(adapter);
    }
    public void setVidget(){
        edtName= (EditText) findViewById(R.id.edt_name);
        edtNumber= (EditText) findViewById(R.id.edt_number);
        rbtnMale =(RadioButton) findViewById(R.id.rbtn_male);
        rbtnFemale =(RadioButton) findViewById(R.id.rbtn_fenale);
        btnAddcontact =(Button) findViewById(R.id.btn_add_contact);
        lvContact =(ListView) findViewById(R.id.lv_contact);
    }
    public void addContact(View view){
        if(view.getId()==R.id.btn_add_contact){
            String name =edtName.getText().toString().trim();
            String number = edtNumber.getText().toString().trim();
            boolean isMale =true;
            if (rbtnMale.isChecked()){
                isMale = true;
            }else {
                isMale = false;
            }
            if (TextUtils.isEmpty(name) || TextUtils.isEmpty(number)){
                Toast.makeText(this , "Bạn phải nhập thông tin ",Toast.LENGTH_SHORT).show();
            }else {
                Contact contact = new Contact(isMale,name,number);
                arrayContact.add(contact);
            }
            adapter.notifyDataSetChanged();

        }
    }
}
