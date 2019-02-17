package com.example.scorekeeper_task;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private int score_1 = 0;
    private int score_2 = 0;
    private int score_6 = 0;
    private int score_1_1 = 0;
    private int score_2_2 = 0;
    private int score_6_6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    public void minus_1(View view) {
        score_1--;
        TextView score_text = (TextView)findViewById(R.id.score_1);
        if (score_text != null) {
            score_text.setText(String.valueOf(score_1));
        }
    }

    public void plus_1(View view) {
        score_1++;
        TextView score_text = (TextView)findViewById(R.id.score_1);
        if (score_text != null) {
            score_text.setText(String.valueOf(score_1));
        }
    }

    public void minus_2(View view) {
        score_2 = score_2 - 2;
        TextView score_text = (TextView)findViewById(R.id.score_1);
        if (score_text != null) {
            score_text.setText(String.valueOf(score_2));
        }
    }

    public void plus_2(View view) {
        score_2 = score_2 + 2;
        TextView score_text = (TextView)findViewById(R.id.score_1);
        if (score_text != null) {
            score_text.setText(String.valueOf(score_2));
        }
    }
    public void minus_6(View view) {
        score_6 = score_6 - 6;
        TextView score_text = (TextView)findViewById(R.id.score_1);
        if (score_text != null) {
            score_text.setText(String.valueOf(score_6));
        }
    }

    public void plus_6(View view) {
        score_6 = score_6 + 6;
        TextView score_text = (TextView)findViewById(R.id.score_1);
        if (score_text != null) {
            score_text.setText(String.valueOf(score_6));
        }
    }
    public void minus_1_1(View view) {
        score_1_1--;
        TextView score_text = (TextView)findViewById(R.id.score_2);
        if (score_text != null) {
            score_text.setText(String.valueOf(score_1_1));
        }
    }

    public void plus_1_1(View view) {
        score_1_1++;
        TextView score_text = (TextView)findViewById(R.id.score_2);
        if (score_text != null) {
            score_text.setText(String.valueOf(score_1_1));
        }
    }

    public void minus_2_2(View view) {
        score_2_2 = score_2_2 - 2;
        TextView score_text = (TextView)findViewById(R.id.score_2);
        if (score_text != null) {
            score_text.setText(String.valueOf(score_2_2));
        }
    }

    public void plus_2_2(View view) {
        score_2_2 = score_2_2 + 2;
        TextView score_text = (TextView)findViewById(R.id.score_2);
        if (score_text != null) {
            score_text.setText(String.valueOf(score_2_2));
        }
    }
    public void minus_6_6(View view) {
        score_6_6 = score_6_6 - 6;
        TextView score_text = (TextView)findViewById(R.id.score_2);
        if (score_text != null) {
            score_text.setText(String.valueOf(score_6_6));
        }
    }

    public void plus_6_6(View view) {
        score_6_6 = score_6_6 + 6;
        TextView score_text = (TextView)findViewById(R.id.score_2);
        if (score_text != null) {
            score_text.setText(String.valueOf(score_6_6));
        }
    }


}
