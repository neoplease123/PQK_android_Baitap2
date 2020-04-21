package vn.edu.ntu.phuquockhanh.android2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityViewCommand;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("dienthoai", "hien thi: ");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("dienthoai", "hien thi: Start ");
        Toast.makeText(getApplicationContext(),"Phù Quốc Khánh Xin Chào",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("dienthoai", "hien thi: Restart ");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("dienthoai", "hien thi: Remuse ");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("dienthoai", "hien thi: Pause ");
        text2 = findViewById(R.id.text2) ;
        SimpleDateFormat spf = new SimpleDateFormat("HH:MM:SS");
        String strDate = spf.format(new Date());
        text2.setText(strDate);

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("dienthoai", "hien thi: Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("dienthoai", "hien thi: Destroy ");
    }
}
