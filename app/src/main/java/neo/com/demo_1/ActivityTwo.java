package neo.com.demo_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import neo.com.demo_1.Model.Student;

public class ActivityTwo extends AppCompatActivity {
    Student objStudent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitytwo);
        Intent intent = getIntent();
       // String s = intent.getParcelableExtra("key_bundle");
        objStudent= (Student) intent.getParcelableExtra("keystudent");
        Toast.makeText(this, objStudent.toString(), Toast.LENGTH_LONG).show();
       // Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
