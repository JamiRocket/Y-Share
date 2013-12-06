package net.orbitalchainsaw.andro.yshare;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class SearchResultsActivity extends FragmentActivity{
	FragmentManager fragManager;
	FragmentTabHost tabhost;

	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		fragManager = this.getSupportFragmentManager();
		setContentView(R.layout.activity_search_results);
		
		tabhost = (FragmentTabHost)findViewById(android.R.id.tabhost);
		tabhost.setup(this, getSupportFragmentManager(), R.id.searchTabContent);
		
		tabhost.addTab(tabhost.newTabSpec("all").setIndicator("Tous"),
				SearchResultsFragment.class, null);
		tabhost.addTab(tabhost.newTabSpec("social").setIndicator("Social"),
				SearchResultsSocialFragment.class, null);
		tabhost.addTab(tabhost.newTabSpec("entreprises").setIndicator("Evenements"),
				SearchResultsEventsFragment.class, null);
	}

}
