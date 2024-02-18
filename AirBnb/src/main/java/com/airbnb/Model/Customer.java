package com.airbnb.Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
    
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	
	@NotNull
	@Email(message = "Email id Should be in Right Formate")
	private String email;
	
	@NotNull
	@Pattern(regexp = "^[6-9]\\d{9}$" , message = "Mobile no must should be 10 digits and shpold be srat with 6/7/8/9")
	private String Phone;
	
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	private List<Booking> booking = new ArrayList<>();	
	
}
