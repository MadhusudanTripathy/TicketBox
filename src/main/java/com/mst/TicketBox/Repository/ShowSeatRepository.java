package com.mst.TicketBox.Repository;

import com.mst.TicketBox.Entities.ShowSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowSeatRepository extends JpaRepository<ShowSeatEntity,Integer> {
}
