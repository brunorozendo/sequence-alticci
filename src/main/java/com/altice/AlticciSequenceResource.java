package com.altice;

import com.altice.service.DataService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alticci")
public class AlticciSequenceResource {

    @Inject
    DataService dataService;

    @GET
    @Path("/{sequence}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getSequence(@PathParam("sequence") int sequence) {
        return dataService.generateSequence(sequence).toString();
    }
}