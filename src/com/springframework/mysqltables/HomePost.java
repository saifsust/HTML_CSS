package com.springframework.mysqltables;

public class HomePost {
	private int post_id;
	private int post_category_id;
	private String post_title;
	private String post_author;
	private String post_date;
	private String post_img;
	private String post_content;
	private String post_tags;
	private String post_status;
	private int post_comment_count;

	public HomePost() {
		super();
	}
	

	public HomePost(String post_title, String post_author, String post_date, String post_img, String post_content) {
		super();
		this.post_title = post_title;
		this.post_author = post_author;
		this.post_date = post_date;
		this.post_img = post_img;
		this.post_content = post_content;
	}


	public HomePost(int post_category_id, String post_title, String post_author, String post_date, String post_img,
			String post_content, String post_tags, String post_status, int post_comment_count) {
		super();
		this.post_category_id = post_category_id;
		this.post_title = post_title;
		this.post_author = post_author;
		this.post_date = post_date;
		this.post_img = post_img;
		this.post_content = post_content;
		this.post_tags = post_tags;
		this.post_status = post_status;
		this.post_comment_count = post_comment_count;
	}

	public HomePost(int post_id, int post_category_id, String post_title, String post_author, String post_date,
			String post_img, String post_content, String post_tags, String post_status, int post_comment_count) {
		super();
		this.post_id = post_id;
		this.post_category_id = post_category_id;
		this.post_title = post_title;
		this.post_author = post_author;
		this.post_date = post_date;
		this.post_img = post_img;
		this.post_content = post_content;
		this.post_tags = post_tags;
		this.post_status = post_status;
		this.post_comment_count = post_comment_count;
	}

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}

	public int getPost_category_id() {
		return post_category_id;
	}

	public void setPost_category_id(int post_category_id) {
		this.post_category_id = post_category_id;
	}

	public String getPost_title() {
		return post_title;
	}

	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}

	public String getPost_author() {
		return post_author;
	}

	public void setPost_author(String post_author) {
		this.post_author = post_author;
	}

	public String getPost_date() {
		return post_date;
	}

	public void setPost_date(String post_date) {
		this.post_date = post_date;
	}

	public String getPost_img() {
		return post_img;
	}

	public void setPost_img(String post_img) {
		this.post_img = post_img;
	}

	public String getPost_content() {
		return post_content;
	}

	public void setPost_content(String post_content) {
		this.post_content = post_content;
	}

	public String getPost_tags() {
		return post_tags;
	}

	public void setPost_tags(String post_tags) {
		this.post_tags = post_tags;
	}

	public String getPost_status() {
		return post_status;
	}

	public void setPost_status(String post_status) {
		this.post_status = post_status;
	}

	public int getPost_comment_count() {
		return post_comment_count;
	}

	public void setPost_comment_count(int post_comment_count) {
		this.post_comment_count = post_comment_count;
	}

	@Override
	public String toString() {
		return "HomePost [post_id=" + post_id + ", post_category_id=" + post_category_id + ", post_title=" + post_title
				+ ", post_author=" + post_author + ", post_date=" + post_date + ", post_img=" + post_img
				+ ", post_content=" + post_content + ", post_tags=" + post_tags + ", post_status=" + post_status
				+ ", post_comment_count=" + post_comment_count + "]";
	}

}
