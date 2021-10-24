package com.example.entity;

public class Unit {

	public Long id;
	public String name;

	public Unit() {
		super();
	}

	public Unit(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		builder.append(String.valueOf(id));
		builder.append(", ");
		builder.append(name);
		return builder.toString();
	}
	
}