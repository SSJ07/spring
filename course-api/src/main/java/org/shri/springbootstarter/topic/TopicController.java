package org.shri.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.shri.springbootstarter.models.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
					new Topic("spring", "Spring Framework", "Spring Framework Description"),
					new Topic("hibernate", "Hibernate Framework", "Hibernate Framework Description"),
					new Topic("java", "Core Java", "Core Java Description"),
					new Topic("python", "Python Framework", "Python Framework Description")
					);
				
	}
}
