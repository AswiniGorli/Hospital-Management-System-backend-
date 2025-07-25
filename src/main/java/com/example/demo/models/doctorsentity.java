package com.example.demo.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


	@Entity
	@Setter
	@Getter
	@NoArgsConstructor
	@AllArgsConstructor
	public class doctorsentity {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
			private long id;
		    private String name;
		    private String specialization;
			private String email;
			private String password;
			private long phnno; 
}
