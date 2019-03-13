package au.com.cdsw.permitsUI.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Vehicle {

    private Long id;

    private String registration;

    private String state;

    private String country;

    private VehicleType vehicleType;

    public Vehicle() {}

    public Long getId() {
        return id;
    }

    public String getRegistration() {
        return registration;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", registration='" + registration + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
