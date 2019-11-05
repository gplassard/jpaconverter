package fr.gplassard.jpaconverter.jpaconverter.entity;

import fr.gplassard.jpaconverter.jpaconverter.internal.ToConvertConverter;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    private Long id;
    private String name;
    @Convert(converter = ToConvertConverter.class)
    private ToConvert toConvert;

    public Car() {
    }

    public Car(Long id, String name, ToConvert toConvert) {
        this.id = id;
        this.name = name;
        this.toConvert = toConvert;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ToConvert getToConvert() {
        return toConvert;
    }

    public void setToConvert(ToConvert toConvert) {
        this.toConvert = toConvert;
    }
}
