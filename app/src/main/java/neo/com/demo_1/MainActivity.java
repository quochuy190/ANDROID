package neo.com.demo_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import neo.com.demo_1.Model.Student;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Button btn_one;
    Button btn_two;
    private Student objStudent;
    Float F = 2f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");
        Log.i("log", "onCreate");
        setContentView(R.layout.activity_main);
        init();
        initEvent();
    }

    private void init() {
        objStudent = new Student("Quốc Huy", 1);
        btn_one = findViewById(R.id.btn_start);
        btn_two = findViewById(R.id.btn_start2);
    }

    private void initEvent() {
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                //bundle.putSerializable("key_student", objStudent);

                Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
                intent.putExtra("key_data", "dữ liệu truyền sang MainActivity");
                intent.putExtra("keystudent", objStudent);
                intent.putExtra("key_bundle", bundle);
                startActivity(intent);
            }
        });
        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("actionOpenThreeActivity");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("log", "onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("log", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("log", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("log", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("log", "onDestroy");
        //Log.d(TAG, "onDestroy: ");
    }
}
