package com.example.junyang1.menuupload;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class menuuploadActivity extends Activity {

    private EditText mNameEt = null; // client input item

    private Button mUploadBtn = null; // translate button


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuupload);


        //get interface component
        mNameEt =  (EditText) findViewById(R.id.menu_item);

        mUploadBtn = (Button) findViewById(R.id.button_upload);

     // client click button, get input
        mUploadBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // get input
                  String name = mNameEt.getText().toString();

                // infomation of get
                Toast.makeText(menuuploadActivity.this, "Input：" + name, Toast.LENGTH_SHORT).show();



            }
    });
}
}