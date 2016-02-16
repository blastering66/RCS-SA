package id.tech.htctools;

import common.view.SlidingTabLayout;

import id.tech.htctools.R;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TestSlidingFragment extends Fragment{
	private SlidingTabLayout mSlidingTabLayout;
	private ViewPager mViewpager;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.test_fragment_sample, container, false);
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		mViewpager = (ViewPager)view.findViewById(R.id.viewpager);
		mViewpager.setAdapter(new SamplePagerAdapter());
		
		mSlidingTabLayout = (SlidingTabLayout)view.findViewById(R.id.sliding_tabs);
		mSlidingTabLayout.setViewPager(mViewpager);
	}
	
	class SamplePagerAdapter extends PagerAdapter {
		TextView title;
		
		

        /**
         * @return the number of pages to display
         */
        @Override
        public int getCount() {
            return 4;
        }

        /**
         * @return true if the value returned from {@link #instantiateItem(ViewGroup, int)} is the
         * same object as the {@link View} added to the {@link ViewPager}.
         */
        @Override
        public boolean isViewFromObject(View view, Object o) {
            return o == view;
        }

        // BEGIN_INCLUDE (pageradapter_getpagetitle)
        /**
         * Return the title of the item at {@code position}. This is important as what this method
         * returns is what is displayed in the {@link SlidingTabLayout}.
         * <p>
         * Here we construct one using the position value, but for real application the title should
         * refer to the item's contents.
         */
        @Override
        public CharSequence getPageTitle(int position) {
        	switch (position) {
			case 0:
				return "History Notif";
			case 1:
				return "History Absensi";
			case 2:
				return "History Update Branding";
			case 3:
				return "History Issue";

			default:
				return "";
				
			}
            
        }
        // END_INCLUDE (pageradapter_getpagetitle)

        /**
         * Instantiate the {@link View} which should be displayed at {@code position}. Here we
         * inflate a layout from the apps resources and then change the text view to signify the position.
         */
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            // Inflate a new layout from our resources
            View view = getActivity().getLayoutInflater().inflate(R.layout.item_test,
                    container, false);
            // Add the newly created View to the ViewPager
            container.addView(view);

            // Retrieve a TextView from the inflated View, and update it's text
            title = (TextView) view.findViewById(R.id.item_title);
            title.setText(String.valueOf(position + 1));

            new Async_LoadHistory().execute();

            // Return the View
            return view;
        }

        /**
         * Destroy the item from the {@link ViewPager}. In our case this is simply removing the
         * {@link View}.
         */
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
        
        private class Async_LoadHistory extends AsyncTask<Void, Void, Void>{
        	
        	@Override
        	protected void onPreExecute() {
        		// TODO Auto-generated method stub
        		super.onPreExecute();
        	}
        	
        	@Override
        	protected Void doInBackground(Void... params) {
        		// TODO Auto-generated method stub
        		try{
        			Thread.sleep(2000);
        		}catch(Exception e){
        			
        		}
        		
        		return null;
        	}
        	
        	@Override
        	protected void onPostExecute(Void result) {
        		// TODO Auto-generated method stub
        		super.onPostExecute(result);
        		Toast.makeText(getActivity(), "LOAD DATA FINISHED", Toast.LENGTH_LONG).show();
        		title.setText("Data");
        		
        	}
        }

    }

}
