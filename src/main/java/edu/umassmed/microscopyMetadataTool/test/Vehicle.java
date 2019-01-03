package edu.umassmed.microscopyMetadataTool.test;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Vehicle
 * <p>
 * A vehicle is used for transportation.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "registrationNumber", "owner" })
public class Vehicle {
	
	/**
	 * The registration number of the vehicle. (Required)
	 * 
	 */
	@JsonProperty("registrationNumber")
	private Integer registrationNumber;
	/**
	 * The owner of the vehicle. (Required)
	 * 
	 */
	@JsonProperty("owner")
	private String owner;
	@JsonIgnore
	private final Map<String, Object> additionalProperties = new HashMap<String, Object>();
	protected final static Object NOT_FOUND_VALUE = new Object();
	
	/**
	 * The registration number of the vehicle. (Required)
	 * 
	 * @return The registrationNumber
	 */
	@JsonProperty("registrationNumber")
	public Integer getRegistrationNumber() {
		return this.registrationNumber;
	}
	
	/**
	 * The registration number of the vehicle. (Required)
	 * 
	 * @param registrationNumber
	 *            The registrationNumber
	 */
	@JsonProperty("registrationNumber")
	public void setRegistrationNumber(final Integer registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	public Vehicle withRegistrationNumber(final Integer registrationNumber) {
		this.registrationNumber = registrationNumber;
		return this;
	}
	
	/**
	 * The owner of the vehicle. (Required)
	 * 
	 * @return The owner
	 */
	@JsonProperty("owner")
	public String getOwner() {
		return this.owner;
	}
	
	/**
	 * The owner of the vehicle. (Required)
	 * 
	 * @param owner
	 *            The owner
	 */
	@JsonProperty("owner")
	public void setOwner(final String owner) {
		this.owner = owner;
	}
	
	public Vehicle withOwner(final String owner) {
		this.owner = owner;
		return this;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	@JsonAnySetter
	public void setAdditionalProperty(final String name, final Object value) {
		this.additionalProperties.put(name, value);
	}
	
	public Vehicle withAdditionalProperty(final String name, final Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}
	
	protected boolean declaredProperty(final String name, final Object value) {
		if ("registrationNumber".equals(name)) {
			if (value instanceof Integer) {
				this.setRegistrationNumber(((Integer) value));
			} else
				throw new IllegalArgumentException(
						("property \"registrationNumber\" is of type \"java.lang.Integer\", but got " + value
								.getClass().toString()));
			return true;
		} else {
			if ("owner".equals(name)) {
				if (value instanceof String) {
					this.setOwner(((String) value));
				} else
					throw new IllegalArgumentException(
							("property \"owner\" is of type \"java.lang.String\", but got " + value
									.getClass().toString()));
				return true;
			} else
				return false;
		}
	}
	
	protected Object declaredPropertyOrNotFound(final String name,
			final Object notFoundValue) {
		if ("registrationNumber".equals(name))
			return this.getRegistrationNumber();
		else {
			if ("owner".equals(name))
				return this.getOwner();
			else
				return notFoundValue;
		}
	}
	
	@SuppressWarnings({ "unchecked" })
	public <T> T get(final String name) {
		final Object value = this.declaredPropertyOrNotFound(name,
				Vehicle.NOT_FOUND_VALUE);
		if (Vehicle.NOT_FOUND_VALUE != value)
			return ((T) value);
		else
			return ((T) this.getAdditionalProperties().get(name));
	}
	
	public void set(final String name, final Object value) {
		if (!this.declaredProperty(name, value)) {
			this.getAdditionalProperties().put(name, (value));
		}
	}
	
	public Vehicle with(final String name, final Object value) {
		if (!this.declaredProperty(name, value)) {
			this.getAdditionalProperties().put(name, (value));
		}
		return this;
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.registrationNumber)
				.append(this.owner).append(this.additionalProperties)
				.toHashCode();
	}
	
	@Override
	public boolean equals(final Object other) {
		if (other == this)
			return true;
		if ((other instanceof Vehicle) == false)
			return false;
		final Vehicle rhs = ((Vehicle) other);
		return new EqualsBuilder()
				.append(this.registrationNumber, rhs.registrationNumber)
				.append(this.owner, rhs.owner)
				.append(this.additionalProperties, rhs.additionalProperties)
				.isEquals();
	}
	
}
