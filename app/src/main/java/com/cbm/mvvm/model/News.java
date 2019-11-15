package com.cbm.mvvm.model;

public class News {
	private String title;
	private String item_id;
	private String source;

	public News(String title, String item_id, String source) {
		this.title = title;
		this.item_id = item_id;
		this.source = source;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return title;
	}

	public String getItem_id() {
		return item_id;
	}

	public String getSource() {
		return source;
	}
}