package fr.wildcodeschool.qutesimpleui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLogin = findViewById(R.id.button_login);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editFirstName = findViewById(R.id.edit_firstName);
                String firstName = editFirstName.getText().toString();

                EditText editLastName = findViewById(R.id.edit_lastName);
                String lastName = editLastName.getText().toString();

                TextView Congratulation = findViewById(R.id.congratulation);
                String congratulation = Congratulation.getText().toString();

                if ((firstName.length() == 0 || (lastName.length() == 0))) {
                    Toast.makeText(MainActivity.this, "Please fill your Firstname and Lastname!", Toast.LENGTH_SHORT).show();
                }
                else {
                    String message = ("Congratulation" + " " + firstName + " " + lastName);
                    Congratulation.setText(message);
                    Congratulation.setVisibility(View.VISIBLE);
                }
            }
        });

        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                EditText editFirstName = findViewById(R.id.edit_firstName);
                EditText editLastName = findViewById(R.id.edit_lastName);

                if (isChecked) {
                    editFirstName.setEnabled(true);
                    editLastName.setEnabled(true);
                } else {
                    editFirstName.setEnabled(false);
                    editLastName.setEnabled(false);
                }
            }
        });

    }
}
