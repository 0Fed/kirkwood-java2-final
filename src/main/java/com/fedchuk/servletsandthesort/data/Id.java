package com.fedchuk.servletsandthesort.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Id {
    @JsonProperty("name")
    private String name;
    @JsonProperty("value")
    private String value;

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{" +
                "\n\t\tname='" + name + '\'' +
                "\n\t\tvalue='" + value + '\'' +
                "\n";
    }
}
