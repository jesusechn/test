package com.travel.busyflights.services;

import org.springframework.stereotype.Service;

import com.travel.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travel.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travel.busyflights.domain.crazyair.CrazyAirRequest;
import com.travel.busyflights.domain.crazyair.CrazyAirResponse;
import com.travel.busyflights.domain.toughjet.ToughJetRequest;
import com.travel.busyflights.domain.toughjet.ToughJetResponse;

@Service
public class BusyFligthsService {
	
	public  BusyFlightsResponse busyFligths( BusyFlightsRequest busyFlightsRequest) {

		BusyFlightsResponse busyFlightsResponse=new BusyFlightsResponse();
		busyFlightsResponse.setAirline("busy");
		busyFlightsResponse.setPrice(300);
		busyFlightsResponse.setCabinclass("");
		busyFlightsResponse.setDestinationAirportCode(busyFlightsRequest.getDestination());
		
		return busyFlightsResponse;
	}
	
	public CrazyAirResponse crazyAir(CrazyAirRequest crazyAirRequest) {
		CrazyAirResponse crazyAirResponse=new CrazyAirResponse();
		crazyAirResponse.setAirline("crazy");
		crazyAirResponse.setDestinationAirportCode(crazyAirRequest.getDestination());
		crazyAirResponse.setPrice(250);
		
		return crazyAirResponse;
	}
	
	
	public  ToughJetResponse toughJet(ToughJetRequest toughJetRequest){

		ToughJetResponse toughJetResponse=new ToughJetResponse();
		toughJetResponse.setArrivalAirportName("TTT");
		toughJetResponse.setArrivalAirportName(toughJetRequest.getTo());
		toughJetResponse.setDiscount(20);
		return toughJetResponse;
	}

}
