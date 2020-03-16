package com.takanaro.api.takaapi.model;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

  @Id private String id;

  private String firstName;
  private String lastName;
}