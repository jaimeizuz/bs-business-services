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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@JsonPropertyOrder({
  EntityType.JSON_PROPERTY_CODE,
  EntityType.JSON_PROPERTY_NAME
})
/**
  * Data structure containing entity type.
  */

public class EntityType  implements Serializable {
  
  public enum CodeEnum {

    COM(String.valueOf("COM")), GOV(String.valueOf("GOV")), IND(String.valueOf("IND")), SUP(String.valueOf("SUP"));


    String value;

    CodeEnum (String v) {
        value = v;
    }

    @JsonValue
    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
        public static CodeEnum fromValue(String value) {
            for (CodeEnum b : CodeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
  }

  public static final String JSON_PROPERTY_CODE = "code";
 /**
  * Entity type Code. - COM: Company. - GOV: Government. - IND: Individual. - SUP: Supranational. 
  */
  
  private CodeEnum code;

  public static final String JSON_PROPERTY_NAME = "name";
 /**
  * Entity type name.
  */
  
  private String name;

  public EntityType() {
  }

 @JsonCreator
  public EntityType(
    @JsonProperty(value = JSON_PROPERTY_NAME, required = true) String name
  ) {
    this.name = name;
  }
  
  /**
   * Entity type Code. - COM: Company. - GOV: Government. - IND: Individual. - SUP: Supranational. 
   * @return code
   **/
  @NotNull
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CodeEnum getCode() {
    return code;
  }

  /**
   * Set code
   */
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public EntityType code(CodeEnum code) {
    this.code = code;
    return this;
  }

  /**
   * Entity type name.
   * @return name
   **/
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }



  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

