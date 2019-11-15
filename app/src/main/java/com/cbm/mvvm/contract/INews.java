package com.cbm.mvvm.contract;

import com.cbm.mvvm.model.Feed;

import retrofit2.Call;
import retrofit2.http.GET;

public interface INews {
	@GET(".")
	Call<Feed> getFeed();
}
