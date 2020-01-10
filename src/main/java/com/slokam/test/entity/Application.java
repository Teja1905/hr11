package com.slokam.test.entity; 
 import java.io.Serializable; 
 import javax.persistence.*;

import org.springframework.web.multipart.MultipartFile;

import java.util.*; 
@Entity 
public class Application implements Serializable { 

	
	
@Id 
 @GeneratedValue 
  private Integer  id;
   @ManyToOne() 
@JoinColumn(name="fkid52") 
   private Candidate  candidate;
   @ManyToOne() 
@JoinColumn(name="fkid53") 
   private Openning  openning;
  private Date  time;
  
  @Transient
  private MultipartFile uploadFile; 
  
  
public MultipartFile getUploadFile() {
	return uploadFile;
}
public void setUploadFile(MultipartFile uploadFile) {
	this.uploadFile = uploadFile;
}
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public Candidate getCandidate() {
		return candidate;
	}
public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
public Openning getOpenning() {
		return openning;
	}
public void setOpenning(Openning openning) {
		this.openning = openning;
	}
public Date getTime() {
		return time;
	}
public void setTime(Date time) {
		this.time = time;
	}
}