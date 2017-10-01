package com.springframework.mysqltables;

public class Category {

	private String cat_id;
	private String cat_title;

	public Category() {
		super();
	}

	public Category(String cat_title) {
		super();
		this.cat_title = cat_title;
	}

	public Category(String cat_id, String cat_title) {
		super();
		this.cat_id = cat_id;
		this.cat_title = cat_title;
	}

	public String getCat_id() {
		return cat_id;
	}

	public void setCat_id(String cat_id) {
		this.cat_id = cat_id;
	}

	public String getCat_title() {
		return cat_title;
	}

	public void setCat_title(String cat_title) {
		this.cat_title = cat_title;
	}

	@Override
	public String toString() {
		return "Category [cat_id=" + cat_id + ", cat_title=" + cat_title + "]";
	}

}
