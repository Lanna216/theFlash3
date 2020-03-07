package com.aylanna.theflash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class addCardActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);



        findViewById(R.id.cancelIcon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        findViewById(R.id.saveIcon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Q = ((EditText) findViewById(R.id.editTextQ)).getText().toString();
                String A = ((EditText) findViewById(R.id.editTextA)).getText().toString();
                Intent data = new Intent(); // create a new Intent, this is where we will put our data
                data.putExtra("stringQ", Q); // puts one string into the Intent, with the key as 'stringQ'
                data.putExtra("stringA", A); // puts another string into the Intent, with the key as 'stringA'
                setResult(RESULT_OK, data); // set result code and bundle data for response
                finish(); // closes this activity and pass data to the original activity that launched this activity
            }
        });
    }



}
