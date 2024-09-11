package com.cxl.ch11.demo1;

public class Client {
    public static void main(String[] args) {
        Plane passengerPlane = new PassengerPlane();
        Plane cargoPlane = new CargoPlane();

        Manufacturer airbus = new Airbus();
        airbus.setPlane(passengerPlane);
        airbus.make();
        Manufacturer boeing = new Boeing();
        boeing.setPlane(cargoPlane);
        boeing.make();
        Manufacturer mcDonnellDouglas = new McDonnellDouglas();
        mcDonnellDouglas.setPlane(passengerPlane);
        mcDonnellDouglas.make();

    }
}
