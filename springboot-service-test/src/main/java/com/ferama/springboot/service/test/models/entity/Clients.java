package com.ferama.springboot.service.test.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="clients")
public class Clients  implements Serializable{
	
	
	private static final long serialVersionUID = -3986371165708308179L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Long id;
	
	@Column(name="last_name")
	public String lastName;
	
	@Column(name="create_date")
	@Temporal(TemporalType.DATE)
	public Date createDate;
	
	@Column(name="adress")
	public String adress;
	
	@Column(name="first_name")
	public String firstName;
	
	@Column(name="route")
	public String route;
	
	
	public Clients() {
		super();
	}
	
	public Clients(String apellido, String direccion, String nombre, String ruta) {
		super();
		this.lastName =apellido;
		this.adress =direccion;
		this.firstName = nombre;
		this.route = ruta;
	}
	
	public Clients(Long id,String lastName, String adress, String name, String route) {
		super();
		this.id = id;
		this.lastName =lastName;
		this.adress =adress;
		this.firstName = name;
		this.route = route;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getName() {
		return firstName;
	}

	public void setName(String name) {
		this.firstName = name;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}
	
	
	

}
