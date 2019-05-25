package com.SellNBuy.Ship_Details_SellNBuy.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity // mark this class as entity
@Table(name="Shipping") // define table for the entity 

@EntityListeners(AuditingEntityListener.class)
public class Shipping {

	@Id     // primary key
	@GeneratedValue(strategy=GenerationType.AUTO) // auto increment the  primary key
	private Long Id;	
	
	@NotBlank(message="Ship Name is mandatory !")   
	private String shipName;
	
	@NotBlank(message = "shippingCost is mandatory")
	private String shippingCost;
	
	@NotBlank(message = "departFrom is mandatory")
	private String departFrom;
	
	@NotNull(message = "departTimeDate is mandatory")
	private LocalDateTime departTimeDate;
	
	@NotBlank(message = "destination is mandatory")
	private String destination;
	
	@NotNull(message = "arrivalTimeDate is mandatory")
	private LocalDateTime arrivalTimeDate;
	
	@NotBlank(message = "status is mandatory")
	private String status;
	
	@NotBlank(message = "company is mandatory")
	private String company;
	
	@NotBlank(message = "companyContactNo is mandatory")
	@Pattern(regexp="(^$|[0-9]{10})",message = "Please enter valid number")//validation---not allow to isert any chrctor that is not a digit.between 0-9 numbers allow
	private String companyContactNo;
	
	@NotBlank(message = "trvellingDescription is mandatory")
	private String trvellingDescription;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public String getShippingCost() {
		return shippingCost;
	}
	public void setShippingCost(String shippingCost) {
		this.shippingCost = shippingCost;
	}
	public String getDepartFrom() {
		return departFrom;
	}
	public void setDepartFrom(String departFrom) {
		this.departFrom = departFrom;
	}
	public LocalDateTime getDepartTimeDate() {
		return departTimeDate;
	}
	public void setDepartTimeDate(LocalDateTime departTimeDate) {
		this.departTimeDate = departTimeDate;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDateTime getArrivalTimeDate() {
		return arrivalTimeDate;
	}
	public void setArrivalTimeDate(LocalDateTime arrivalTimeDate) {
		this.arrivalTimeDate = arrivalTimeDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompanyContactNo() {
		return companyContactNo;
	}
	public void setCompanyContactNo(String companyContactNo) {
		this.companyContactNo = companyContactNo;
	}
	public String getTrvellingDescription() {
		return trvellingDescription;
	}
	public void setTrvellingDescription(String trvellingDescription) {
		this.trvellingDescription = trvellingDescription;
	}
	
}
