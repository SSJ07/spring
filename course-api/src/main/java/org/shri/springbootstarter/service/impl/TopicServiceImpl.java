package org.shri.springbootstarter.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.shri.springbootstarter.models.Topic;
import org.shri.springbootstarter.service.TopicService;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicService {

	private List<Topic> topicList = new ArrayList<Topic>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("hibernate", "Hibernate Framework", "Hibernate Framework Description"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("python", "Python Framework", "Python Framework Description")
			));
	@Override
	public List<Topic> getAllTopics() {
		return topicList; 
	}
	@Override
	public Topic getTopic(String id) {
		return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	@Override
	public Topic createTopic(Topic topic) {
		topicList.add(topic);
		return topic;
	}
	@Override
	public Topic updateTopic(String id, Topic topic) {
		for(int i=0; i<topicList.size(); i++){
			if(topicList.get(i).getId().equals(id)){
				topicList.add(i, topic);
				return topic;
			}
		}
		return null;
	}
	@Override
	public List<Topic> deleteTopic(String id) {
		topicList.removeIf(t->t.getId().equals(id));
		return topicList;
	}

}
