package com.cbm.mvvm.viewmodel;

import com.cbm.mvvm.R;
import com.cbm.mvvm.activity.MainActivity;
import com.cbm.mvvm.contract.LoadListener;
import com.cbm.mvvm.model.Feed;
import com.cbm.mvvm.model.News;

import java.util.List;

public class MainViewModel {

	private static final String TAG = "MainViewModel";
	private MainActivity mActivity;
	private String feedUrl;

	public MainViewModel(MainActivity activity) {
		mActivity = activity;
	}

	public void loadNews() {
		// 获取url
		feedUrl = mActivity.getResources().getString(R.string.feed_api_url);
		// 加载数据
		Feed feed = new Feed();
		feed.loadData(feedUrl, new LoadListener<News>() {
			@Override
			public void loadSuccess(List<News> list) {
				// 加载数据成功
				mActivity.mNewsList.addAll(list);
				mActivity.mNewsAdapter.notifyDataSetChanged();
			}
			@Override
			public void loadFailure(String message) {
				// 加载数据失败
			}
		});
	}
}