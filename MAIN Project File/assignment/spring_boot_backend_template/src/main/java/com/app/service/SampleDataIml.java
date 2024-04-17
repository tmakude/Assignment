package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.SampleTimeStamp;
import com.app.repository.SampleTimeStampres;

@Service
@Transactional
public class SampleDataIml implements SampleData {
	
	@Autowired
	SampleTimeStampres sample;

	@Override
	public List<SampleTimeStamp> getAllstamp() {
		
		return sample.findAll().stream().collect(Collectors.toList());
	}

	public List<SampleTimeStamp> getonehr(Long hr) {
		
		return sample.findAllinOnehr( hr).stream().collect(Collectors.toList());
	}

	public List<SampleTimeStamp> getEighthr(Long hrr) {
		
		return sample.findAllinEighthr( hrr).stream().collect(Collectors.toList());
	}

	public List<SampleTimeStamp> getTwentyForthhr(Long hrrr) {
		
		return sample.findAllinTwentyFourthhr( hrrr).stream().collect(Collectors.toList());
	}

}
