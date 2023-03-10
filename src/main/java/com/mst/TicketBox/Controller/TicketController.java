package com.mst.TicketBox.Controller;


import com.mst.TicketBox.EntryDtos.TicketEntryDto;
import com.mst.TicketBox.Services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @PostMapping("/book")
    public String bookTicket(@RequestBody TicketEntryDto ticketEntryDto){


        try{
            String result = ticketService.addTicket(ticketEntryDto);
            return result;

        }catch (Exception e){

            return "";
        }


    }
}