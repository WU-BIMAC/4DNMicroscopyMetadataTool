
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
 * Car
 * <p>
 * A car is used for transportation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "engine"
})
public class Car
    extends Vehicle
{

    /**
     * The type of car engine.
     * (Required)
     * 
     */
    @JsonProperty("engine")
    private String engine;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * The type of car engine.
     * (Required)
     * 
     * @return
     *     The engine
     */
    @JsonProperty("engine")
    public String getEngine() {
        return engine;
    }

    /**
     * The type of car engine.
     * (Required)
     * 
     * @param engine
     *     The engine
     */
    @JsonProperty("engine")
    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Car withEngine(String engine) {
        this.engine = engine;
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

    public Car withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("engine".equals(name)) {
            if (value instanceof String) {
                setEngine(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"engine\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            return super.declaredProperty(name, value);
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("engine".equals(name)) {
            return getEngine();
        } else {
            return super.declaredPropertyOrNotFound(name, notFoundValue);
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Car.NOT_FOUND_VALUE);
        if (Car.NOT_FOUND_VALUE!= value) {
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

    public Car with(String name, Object value) {
        if (!declaredProperty(name, value)) {
            getAdditionalProperties().put(name, ((Object) value));
        }
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(engine).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Car) == false) {
            return false;
        }
        Car rhs = ((Car) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(engine, rhs.engine).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
