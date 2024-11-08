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
import es.santander.scib.extractor.rest.dto.WrapperGetResponseFileExtractionsData;

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
@Path("/file_extractions/{file_extraction_id}")
public interface MetadataRetrievalApi  {

    /**
     * Retrieves the metadata from a file extraction.
     *
     * Retrieves the metadata from a specific file extraction.  To send this request, you must provide a file extraction ID in the request path.  The metadata can be retrieved only after the extraction is complete and the &#39;GET /file_extractions/{file_extraction_id}/status&#39; operation returns the &#39;Completed&#39; extraction status.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    WrapperGetResponseFileExtractionsData metadataExtractionRetrieval(@HeaderParam("x-santander-client-id")  @NotNull String xSantanderClientId, @PathParam("file_extraction_id") String fileExtractionId) throws ApiException, ProcessingException;
}
