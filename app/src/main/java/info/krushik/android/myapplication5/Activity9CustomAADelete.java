package info.krushik.android.myapplication5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity9CustomAADelete extends AppCompatActivity {

    ArrayList<Student> arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);

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

        adapter.setStudentListener(new StudentAdapter.StudentListener() {
            @Override
            public void onDeleteClick(Student student) {
                Toast.makeText(Activity9CustomAADelete.this, student.toString(), Toast.LENGTH_SHORT).show();
                arr.remove(student);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
