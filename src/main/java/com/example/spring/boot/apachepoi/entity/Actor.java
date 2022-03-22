package com.example.spring.boot.apachepoi.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Actor {

	@Id
	private Integer actorId;
	private String firstName;
	private String lastName;
	private Date lastUpdate;

}
