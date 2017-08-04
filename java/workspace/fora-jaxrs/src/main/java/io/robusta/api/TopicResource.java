package io.robusta.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

import io.robusta.ForaDataSource;
import io.robusta.business.CommentBusiness;
import io.robusta.business.TopicBusiness;
import io.robusta.business.UserBusiness;
import io.robusta.demo.providers.NotAcceptableCustomException;
import io.robusta.domain.Comment;
import io.robusta.domain.Topic;
import io.robusta.domain.User;

@Path("topics")
@Produces("application/json")
@Consumes("application/json")
public class TopicResource {

	
	 @GET
	 
	 @Produces("application/json") public List<Topic> findTopics() throws
	 Exception {
	 
	 return ForaDataSource.getInstance().getTopics(); }
	 
	/*@GET
	@Produces("text/html")
	public String getTopics() {
		String list = new TopicBusiness().getAllTopics().stream().map(topic -> topic.getTitle())
				.map(title -> "<li>" + title + "</li>").collect(Collectors.joining());
		return "<html><body><ul>" + list + "</ul></body></html>";
	}
*/
	@GET
	@Produces("application/json")
	@Path("{id}")
	public Topic findTopicById(@PathParam("id") Long id) throws Exception {
		Topic topic = new TopicBusiness().getTopicById(id);
		if (topic == null) {

			throw new NotFoundException("No user" + id + "found");
		}
		return topic;
	}

	@POST
	@Path("{idTopic}/comments")
	public Response createComment(@PathParam("idTopic") long idTopic, Comment representation) {
		Topic topic = new TopicBusiness().getTopicById(idTopic);
		boolean anonymous = false;
		User user = null;
		if (representation.getUser() == null) {
			anonymous = true;
		} else {
			user = new UserBusiness().findById(representation.getUser().getId());
			if (user == null) {
				return Response.status(401).entity("Please authenticate in the App").build();
			}
		}

		Comment comment = new CommentBusiness().createComment(topic, representation.getContent(), user, anonymous);
		NewCookie cookie = new NewCookie("Hello", "World");
		return Response.status(201).cookie(cookie).header("X-Location", "Aelion Centaure").entity(comment).build();
	}
	
	@POST
	@Path("create")
	public Response createTopic(Topic representation) {
		
		Topic topic = new TopicBusiness().createTopic(representation);
		return Response.status(201).entity(topic).build();
	}
}