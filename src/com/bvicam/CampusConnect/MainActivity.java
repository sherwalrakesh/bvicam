package com.bvicam.CampusConnect;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen_view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void showGridView(View v) 
    {
		RelativeLayout bottomGridView = (RelativeLayout) findViewById(R.id.gridview_layout);
		Animation animateGridView = AnimationUtils.loadAnimation(this, R.anim.animate_bottomview_on_homescreen);
		bottomGridView.startAnimation(animateGridView);
	}
    
   
}
