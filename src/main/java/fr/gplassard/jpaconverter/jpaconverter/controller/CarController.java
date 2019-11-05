package fr.gplassard.jpaconverter.jpaconverter.controller;

import fr.gplassard.jpaconverter.jpaconverter.entity.Car;
import fr.gplassard.jpaconverter.jpaconverter.repository.CarRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    private CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/api/v1/cars")
    public List<Car> cars() {
        return carRepository.findAll();
    }
}
