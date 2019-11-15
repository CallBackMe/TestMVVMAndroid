package com.cbm.mvvm.contract;

import java.util.List;

public interface LoadListener<T> {
	void loadSuccess(List<T> list);
	void loadFailure(String message);
}
