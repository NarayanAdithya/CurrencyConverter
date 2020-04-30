package com.example.currencyconverter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner sp1;
    Spinner sp2;
    Button submit;
    EditText Result;
    EditText frombox;
    String y="";
    double iniamt;
    List<String> arr = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1=(Spinner)findViewById(R.id.fromcur);
        sp2=(Spinner)findViewById(R.id.tocur);
        submit=(Button)findViewById((R.id.submit));
        Result=(EditText)findViewById(R.id.resultbox);
        frombox=(EditText)findViewById(R.id.editText4);

        arr.add("USD");
        arr.add("INR");
        arr.add("EUR");
        arr.add("YEN");
        arr.add("AUD");
        arr.add("CUD");
        arr.add("OMR");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,arr);
        Log.d("ReachedHEre","Hooray");
        sp1.setAdapter(arrayAdapter);
        sp2.setAdapter(arrayAdapter);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int item=sp1.getSelectedItemPosition();
                String y;
                y= arr.get(item);
                frombox.setHint("Enter "+y);
                Toast.makeText(getApplicationContext(),"From:"+y,Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int item=sp2.getSelectedItemPosition();
                String y;
                y= arr.get(item);
                Result.setHint("RESULT IN "+y);
                Toast.makeText(getApplicationContext(),"To:"+y,Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        Toast.makeText(getApplicationContext(),"Created By Adithya Narayan",Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    public void click(View view) {
        int from=sp1.getSelectedItemPosition();
        y=arr.get(from);
        int to=sp2.getSelectedItemPosition();
        String z="";
        z=arr.get(to);
        if((frombox.getText().toString()).equals(""))
        {
            Result.setText("");
            Toast.makeText(getApplicationContext(),"No amount entered",Toast.LENGTH_SHORT).show();
        }
        else if(y.equals("INR")&& z.equals("INR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("INR")&& z.equals("USD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.013;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("INR")&& z.equals("EUR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.012;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("INR")&& z.equals("YEN"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*1.41;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("INR")&& z.equals("AUD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.021;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("INR")&& z.equals("CUD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.018;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("INR")&& z.equals("OMR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.0050;
            Result.setText(Double.toString(iniamt));
        }
        //For USD conversions
        else if(y.equals("USD")&& z.equals("INR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*76.32;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("USD")&& z.equals("USD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*1;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("USD")&& z.equals("EUR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.92;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("USD")&& z.equals("YEN"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*107.46;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("USD")&& z.equals("AUD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*1.56;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("USD")&& z.equals("CUD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*1.41;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("USD")&& z.equals("OMR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.39;
            Result.setText(Double.toString(iniamt));
        }
        //EUR Conversions
        else if(y.equals("EUR")&& z.equals("INR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*82.96;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("EUR")&& z.equals("USD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*1.08;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("EUR")&& z.equals("EUR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*1;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("EUR")&& z.equals("YEN"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*116.30;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("EUR")&& z.equals("AUD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*1.69;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("EUR")&& z.equals("CUD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*1.53;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("EUR")&& z.equals("OMR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.42;
            Result.setText(Double.toString(iniamt));
        }
        //From Yen to others
        else if(y.equals("YEN")&& z.equals("INR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.71;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("YEN")&& z.equals("USD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.0093;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("YEN")&& z.equals("EUR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.0086;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("YEN")&& z.equals("YEN"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*1;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("YEN")&& z.equals("AUD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.015;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("YEN")&& z.equals("CUD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.013;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("YEN")&& z.equals("OMR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.0036;
            Result.setText(Double.toString(iniamt));
        }
        //AUD to
        else if(y.equals("AUD")&& z.equals("INR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*48.74;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("AUD")&& z.equals("USD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.64;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("AUD")&& z.equals("EUR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.59;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("AUD")&& z.equals("YEN"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*68.73;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("AUD")&& z.equals("AUD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*1;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("AUD")&& z.equals("CUD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.90;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("AUD")&& z.equals("OMR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.25;
            Result.setText(Double.toString(iniamt));
        }
        //CUD conversions
        else if(y.equals("CUD")&& z.equals("INR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*54.15;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("CUD")&& z.equals("USD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.71;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("CUD")&& z.equals("EUR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.66;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("CUD")&& z.equals("YEN"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*76.28;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("CUD")&& z.equals("AUD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*1.11;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("CUD")&& z.equals("CUD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*1;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("CUD")&& z.equals("OMR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*0.27;
            Result.setText(Double.toString(iniamt));
        }
        //OMR
        else if(y.equals("OMR")&& z.equals("INR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*198.19;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("OMR")&& z.equals("USD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*2.60;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("OMR")&& z.equals("EUR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*2.40;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("OMR")&& z.equals("YEN"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*279.07;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("OMR")&& z.equals("AUD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*4.06;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("OMR")&& z.equals("CUD"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*3.66;
            Result.setText(Double.toString(iniamt));
        }
        else if(y.equals("OMR")&& z.equals("OMR"))
        {
            iniamt=Double.valueOf(frombox.getText().toString());
            iniamt=iniamt*1;
            Result.setText(Double.toString(iniamt));
        }






    }
}
