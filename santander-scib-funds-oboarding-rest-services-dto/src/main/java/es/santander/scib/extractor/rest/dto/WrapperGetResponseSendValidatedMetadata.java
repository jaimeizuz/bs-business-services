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
import es.santander.scib.extractor.rest.dto.ItemValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@JsonPropertyOrder({
  WrapperGetResponseSendValidatedMetadata.JSON_PROPERTY_DESCRIPTION
})
/**
  * Data structure containing information about a notice message displaying relevant information on the screen; for example, a legal disclaimer or an informative message to help understand the current operation.  This data structure is the response to a request to send feedback for extracted metadata.
  */

public class WrapperGetResponseSendValidatedMetadata  implements Serializable {
  
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  
  private ItemValue description;

  /**
   * Get description
   * @return description
   **/
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ItemValue getDescription() {
    return description;
  }

  /**
   * Set description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(ItemValue description) {
    this.description = description;
  }

  public WrapperGetResponseSendValidatedMetadata description(ItemValue description) {
    this.description = description;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WrapperGetResponseSendValidatedMetadata {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

