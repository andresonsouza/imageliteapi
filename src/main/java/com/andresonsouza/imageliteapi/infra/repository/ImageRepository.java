package com.andresonsouza.imageliteapi.infra.repository;

import com.andresonsouza.imageliteapi.domain.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, String> {

}
