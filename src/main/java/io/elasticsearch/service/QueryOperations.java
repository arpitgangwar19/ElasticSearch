package io.elasticsearch.service;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.StringQuery;
import org.springframework.stereotype.Service;

import io.elasticsearch.model.PersonalDetails;
import io.elasticsearch.repository.ElasticSearchRepo;
import lombok.extern.slf4j.Slf4j;


@Service
public class QueryOperations {
	
	
	 public  final String DETAILS_INDEX_NAME = "details";
	 
	  private ElasticsearchOperations  elasticsearchOperations ;

	  public Iterable findByProductName(final String Name) {
	    StringQuery searchQuery = new StringQuery(
	      "{\"match\":{\"name\":{\"query\":\""+ Name + "\"}}}\"");
	    
	    SearchHits<PersonalDetails> details = elasticsearchOperations.search(
	      searchQuery, 
	      PersonalDetails.class,
	      IndexCoordinates.of(DETAILS_INDEX_NAME));
	    
	    System.out.print("work4");//testing
	    return details;
	   }

}
