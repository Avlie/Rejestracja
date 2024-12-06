package com.example.rejestracja;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText TextEmail;
    private EditText editTextPassword;
    private EditText editTextPassword2;
    private Button buttonSubmit;
    private TextView Zmiana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextPassword2 = findViewById(R.id.editTextPassword2);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        Zmiana = findViewById(R.id.zmiana);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = TextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString();
                String repeatPassword = editTextPassword2.getText().toString();

                if (!email.contains("@")) {
                    Zmiana.setText("Nieprawidłowy adres e-mail");
                } else if (!password.equals(repeatPassword)) {
                    Zmiana.setText("Hasła się różnią");
                } else {
                    Zmiana.setText("Witaj " + email);
                }
            }
        });
    }
}