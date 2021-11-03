/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author adity
 */
public class Person {
    
    private String personName;
    private int age;
    private String gender;
    private String house;
    private String city;
    private String community;
    private int zipcode;
    private int personId;
    private VitalSignsHistory vitalSign;

    private static int count = 0;
    
    public Person() {
        count++;
        personId = count;
        
        this.vitalSign = new VitalSignsHistory();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public VitalSignsHistory getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSignsHistory vitalSign) {
        this.vitalSign = vitalSign;
    }

  
    
    @Override
    public String toString()
    {
        return this.personName;
    }
    
}
