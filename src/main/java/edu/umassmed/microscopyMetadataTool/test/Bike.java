package edu.umassmed.microscopyMetadataTool.test;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Bike
 * <p>
 * A bike is used for transportation.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "type" })
public class Bike extends Vehicle {
	
	/**
	 * The type of bike. (Required)
	 * 
	 */
	@JsonProperty("type")
	private Bike.Type type;
	@JsonIgnore
	private final Map<String, Object> additionalProperties = new HashMap<String, Object>();
	protected final static Object NOT_FOUND_VALUE = new Object();
	
	/**
	 * The type of bike. (Required)
	 * 
	 * @return The type
	 */
	@JsonProperty("type")
	public Bike.Type getType() {
		return this.type;
	}
	
	/**
	 * The type of bike. (Required)
	 * 
	 * @param type
	 *            The type
	 */
	@JsonProperty("type")
	public void setType(final Bike.Type type) {
		this.type = type;
	}
	
	public Bike withType(final Bike.Type type) {
		this.type = type;
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
	public Bike withAdditionalProperty(final String name, final Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}
	
	@Override
	protected boolean declaredProperty(final String name, final Object value) {
		if ("type".equals(name)) {
			if (value instanceof Bike.Type) {
				this.setType(((Bike.Type) value));
			} else
				throw new IllegalArgumentException(
						("property \"type\" is of type \"testPackage.Bike.Type\", but got " + value
								.getClass().toString()));
			return true;
		} else
			return super.declaredProperty(name, value);
	}
	
	@Override
	protected Object declaredPropertyOrNotFound(final String name,
			final Object notFoundValue) {
		if ("type".equals(name))
			return this.getType();
		else
			return super.declaredPropertyOrNotFound(name, notFoundValue);
	}
	
	@Override
	@SuppressWarnings({ "unchecked" })
	public <T> T get(final String name) {
		final Object value = this.declaredPropertyOrNotFound(name,
				Bike.NOT_FOUND_VALUE);
		if (Bike.NOT_FOUND_VALUE != value)
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
	public Bike with(final String name, final Object value) {
		if (!this.declaredProperty(name, value)) {
			this.getAdditionalProperties().put(name, (value));
		}
		return this;
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder().appendSuper(super.hashCode())
				.append(this.type).append(this.additionalProperties)
				.toHashCode();
	}
	
	@Override
	public boolean equals(final Object other) {
		if (other == this)
			return true;
		if ((other instanceof Bike) == false)
			return false;
		final Bike rhs = ((Bike) other);
		return new EqualsBuilder().appendSuper(super.equals(other))
				.append(this.type, rhs.type)
				.append(this.additionalProperties, rhs.additionalProperties)
				.isEquals();
	}
	
	@Generated("org.jsonschema2pojo")
	public enum Type {
		
		SPORT("sport"), CHOPPER("chopper");
		private final String value;
		private final static Map<String, Bike.Type> CONSTANTS = new HashMap<String, Bike.Type>();
		
		static {
			for (final Bike.Type c : Type.values()) {
				Type.CONSTANTS.put(c.value, c);
			}
		}
		
		private Type(final String value) {
			this.value = value;
		}
		
		@JsonValue
		@Override
		public String toString() {
			return this.value;
		}
		
		@JsonCreator
		public static Bike.Type fromValue(final String value) {
			final Bike.Type constant = Type.CONSTANTS.get(value);
			if (constant == null)
				throw new IllegalArgumentException(value);
			else
				return constant;
		}
		
	}
	
}
