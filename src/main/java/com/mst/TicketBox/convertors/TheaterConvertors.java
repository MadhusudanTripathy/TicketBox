package com.mst.TicketBox.convertors;

import com.mst.TicketBox.Entities.TheaterEntity;
import com.mst.TicketBox.EntryDtos.TheaterEntryDto;

public class TheaterConvertors {


    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

    }

}
