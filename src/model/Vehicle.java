package model;

import java.time.LocalDate;

public class Vehicle {
    private Integer id;
    private String uuid;
    private String name;
    private String numberplate;
    private String profile;
    private LocalDate createDate;
    private VehicleOfModel vehicle;
    public Vehicle(){}

    public Vehicle(Integer id, String uuid, String name, String numberplate, String profile, LocalDate createDate, VehicleOfModel vehicle) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.numberplate = numberplate;
        this.profile = profile;
        this.createDate = createDate;
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", numberplate='" + numberplate + '\'' +
                ", profile='" + profile + '\'' +
                ", createDate=" + createDate +
                ", vehicle=" + vehicle +
                '}';
    }
}
