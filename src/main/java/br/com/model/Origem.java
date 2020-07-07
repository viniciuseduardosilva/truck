package br.com.model;

public class Origem {
	
	private String latitudeOrigem;
	
	private String longitudeOrigem;

	public String getLatitudeOrigem() {
		return latitudeOrigem;
	}

	public void setLatitudeOrigem(String latitudeOrigem) {
		this.latitudeOrigem = latitudeOrigem;
	}

	public String getLongitudeOrigem() {
		return longitudeOrigem;
	}

	public void setLongitudeOrigem(String longitudeOrigem) {
		this.longitudeOrigem = longitudeOrigem;
	}

	@Override
	public String toString() {
		return "Origem [latitudeOrigem=" + latitudeOrigem + ", longitudeOrigem=" + longitudeOrigem + "]";
	}
	
	

}
