package com.capg.dac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.dac.exception.NewsNotFoundException;
import com.capg.dac.model.News;
import com.capg.dac.service.NewsService;

@RestController
@RequestMapping("/news")
public class NewsContrloler {

	@Autowired
	private NewsService newsService;
	
	@PostMapping("/addNews")
	public void addProduct(@RequestBody News news) {
		newsService.addNews(news);
	}
	
	@GetMapping("/read/{id}")
	public ResponseEntity<News> findSeatById(@PathVariable("id") int id) throws NewsNotFoundException{
		News news = newsService.viewNewsById(id);
		ResponseEntity<News> response = new ResponseEntity<>(news, HttpStatus.OK);
		return response;
	}
}
