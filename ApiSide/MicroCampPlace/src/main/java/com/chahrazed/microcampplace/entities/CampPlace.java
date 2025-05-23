package com.chahrazed.microcampplace.entities;

import com.chahrazed.microcampplace.enumeration.State;
import com.chahrazed.microcampplace.enumeration.CampPlaceCategory;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CampPlace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer idCampPlace;
    private String name;
    private CampPlaceCategory category;
    private int tel;
    private String email;
    private String address;
    private State state;
    @Column(length = 1000)
    private String description;
    private Double longitude ;
    private Double latitude;
    // uni
    @OneToMany
    private List<Image> images;


}