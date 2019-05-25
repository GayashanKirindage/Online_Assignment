package com.SellNBuy.Ship_Details_SellNBuy.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SellNBuy.Ship_Details_SellNBuy.dao.ShippingDAO;
import com.SellNBuy.Ship_Details_SellNBuy.model.Shipping;

@RestController
@RequestMapping("/SellNBuy")
public class ShippingController {

	@Autowired
	ShippingDAO shippingDAO;
	
	/*to save a shipping detail*/
	@PostMapping("/shipping")
	public Shipping createShipping(@Valid @RequestBody Shipping ship) {
		return shippingDAO.save(ship);
	}
	
	/*to get all shipping details*/
	@GetMapping("/shipping")
	public List<Shipping>getAllShippings(){
		return shippingDAO.findAll();
	}
	
	/*get shipping details by id*/
	@GetMapping("/shipping/{id}")
	public ResponseEntity<Shipping> getShippingById(@PathVariable(value="id") Long Id){
		
		Shipping ship=shippingDAO.findOne(Id);
		
		if(ship==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(ship);
		
	}
	/*update an shipping detail by id*/
	@PutMapping("/shipping/{id}")
	
	//pass the value of user id and get user inputs related to that
	public ResponseEntity<Shipping> updateShipping(@PathVariable(value="id") Long Id,@Valid @RequestBody Shipping shippingDetails){ 
		
		Shipping ship=shippingDAO.findOne(Id); //find the records related to id in db 
		if(ship==null) {
			return ResponseEntity.notFound().build();
		}
		
		ship.setShipName(shippingDetails.getShipName());
		ship.setShippingCost(shippingDetails.getShippingCost());
		ship.setDepartFrom(shippingDetails.getDepartFrom());
		ship.setDepartTimeDate(shippingDetails.getDepartTimeDate());
		ship.setDestination(shippingDetails.getDestination());
		ship.setArrivalTimeDate(shippingDetails.getArrivalTimeDate());		
		ship.setStatus(shippingDetails.getStatus());
		ship.setCompany(shippingDetails.getCompany());
		ship.setCompanyContactNo(shippingDetails.getCompanyContactNo());
		ship.setTrvellingDescription(shippingDetails.getTrvellingDescription());
		
		Shipping updateShippingDetail=shippingDAO.save(ship);
		return ResponseEntity.ok().body(updateShippingDetail);
			
	}
	
	/*Delete a Shipping record*/
	@DeleteMapping("/shipping/{id}")

	//get the user input id and pass it to sID
	public ResponseEntity<Shipping> deleteShippingDetail(@PathVariable(value="id") Long Id){
		
		Shipping ship=shippingDAO.findOne(Id); //find the related records existence in db table
		if(ship==null) {
			return ResponseEntity.notFound().build();
		}
		shippingDAO.Delete(ship); //if record exists delete
		
		return ResponseEntity.ok().build();
		
		
	}
	
}
