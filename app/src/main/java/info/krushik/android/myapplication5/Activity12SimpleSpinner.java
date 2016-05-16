package info.krushik.android.myapplication5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity12SimpleSpinner extends AppCompatActivity {

    ArrayList<Student> arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_12);

        arr = new ArrayList<>();

        arr.add(new Student("Ivan0", "Ivanov0", 20));
        arr.add(new Student("Ivan1", "Ivanov1", 21));
        arr.add(new Student("Ivan2", "Ivanov2", 22));


        final StudentAdapter adapter = new StudentAdapter(
                this,
                R.layout.list_item,
                arr
        );

        Spinner listView = (Spinner) findViewById(R.id.spinner);
        listView.setAdapter(adapter);


    }
}
