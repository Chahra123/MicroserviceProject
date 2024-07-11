package com.chahrazed.microcampplace.dto;
import com.chahrazed.microcampplace.enumeration.State;
import com.chahrazed.microcampplace.enumeration.CampPlaceCategory;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CampPlaceDto {
    private Integer idCampPlace;
    private String name;
    private CampPlaceCategory category;
    private int tel;
    private String email;
    private String address;
    private State state;
    private String description;
    private Double longitude ;
    private Double latitude;
}