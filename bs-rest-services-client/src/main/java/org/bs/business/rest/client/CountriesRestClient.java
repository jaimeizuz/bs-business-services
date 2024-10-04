package org.bs.business.rest.client;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import org.bs.business.rest.dto.CitiesDTO;
import org.bs.business.rest.dto.CountriesDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "bs-rest-services-url")
public interface CountriesRestClient {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/countries")
    //Response get(@PathParam("id")String requestId);
    CountriesDTO listCountries();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/countries/{countryId}/cities")
    CitiesDTO getCitiesByCountryId(@PathParam("countryId")short countryId);
}