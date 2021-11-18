package com.pwpb.latihan_intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button explicitIntent;
    Button implicitIntent;
    Button gridView;
    Button fragmentView;
    Button ui1View;
    Button ui2View;
    Button inputView;
    Button listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        explicitIntent = (Button) findViewById(R.id.explicitIntent);
        explicitIntent.setOnClickListener(this);

        implicitIntent = (Button) findViewById(R.id.implicitIntent);
        implicitIntent.setOnClickListener(this);

        gridView = (Button) findViewById(R.id.gridView);
        gridView.setOnClickListener(this);

        fragmentView = (Button) findViewById(R.id.fragmentView);
        fragmentView.setOnClickListener(this);

        ui1View = (Button) findViewById(R.id.ui1View);
        ui1View.setOnClickListener(this);

        ui2View = (Button) findViewById(R.id.ui2View);
        ui2View.setOnClickListener(this);

        inputView = (Button) findViewById(R.id.inputView);
        inputView.setOnClickListener(this);

        listView = (Button) findViewById(R.id.listView);
        listView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.explicitIntent:
                Intent explicit = new Intent(MainActivity.this, com.pwpb.latihan_intent.IntentActivity.class);
                startActivity(explicit);
                break;
            case R.id.implicitIntent:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                startActivity(implicit);
                break;
            case R.id.gridView:
                Intent grid = new Intent(MainActivity.this, GridActivity.class);
                startActivity(grid);
                break;
            case R.id.fragmentView:
                Intent fragment = new Intent(MainActivity.this, FragmentActivity.class);
                startActivity(fragment);
                break;
            case R.id.ui1View:
                Intent ui1 = new Intent(MainActivity.this, UI1Activity.class);
                startActivity(ui1);
                break;
            case R.id.ui2View:
                Intent ui2 = new Intent(MainActivity.this, UI2Activity.class);
                startActivity(ui2);
                break;
            case R.id.inputView:
                Intent input = new Intent(MainActivity.this, InputActivity.class);
                startActivity(input);
                break;
            case R.id.listView:
                Intent list = new Intent(MainActivity.this, com.pwpb.latihan_intent.ListActivity.class);
                startActivity(list);
                break;
            default:
                break;
        }
    }
}