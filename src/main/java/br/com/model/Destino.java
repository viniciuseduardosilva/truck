package br.com.model;

public class Destino {
	
	private String latitudeDestino;
	
	private String longitudeDestino;

	public String getLatitudeDestino() {
		return latitudeDestino;
	}

	public void setLatitudeDestino(String latitudeDestino) {
		this.latitudeDestino = latitudeDestino;
	}

	public String getLongitudeDestino() {
		return longitudeDestino;
	}

	public void setLongitudeDestino(String longitudeDestino) {
		this.longitudeDestino = longitudeDestino;
	}

	@Override
	public String toString() {
		return "Destino [latitudeDestino=" + latitudeDestino + ", longitudeDestino=" + longitudeDestino + "]";
	}

	
}
