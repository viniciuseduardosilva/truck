package br.com.restclient;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.model.response.Result;



//https://maps.googleapis.com/maps/api/geocode/json?latlng=40.714224,-73.961452&key=YOUR_API_KEY

@FeignClient(name = "mapsClient", url = "https://maps.googleapis.com/maps/api/geocode")
public interface MapsApiClient {
	
	@GetMapping(value = "/json", produces = "application/json; charset=UTF-8")
	public ResponseEntity<Result> local(@RequestParam(value = "latlng", required = true) String latlng,
			@RequestParam(value = "key", required = true) String key);
	
}
