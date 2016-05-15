package info.krushik.android.myapplication5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class Activity3NotSoSA extends AppCompatActivity {

    private static final String KAY_NAME = "Name";
    private static final String KAY_AGE = "Age";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        SetAdapter();

    }

    private void SetAdapter() {
        ArrayList<HashMap<String, String>> arr = new ArrayList<>();

        HashMap<String,String> map = new HashMap<>();
        map.put(KAY_NAME, "Ivan");
        map.put(KAY_AGE, "22");
        arr.add(map);

        map = new HashMap<>();
        map.put(KAY_NAME, "Petro");
        map.put(KAY_AGE, "23");
        arr.add(map);

        map = new HashMap<>();
        map.put(KAY_NAME, "Vova");
        map.put(KAY_AGE, "24");
        arr.add(map);

        SimpleAdapter adapter = new SimpleAdapter(
                this,
                arr,
                android.R.layout.simple_expandable_list_item_2,
                new String[]{KAY_NAME, KAY_AGE},
                new int[]{android.R.id.text1, android.R.id.text2}
        );

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}

