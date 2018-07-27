package com.example.data.validator.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "serialized_objects")
public class SerializedObject implements Serializable {
	
	private static final long serialVersionUID = -2024156824404097658L;
	
	@Id
	@Column(name = "object_name", columnDefinition = "VARCHAR(20) default NULL")
	private String objectName;
	
	@Lob
	@Column(name = "serialized_object")
	private byte[] serializedObject;

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public byte[] getSerializedObject() {
		return serializedObject;
	}

	public void setSerializedObject(byte[] serializedObject) {
		this.serializedObject = serializedObject;
	}
}
