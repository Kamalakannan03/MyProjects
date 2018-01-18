package com.example.SpringStarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics= new ArrayList<Topic>();
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		List<Topic> Topics = getAllTopics();

	      for(Topic topic: Topics){
	         if(topic.getId().equals(id)){
	            return topic;
	         }
	      }
		return null;
	}

	public void addTopic(Topic topic) {
			topics.add(topic);
	}

	public void updateTopic(String id,Topic topic) {
		for(int i=0; i<topics.size(); i++){
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i, topic);
			}
		}
	}

	
	public void deleteTopic(String id) {
			for(int i=0;i<topics.size();i++){
				Topic t = topics.get(i);
				if(t.getId().equals(id)){
					topics.remove(i);
				}
			}
	}
}
/*
 * REQUEST method format
 * {
    "id": "Spring",
    "name": "java spring framework",
    "description": "java spring framework for developing web application"
}
 */
