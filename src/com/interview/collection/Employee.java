package com.interview.collection;

import java.util.Comparator;
import java.util.List;

public class Employee implements Comparator<Employee>{

	private String id;
	private String name;
	private String email;
    private int age;
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String name, String email,int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void sortByName(List<Employee> employee) {
        // Comparator to sort by name ascending
        Comparator<Employee> compare = (Employee s1, Employee s2) ->
        {
            return s1.getName().compareTo(s2.getName());
        };
        
        employee.sort(compare);
    }
	
	// Comparator to sort by id ascending
	public static void sortById(List<Employee> employee) {
		Comparator<Employee> comp=(Employee s1, Employee s2)->{
			return s1.getId().compareTo(s2.getId());
		};
		employee.sort(comp);
		
	}

}
