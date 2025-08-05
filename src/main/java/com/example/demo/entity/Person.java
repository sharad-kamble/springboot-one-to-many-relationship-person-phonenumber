	package com.example.demo.entity;
	
	import java.util.List;
	
	import com.fasterxml.jackson.annotation.JsonManagedReference;
	
	import jakarta.persistence.CascadeType;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.OneToMany;
	import jakarta.persistence.Table;
	import lombok.Data;
	
	@Data
	@Entity
	@Table(name = "Person_info")
	public class Person {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
		private String email;
		private String address;
	
		@JsonManagedReference
		// OneToMany relation with PhoneNumber
		@OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
		private List<PhoneNumber> phoneNumbers;
	
	}
