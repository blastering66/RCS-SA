package id.tech.htctools;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.daimajia.swipe.SwipeLayout;
import com.daimajia.swipe.SwipeLayout.SwipeListener;
import id.tech.htctools.R;

public class Test_Swipe extends ActionBarActivity {

	private RecyclerView mRView;
	private RecyclerView.Adapter mAdapter;
	private RecyclerView.LayoutManager mLayoutManager;
	private String[] myDataSet = { "Hello" , "SayaRidho", "Apa Kabar", "SayaRidho", "Apa Kabar"
			, "SayaRidho", "Apa Kabar", "SayaRidho", "Apa Kabar"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cekproduk);
		
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setTitle("Submit Issue");
		
		mRView = (RecyclerView) findViewById(R.id.recycler_view);
		mRView.setHasFixedSize(true);

		mLayoutManager = new LinearLayoutManager(getApplicationContext());
		mRView.setLayoutManager(mLayoutManager);

		mAdapter = new MyAdapter(myDataSet);
		
		mRView.setAdapter(mAdapter);

	}

	private class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
		private String[] mDataset;

		public class ViewHolder extends RecyclerView.ViewHolder {
			// each data item is just a string in this case
			public TextView mTextView;
			public SwipeLayout swipeLayout;

			public ViewHolder(View v) {
				super(v);
				mTextView = (TextView) v.findViewById(R.id.txt);
				swipeLayout = (SwipeLayout) v.findViewById(R.id.godfather);
			}
		}

		// Provide a suitable constructor (depends on the kind of dataset)
		public MyAdapter(String[] myDataset) {
			mDataset = myDataset;
		}

		@Override
		public int getItemCount() {
			// TODO Auto-generated method stub
			return mDataset.length;
		}

		@Override
		public void onBindViewHolder(ViewHolder holder, int position) {
			// TODO Auto-generated method stub
			holder.swipeLayout.setShowMode(SwipeLayout.ShowMode.LayDown);
			holder.swipeLayout.setDragEdge(SwipeLayout.DragEdge.Left);
			holder.swipeLayout.addSwipeListener(new SwipeListener() {

				@Override
				public void onUpdate(SwipeLayout arg0, int arg1, int arg2) {
					// TODO Auto-generated method stub

				}

				@Override
				public void onStartOpen(SwipeLayout arg0) {
					// TODO Auto-generated method stub

				}

				@Override
				public void onStartClose(SwipeLayout arg0) {
					// TODO Auto-generated method stub

				}

				@Override
				public void onOpen(SwipeLayout arg0) {
					// TODO Auto-generated method stub

				}

				@Override
				public void onHandRelease(SwipeLayout arg0, float arg1,
						float arg2) {
					// TODO Auto-generated method stub

				}

				@Override
				public void onClose(SwipeLayout arg0) {
					// TODO Auto-generated method stub

				}
			});
			holder.mTextView.setText(mDataset[position]);
		}

		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int arg1) {
			// TODO Auto-generated method stub
			// create a new view
			View v = LayoutInflater.from(parent.getContext()).inflate(
					R.layout.textview_view, parent, false);
			// set the view's size, margins, paddings and layout parameters

			ViewHolder vh = new ViewHolder(v);
			return vh;
		}
	}
}
