package com.app.service;

import java.util.List;

import com.app.entities.SampleTimeStamp;

public interface SampleData {
	
	List<SampleTimeStamp> getAllstamp();
	List<SampleTimeStamp> getonehr(Long hr);
	List<SampleTimeStamp> getEighthr(Long hrr);
	List<SampleTimeStamp> getTwentyForthhr(Long hrrr);

}
