package ca.ualberta.CMPUT301W15T06;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ClaimentClaimListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_claiment_claim_list);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.claiment_claim_list, menu);
		return true;
	}

}
