package com.google.zxing.client.android.result;

import android.app.Activity;
import android.os.Handler;

import com.google.zxing.Result;
import com.google.zxing.client.android.CaptureActivity;
import com.google.zxing.client.result.ParsedResult;

public class TestResultHandler extends ResultHandler {

	private Handler mHandler = new Handler();
	
	TestResultHandler(Activity activity, ParsedResult result, Result rawResult) {
		super(activity, result, rawResult);
		//nothing
	}

	@Override
	public int getButtonCount() {
		return 0;
	}

	@Override
	public int getButtonText(int index) {
		return 0;
	}

	@Override
	public void handleButtonPress(int index) {
		return;
	}

	@Override
	public int getDisplayTitle() {
		return 0;
	}

}
