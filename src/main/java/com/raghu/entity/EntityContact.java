package com.raghu.entity;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;



import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity

@Table(name="CONTACT_DLTS")
public class EntityContact {
	@Id
	@Column(name="CONTACT_ID") 
	@SequenceGenerator(name="cid_seq_gen",
						sequenceName="CONTACT_ID_SEQ",allocationSize=1)
	@GeneratedValue(generator="cid_seq_gen",
					strategy=GenerationType.SEQUENCE)
	
	private Integer contactId;
	@Column(name="CONTACT_NUMBER")
	private String contactNumber;
	@Column(name="CONTACT_NAME")
	private String contactName;
	@Column(name="CONTACT_EMAIL")
	private String contactEmail;
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE",updatable=false)
	private Date createdDate;
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE",insertable=false)
	private Date UpdatedDate;
	

}
