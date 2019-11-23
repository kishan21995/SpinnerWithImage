package com.app.spinnerwithimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner customSpinner;
    ArrayList<CustomItem>customList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customSpinner=findViewById(R.id.customIconSpinner);
        customList=getCustomList();
        CustomAdapter adapter=new CustomAdapter(this,customList);

        if(customSpinner!=null){

            customSpinner.setAdapter(adapter);
            customSpinner.setOnItemSelectedListener(this);

        }


    }

    private ArrayList<CustomItem>getCustomList(){

        customList = new ArrayList<>();
        customList.add(new CustomItem("Android",R.drawable.ic_android));
        customList.add(new CustomItem("School",R.drawable.ic_android));
        customList.add(new CustomItem("Satisfied",R.drawable.ic_android));
        customList.add(new CustomItem("Shopping Cart",R.drawable.ic_android));
        customList.add(new CustomItem("Whatshot",R.drawable.ic_android));
        return customList;


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        CustomItem item=(CustomItem)adapterView.getSelectedItem();
        Toast.makeText(this,item.getSpinnerItemName(), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
