package org.shri.springbootstarter.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.shri.springbootstarter.models.Topic;
import org.shri.springbootstarter.repository.TopicRepository;
import org.shri.springbootstarter.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	@Override
	public List<Topic> getAllTopics() {
		List<Topic> topicList = new ArrayList<>();
		topicRepository.findAll().forEach(topicList::add);
		return topicList;
	}
	@Override
	public Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}
	@Override
	public Topic createTopic(Topic topic) {
		topicRepository.save(topic);
		return topic;
	}
	@Override
	public Topic updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
		return topic;
	}
	@Override
	public List<Topic> deleteTopic(String id) {
		topicRepository.delete(id);
		return getAllTopics();
	}

}
