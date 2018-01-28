package org.shri.springbootstarter.service;

import java.util.List;

import org.shri.springbootstarter.models.Topic;

public interface TopicService {

	public List<Topic> getAllTopics();
	public Topic getTopic(String id);
	public Topic createTopic(Topic topic);
	public Topic updateTopic(String id, Topic topic);
	public List<Topic> deleteTopic(String id);
}
