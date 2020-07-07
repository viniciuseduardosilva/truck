
package br.com.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "northeast",
    "southwest"
})
public class Viewport {

    @JsonProperty("northeast")
    public Northeast northeast;
    @JsonProperty("southwest")
    public Southwest southwest;
	public Northeast getNortheast() {
		return northeast;
	}
	public void setNortheast(Northeast northeast) {
		this.northeast = northeast;
	}
	public Southwest getSouthwest() {
		return southwest;
	}
	public void setSouthwest(Southwest southwest) {
		this.southwest = southwest;
	}
	@Override
	public String toString() {
		return "Viewport [northeast=" + northeast + ", southwest=" + southwest + "]";
	}

    
}
