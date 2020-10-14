package com.ilcarro.qa;

import org.testng.annotations.Test;

public class AddCarTests extends TestBase {

    @Test
    public void testFormLetTheCarWorkForLoggedInUser() throws InterruptedException {
        if(!app.getUser().isUserLoggedIn()){
            app.getUser().logIn();
            app.getCar().pause(2000);
        }
        app.getCar().openAddCarFormFromHeader();
        app.getCar().fillCarForm(
                new Car().setCountry("Israel").setAddress("Balfour Street").setDistanceIncluded("500")
                        .setSerialNumber("12345678").setBrand("Volkswagen").setModel("Bora").setYear("2002")
                        .setEngine("1.6").setFuelConsumption("8").setFuel("petrol").setTransmition("automatic")
                        .setWd("wedfrt").setHorsepower("110").setTorque("3456").setDoors("4").setSeats("5")
                        .setCarClass("E").setAbout("Dfgeriu").setTypeFeature("myTypeFueature").setPrice("87"));

        app.getCar().pause(2000);
        app.getCar().submitForm();
    }

    @Test
    public void testFormLetTheCarWorkForNotLoggedInUser() throws InterruptedException {
        if(app.getUser().isUserLoggedIn()){
            app.getUser().logOut();
        }
        app.getCar().openAddCarFormFromHeader();
        app.getCar().fillCarForm(
                new Car().setCountry("Israel").setAddress("Balfour Street").setDistanceIncluded("500")
                        .setSerialNumber("12345678").setBrand("Volkswagen").setModel("Bora").setYear("2002")
                        .setEngine("1.6").setFuelConsumption("8").setFuel("petrol").setTransmition("automatic")
                        .setWd("wedfrt").setHorsepower("110").setTorque("3456").setDoors("4").setSeats("5")
                        .setCarClass("E").setAbout("Dfgeriu").setTypeFeature("myTypeFueature").setPrice("87"));

        app.getCar().pause(2000);
        app.getCar().submitForm();
    }

    @Test
    public void negativeTestAddCarWithoutDorsInfo() throws InterruptedException {
        app.getCar().openAddCarFormFromHeader();
        app.getCar().fillCarForm(
                new Car().setCountry("Israel").setAddress("Balfour Street").setDistanceIncluded("500")
                        .setSerialNumber("12345678").setBrand("Volkswagen").setModel("Bora").setYear("2002")
                        .setEngine("1.6").setFuelConsumption("8").setFuel("petrol").setTransmition("automatic")
                        .setWd("wedfrt").setHorsepower("110").setTorque("3456").setSeats("5")
                        .setCarClass("E").setAbout("Dfgeriu").setTypeFeature("myTypeFueature").setPrice("87"));

        app.getCar().pause(2000);
        app.getCar().submitForm();
    }


}
