package br.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.model.response.Result;
import br.com.restclient.MapsApiClient;

@Service
public class MapService {
	
	@Autowired
	MapsApiClient apiClient;
	
	
	public ResponseEntity<Result> consulta(String longuitude, String latidude) {
		String latlng = longuitude+","+latidude;
		String key = "AIzaSyDJzkQVtTfsLdxeLMndDB1xBv1nFQPO6OQ";
		return apiClient.local(latlng, key);
	}

}
