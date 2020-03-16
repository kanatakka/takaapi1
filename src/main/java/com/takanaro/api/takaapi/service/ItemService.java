package com.takanaro.api.takaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.takanaro.api.takaapi.domain.Item;
import com.takanaro.api.takaapi.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	ItemRepository itemRepository;
	
	public List<Item> findAll() {
		return itemRepository.findAll();
	}
	
}