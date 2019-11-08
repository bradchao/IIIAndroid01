package tw.org.iii.HelloWorld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button buttonClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.lottery);
        buttonClick = findViewById(R.id.click);

        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLottery();
            }
        });
    }

    private void showLottery(){
        TreeSet<Integer> set = new TreeSet<>();
        while (set.size() < 6){
            set.add((int)(Math.random()*49+1));
        }
        textView.setText(set.toString());
    }

}
