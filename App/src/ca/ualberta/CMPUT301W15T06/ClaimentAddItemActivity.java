package ca.ualberta.CMPUT301W15T06;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ClaimentAddItemActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_claiment_add_item);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.claiment_add_item, menu);
		return true;
	}

}
