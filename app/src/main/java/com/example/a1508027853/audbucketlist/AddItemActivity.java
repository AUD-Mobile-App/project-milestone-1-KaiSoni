package com.example.a1508027853.audbucketlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddItemActivity extends AppCompatActivity {

    // Initalize the variables to be used
    private Button SaveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        // Additional Functionality to be added

        // Define the variable to be used
        SaveButton = (Button) findViewById(R.id.btnSave);

        // When save is clicked will return back to ListActivity
        SaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), ListActivity.class));
            }
        });
    }
}
