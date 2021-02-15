package edu.co.icesi.ams1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.text.DateTimePatternGenerator.PatternInfo.OK;

public class MainActivity extends AppCompatActivity {

    private TextView loginTitle;
    private ImageView loginLogo;
    private EditText loginUsername;
    private EditText loginPassword;
    private Button loginIniciarBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referenciar
        loginTitle = findViewById(R.id.loginTitle);
        loginLogo = findViewById(R.id.loginLogo);
        loginUsername = findViewById(R.id.loginUsername);
        loginPassword = findViewById(R.id.loginPassword);
        loginIniciarBtn = findViewById(R.id.loginIniciarBtn);

    }


}