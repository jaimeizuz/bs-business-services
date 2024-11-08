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

package es.santander.scib.extractor.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import es.santander.scib.extractor.rest.dto.Request;
import es.santander.scib.extractor.rest.dto.WrapperFileExtractedData;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@JsonPropertyOrder({
  WrapperCreateFeedbackProcessInput.JSON_PROPERTY_REQUEST_ID,
  WrapperCreateFeedbackProcessInput.JSON_PROPERTY_FILE_EXTRACTED_DATA
})
/**
  * Data structure containing the required information to send feedback for extracted metadata
  */

public class WrapperCreateFeedbackProcessInput  implements Serializable {
  
  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  
  private Request requestId;

  public static final String JSON_PROPERTY_FILE_EXTRACTED_DATA = "fileExtractedData";
  
  private WrapperFileExtractedData fileExtractedData;

  /**
   * Get requestId
   * @return requestId
   **/
  @NotNull
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Request getRequestId() {
    return requestId;
  }

  /**
   * Set requestId
   */
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequestId(Request requestId) {
    this.requestId = requestId;
  }

  public WrapperCreateFeedbackProcessInput requestId(Request requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Get fileExtractedData
   * @return fileExtractedData
   **/
  @NotNull
  @JsonProperty(JSON_PROPERTY_FILE_EXTRACTED_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public WrapperFileExtractedData getFileExtractedData() {
    return fileExtractedData;
  }

  /**
   * Set fileExtractedData
   */
  @JsonProperty(JSON_PROPERTY_FILE_EXTRACTED_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileExtractedData(WrapperFileExtractedData fileExtractedData) {
    this.fileExtractedData = fileExtractedData;
  }

  public WrapperCreateFeedbackProcessInput fileExtractedData(WrapperFileExtractedData fileExtractedData) {
    this.fileExtractedData = fileExtractedData;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WrapperCreateFeedbackProcessInput {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    fileExtractedData: ").append(toIndentedString(fileExtractedData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

