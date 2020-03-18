package com.gmail.mycheckbox.bmichaelh13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private CheckBox momCheckBox;
    private CheckBox dadCheckBox;
    private CheckBox otherCheckBox;

    private Button showButton;
    private TextView showTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        momCheckBox = (CheckBox) findViewById(R.id.momCheckBoxId);
        dadCheckBox = (CheckBox) findViewById(R.id.dadCheckBoxId);
        otherCheckBox = (CheckBox) findViewById(R.id.otherCheckBoxId);

        showTextView = (TextView) findViewById(R.id.showButtonId);
        showButton = (Button) findViewById(R.id.showButtonId);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(momCheckBox.getText().toString() + "status is: " + momCheckBox.isChecked() + "\n");
                stringBuilder.append(dadCheckBox.getText().toString() + "status is: " + dadCheckBox.isChecked() + "\n");
                stringBuilder.append(otherCheckBox.getText().toString() + "status is: " + otherCheckBox.isChecked() + "\n");

                showTextView.setText(stringBuilder);


            }
        });

    }
}
