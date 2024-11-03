/**
 * GBO Entities
 * It allows the possibility of standardizing the way entities are created and generated for the different regions and global entities of GBO, allowing the creation of entities in a single way for the different users with a new way that allows this action to be carried out. 
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: dario.vega@gruposantander.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package es.santander.scib.gboentities.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import es.santander.scib.gboentities.rest.dto.Component;
import es.santander.scib.gboentities.rest.dto.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@JsonPropertyOrder({
  Health.JSON_PROPERTY_STATUS,
  Health.JSON_PROPERTY_COMPONENTS
})
/**
  * Data structure containing information about the health response.
  */

public class Health  implements Serializable {
  
  public static final String JSON_PROPERTY_STATUS = "status";
  
  private Status status;

  public static final String JSON_PROPERTY_COMPONENTS = "components";
 /**
  * List of components.
  */
  
  private List<@Valid Component> components = new ArrayList<>();

  /**
   * Get status
   * @return status
   **/
  @NotNull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Status getStatus() {
    return status;
  }

  /**
   * Set status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(Status status) {
    this.status = status;
  }

  public Health status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * List of components.
   * @return components
   **/
  @NotNull
  @JsonProperty(JSON_PROPERTY_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<@Valid Component> getComponents() {
    return components;
  }

  /**
   * Set components
   */
  @JsonProperty(JSON_PROPERTY_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setComponents(List<@Valid Component> components) {
    this.components = components;
  }

  public Health components(List<@Valid Component> components) {
    this.components = components;
    return this;
  }

  public Health addComponentsItem(Component componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Health {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
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
