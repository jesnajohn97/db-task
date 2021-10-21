package com.example.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;
    private Integer unitId;
    
    public Employee() {
    	super();
    }
  
	public Employee(Integer id, String name,Integer unitId) {
		super();
		this.id = id;
		this.name = name;
		this.unitId = unitId;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getUnitId() {
		return unitId;
	}



	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}
	
	@Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append(String.valueOf(id));
        builder.append(", ");
        builder.append(name);
        builder.append(", ");
        builder.append(unitId);
        return builder.toString();
    }
    

	
 
}
