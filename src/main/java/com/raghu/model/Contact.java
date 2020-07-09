package com.raghu.model;

import java.sql.Date;

import lombok.Data;

@Data
public class Contact {
	private Integer contactId;
	private Integer contactNumber;
	private String contactName;
	private String contactEmail;
	private Date createdDate;
	private Date updatedDate;
	

}
