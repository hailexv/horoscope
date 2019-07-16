package com.example.blackmoon.horosc;



import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

    EditText d,m,y;
    Button sub;
    int date=-1,monthh=0;
    @Override
    public void onPause() {
        super.onPause();

    }

    @Override
    public void onResume(){
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intialise();
        sub.setOnClickListener(this);
    }

    private void oneDigit() {


    }

    private void intialise() {

        d=(EditText)findViewById(R.id.etDay);
        m=(EditText)findViewById(R.id.etMonth);
        y=(EditText)findViewById(R.id.etYear);
        sub=(Button)findViewById(R.id.bSub);


    }



    @Override
    public void onClick(View arg0)
    {

        String nn=d.getText().toString();
        String month=m.getText().toString();

        try {
            date= Integer.parseInt(nn);
            monthh=Integer.parseInt(month);
        } catch(NumberFormatException nfe) {

        }
        if(date>0 && date<=31 && monthh>0 && monthh<=12 && d.length()>0 && m.length()>0 && y.length()>3)
        {


            if    ((monthh == 12 && date >= 22 && date <= 31) || (monthh ==  1 && date >= 1 && date <= 19)) {
                Intent intent = new Intent(MainActivity.this, Description.class);
                intent.putExtra("name", "Capricorn");
                startActivity(intent);
            }

            else if ((monthh ==  1 && date >= 20 && date <= 31) || (monthh ==  2 && date >= 1 && date <= 17)) {
                Intent intent = new Intent(MainActivity.this, Description.class);
                intent.putExtra("name", "Aquarius");
                startActivity(intent);
            }

            else if ((monthh ==  2 && date >= 18 && date <= 29) || (monthh ==  3 && date >= 1 && date <= 19)) {
                Intent intent = new Intent(MainActivity.this, Description.class);
                intent.putExtra("name", "Pisces");
                startActivity(intent);
            }

            else if ((monthh ==  3 && date >= 20 && date <= 31) || (monthh ==  4 && date >= 1 && date <= 19)) {
                Intent intent = new Intent(MainActivity.this, Description.class);
                intent.putExtra("name", "Aries");
                startActivity(intent);
            }

            else if ((monthh ==  4 && date >= 20 && date <= 30) || (monthh ==  5 && date >= 1 && date <= 20)) {
                Intent intent = new Intent(MainActivity.this, Description.class);
                intent.putExtra("name", "Taurus");
                startActivity(intent);
            }

            else if ((monthh ==  5 && date >= 21 && date <= 31) || (monthh ==  6 && date >= 1 && date <= 20)) {
                Intent intent = new Intent(MainActivity.this, Description.class);
                intent.putExtra("name", "Gemini");
                startActivity(intent);
            }

            else if ((monthh ==  6 && date >= 21 && date <= 30) || (monthh ==  7 && date >= 1 && date <= 22)) {
                Intent intent = new Intent(MainActivity.this, Description.class);
                intent.putExtra("name", "Cancer");
                startActivity(intent);
            }

            else if ((monthh ==  7 && date >= 23 && date <= 31) || (monthh ==  8 && date >= 1 && date <= 22)) {
                Intent intent = new Intent(MainActivity.this, Description.class);
                intent.putExtra("name", "Leo");
                startActivity(intent);
            }

            else if ((monthh ==  8 && date >= 23 && date <= 31) || (monthh ==  9 && date >= 1 && date <= 22)) {
                Intent intent = new Intent(MainActivity.this, Description.class);
                intent.putExtra("name", "Virgo");
                startActivity(intent);
            }

            else if ((monthh ==  9 && date >= 23 && date <= 30) || (monthh == 10 && date >= 1 && date <= 22)) {
                Intent intent = new Intent(MainActivity.this, Description.class);
                intent.putExtra("name", "Libra");
                startActivity(intent);
            }

            else if ((monthh == 10 && date >= 23 && date <= 31) || (monthh == 11 && date >= 1 && date <= 21)) {
                Intent intent = new Intent(MainActivity.this, Description.class);
                intent.putExtra("name", "Scorpio");
                startActivity(intent);
            }

            else if ((monthh == 11 && date >= 22 && date <= 30) || (monthh == 12 && date >= 1 && date <= 21)) {
                Intent intent = new Intent(MainActivity.this, Description.class);
                intent.putExtra("name", "Sagitarius");
                startActivity(intent);
            }




            /*
            while(n>9)
            {
                n=(n/10)+(n%10);
            }
            Bundle sendData=new Bundle();
            sendData.putInt("key_data", (n-1));
            Intent startOC=new Intent(MainActivity.this,predict.class);
            startOC.putExtras(sendData);
            startActivity(startOC);

            */
        }
        else
        {
            Context context = getApplicationContext();
            Toast toast=Toast.makeText(context, "Please enter your valid date of birth ",Toast.LENGTH_LONG);
            toast.show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu)

    {
        // TODO Auto-generated method stub
        super.onCreateOptionsMenu(menu);
        MenuInflater capactiveButtonMenu=getMenuInflater();
        capactiveButtonMenu.inflate(R.menu.avant_grade_menu, menu);
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        switch(item.getItemId())
        {

            case R.id.aboutapp:

                Bundle Data=new Bundle();
                String value="Numerology";
                Data.putString("say", value);
                //Intent start=new Intent(Destiny.this,About.class);
                //start.putExtras(Data);
                //startActivity(start);
                break;


            case R.id.Exit:
                //startAppAd.showAd(); // show the ad
                //startAppAd.loadAd(); // load the next ad
                finish();
                break;
        }
        return false;

    }

}

