
package br.com.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "location",
    "location_type",
    "viewport"
})
public class Geometry {

    @JsonProperty("location")
    public Location location;
    @JsonProperty("location_type")
    public String locationType;
    @JsonProperty("viewport")
    public Viewport viewport;
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getLocationType() {
		return locationType;
	}
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}
	public Viewport getViewport() {
		return viewport;
	}
	public void setViewport(Viewport viewport) {
		this.viewport = viewport;
	}
	@Override
	public String toString() {
		return "Geometry [location=" + location + ", locationType=" + locationType + ", viewport=" + viewport + "]";
	}

    
}
