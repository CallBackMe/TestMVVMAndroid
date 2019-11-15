package com.cbm.mvvm.activity;

import android.os.Bundle;

import com.cbm.mvvm.R;
import com.cbm.mvvm.contract.NewsAdapter;
import com.cbm.mvvm.databinding.ActivityMainBinding;
import com.cbm.mvvm.model.News;
import com.cbm.mvvm.viewmodel.MainViewModel;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

public class MainActivity extends AppCompatActivity {

	private static final String TAG = "MainActivity";

	public ActivityMainBinding mActivityMainBinding;
	private MainViewModel mViewModel;

	public NewsAdapter mNewsAdapter;
	public List<News> mNewsList = new ArrayList<>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 设置dataBinding、viewModel
		mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
		mViewModel = new MainViewModel(this);
		mActivityMainBinding.setViewModel(mViewModel);
		// 初始化RecyclerView
		LinearLayoutManager layoutManager = new LinearLayoutManager(this);
		mActivityMainBinding.recyclerView.setLayoutManager(layoutManager);
		mNewsAdapter = new NewsAdapter(this, mNewsList);
		mActivityMainBinding.recyclerView.setAdapter(mNewsAdapter);
		// 加载数据
		mViewModel.loadNews();
	}

}
