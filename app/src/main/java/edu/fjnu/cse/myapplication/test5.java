package edu.fjnu.cse.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.id.edit;

public class test5 extends AppCompatActivity {
    private Button btn;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test5);

        btn= (Button) findViewById(R.id.btn);
        edit= (EditText) findViewById(R.id.edit);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
              /*  intent.addCategory(Intent.CATEGORY_DEFAULT);*/
                intent.setData(Uri.parse(edit.getText().toString()));
                startActivity(intent);
            }
        });
    }
}