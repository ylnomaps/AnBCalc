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
    static boolean isempty=true;
    public void number_click (View sender)
    {
    	Button bt = (Button) sender;
    	if (text1.getText().length()>7)
    		return;
    	if (isempty)
    	{
    		text1.setText(bt.getText());
    		isempty=false;
    	}
    	else
    	{
    		text1.append(bt.getText());
    	}
    }
    public void zero(View sender) {
    	
    	Button bt2 =(Button) sender;
    	if (text1.getText()!="0")
    	
    	{
    	text1.setText("");
    	}
    }
    	
    	
    	
    	
    }
 
   

