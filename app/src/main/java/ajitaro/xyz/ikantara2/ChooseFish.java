package ajitaro.xyz.ikantara2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseFish extends Activity {
    private Button button;
    private Button ikanBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_fish);

        button = (Button) findViewById(R.id.backBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLevelPage();
            }
        });

        ikanBtn1 = (Button) findViewById(R.id.ikan1);
        ikanBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGamePage();
            }
        });

    }
    public void openLevelPage(){
        Intent intent = new Intent(this, LevelActivity.class);
        startActivity(intent);
        finish();
    }
    public void openGamePage(){
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
        finish();
    }
}
