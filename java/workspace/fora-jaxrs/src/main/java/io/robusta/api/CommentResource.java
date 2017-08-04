package io.robusta.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import io.robusta.business.CommentBusiness;
import io.robusta.domain.Comment;

@Path("comments")
@Produces("application/json")
@Consumes("application/json")
public class CommentResource {

	@PUT
	@Path("{idComment}/up")
	public Response up(@PathParam("idComment") String idComment) throws Exception {
		Comment comment = new CommentBusiness().getCommentById(idComment);
		comment.up();
		return Response.status(301).entity(comment).build();
	}

	@PUT
	@Path("{idComment}/down")
	public Response down(@PathParam("idComment") String idComment) throws Exception {
		Comment comment = new CommentBusiness().getCommentById(idComment);
		comment.down();
		return Response.status(301).entity(comment).build();
	}

}
