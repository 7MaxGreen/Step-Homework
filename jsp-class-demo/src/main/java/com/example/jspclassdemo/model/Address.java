package com.example.jspclassdemo.model;

    public class Address {
        private String streetName;
        private String streetNumber;
        private String apartmentNumber;
        private String houseNumber;

        public void setStreetName(String streetName) {
            this.streetName = streetName;
        }

        public void setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
        }

        public void setApartmentNumber(String apartmentNumber) {
            this.apartmentNumber = apartmentNumber;
        }

        public void setHouseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
        }

        public String getStreetName() {
            return streetName;
        }

        public String getStreetNumber() {
            return streetNumber;
        }

        public String getApartmentNumber() {
            return apartmentNumber;
        }

        public String getHouseNumber(){
            return houseNumber;
        }

        public Address(String streetName) {
            this.streetName = streetName;
        }

        public Address(String streetName, String streetNumber, String apartmentNumber, String houseNumber) {
            this.streetName = streetName;
            this.streetNumber = streetNumber;
            this.apartmentNumber = apartmentNumber;
            this.houseNumber = houseNumber;
        }
    }

