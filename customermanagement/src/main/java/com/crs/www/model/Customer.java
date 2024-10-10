package com.crs.www.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Customer {
	@Id
	private int custId;
	@Column
	private String custName;
	@Column
	private String custAdd;
	
}
