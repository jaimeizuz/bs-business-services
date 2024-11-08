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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@JsonPropertyOrder({
  WrapperFileExtractedData.JSON_PROPERTY_FILE_EXTRACTED_DATA
})
/**
  * Data structure containing information about a file. The information is the validated metadata provided as feedback.
  */

public class WrapperFileExtractedData  implements Serializable {
  
  public static final String JSON_PROPERTY_FILE_EXTRACTED_DATA = "fileExtractedData";
 /**
  * Data structure containing metadata for content extracted from the file.  The metadata is provided in JSON format agreed between the app sending the request and the local services called from the API. The JSON content can be a maximum of 8,000 char long.
  */
  
  private String fileExtractedData;

  /**
   * Data structure containing metadata for content extracted from the file.  The metadata is provided in JSON format agreed between the app sending the request and the local services called from the API. The JSON content can be a maximum of 8,000 char long.
   * @return fileExtractedData
   **/
  @JsonProperty(JSON_PROPERTY_FILE_EXTRACTED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFileExtractedData() {
    return fileExtractedData;
  }

  /**
   * Set fileExtractedData
   */
  @JsonProperty(JSON_PROPERTY_FILE_EXTRACTED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileExtractedData(String fileExtractedData) {
    this.fileExtractedData = fileExtractedData;
  }

  public WrapperFileExtractedData fileExtractedData(String fileExtractedData) {
    this.fileExtractedData = fileExtractedData;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WrapperFileExtractedData {\n");
    
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

