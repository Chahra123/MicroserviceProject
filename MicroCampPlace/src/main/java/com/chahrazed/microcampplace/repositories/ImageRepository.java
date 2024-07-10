package com.chahrazed.microcampplace.repositories;

import com.chahrazed.microcampplace.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Integer> {
}