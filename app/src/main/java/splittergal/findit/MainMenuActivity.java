package splittergal.findit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainMenuActivity extends AppCompatActivity {
    Button a;
    Button b;
    Button c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        a = (Button) findViewById(R.id.tags);
        b = (Button) findViewById(R.id.map);
        c = (Button) findViewById(R.id.options);
        final TextView welcomeMessage = (TextView)findViewById(R.id.tvWelcomeMsg);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        String message = "Dear " + name + " welcome to FindIt";
        welcomeMessage.setText(message);

    }

    public void ShowTags(View v) {
        Intent intent = new Intent(this, TagsActivity.class);
        startActivity(intent);
    }

    public void ShowMap(View v) {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }

    public void ShowOptions(View v) {
        Intent intent = new Intent(this, OptionsActivity.class);
        startActivity(intent);
    }
}
