package ca.hagerman.assignment1_part2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity_a1 extends Activity {
	int i=1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_a1);
		
		final Button button_1 = (Button) findViewById(R.id.button1);
		button_1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				View parent = (View)v.getParent();
		        if (parent != null) {
		        	TextView txtView = (TextView) parent.findViewById(R.id.textView1);
		        	txtView.setText("The Change Button has been pressed " + i++ + " times");
		        	
		        	ImageView imgView = (ImageView) parent.findViewById(R.id.imageView1);
		        	imgView.setVisibility(View.VISIBLE);
		        }
			}
		});
		
		final Button button_2 = (Button) findViewById(R.id.button2);
		button_2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				i++;	
				View parent = (View)v.getParent();
		        if (parent != null) {
		        	
		        	ImageView imgView = (ImageView) parent.findViewById(R.id.imageView1);
		        	if (imgView.getVisibility() == View.VISIBLE) {
		        		imgView.setVisibility(View.INVISIBLE);
		        	} else {
		        		imgView.setVisibility(View.VISIBLE);
		        	}
		        }
			}
		});		
		
	
		
		

		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity_a1, menu);
		return true;
	}

}
