package com.fedchuk.servletsandthesort.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Street {
    @JsonProperty("number")
    private String number;
    @JsonProperty("name")
    private String name;

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "\n\t\tnumber='" + number + '\'' +
                "\n\t\tname='" + name + '\'' +
                "\n\t}";
    }
}
