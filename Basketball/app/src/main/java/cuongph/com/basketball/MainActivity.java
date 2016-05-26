package cuongph.com.basketball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn_play;

    private EditText et_name1, et_name2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_play = (Button)findViewById(R.id.btn_play);
        et_name1 = (EditText)findViewById(R.id.editText_team1);
        et_name2 = (EditText)findViewById(R.id.editText_team2);

        btn_play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intentPlay = new Intent(getApplicationContext(), ScoreGame.class);
                intentPlay.putExtra("team 1", et_name1.getText().toString());
                intentPlay.putExtra("team 2", et_name2.getText().toString());
                startActivity(intentPlay);
            }
        });

    }
}