package com.mst.TicketBox.Services;


import com.mst.TicketBox.Entities.MovieEntity;
import com.mst.TicketBox.EntryDtos.MovieEntryDto;
import com.mst.TicketBox.Repository.MovieRepository;
import com.mst.TicketBox.convertors.MovieConvertors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieEntryDto movieEntryDto)throws Exception{


        MovieEntity movieEntity = MovieConvertors.convertEntryDtoToEntity(movieEntryDto);

        movieRepository.save(movieEntity);

        return "Movie Added successfully";


    }

}
