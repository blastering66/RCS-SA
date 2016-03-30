package id.tech.htctools;

import common.activities.SampleActivityBase;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;

public class History_Activity extends SampleActivityBase{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		
		ActionBar ac = getSupportActionBar();
		ac.setDisplayHomeAsUpEnabled(true);
		ac.setTitle("History");
		
		FragmentTransaction t = getSupportFragmentManager().beginTransaction();
//		TestSlidingFragment fragment = new TestSlidingFragment();
		HistorySlidingTabsFragment fragment = new HistorySlidingTabsFragment();
		t.replace(R.id.sample_content_fragment	, fragment);
		t.commit();
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub		
		switch (item.getItemId()) {
		case android.R.id.home:			
			finish();
			break;
		
		}
		return super.onOptionsItemSelected(item);
		
	}

//public class History_Activity extends ActionBarActivity {
//
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		// TODO Auto-generated method stub
//		super.onCreate(savedInstanceState);
//
//		ActionBar actionBar = getSupportActionBar();
//		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
//		actionBar.setDisplayShowTitleEnabled(true);
//
//		Tab tab1 = actionBar.newTab().setText("Tab 1")
//				.setIcon(R.drawable.ic_launcher);
//		// .setTabListener(new SupportFra)
//	}
//
//	private class TabListener implements ActionBar.TabListener {
//		private TabContentFragment mFragment;
//		
//		public TabListener(TabContentFragment fragment) {
//			// TODO Auto-generated constructor stub
//			mFragment = fragment;
//		}
//
//		@Override
//		public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public void onTabSelected(Tab arg0, FragmentTransaction arg1) {
//			// TODO Auto-generated method stub
//			arg1.add(R.id.f, arg1)
//
//		}
//
//		@Override
//		public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
//			// TODO Auto-generated method stub
//
//		}
//
//	}
//
//	private class TabContentFragment extends Fragment {
//		private String mTxt;
//
//		public TabContentFragment(String mTxt) {
//			// TODO Auto-generated constructor stub
//			this.mTxt = mTxt;
//		}
//
//		public String getText() {
//			return mTxt;
//		}
//		
//		@Override
//		public View onCreateView(LayoutInflater inflater, ViewGroup container,
//				Bundle savedInstanceState) {
//			// TODO Auto-generated method stub
//			View v = inflater.inflate(R.layout.item_test, null);
//			
//			TextView t = (TextView)v.findViewById(R.id.tv_judul);
//			t.setText(mTxt);
//			return v;
//		}
//	}
}
