package splittergal.findit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
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
    }

    public void ShowTags(View v) {
        Intent intent = new Intent(this, Tags.class);
        startActivity(intent);
    }

    public void ShowMap(View v) {
        Intent intent = new Intent(this, Map.class);
        startActivity(intent);
    }

    public void ShowOptions(View v) {
        Intent intent = new Intent(this, Options.class);
        startActivity(intent);
    }
}
