/**
 * Document Data Extractor
 * This API extracts metadata from unstructured documents using artificial intelligence (AI).  The process is asynchronous and requires that the document from which metadata is to be extracted is first uploaded separately to a repository, as the document itself is not provided in the API request.  The API can be used to: - Initiate a metadata extraction. - Verify the status of a file extraction. - Retrieve the metadata from a file extraction - Send feedback for extracted metadata.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: apiglobalgovernance@gruposantander.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package es.santander.scib.extractor.rest.client;

import es.santander.scib.extractor.rest.dto.Errors;
import es.santander.scib.extractor.rest.dto.WrapperCreateProcessInput;
import es.santander.scib.extractor.rest.dto.WrapperGetResponseFileExtractions;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.MediaType;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 * Document Data Extractor
 *
 * <p>This API extracts metadata from unstructured documents using artificial intelligence (AI).  The process is asynchronous and requires that the document from which metadata is to be extracted is first uploaded separately to a repository, as the document itself is not provided in the API request.  The API can be used to: - Initiate a metadata extraction. - Verify the status of a file extraction. - Retrieve the metadata from a file extraction - Send feedback for extracted metadata.
 *
 */

@RegisterRestClient(configKey="extractor-rest-service")
@RegisterProvider(ApiExceptionMapper.class)
@Path("/file_extractions")
public interface MetadataExtractionApi  {

    /**
     * Initiates a metadata extraction.
     *
     * Initiates a metadata extraction from a document.  The following must be provided in the request body: - Process ID that defines the type of extraction to be performed - Repository location where the document was previously uploaded  The response includes the file extraction ID.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    WrapperGetResponseFileExtractions metadataExtractionInitiation(@HeaderParam("x-santander-client-id")  @NotNull String xSantanderClientId, @Valid WrapperCreateProcessInput wrapperCreateProcessInput) throws ApiException, ProcessingException;
}
