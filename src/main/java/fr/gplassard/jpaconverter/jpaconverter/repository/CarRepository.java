package fr.gplassard.jpaconverter.jpaconverter.repository;

import fr.gplassard.jpaconverter.jpaconverter.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
