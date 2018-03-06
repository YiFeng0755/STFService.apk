package jp.co.cyberagent.stf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = getIntent();
        Intent intent = new Intent(this, Service.class);
        intent.setAction(i.getAction());
        this.startService(intent);
        finish();
    }
}
