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
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@JsonPropertyOrder({
  TradingAccountIdentifier.JSON_PROPERTY_TYPE,
  TradingAccountIdentifier.JSON_PROPERTY_ID,
  TradingAccountIdentifier.JSON_PROPERTY_CREATION_DATE
})
/**
  * Data structure containing Trading Account Identifier details.
  */

public class TradingAccountIdentifier  implements Serializable {
  
  public enum TypeEnum {

    FDID(String.valueOf("FDID")), LTID(String.valueOf("LTID"));


    String value;

    TypeEnum (String v) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
 /**
  * Type of Trading Account Identifier. - FDID: Firm Designated Identifier. - LTID: Large Trader Identifier. 
  */
  
  private TypeEnum type;

  public static final String JSON_PROPERTY_ID = "id";
 /**
  * Unique Identifier of the Trading Account assigned by SEC and provided by clearing house.
  */
  
  private String id;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
 /**
  * Trading Account Identifier creation date. The value uses the complete data format defined in ISO 8601:\\ 'YYYY-MM-DDThh:mm:ss.sssTZD'\\ Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 = January) - DD: 2-digit day of the month (01 through 31). 
  */
  
  private LocalDate creationDate;

  /**
   * Type of Trading Account Identifier. - FDID: Firm Designated Identifier. - LTID: Large Trader Identifier. 
   * @return type
   **/
  @NotNull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * Set type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  public TradingAccountIdentifier type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Unique Identifier of the Trading Account assigned by SEC and provided by clearing house.
   * @return id
   **/
  @NotNull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  /**
   * Set id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }

  public TradingAccountIdentifier id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Trading Account Identifier creation date. The value uses the complete data format defined in ISO 8601:\\ &#39;YYYY-MM-DDThh:mm:ss.sssTZD&#39;\\ Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 &#x3D; January) - DD: 2-digit day of the month (01 through 31). 
   * @return creationDate
   **/
  @NotNull
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LocalDate getCreationDate() {
    return creationDate;
  }

  /**
   * Set creationDate
   */
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public TradingAccountIdentifier creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradingAccountIdentifier {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
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
