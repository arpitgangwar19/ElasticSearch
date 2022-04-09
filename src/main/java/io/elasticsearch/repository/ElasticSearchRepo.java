package io.elasticsearch.repository;

import java.util.List;

import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.StringQuery;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Service;

import io.elasticsearch.model.PersonalDetails;


@Service
public interface ElasticSearchRepo  extends ElasticsearchRepository<PersonalDetails, String> {
	
//		List<Product> findAll();
	 List<PersonalDetails> findByName(String name);
	  
	 List<PersonalDetails> findByLname(String lname);

//	SearchHits<PersonalDetails> search(StringQuery searchQuery, Class<PersonalDetails> class1, IndexCoordinates of);
	 
	

}
