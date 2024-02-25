package com.example.login_d;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etFirstName = findViewById(R.id.etFirstName);
        final EditText etFamilyName = findViewById(R.id.etFamilyName);
        final EditText etDateOfBirth = findViewById(R.id.etDateOfBirth);
        final EditText etEmail = findViewById(R.id.etEmail);
        final EditText etPassword = findViewById(R.id.etPassword);

        Button btnSubmitRegistration = findViewById(R.id.btnSubmitRegistration);
        btnSubmitRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = etFirstName.getText().toString().trim();
                String familyName = etFamilyName.getText().toString().trim();
                String dateOfBirth = etDateOfBirth.getText().toString().trim();
                String email = etEmail.getText().toString().trim();
                String password = etPassword.getText().toString();

                if (validateInput(firstName, familyName, dateOfBirth, email, password)) {
                    // Registration logic
                    Toast.makeText(RegisterActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                    finish(); // Go back to the previous screen (MainActivity)
                }
            }
        });
    }

    private boolean validateInput(String firstName, String familyName, String dob, String email, String password) {
        if (firstName.isEmpty() || firstName.length() < 3 || firstName.length() > 30) {
            Toast.makeText(this, "First name must be between 3 and 30 characters", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (familyName.isEmpty()) {
            Toast.makeText(this, "Family name cannot be empty", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (!dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
            Toast.makeText(this, "Date of Birth must be in the format mm/dd/yyyy", Toast.LENGTH_SHORT).show();
            return false;
        }


        // Simple email validation
        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, "Enter a valid email address", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (password.isEmpty()) {
            Toast.makeText(this, "Password cannot be empty", Toast.LENGTH_SHORT).show();
            return false;
        }

        // Additional validations can be added here

        return true; // Validation passed
    }
}




