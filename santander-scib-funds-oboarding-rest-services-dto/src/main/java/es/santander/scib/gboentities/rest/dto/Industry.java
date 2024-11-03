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
  Industry.JSON_PROPERTY_CODE,
  Industry.JSON_PROPERTY_NAME
})
/**
  * Data structure containing entity industry.
  */

public class Industry  implements Serializable {
  
  public enum CodeEnum {

    BANSB(String.valueOf("BANSB")), BROKE(String.valueOf("BROKE")), CLIEN(String.valueOf("CLIEN")), CORPN(String.valueOf("CORPN")), CORPC(String.valueOf("CORPC")), EQUIS(String.valueOf("EQUIS")), FUNMA(String.valueOf("FUNMA")), HDFND(String.valueOf("HDFND")), INSUR(String.valueOf("INSUR")), ORGMA(String.valueOf("ORGMA")), CARDH(String.valueOf("CARDH")), PROJE(String.valueOf("PROJE")), PUBIN(String.valueOf("PUBIN")), SOVER(String.valueOf("SOVER")), SUPRA(String.valueOf("SUPRA")), SECUR(String.valueOf("SECUR"));


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
  * Industry code. - BANSB: Banks & Saving Banks. - BROKE: Brokers. - CLIEN: Clients. - CORPN: Companies. - CORPC: Corporate Classified. - EQUIS: Fund Managers, Operating Unit. - FUNMA: Funds, Operating Unit. - HDFND: Hedge Funds. - INSUR: Insurance. - ORGMA: Organized Markets. - CARDH: Other Financial Entities. - PROJE: Project Finance. - PUBIN: Public Institutions. - SOVER: Sovereign. - SUPRA: Supranational Entities. - SECUR: Securitizations (Titulizaciones). 
  */
  
  private CodeEnum code;

  public static final String JSON_PROPERTY_NAME = "name";
 /**
  * Industry name.
  */
  
  private String name;

  public Industry() {
  }

 @JsonCreator
  public Industry(
    @JsonProperty(value = JSON_PROPERTY_NAME, required = true) String name
  ) {
    this.name = name;
  }
  
  /**
   * Industry code. - BANSB: Banks &amp; Saving Banks. - BROKE: Brokers. - CLIEN: Clients. - CORPN: Companies. - CORPC: Corporate Classified. - EQUIS: Fund Managers, Operating Unit. - FUNMA: Funds, Operating Unit. - HDFND: Hedge Funds. - INSUR: Insurance. - ORGMA: Organized Markets. - CARDH: Other Financial Entities. - PROJE: Project Finance. - PUBIN: Public Institutions. - SOVER: Sovereign. - SUPRA: Supranational Entities. - SECUR: Securitizations (Titulizaciones). 
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

  public Industry code(CodeEnum code) {
    this.code = code;
    return this;
  }

  /**
   * Industry name.
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
    sb.append("class Industry {\n");
    
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
