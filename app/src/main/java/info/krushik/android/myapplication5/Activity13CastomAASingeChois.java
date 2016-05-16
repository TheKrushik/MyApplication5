package info.krushik.android.myapplication5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity13CastomAASingeChois extends AppCompatActivity {

    ArrayList<Student> arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13);

        arr = new ArrayList<>();

        arr.add(new Student("Ivan0", "Ivanov0", 20));
        arr.add(new Student("Ivan1", "Ivanov1", 21));
        arr.add(new Student("Ivan2", "Ivanov2", 22));


        final StudentAdapter adapter = new StudentAdapter(
                this,
                R.layout.list_item,
                arr
        );

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        findViewById(R.id.button14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = adapter.getChecked();
                Toast.makeText(Activity13CastomAASingeChois.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
