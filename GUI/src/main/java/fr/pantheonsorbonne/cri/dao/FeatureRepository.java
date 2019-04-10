package fr.pantheonsorbonne.cri.dao;

import org.springframework.data.repository.CrudRepository;

import fr.pantheonsorbonne.cri.entities.Feature;

public interface FeatureRepository extends CrudRepository<Feature, Long> {

}
