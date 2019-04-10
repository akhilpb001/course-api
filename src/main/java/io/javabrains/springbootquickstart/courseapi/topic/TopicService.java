package io.javabrains.springbootquickstart.courseapi.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		return (List<Topic>) topicRepository.findAll();
	}

	public Topic getTopic(String id) {
		return topicRepository.findById(id).get();
	}

	public String addTopic(Topic topic) {
		topicRepository.save(topic);
		return "Topic added successfully";
	}

	public String updateTopic(Topic topic) {
		topicRepository.save(topic);
		return "Topic updated successfully";
	}

	public String deleteTopic(String id) {
		topicRepository.deleteById(id);
		return "Topic deleted successfully";
	}

}
