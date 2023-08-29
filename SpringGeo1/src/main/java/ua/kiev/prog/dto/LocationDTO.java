package ua.kiev.prog.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

// DB -> E -> R -> S -> |DTO| -> C -> JSON/View

@Data
@NoArgsConstructor
public class LocationDTO {
    private String ip;
    private String city;
    private String region;
    private String country;
    private double rate;

    private LocationDTO(String ip, String city, String region, String country, double rate) {
        this.ip = ip;
        this.city = city;
        this.region = region;
        this.country = country;
        this.rate = rate;
    }

    public static LocationDTO of(String ip, String city, String region, String country, double rate) {
        return new LocationDTO(ip, city, region, country, rate);
    }
}
