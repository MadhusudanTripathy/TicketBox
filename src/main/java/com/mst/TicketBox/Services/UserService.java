package com.mst.TicketBox.Services;


import com.mst.TicketBox.Entities.UserEntity;
import com.mst.TicketBox.EntryDtos.UserEntryDto;
import com.mst.TicketBox.Repository.UserRepository;
import com.mst.TicketBox.convertors.UserConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto)throws Exception,NullPointerException{

        UserEntity userEntity = UserConvertor.convertDtoToEntity(userEntryDto);

        userRepository.save(userEntity);

        return "User Added successfully";

    }



}
