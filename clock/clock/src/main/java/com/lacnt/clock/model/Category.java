package com.lacnt.clock.model;


public class Category  {
	
	private int id_category;
	private String name;

	public int getId_category() {
		return id_category;
	}

	public void setId_category(int id_category) {
		this.id_category = id_category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category(int id_category, String name) {
		super();
		this.id_category = id_category;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [id_category=" + id_category + ", name=" + name + "]";
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

}
