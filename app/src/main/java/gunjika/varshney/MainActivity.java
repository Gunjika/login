package gunjika.varshney;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText etEmail, etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_password);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();
                if (email.equals("gunjika.gla_mca17@gla.ac.in") && password.equals("1234gunjika")) {
                    Toast.makeText(MainActivity.this, "login successful!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "please check email/password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
