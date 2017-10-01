package com.springframework.mysqltables;

public class Menu {
	private int menu_id;
	private String menu_item;
	private String page_link;

	public Menu() {
		super();
	}

	public Menu(String menu_item, String page_link) {
		super();
		this.menu_item = menu_item;
		this.page_link = page_link;
	}

	public Menu(int menu_id, String menu_item, String page_link) {
		super();
		this.menu_id = menu_id;
		this.menu_item = menu_item;
		this.page_link = page_link;
	}

	public int getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	public String getMenu_item() {
		return menu_item;
	}

	public void setMenu_item(String menu_item) {
		this.menu_item = menu_item;
	}

	public String getPage_link() {
		return page_link;
	}

	public void setPage_link(String page_link) {
		this.page_link = page_link;
	}

	@Override
	public String toString() {
		return "Menu [menu_id=" + menu_id + ", menu_item=" + menu_item + ", page_link=" + page_link + "]";
	}

}
