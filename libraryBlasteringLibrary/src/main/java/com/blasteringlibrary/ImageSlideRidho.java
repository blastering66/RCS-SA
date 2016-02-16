package com.blasteringlibrary;

import com.squareup.picasso.Picasso;

import android.content.Context;
import android.os.Handler;
import android.widget.ImageView;

public class ImageSlideRidho {
	public static int DURATION_FAST = 1000;
	public static int DURATION_NORMAL = 4000;
	public static int DURATION_LONG = 8000;

	public static void slideImageView(final Context ctx, final String[] gambar,
			final ImageView iv, final int durasi) {
		final Handler handler = new Handler();
		Runnable runnable = new Runnable() {
			int i = 0;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Picasso.with(ctx).load(gambar[i]).into(iv);
				i++;
				if (i > gambar.length - 1) {
					i = 0;
				}
				handler.postDelayed(this, durasi);
			}
		};
		handler.postDelayed(runnable, 1000);
	}
}
