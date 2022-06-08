package com.project.ship.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.ship.model.dao.TestMapper;
import com.project.ship.model.dto.UserInfo;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService{
	private final TestMapper testMapper;
	
	@Override
	public List<UserInfo> getAllDataList(){
		return testMapper.getAllDataList();
	}
}
