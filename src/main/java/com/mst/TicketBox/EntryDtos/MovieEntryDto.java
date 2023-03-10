package com.mst.TicketBox.EntryDtos;


import com.mst.TicketBox.Enums.Genre;
import com.mst.TicketBox.Enums.Language;
import lombok.Data;

@Data
public class MovieEntryDto {

    private String movieName;

    private double ratings;

    private int duration;

    private Language language;

    private Genre genre;

}
