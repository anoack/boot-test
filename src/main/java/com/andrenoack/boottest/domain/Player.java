package com.andrenoack.boottest.domain;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by andre.noack on 23.11.15.
 */
@Entity
public class Player {

	@Id
	@GeneratedValue
	Long id;
	String name;
	String position;

	public Player() {
		super();
	}

	public Player(String name, String position) {
		this();
		this.name = name;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
