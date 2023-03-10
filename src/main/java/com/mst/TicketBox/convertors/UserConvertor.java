package com.mst.TicketBox.convertors;

import com.mst.TicketBox.Entities.UserEntity;
import com.mst.TicketBox.EntryDtos.UserEntryDto;

public class UserConvertor {

    //Static is kept to avoid calling it via objects/instances
    public static UserEntity convertDtoToEntity(UserEntryDto userEntryDto){

        UserEntity userEntity =  UserEntity.builder().age(userEntryDto.getAge()).address(userEntryDto.getAddress())
                .email(userEntryDto.getEmail()).name(userEntryDto.getName()).mobNo(userEntryDto.getMobNo())
                .build();

        return userEntity;

    }

}
