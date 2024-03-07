package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.beans.Destination;

/**
 * @author christophersaid - csaid
 * CIS175 - Spring 2024
 * Mar 7, 2024
 */
@Repository
public interface DestinationRepository extends JpaRepository <Destination, Long> {
	
}
