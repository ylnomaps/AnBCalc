package net46.andreasb.anbcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
	
	TextView text1;
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        text1=(TextView)findViewById(R.id.display1);
        text1.setText("0");
    }
 
   
}
