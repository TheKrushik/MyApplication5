package info.krushik.android.myapplication5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class Activity2SimpleAdapter extends AppCompatActivity {

    private static final String KAY_NAME = "Name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ArrayList<HashMap<String, String>> arr = new ArrayList<>();

        HashMap<String,String> map = new HashMap<>();
        map.put(KAY_NAME, "Ivan");
        arr.add(map);

        map = new HashMap<>();
        map.put(KAY_NAME, "Petro");
        arr.add(map);

        map = new HashMap<>();
        map.put(KAY_NAME, "Vova");
        arr.add(map);

        SimpleAdapter adapter = new SimpleAdapter(
                this,
                arr,
                android.R.layout.simple_expandable_list_item_1,
                new String[]{KAY_NAME},
                new int[]{android.R.id.text1}
        );

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}
