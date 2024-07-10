package com.chahrazed.microcampplace.services;

import com.chahrazed.microcampplace.dto.CampPlaceSelectDto;
import com.chahrazed.microcampplace.entities.CampPlace;
import com.chahrazed.microcampplace.enumeration.State;
import com.chahrazed.microcampplace.enumeration.CampPlaceCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICampPlaceService {


    List<CampPlace> getAllCampPlaces();
    CampPlace getCampPlaceById (int id);
    void addCampPlace (CampPlace campPlace);

    void updateCampPlace(CampPlace campPlace);

    void deleteCampPlace(int id);
    List<CampPlaceCategory> getCategories();
    List<State> getState();
    List<CampPlace> getCampPlaceByCategory(CampPlaceCategory category);

    Page<CampPlace> getFiltredCampPlace(List <CampPlaceCategory> category,List <State> state, String search, Pageable pageable);


    //for home screen
    List<CampPlace> findTop5CampPlaces();
    long campPlacesCount();

    List<CampPlaceSelectDto> getCampPlaceSelect();

}
