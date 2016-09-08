package com.example.wtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.ListView;

public class FixedListView extends ListView {

	private static final String TAG=FixedListView.class.getSimpleName();
	public FixedListView(Context context) {
		this(context, null);
		// TODO Auto-generated constructor stub
	}

	public FixedListView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
		// TODO Auto-generated constructor stub
	}

	public FixedListView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean dispatchKeyEvent(KeyEvent event) {
		// TODO Auto-generated method stub
		super.dispatchKeyEvent(event);

		if (event.getAction() == KeyEvent.ACTION_DOWN) {

			if (KeyEvent.KEYCODE_DPAD_DOWN == event.getKeyCode()) {
				Log.d(TAG, "[dispatchKeyEvent] keycode down");
				this.smoothScrollToPositionFromTop(
						super.getSelectedItemPosition(), 0);
			}
			if(KeyEvent.KEYCODE_DPAD_UP==event.getKeyCode())
			{
				Log.d(TAG, "[dispatchKeyEvent] keycode up");
			}
		}

		return true;
	}

}
