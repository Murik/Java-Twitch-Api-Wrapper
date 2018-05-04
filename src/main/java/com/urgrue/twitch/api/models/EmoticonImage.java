
package com.mb3364.twitch.api.models;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "code",
    "emoticon_set"
})
public class EmoticonImage {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("emoticon_set")
    private Object emoticonSet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EmoticonImage() {
    }

    /**
     * 
     * @param id
     * @param emoticonSet
     * @param code
     */
    public EmoticonImage(Integer id, String code, Object emoticonSet) {
        super();
        this.id = id;
        this.code = code;
        this.emoticonSet = emoticonSet;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("emoticon_set")
    public Object getEmoticonSet() {
        return emoticonSet;
    }

    @JsonProperty("emoticon_set")
    public void setEmoticonSet(Object emoticonSet) {
        this.emoticonSet = emoticonSet;
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

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(code).append(emoticonSet).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmoticonImage) == false) {
            return false;
        }
        EmoticonImage rhs = ((EmoticonImage) other);
        return new EqualsBuilder().append(id, rhs.id).append(code, rhs.code).append(emoticonSet, rhs.emoticonSet).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
