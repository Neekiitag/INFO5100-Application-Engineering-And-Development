/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author adity
 */
public class CarInfo {
    private String carManufacturer;
    private String carModelname;
    private String carModelNum;
    private String yearOfManufacturing;
    private int serialNumber;
    private String city;
    private int countOfSeats;
    private String availability;
    private String maintainenceCertStatus;

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }
    
    public String getCarModelname() {
        return carModelname;
    }

    public void setCarModelname(String carModelname) {
        this.carModelname = carModelname;
    }

    public String getCarModelNum() {
        return carModelNum;
    }

    public void setCarModelNum(String carModelNum) {
        this.carModelNum = carModelNum;
    }

    public String getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public void setYearOfManufacturing(String yearOfManufacturing) {
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountOfSeats() {
        return countOfSeats;
    }

    public void setCountOfSeats(int countOfSeats) {
        this.countOfSeats = countOfSeats;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getMaintainenceCertStatus() {
        return maintainenceCertStatus;
    }

    public void setMaintainenceCertStatus(String maintainenceCertStatus) {
        this.maintainenceCertStatus = maintainenceCertStatus;
    }
    
    
 
    
    

    
    
    @Override 
    public String toString(){
        return carManufacturer;
    }
}
