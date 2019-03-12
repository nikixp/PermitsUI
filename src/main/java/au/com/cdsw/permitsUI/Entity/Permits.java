package au.com.cdsw.permitsUI.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Permits implements Serializable {

    private Long id;

    private Double cost;

    private String name;

    private String daysValid;

    private Long permitAreaFk;

    private String vehicleType;

    public Permits() {}

    public Long getId() {
        return id;
    }

    public Double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDaysValid() {
        return daysValid;
    }

    public Long getPermitAreaFk() {
        return permitAreaFk;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Permits{" +
                "id=" + id +
                ", cost=" + cost +
                ", name='" + name + '\'' +
                ", daysValid='" + daysValid + '\'' +
                ", permitAreaFk=" + permitAreaFk +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }

}
