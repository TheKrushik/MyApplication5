package info.krushik.android.myapplication5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity8CustomAAClick extends AppCompatActivity {

    ArrayList<Student> arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        arr = new ArrayList<>();
        arr.add(new Student("Ivan0", "Ivanov0", 20));
        arr.add(new Student("Ivan1", "Ivanov1", 21));
        arr.add(new Student("Ivan2", "Ivanov2", 22));


        StudentAdapter adapter = new StudentAdapter(
                this,
                R.layout.list_item,
                arr
        );

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Student student = arr.get(position);
//                Toast.makeText(Activity8CustomAAClick.this, student.toString(), Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                Student student = arr.get(position);
//                Toast.makeText(Activity8CustomAAClick.this, student.toString(), Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });
    }
}
