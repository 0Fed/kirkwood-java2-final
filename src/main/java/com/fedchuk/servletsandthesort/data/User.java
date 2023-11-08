package com.fedchuk.servletsandthesort.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class User implements Comparable<User> {

    @JsonProperty("gender")
    private String gender;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("cell")
    private String cell;
    @JsonProperty("nat")
    private String nat;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("registered")
    private Registered registered;
    @JsonProperty("id")
    private Id id;
    @JsonProperty("picture")
    private Picture picture;
    @JsonProperty("dob")
    private DOB dob;
    @JsonProperty("login")
    private Login login;

    public String getGender() {
        return gender;
    }

    public Name getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCell() {
        return cell;
    }

    public String getNat() {
        return nat;
    }

    public Location getLocation() {
        return location;
    }

    public Registered getRegistered() {
        return registered;
    }

    public Id getId() {
        return id;
    }

    public Picture getPicture() {
        return picture;
    }

    public DOB getDob() {
        return dob;
    }

    public Login getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "User{" +
                "\n\tgender='" + gender + '\'' +
                "\n\tname='" + name + '\'' +
                "\n\tlocation='" + location + '\'' +
                "\n\temail='" + email + '\'' +
                "\n\tphone='" + phone + '\'' +
                "\n\tcell='" + cell + '\'' +
                "\n\tnat='" + nat + '\'' +
                "\n\tregistered=" + registered +
                "\n\tid=" + id +
                "\n\tpicture=" + picture +
                "\n\tdob='" + dob + '\'' +
                "\n\tdob='" + login + '\'' +
                "\n";
    }

    @Override
    public int compareTo(User o) {
        int result = this.getName().getLast().compareTo(o.getName().getLast());
        if(result == 0){
            result = this.getName().getFirst().compareTo(o.getName().getFirst());
        }
        return result;
    }
}

