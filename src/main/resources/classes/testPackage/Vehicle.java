
package testPackage;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Vehicle
 * <p>
 * A vehicle is used for transportation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "registrationNumber",
    "owner"
})
public class Vehicle {

    /**
     * The registration number of the vehicle.
     * (Required)
     * 
     */
    @JsonProperty("registrationNumber")
    private Integer registrationNumber;
    /**
     * The owner of the vehicle.
     * (Required)
     * 
     */
    @JsonProperty("owner")
    private String owner;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * The registration number of the vehicle.
     * (Required)
     * 
     * @return
     *     The registrationNumber
     */
    @JsonProperty("registrationNumber")
    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * The registration number of the vehicle.
     * (Required)
     * 
     * @param registrationNumber
     *     The registrationNumber
     */
    @JsonProperty("registrationNumber")
    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Vehicle withRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }

    /**
     * The owner of the vehicle.
     * (Required)
     * 
     * @return
     *     The owner
     */
    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    /**
     * The owner of the vehicle.
     * (Required)
     * 
     * @param owner
     *     The owner
     */
    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Vehicle withOwner(String owner) {
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
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Vehicle withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("registrationNumber".equals(name)) {
            if (value instanceof Integer) {
                setRegistrationNumber(((Integer) value));
            } else {
                throw new IllegalArgumentException(("property \"registrationNumber\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("owner".equals(name)) {
                if (value instanceof String) {
                    setOwner(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"owner\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                return false;
            }
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("registrationNumber".equals(name)) {
            return getRegistrationNumber();
        } else {
            if ("owner".equals(name)) {
                return getOwner();
            } else {
                return notFoundValue;
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Vehicle.NOT_FOUND_VALUE);
        if (Vehicle.NOT_FOUND_VALUE!= value) {
            return ((T) value);
        } else {
            return ((T) getAdditionalProperties().get(name));
        }
    }

    public void set(String name, Object value) {
        if (!declaredProperty(name, value)) {
            getAdditionalProperties().put(name, ((Object) value));
        }
    }

    public Vehicle with(String name, Object value) {
        if (!declaredProperty(name, value)) {
            getAdditionalProperties().put(name, ((Object) value));
        }
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(registrationNumber).append(owner).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Vehicle) == false) {
            return false;
        }
        Vehicle rhs = ((Vehicle) other);
        return new EqualsBuilder().append(registrationNumber, rhs.registrationNumber).append(owner, rhs.owner).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
