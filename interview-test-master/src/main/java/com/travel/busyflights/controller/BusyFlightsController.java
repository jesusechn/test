package com.travel.busyflights.controller;


import javax.xml.bind.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.travel.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travel.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travel.busyflights.domain.crazyair.CrazyAirRequest;
import com.travel.busyflights.domain.crazyair.CrazyAirResponse;
import com.travel.busyflights.domain.toughjet.ToughJetRequest;
import com.travel.busyflights.domain.toughjet.ToughJetResponse;
import com.travel.busyflights.services.BusyFligthsService;

@RestController
@RequestMapping("fly")
public class BusyFlightsController {
	 @Autowired
	BusyFligthsService busyFligthsService;

	  @PostMapping("/busyFligths")
	  BusyFlightsResponse create(@RequestBody BusyFlightsRequest busyFlightsRequest) throws ValidationException  {
			if(	busyFlightsRequest.getOrigin()==null&&busyFlightsRequest.getDestination()==null) {
				throw new ValidationException("the origin and  destination need to be filled ");
			}
			else {
				if(busyFlightsRequest.getNumberOfPassengers()>4) {
					throw new ValidationException("no more than 4 people in order to reserve");
				}
				return busyFligthsService.busyFligths(busyFlightsRequest);
			}
	    
	  }

	  @PostMapping("/crazyAir")
	  CrazyAirResponse create(@RequestBody CrazyAirRequest crazyAirRequest) throws ValidationException  {
			if(	crazyAirRequest.getOrigin()==null&&crazyAirRequest.getDestination()==null) {
				throw new ValidationException("the origin and   destination need to be filled ");
			}
			else {
				 return busyFligthsService.crazyAir(crazyAirRequest);
			}
		   
		  }

	  @PostMapping("/toughJet")
	  ToughJetResponse create(@RequestBody ToughJetRequest toughJetRequest) throws ValidationException  {
			if(	toughJetRequest.getFrom()==null&&toughJetRequest.getTo()==null) {
				throw new ValidationException("the origin and  destination need to be filled ");
			}
			else {
				return busyFligthsService.toughJet(toughJetRequest);
			}
		    
		  }
	  
	  @ResponseStatus(HttpStatus.BAD_REQUEST)
	  @ExceptionHandler(ValidationException.class)
	  String exceptionHandler(ValidationException e) {
	    return e.getMessage();
	  }

	

}
