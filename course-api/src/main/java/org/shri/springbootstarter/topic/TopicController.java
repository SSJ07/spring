package org.shri.springbootstarter.topic;

import java.util.List;

import org.shri.springbootstarter.models.Topic;
import org.shri.springbootstarter.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();	
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id){
		return topicService.getTopic(id);
	}
	
	@RequestMapping(value="/topics", method=RequestMethod.POST)
	public Topic createTopic(@RequestBody Topic topic){
		return topicService.createTopic(topic);
	}
	@RequestMapping(value="/topics/{id}", method=RequestMethod.DELETE)
	public List<Topic> deleteTopic(@PathVariable String id){
		return topicService.deleteTopic(id);
	}
	@RequestMapping(value="/topics/{id}", method=RequestMethod.PUT)
	public Topic updateTopic(@RequestBody Topic topic, @PathVariable String id){
		return topicService.updateTopic(id, topic);
	}
	
}
