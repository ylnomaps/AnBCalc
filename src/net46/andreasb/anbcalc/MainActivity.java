package net46.andreasb.anbcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */

	TextView text1;
	TextView text2;
	TextView operator1;
	TextView text3;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		text1 = (TextView) findViewById(R.id.display1);
		text1.setText("0");
		text2 = (TextView) findViewById(R.id.display2);
		text2.setText("0");
		operator1 = (TextView) findViewById(R.id.operator);
		operator1.setText("+");
		text3 = (TextView) findViewById(R.id.ergebnis);
		text3.setText("0");

	}

	static boolean wechsel = true;
	static boolean isempty = true;

	public void number_click(View sender) {
		Button bt = (Button) sender;
		if (text1.hasFocus()) {
			if (text1.getText().length() > 7)
				return;
			if (isempty) {
				text1.setText(bt.getText());
				isempty = false;
			} else {
				text1.append(bt.getText());
			}
		} else if (text2.hasFocus()) {
			if (text2.getText().length() > 7)
				return;
			if (isempty) {
				text2.setText(bt.getText());
				isempty = false;
			} else {
				text2.append(bt.getText());
			}
		} else
			return;
	}

	public void zero(View sender) {

		Button bt2 = (Button) sender;
		if (text1.hasFocus()) {
			if (text1.getText() != "0")

			{
				text1.setText("0");
			}
		} else if (text2.hasFocus()) {
			if (text2.getText() != "0")

			{
				text2.setText("0");
			}
		}
	}
	
	String opp = "";
	public String operator_click(View sender) {
		Button bt = (Button) sender;

		operator1.setText(bt.getText());
		opp= bt.getText().toString();
		return opp;
	}
	
	
	
	
	public void ist_gleich(View sender) {
		Button bt = (Button) sender;
		

		String eins = text1.getText().toString();
		int eins1 = Integer.parseInt(eins);
		String zwei = text2.getText().toString();
		int zwei2 = Integer.parseInt(zwei);
		int ergebnis = 0;
		if (opp.equals("+")) { 
		ergebnis = eins1+zwei2; }
		else if (opp.equals("-")) {
			ergebnis = eins1-zwei2; }
		else if (opp.equals("/")) {
			ergebnis = eins1/zwei2; } 
				else {
				ergebnis = eins1*zwei2;  }
	
		System.out.print(ergebnis); 
		
		 text3.setText(String.valueOf(ergebnis)); return; }
		
		
		
}

	

	


