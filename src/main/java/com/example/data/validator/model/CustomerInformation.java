package com.example.data.validator.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CustomerInformation implements Serializable {

	private static final long serialVersionUID = 24178630284850178L;
	
	@Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
	
	@Column(name = "customer_name")
	private String name;

}
