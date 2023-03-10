package com.mst.TicketBox.Entities;


import com.mst.TicketBox.Enums.SeatType;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="showseats")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShowSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean isBooked;

    private int price; //price of CLASSIC Seat for that particualr

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    private ShowEntity showEntity;

    @Override
    public String toString() {
        return "ShowSeatEntity{" +
                "id=" + id +
                ", isBooked=" + isBooked +
                ", price=" + price +
                ", seatNo='" + seatNo + '\'' +
                ", seatType=" + seatType +
                ", bookedAt=" + bookedAt +
                '}';
    }
}
