package com.fabless.clothlogix.mapper;
import com.fabless.clothlogix.model.entities.ColoreEntity;
import com.fabless.clothlogix.DTO.ColoreDTO;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;


@Mapper(componentModel = "spring")
public interface SuperClassMapper {

    ColoreDTO toColoreDTO(ColoreEntity coloreEntity);

    ColoreEntity toColoreEntity(ColoreDTO coloreDTO);

    default Iterable<ColoreDTO> toColoreDTOs(Iterable<ColoreEntity> list) {
        if (list == null) {
            return null;
        }

        List<ColoreDTO> coloreDTOs = new ArrayList<>();
        for (ColoreEntity coloreEntity : list) {
            coloreDTOs.add(toColoreDTO(coloreEntity));
        }

        return coloreDTOs;
    }

}