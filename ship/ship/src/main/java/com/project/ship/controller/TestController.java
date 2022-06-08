package com.project.ship.controller;

import java.util.List;

import com.project.ship.model.dto.UserInfo;
import com.project.ship.service.TestService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class TestController {
  private final TestService testService;

  @GetMapping("/hello")
  public String hello() {
    return "Hello World";
  }

  @GetMapping("/test")
  public List<UserInfo> test() {
    return testService.getAllDataList();
  }
}