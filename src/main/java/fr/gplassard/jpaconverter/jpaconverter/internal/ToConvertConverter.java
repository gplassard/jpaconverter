package fr.gplassard.jpaconverter.jpaconverter.internal;

import fr.gplassard.jpaconverter.jpaconverter.entity.ToConvert;

import javax.persistence.AttributeConverter;

public class ToConvertConverter implements AttributeConverter<ToConvert, Long> {
    @Override
    public Long convertToDatabaseColumn(ToConvert attribute) {
        if (attribute.isLessThan100()) {
            return 1L;
        }
        return 101L;
    }

    @Override
    public ToConvert convertToEntityAttribute(Long dbData) {
        boolean greaterThan100 = dbData > 100;
        return new ToConvert(greaterThan100);
    }
}
