
package br.com.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "long_name",
    "short_name",
    "types"
})
public class AddressComponent {

    @JsonProperty("long_name")
    public String longName;
    @JsonProperty("short_name")
    public String shortName;
    @JsonProperty("types")
    public List<String> types = null;
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public List<String> getTypes() {
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
	@Override
	public String toString() {
		return "AddressComponent [longName=" + longName + ", shortName=" + shortName + ", types=" + types + "]";
	}
    
    

}
