package com.tts.javaaddressbookttsfinalproject;

import java.io.Serializable;

public class Entry implements Serializable{ //public class ContactEntry implements Serializable

  //Default serialVersion id
  private static final long serialVersionUID = 1L;

  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String email;

  //Generate the Getters and Setters
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  //You should override the toString() method so that the entries can be printed in an easy-to-read-manner.
  @Override
  public String toString() {
    return "ContactEntry{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", email='" + email + '\'' +
            '}';
  }

  //Search for an entry: Users can pick which methods they will search by (first name, last name, phone number, or email address).
  public String contactSearch(int searchMethod) {
    if (searchMethod == 1) {
      return this.getFirstName();

    } else if (searchMethod == 2) {
      return this.getLastName();

    } else if (searchMethod == 3) {
      return this.getPhoneNumber();

    } else {
      return this.getEmail();
    }
  }
}
