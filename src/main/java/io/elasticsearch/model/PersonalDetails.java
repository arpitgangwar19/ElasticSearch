package io.elasticsearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "details")
public class PersonalDetails {
	
	
	@Id
	private String id;
	
	
	 @Field(type = FieldType.Text, name = "name")
	 private String name; 			
	 @Field(type = FieldType.Text, name = "lname")
	 private String lname; 
	 
	 @Field(type = FieldType.Text, name = "address")
     private String address; 
	 @Field(type = FieldType.Text, name = "age")
	 private int age; 
	 @Field(type = FieldType.Text, name = "favoriteBike")
	 private String favoriteBike ; 
	 
	 @Field(type = FieldType.Text, name = "qualification")
	 private String qualification; 
	 
	 @Field(type = FieldType.Text, name = "phoneno")
     private String phonenumber;

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

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFavoriteBike() {
		return favoriteBike;
	}

	public void setFavoriteBike(String favoriteBike) {
		this.favoriteBike = favoriteBike;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public PersonalDetails(String id, String name, String lname, String address, int age, String favoriteBike,
			String qualification, String phonenumber) {
		super();
		this.id = id;
		this.name = name;
		this.lname = lname;
		this.address = address;
		this.age = age;
		this.favoriteBike = favoriteBike;
		this.qualification = qualification;
		this.phonenumber = phonenumber;
	}
	public PersonalDetails(String name, String lname, String address, int age, String favoriteBike,
			String qualification, String phonenumber) {
		super();
		this.name = name;
		this.lname = lname;
		this.address = address;
		this.age = age;
		this.favoriteBike = favoriteBike;
		this.qualification = qualification;
		this.phonenumber = phonenumber;
	}
	

	
	public PersonalDetails() {
		
	}
}
