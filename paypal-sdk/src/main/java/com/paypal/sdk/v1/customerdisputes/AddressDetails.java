// This class was generated on Mon, 09 Apr 2018 16:10:52 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// AddressDetails.java
// @version 0.1.0-dev+291f3f
// @type object
// @data H4sIAAAAAAAC/7xVTW/kNgy991cQPnvcFL3NLU1QFG2RBmnaS1uMaYueISqLXkqaxFjkvy/kj5k4M8EiyCI3iZREvkfy6XN233eUrbNLY5S8h2sKyNZnefY3KmNl6QbbdCDLs9+oP26uydfKXWBx2Tq73xE4catONKRLgMZw8qFNy+FpMz4NYYcBUAm8tBS4JQ+OyJCBRhRqaTvL6GrKQdn/n4MoSNiRgq/JobJ4eNiREjTsaLVVZHeIwa4RbTFFhpa3uwAVTa8XcCMBDgk+cNilYK04CDtWAx1q6AGdAenIeYlaUwF3ZKIz6MJ8YwhM1vgCfhYFesS2s5RDOeWwmUMUs8Gyo80PJbCH6CNa2wOm0BW7MVNpjrcnlgoflChsXGwr0nJIq5xt2NLSEvqOyiLLs0tV7MeSXuTZHaH5w9k+WzdoPSXDp8hK5mC4VelIA5PP1v8cmsEHZbc97YEqsjXstkMGi4Z46Vl2xyUkswEr9QB46gGlTsmTC2lP0Cm17KmAvw4kzc8O91MjjHTA0CfWUj3TNx/0Y5Vwruzy3ouK/RsvLn6sazE0rOhKcU8OfpHoR0v9/dH5XnZdtPYp/yrFhizvSfuNJ91zvWT5jPN0DOdDMB0q4FZ8AGkargkqecyhwu3EyDBd3TN/IuyDoD7r5gXKpf0U4OgfM4Vfow9QXmvUvgR20xJ+R/f+gXgjjoHQs0hmz+tYxvb80HyTZpzLdrK/mmvyp5FLIzuJ1ksl/HM4WeZQDnXIofxJoqU9qkmbK4mavEnBvIC4jwIeq80sFEvkS8cp9IbVh5WoIQVygUMPFVl5AJyU7SBUogeVOytyPlarM0Ln2W0tHZ9JKpa+tTfIXAFX6NJ3h9BYDDn4IEp9Do0V0RxUpB3GHdNH15IL34T2/56++wIAAP//
// DO NOT EDIT
package com.paypal.sdk.v1.customerdisputes;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The non-portable additional address details that are sometimes needed for compliance, risk, or other scenarios where fine-grain address information might be needed. Not portable with common third party and opensource. Redundant with core fields. For example, `address_portable.address_line_1` is usually a combination of `address_details.street_number` and `street_name` and `street_type`.
 */
@Model
public class AddressDetails {

    // Required default constructor
    public AddressDetails() {}

	/**
	* A named locations that represents the premise. Usually a building name or number or collection of buildings with a common name or number. For example, <code>Craven House</code>.
	*/
	@SerializedName("building_name")
	private String buildingName;

	public String buildingName() { return buildingName; }
	
	public AddressDetails buildingName(String buildingName) {
	    this.buildingName = buildingName;
	    return this;
	}

	/**
	* The delivery service. Post office box, bag number, or post office name.
	*/
	@SerializedName("delivery_service")
	private String deliveryService;

	public String deliveryService() { return deliveryService; }
	
	public AddressDetails deliveryService(String deliveryService) {
	    this.deliveryService = deliveryService;
	    return this;
	}

	/**
	* The street name. Just `Drury` in `Drury Lane`.
	*/
	@SerializedName("street_name")
	private String streetName;

	public String streetName() { return streetName; }
	
	public AddressDetails streetName(String streetName) {
	    this.streetName = streetName;
	    return this;
	}

	/**
	* The street number.
	*/
	@SerializedName("street_number")
	private String streetNumber;

	public String streetNumber() { return streetNumber; }
	
	public AddressDetails streetNumber(String streetNumber) {
	    this.streetNumber = streetNumber;
	    return this;
	}

	/**
	* The street type of the address. For example, `Street`, `Lane`, `Boulevard`, `Court`, and so on.
	*/
	@SerializedName("street_type")
	private String streetType;

	public String streetType() { return streetType; }
	
	public AddressDetails streetType(String streetType) {
	    this.streetType = streetType;
	    return this;
	}

	/**
	* The first-order entity below a named building or location that represents the sub-premise. Usually a single building within a collection of buildings with a common name. Can be a flat, storey, floor, room, or apartment.
	*/
	@SerializedName("sub_building")
	private String subBuilding;

	public String subBuilding() { return subBuilding; }
	
	public AddressDetails subBuilding(String subBuilding) {
	    this.subBuilding = subBuilding;
	    return this;
	}
}