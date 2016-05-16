package info.krushik.android.myapplication5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class StudentAdapter extends ArrayAdapter<Student> {
    private Context mContext;
    private int mResource;
    private ArrayList<Student> mStudents;
    private LayoutInflater mInflater;

    private int mPosition = -1;

    public StudentAdapter(Context context, int resource, ArrayList<Student> objects){
        super(context, resource, objects);

        mContext = context;
        mResource = resource;
        mStudents = objects;

        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(final int position, View convertViev, ViewGroup parent){
        View view = mInflater.inflate(mResource, null);

        final Student student = mStudents.get(position);

        ((TextView) view.findViewById(R.id.textViewFirstName)).setText(student.FirstName);
        ((TextView) view.findViewById(R.id.textViewLastName)).setText(student.LastName);
        ((TextView) view.findViewById(R.id.textViewAge)).setText(String.valueOf(student.Age));

        final RadioButton radioButton = (RadioButton) view.findViewById(R.id.radio);

        if (position == mPosition){
            radioButton.setChecked(true);
        }

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButton.setChecked(true);
                mPosition = position;

                notifyDataSetChanged();
            }
        });

//        Button button = (Button) view.findViewById(R.id.button);
//        button.setOnClickListener(new  View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                if (mListener != null) {
//                    mListener.onDeleteClick(student);
//                }
//            }
//        });

        return  view;
    }

    public int getChecked(){
        return mPosition;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View view = mInflater.inflate(mResource, null);

        final Student student = mStudents.get(position);

        ((TextView) view.findViewById(R.id.textViewFirstName)).setText(student.FirstName);
        ((TextView) view.findViewById(R.id.textViewLastName)).setText(student.LastName);

        Button button = (Button) view.findViewById(R.id.button);
        button.setVisibility(View.GONE);

        return  view;
    }

    private StudentListener mListener;

    public void  setStudentListener(StudentListener listener){
        mListener = listener;
    }

    public  interface StudentListener {
        void  onDeleteClick(Student student);
    }

}
