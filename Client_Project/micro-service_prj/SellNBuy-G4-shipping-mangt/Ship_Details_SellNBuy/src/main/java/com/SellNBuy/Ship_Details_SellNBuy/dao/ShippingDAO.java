package com.SellNBuy.Ship_Details_SellNBuy.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SellNBuy.Ship_Details_SellNBuy.model.Shipping;
import com.SellNBuy.Ship_Details_SellNBuy.repository.ShippingRepository;

@Service
public class ShippingDAO {

	@Autowired
	ShippingRepository shippingRepository;
	
	/*Save a ship detail*/
	
	
	public Shipping save(Shipping ship) {
		return shippingRepository.save(ship);
	}
	
	/* Search all shipping*/
	
	public List<Shipping>findAll(){
		return shippingRepository.findAll();
	}
	
	/*get one shipping using id*/
	
	public Shipping findOne(Long Id) {
		Optional<Shipping> op = shippingRepository.findById(Id);
		if(op.isPresent()) {
			return op.get();
		}
		else {
			return null;
		}
	}
	/*delete a shipping detail using id*/
	
	public void Delete(Shipping ship) {
		shippingRepository.delete(ship);
	}
}

