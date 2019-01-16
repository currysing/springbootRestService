package com.example.restservice1.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class KeyColumn {
	// note use Long rather than int, that's what Jpa like
	@Id
	@Column(name = "PK", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pk;
	
	public Long getPk() {
		return pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
	}

}
