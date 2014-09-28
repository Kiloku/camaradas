package com.tvrelaxa.camaradas2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoginActivity extends ActionBarActivity {
	public final static String FACEBOOK_NAME = "com.tvrelaxa.camaradas.login.facebook_name";
	public final static String FACEBOOK_GENDER = "com.tvrelaxa.camaradas.login.facebook_gender";
	private LoginActivity context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_activity);
		
		Button bttLogin = (Button) findViewById(R.id.buttonLogin);
		
		context = this;
		
		bttLogin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//TODO interação com facebook
				
				//calling settings activity
				Intent intent = new Intent(context, SettingsActivity.class);
				intent.putExtra(FACEBOOK_NAME, "Mateus Lacerda");
				intent.putExtra(FACEBOOK_GENDER, "M");
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
