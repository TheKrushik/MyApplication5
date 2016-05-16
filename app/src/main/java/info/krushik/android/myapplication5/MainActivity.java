package info.krushik.android.myapplication5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void OnClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent intent = new Intent(this, Activity2SimpleAdapter.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(this, Activity3NotSoSA.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3 = new Intent(this, Activity4TreeString.class);
                startActivity(intent3);
                break;
            case R.id.button4:
                Intent intent4 = new Intent(this, Activity5ArrayAdapter.class);
                startActivity(intent4);
                break;
            case R.id.button5:
                Intent intent5 = new Intent(this, Activity6StudentAA.class);
                startActivity(intent5);
                break;
            case R.id.button6:
                Intent intent6 = new Intent(this, Activity7CustomAA.class);
                startActivity(intent6);
                break;
            case R.id.button7:
                Intent intent7 = new Intent(this, Activity8CustomAAClick.class);
                startActivity(intent7);
                break;
            case R.id.button8:
                Intent intent8 = new Intent(this, Activity9CustomAADelete.class);
                startActivity(intent8);
                break;
            case R.id.button9:
                Intent intent9 = new Intent(this, Activity10SingleSelect.class);
                startActivity(intent9);
                break;
            case R.id.button10:
                Intent intent10 = new Intent(this, Activity11MultiSelect.class);
                startActivity(intent10);
                break;
            case R.id.button11:
                Intent intent11 = new Intent(this, Activity12SimpleSpinner.class);
                startActivity(intent11);
                break;
            case R.id.button12:
                Intent intent12 = new Intent(this, Activity13CastomAASingeChois.class);
                startActivity(intent12);
                break;
        }
    }
}
