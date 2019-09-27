package io.humourmind.cnspringgateway.domain;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CityWeatherInfo {
    private City city;
    private Weather weather;
}
