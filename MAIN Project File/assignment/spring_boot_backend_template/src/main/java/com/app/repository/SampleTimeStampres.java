package com.app.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.SampleTimeStamp;


@Repository
public interface SampleTimeStampres extends JpaRepository<SampleTimeStamp, String> {

	List<SampleTimeStamp> findAllinOnehr(Long hr);

	List<SampleTimeStamp> findAllinEighthr(Long hrr);
	
	List<SampleTimeStamp> findAllinTwentyFourthhr(Long hrrr);
	
	

}
