package com.machart.hotels.model;

import java.io.Serializable;

public class Hotels implements Serializable {
    String address_1;
    String address_2;
    String alt_email;
    String category_id;
    String classification_id;
    String comm_email;
    String country_code;
    String distance;
    String district_id;
    String id;
    String image;
    String latitude;
    String longitude;
    String mobile;
    String name;
    String pincode;
    String place;
    String reservation_link;
    String std_code;
    String tariff_max_rate;
    String tariff_min_rate;
    String telephone_1;
    String telephone_2;
    String website;

    public Hotels(String address_1, String address_2, String alt_email, String category_id, String classification_id, String comm_email, String country_code, String distance, String district_id, String id, String image, String latitude, String longitude, String mobile, String name, String pincode, String place, String reservation_link, String std_code, String tariff_max_rate, String tariff_min_rate, String telephone_1, String telephone_2, String website) {
        this.address_1 = address_1;
        this.address_2 = address_2;
        this.alt_email = alt_email;
        this.category_id = category_id;
        this.classification_id = classification_id;
        this.comm_email = comm_email;
        this.country_code = country_code;
        this.distance = distance;
        this.district_id = district_id;
        this.id = id;
        this.image = image;
        this.latitude = latitude;
        this.longitude = longitude;
        this.mobile = mobile;
        this.name = name;
        this.pincode = pincode;
        this.place = place;
        this.reservation_link = reservation_link;
        this.std_code = std_code;
        this.tariff_max_rate = tariff_max_rate;
        this.tariff_min_rate = tariff_min_rate;
        this.telephone_1 = telephone_1;
        this.telephone_2 = telephone_2;
        this.website = website;
    }

    public String getAddress_1() {
        return address_1;
    }

    public String getAddress_2() {
        return address_2;
    }

    public String getAlt_email() {
        return alt_email;
    }

    public String getCategory_id() {
        return category_id;
    }

    public String getClassification_id() {
        return classification_id;
    }

    public String getComm_email() {
        return comm_email;
    }

    public String getCountry_code() {
        return country_code;
    }

    public String getDistance() {
        return distance;
    }

    public String getDistrict_id() {
        return district_id;
    }

    public String getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getMobile() {
        return mobile;
    }

    public String getName() {
        return name;
    }

    public String getPincode() {
        return pincode;
    }

    public String getPlace() {
        return place;
    }

    public String getReservation_link() {
        return reservation_link;
    }

    public String getStd_code() {
        return std_code;
    }

    public String getTariff_max_rate() {
        return tariff_max_rate;
    }

    public String getTariff_min_rate() {
        return tariff_min_rate;
    }

    public String getTelephone_1() {
        return telephone_1;
    }

    public String getTelephone_2() {
        return telephone_2;
    }

    public String getWebsite() {
        return website;
    }
}

