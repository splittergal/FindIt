package splittergal.findit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {
    Button a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        a = (Button) findViewById(R.id.mainmenu);
    }

    public void ShowMainMenu(View v) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}
