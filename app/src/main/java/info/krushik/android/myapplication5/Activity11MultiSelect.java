package info.krushik.android.myapplication5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity11MultiSelect extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_11);

        listView = (ListView) findViewById(R.id.listView);
        listView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);

        String[] myArrList = new String[]{"Ivan", "Petro", "Ann"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_multiple_choice,
                android.R.id.text1,
                myArrList);
        listView.setAdapter(adapter);

        SparseBooleanArray itemPositions = listView.getCheckedItemPositions();
        for (int i = 0; i < itemPositions.size(); i++) {
            if (itemPositions.get(i)){
                //item.selected
            }
        }
    }
}
