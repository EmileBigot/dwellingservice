package services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/dwellingservice")
public class DwellingService {

    @GET
    @Path("/createdwelling")
    @Consumes("application/json")
    public Response generateBusinessRule(String JSONArray) {
        System.out.println("Generate call with: \n" + JSONArray.toString());

        System.out.println("Generated output: \n" + JSONArray.toString());
        return Response.status(200).entity("Het werkt!").build();
    }
}
