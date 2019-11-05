package fr.gplassard.jpaconverter.jpaconverter;

import fr.gplassard.jpaconverter.jpaconverter.entity.Car;
import fr.gplassard.jpaconverter.jpaconverter.entity.ToConvert;
import fr.gplassard.jpaconverter.jpaconverter.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaconverterApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaconverterApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(CarRepository carRepository) {
        return args -> {
            carRepository.saveAndFlush(new Car(1L, "car1", new ToConvert(true)));
            carRepository.saveAndFlush(new Car(2L, "car2", new ToConvert(false)));
            carRepository.saveAndFlush(new Car(3L, "car3", new ToConvert(true)));
            carRepository.saveAndFlush(new Car(4L, "car4", new ToConvert(false)));
            carRepository.saveAndFlush(new Car(5L, "car5", new ToConvert(true)));
            carRepository.saveAndFlush(new Car(6L, "car6", new ToConvert(false)));
        };
    }

}
