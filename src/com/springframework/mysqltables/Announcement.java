package com.springframework.mysqltables;

public class Announcement {
	private int ann_id;
	private String ann_title;
	private String ann_content;
	private String ann_date;

	public Announcement() {
		super();
	}

	public Announcement(String ann_title, String ann_content, String ann_date) {
		super();
		this.ann_title = ann_title;
		this.ann_content = ann_content;
		this.ann_date = ann_date;
	}

	public Announcement(int ann_id, String ann_title, String ann_content, String ann_date) {
		super();
		this.ann_id = ann_id;
		this.ann_title = ann_title;
		this.ann_content = ann_content;
		this.ann_date = ann_date;
	}

	public int getAnn_id() {
		return ann_id;
	}

	public void setAnn_id(int ann_id) {
		this.ann_id = ann_id;
	}

	public String getAnn_title() {
		return ann_title;
	}

	public void setAnn_title(String ann_title) {
		this.ann_title = ann_title;
	}

	public String getAnn_content() {
		return ann_content;
	}

	public void setAnn_content(String ann_content) {
		this.ann_content = ann_content;
	}

	public String getAnn_date() {
		return ann_date;
	}

	public void setAnn_date(String ann_date) {
		this.ann_date = ann_date;
	}

	@Override
	public String toString() {
		return "Announcement [ann_id=" + ann_id + ", ann_title=" + ann_title + ", ann_content=" + ann_content
				+ ", ann_date=" + ann_date + "]";
	}

}
