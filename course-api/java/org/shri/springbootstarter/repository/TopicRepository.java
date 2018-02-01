package org.shri.springbootstarter.repository;

import org.shri.springbootstarter.models.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
