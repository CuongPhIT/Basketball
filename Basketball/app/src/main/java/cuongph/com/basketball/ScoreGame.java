package cuongph.com.basketball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreGame extends AppCompatActivity {
    private TextView tv_score1, tv_score2, tv_name1, tv_name2;
    private Button btn_add3team1, btn_add2team1, btn_add1team1;
    private Button btn_add3team2, btn_add2team2, btn_add1team2;
    private Button btn_reset;
    private int points1 = 0, points2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_game);

        tv_name1 = (TextView)findViewById(R.id.textView_team1);
        tv_name2 = (TextView)findViewById(R.id.textView_team2);
        tv_name1.setText(getIntent().getStringExtra("team 1"));
        tv_name2.setText(getIntent().getStringExtra("team 2"));

        btn_add1team1 = (Button)findViewById(R.id.btn_add1pointsteam1);
        btn_add2team1 = (Button)findViewById(R.id.btn_add2pointsteam1);
        btn_add3team1 = (Button)findViewById(R.id.btn_add3pointsteam1);

        btn_add1team2 = (Button)findViewById(R.id.btn_add1pointsteam2);
        btn_add2team2 = (Button)findViewById(R.id.btn_add2pointsteam2);
        btn_add3team2 = (Button)findViewById(R.id.btn_add3pointsteam2);

        btn_reset = (Button)findViewById(R.id.btn_reset);

        tv_score1 = (TextView)findViewById(R.id.textView_score1);
        tv_score2 = (TextView)findViewById(R.id.textView_score2);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                points1 = Integer.parseInt(tv_score1.getText().toString());
                points2 = Integer.parseInt(tv_score2.getText().toString());
                switch (v.getId()){
                    case R.id.btn_add1pointsteam1:{
                        points1=points1 + 1;
                        tv_score1.setText(String.valueOf(points1));
                        break;
                    }
                    case R.id.btn_add2pointsteam1:{
                        points1 = points1 + 2;
                        tv_score1.setText(String.valueOf(points1));
                        break;
                    }
                    case R.id.btn_add3pointsteam1:{
                        points1 = points1 + 3;
                        tv_score1.setText(String.valueOf(points1));
                        break;
                    }
                    case R.id.btn_add1pointsteam2:{
                        points2 = points2 + 1;
                        tv_score2.setText(String.valueOf(points2));
                        break;
                    }
                    case R.id.btn_add2pointsteam2:{
                        points2 = points2 + 2;
                        tv_score2.setText(String.valueOf(points2));
                        break;
                    }
                    case R.id.btn_add3pointsteam2:{
                        points2 = points2 + 3;
                        tv_score2.setText(String.valueOf(points2));
                        break;
                    }
                    case R.id.btn_reset:{
                        tv_score1.setText("0");
                        tv_score2.setText("0");
                    }
                }
            }
        };

        btn_add1team1.setOnClickListener(listener);
        btn_add2team1.setOnClickListener(listener);
        btn_add3team1.setOnClickListener(listener);
        btn_add1team2.setOnClickListener(listener);
        btn_add2team2.setOnClickListener(listener);
        btn_add3team2.setOnClickListener(listener);
        btn_reset.setOnClickListener(listener);
    }

}
