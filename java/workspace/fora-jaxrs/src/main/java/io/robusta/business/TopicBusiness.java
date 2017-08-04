package io.robusta.business;

import io.robusta.ForaDataSource;
import io.robusta.domain.Topic;
import io.robusta.domain.User;

import java.util.List;
import java.util.logging.Logger;

public class TopicBusiness {

	private final static Logger logger = Logger.getLogger(TopicBusiness.class
			.getName());

	ForaDataSource fora = ForaDataSource.getInstance();

	public Topic getTopicById(long id) {
		for (Topic s : fora.getTopics()) {
			if (s.getId() == id) {
				return s;
			}

		}

		return null;// or throw exception
	}

	public Topic createTopic(Topic t){
		t.setId(fora.getTopics().size());
		fora.getTopics().add(t);
		return t;
	}

	public Topic createTopic(String title,User user){
		Topic topic = new Topic();
		topic.setUser(user);
		topic.setTitle(title);
		topic = createTopic(topic);
		return topic;
	}
	public List<Topic> getAllTopics() {
		return fora.getTopics();

	}

	public int countTopics() {

		return fora.getTopics().size();

	}
}
