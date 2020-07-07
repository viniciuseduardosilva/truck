
package br.com.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "address_components",
    "formatted_address",
    "geometry",
    "place_id",
    "types"
})
public class Result {

    @JsonProperty("address_components")
    public List<AddressComponent> addressComponents = null;
    @JsonProperty("formatted_address")
    public String formattedAddress;
    @JsonProperty("geometry")
    public Geometry geometry;
    @JsonProperty("place_id")
    public String placeId;
    @JsonProperty("types")
    public List<String> types = null;
	public List<AddressComponent> getAddressComponents() {
		return addressComponents;
	}
	public void setAddressComponents(List<AddressComponent> addressComponents) {
		this.addressComponents = addressComponents;
	}
	public String getFormattedAddress() {
		return formattedAddress;
	}
	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	public String getPlaceId() {
		return placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	public List<String> getTypes() {
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
	@Override
	public String toString() {
		return "Result [addressComponents=" + addressComponents + ", formattedAddress=" + formattedAddress
				+ ", geometry=" + geometry + ", placeId=" + placeId + ", types=" + types + "]";
	}

    
}
