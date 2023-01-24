package codepath.demos.helloworlddemo;


import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HelloWorldActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_world);
		View button = findViewById(R.id.button);
		View.OnClickListener btnClick = new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub


				Log.v("hello world", "button clicked");
				Toast toast = Toast.makeText(getApplicationContext(),"NOOO!!! HE ESCAPED!!", Toast.LENGTH_SHORT);
				toast.show();
			}
		};

		button.setOnClickListener(btnClick);


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_hello_world, menu);
		return true;
	}

}
