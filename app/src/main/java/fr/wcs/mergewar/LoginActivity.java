package fr.wcs.mergewar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button buttonLogin = findViewById(R.id.button_send);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editLogin = findViewById(R.id.edit_login);
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("login", editLogin.getText().toString());
                startActivity(intent);
            }
        });

    }
}
