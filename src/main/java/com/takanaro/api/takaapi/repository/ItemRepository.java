package com.takanaro.api.takaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.takanaro.api.takaapi.domain.Item;


public interface ItemRepository extends JpaRepository<Item, Integer>{
}