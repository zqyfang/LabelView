package com.example.auto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.auto.view.LabelViews;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LabelViews labels;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        labels= (LabelViews) findViewById(R.id.labels);
        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                showLabel();
                break;

        }
    }

    /**
     * 显示label
     */
    private void showLabel() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Android");
        list.add("IOS");
        list.add("前端");
        list.add("后台");
        list.add("微信开发");
        list.add("Java");
        list.add("JavaScript");
        list.add("C++");
        list.add("PHP");
        list.add("Python");
        labels.setLabels(list);
        labels.setOnLabelClickListener(new LabelViews.OnLabelClickListener() {
            @Override
            public void onLabelClick(TextView label, int position) {
                Toast.makeText(MainActivity.this, ""+label.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
