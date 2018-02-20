package sdu.cs58.pichsinee.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //1. Explicit ประกาศตัวแปรยน java
    TextView nameTextView;
    String getnameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2.Initial view ผูกตัวแปรบน Java กับ element UI
        nameTextView = findViewById(R.id.txvName);

        //รับค่า nameString จากหน้า Login
        getnameString = getIntent().getStringExtra("nameString");
        nameTextView.setText("ยินดีต้อนรับ "+getnameString+" ได้เข้าสู่ระบบ");


    }   //end onCreate
}   //end Class
