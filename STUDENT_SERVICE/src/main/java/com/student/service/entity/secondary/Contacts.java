
/**
 * 
 */
package com.student.service.entity.secondary;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contacts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String address;
	private String phone;
	private String pinCode;
	private String state;
	@Override
	public String toString() {
		return "Contacts [id=" + id + ", address=" + address + ", phone=" + phone + ", pinCode=" + pinCode + ", state="
				+ state + "]";
	}
	
	
}
