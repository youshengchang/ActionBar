package org.example.androidsdk.demo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent intent = null;
		switch (item.getItemId()) {
		case R.id.action_activity_two:
			intent = new Intent(MainActivity.this, DetailActivity.class);
			startActivity(intent);
			break;

		case R.id.action_external_url:
			String webpage = "http://developer.android.com/index.html";
			
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webpage));
			startActivity(intent);
			break;

		case R.id.action_send_message:
			intent = new Intent();
			intent.setAction(Intent.ACTION_SEND);
			intent.putExtra(Intent.EXTRA_TEXT, "Hello from Hansel and Petal!");
			intent.setType("text/plain");
			startActivity(intent);
			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}
