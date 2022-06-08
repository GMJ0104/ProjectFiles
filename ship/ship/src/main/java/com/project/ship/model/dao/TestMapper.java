package com.project.ship.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.project.ship.model.dto.UserInfo;

@Repository
@Mapper
public interface TestMapper {
	List<UserInfo> getAllDataList();
}
