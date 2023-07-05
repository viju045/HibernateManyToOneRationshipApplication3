/**
 * Created By VijayKumar Moohite
 * Date : 7/5/2023
 * Time : 4:57 PM
 * Project : ManyToOneRelationshipApplicationHB3
 **/

package org.mahagan.domain;

import jakarta.persistence.*;
//This is my Third ManyToOne mapping Relationship application.
@Entity
@Table(name = "addres")
public class Addres {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addId;
    private String country;
    private String city;
    private String pincode;

    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
