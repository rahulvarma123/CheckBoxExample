package com.example.checkboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox chkBoxEnglish, chkBoxGerman, chkBoxFrench;
    TextView txtViewLang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkBoxEnglish = findViewById(R.id.cbEnglish);
        chkBoxGerman = findViewById(R.id.cbGerman);
        chkBoxFrench = findViewById(R.id.cbFrench);

        txtViewLang = findViewById(R.id.tvSelLang);

        chkBoxEnglish.setOnCheckedChangeListener(this);
        chkBoxGerman.setOnCheckedChangeListener(this);
        chkBoxFrench.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        String selectedLang = "";
        if (chkBoxEnglish.isChecked()) {
            selectedLang = chkBoxEnglish.getText().toString();
        }
        if (chkBoxGerman.isChecked()) {
            selectedLang = selectedLang + chkBoxGerman.getText();
        }
        if (chkBoxFrench.isChecked()) {
            selectedLang = selectedLang + chkBoxFrench.getText();
        }
        txtViewLang.setText(selectedLang);
    }
}
