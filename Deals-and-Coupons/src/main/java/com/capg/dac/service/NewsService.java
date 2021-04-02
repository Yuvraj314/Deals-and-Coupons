package com.capg.dac.service;

import org.springframework.stereotype.Service;

import com.capg.dac.exception.NewsNotFoundException;
import com.capg.dac.model.News;

@Service
public interface NewsService {

	News addNews(News news);
	News viewNewsById(int id) throws NewsNotFoundException;
}
