package com.capg.dac.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.capg.dac.exception.NewsNotFoundException;
import com.capg.dac.model.Coupon;
import com.capg.dac.model.News;
import com.capg.dac.repository.NewsRepository;

@Service
@Transactional
public class NewsServiceImpl implements NewsService{

	@Autowired
	private NewsRepository newsRepo;
	
	Coupon coupon = new Coupon();
	
	@Override
	public News addNews(News news) {
		newsRepo.save(news);
		return news;
	}

	@Override
	public News viewNewsById(int id) throws NewsNotFoundException{
		Optional<News> optional = newsRepo.findById(id);
		if(optional.isPresent()) {
			double c = 0.5;
			coupon.setCashpoints(coupon.getCashpoints() + c);
			System.out.println("you get "+c+" rupee as cashpoints.");	
			System.out.println("Your balance is: "+coupon.getCashpoints()+ " rupees.");
			return optional.get();
		}
		throw new NewsNotFoundException("News for id "+id+" not present.");
	}
}
