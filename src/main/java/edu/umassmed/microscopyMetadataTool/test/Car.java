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
 * Car
 * <p>
 * A car is used for transportation.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "engine" })
public class Car extends Vehicle {
	
	/**
	 * The type of car engine. (Required)
	 * 
	 */
	@JsonProperty("engine")
	private String engine;
	@JsonIgnore
	private final Map<String, Object> additionalProperties = new HashMap<String, Object>();
	protected final static Object NOT_FOUND_VALUE = new Object();
	
	/**
	 * The type of car engine. (Required)
	 * 
	 * @return The engine
	 */
	@JsonProperty("engine")
	public String getEngine() {
		return this.engine;
	}
	
	/**
	 * The type of car engine. (Required)
	 * 
	 * @param engine
	 *            The engine
	 */
	@JsonProperty("engine")
	public void setEngine(final String engine) {
		this.engine = engine;
	}
	
	public Car withEngine(final String engine) {
		this.engine = engine;
		return this;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	@Override
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	@Override
	@JsonAnySetter
	public void setAdditionalProperty(final String name, final Object value) {
		this.additionalProperties.put(name, value);
	}
	
	@Override
	public Car withAdditionalProperty(final String name, final Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}
	
	@Override
	protected boolean declaredProperty(final String name, final Object value) {
		if ("engine".equals(name)) {
			if (value instanceof String) {
				this.setEngine(((String) value));
			} else
				throw new IllegalArgumentException(
						("property \"engine\" is of type \"java.lang.String\", but got " + value
								.getClass().toString()));
			return true;
		} else
			return super.declaredProperty(name, value);
	}
	
	@Override
	protected Object declaredPropertyOrNotFound(final String name,
			final Object notFoundValue) {
		if ("engine".equals(name))
			return this.getEngine();
		else
			return super.declaredPropertyOrNotFound(name, notFoundValue);
	}
	
	@Override
	@SuppressWarnings({ "unchecked" })
	public <T> T get(final String name) {
		final Object value = this.declaredPropertyOrNotFound(name,
				Car.NOT_FOUND_VALUE);
		if (Car.NOT_FOUND_VALUE != value)
			return ((T) value);
		else
			return ((T) this.getAdditionalProperties().get(name));
	}
	
	@Override
	public void set(final String name, final Object value) {
		if (!this.declaredProperty(name, value)) {
			this.getAdditionalProperties().put(name, (value));
		}
	}
	
	@Override
	public Car with(final String name, final Object value) {
		if (!this.declaredProperty(name, value)) {
			this.getAdditionalProperties().put(name, (value));
		}
		return this;
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder().appendSuper(super.hashCode())
				.append(this.engine).append(this.additionalProperties)
				.toHashCode();
	}
	
	@Override
	public boolean equals(final Object other) {
		if (other == this)
			return true;
		if ((other instanceof Car) == false)
			return false;
		final Car rhs = ((Car) other);
		return new EqualsBuilder().appendSuper(super.equals(other))
				.append(this.engine, rhs.engine)
				.append(this.additionalProperties, rhs.additionalProperties)
				.isEquals();
	}
	
}
