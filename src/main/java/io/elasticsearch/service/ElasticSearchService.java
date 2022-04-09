package io.elasticsearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Service;

import io.elasticsearch.model.PersonalDetails;
import io.elasticsearch.model.Product;


@Service
public class ElasticSearchService {
	
	
	@Autowired
	ElasticsearchRepository  elasticSearchRepo;
	
	public void createProductBulk(final List<PersonalDetails> li)
	{
		System.out.print("work2");// testing
		elasticSearchRepo.saveAll(li); // addding bulk data
	}
	
	

	  public void createProductIndex(final PersonalDetails personalDetails) {
	    elasticSearchRepo.save(personalDetails);
	  }



	public Iterable findByName() {
		
		return  elasticSearchRepo.findAll();
	}
	
//	public void findById() {
//		return elasticSearchRepo.findById();
//	}
}
