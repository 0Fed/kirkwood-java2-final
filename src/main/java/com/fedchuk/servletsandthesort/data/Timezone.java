package com.fedchuk.servletsandthesort.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Timezone {
    @JsonProperty("offset")
    private String offset;
    @JsonProperty("description")
    private String description;

    public String getOffset() {
        return offset;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "{" +
                "\n\t\toffset='" + offset + '\'' +
                "\n\t\tdescription='" + description + '\'' +
                "\n\t}";
    }
}
