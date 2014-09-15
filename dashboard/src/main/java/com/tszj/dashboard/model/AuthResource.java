package com.tszj.dashboard.model;

/**
 * Created with IntelliJ IDEA.
 * User: ck01-392
 * Date: 13-12-2
 * Time: 下午3:22
 * To change this template use File | Settings | File Templates.
 */
public class AuthResource {

	private int id;
	private int category;
	private String memo;
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public String toString() {
		return "AuthResource{" +
				"id=" + id +
				", category=" + category +
				", memo='" + memo + '\'' +
				", url='" + url + '\'' +
				'}';
	}
}
