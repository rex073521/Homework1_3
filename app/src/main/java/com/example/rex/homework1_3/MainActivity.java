package com.example.rex.homework1_3;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    private ImageView imageView;
    private Button backBtn, nextBtn;
    private TextView teamText;
    public int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    public void findViews() {
        imageView = (ImageView) findViewById(R.id.imageView);
        teamText=(TextView)findViewById(R.id.teamText);
        backBtn = (Button) findViewById(R.id.backBtn);
        nextBtn = (Button) findViewById(R.id.nextBtn);
        backBtn.setOnClickListener(this);
        nextBtn.setOnClickListener(this);

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.nextBtn:
                i++;
                if (i == 10)
                    i = 1;
                getImage();
                break;
            case R.id.backBtn:
                i--;
                if (i == 0)
                    i = 10;
                getImage();
                break;
        }
    }

    public void getImage() {
        switch (i) {
            case 1:
                teamText.setText(R.string.teamOne);
                imageView.setImageResource(R.drawable.p1);
                break;
            case 2:
                teamText.setText(R.string.teamTwo);
                imageView.setImageResource(R.drawable.p2);
                break;
            case 3:
                teamText.setText(R.string.teamThree);
                imageView.setImageResource(R.drawable.p3);
                break;
            case 4:
                teamText.setText(R.string.teamFour);
                imageView.setImageResource(R.drawable.p4);
                break;
            case 5:
                teamText.setText(R.string.teamFive);
                imageView.setImageResource(R.drawable.p5);
                break;
            case 6:
                teamText.setText(R.string.teamSix);
                imageView.setImageResource(R.drawable.p6);
                break;
            case 7:
                teamText.setText(R.string.teamSeven);
                imageView.setImageResource(R.drawable.p7);
                break;
            case 8:
                teamText.setText(R.string.teamEight);
                imageView.setImageResource(R.drawable.p8);
                break;
            case 9:
                teamText.setText(R.string.teamNine);
                imageView.setImageResource(R.drawable.p9);
                break;
            case 10:
                teamText.setText(R.string.teamTen);
                imageView.setImageResource(R.drawable.p10);
                break;
        }
    }

}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
