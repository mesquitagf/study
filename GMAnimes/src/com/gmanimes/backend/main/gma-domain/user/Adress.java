package user;

import java.math.BigDecimal;

public class Adress {

    private String country;
    private String adressDesc;
    private String comp;
    private String city;
    private String state;
    private BigDecimal zipcode;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAdressDesc() {
        return adressDesc;
    }

    public void setAdressDesc(String adressDesc) {
        this.adressDesc = adressDesc;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigDecimal getZipcode() {
        return zipcode;
    }

    public void setZipcode(BigDecimal zipcode) {
        this.zipcode = zipcode;
    }
}
