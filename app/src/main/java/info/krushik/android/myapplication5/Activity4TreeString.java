package info.krushik.android.myapplication5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class Activity4TreeString extends AppCompatActivity {

    private static final String KAY_FIRST_NAME = "FirstName";
    private static final String KAY_LAST_NAME = "LastName";
    private static final String KAY_AGE = "Age";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        SetAdapter();

    }

    private void SetAdapter() {
        ArrayList<HashMap<String, String>> arr = new ArrayList<>();

        HashMap<String,String> map = new HashMap<>();
        map.put(KAY_FIRST_NAME, "Ivan");
        map.put(KAY_LAST_NAME, "Ivanov");
        map.put(KAY_AGE, "22");
        arr.add(map);

        map = new HashMap<>();
        map.put(KAY_FIRST_NAME, "Petro");
        map.put(KAY_LAST_NAME, "Petrov");
        map.put(KAY_AGE, "23");
        arr.add(map);

        map = new HashMap<>();
        map.put(KAY_FIRST_NAME, "Vova");
        map.put(KAY_LAST_NAME, "Vovoov");
        map.put(KAY_AGE, "24");
        arr.add(map);

        SimpleAdapter adapter = new SimpleAdapter(
                this,
                arr,
                R.layout.list_item,
                new String[]{KAY_FIRST_NAME, KAY_LAST_NAME, KAY_AGE},
                new int[]{R.id.textViewFirstName, R.id.textViewLastName, R.id.textViewAge}
        );

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
