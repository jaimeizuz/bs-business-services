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
import es.santander.scib.gboentities.rest.dto.EntityStatus;
import es.santander.scib.gboentities.rest.dto.Industry;
import es.santander.scib.gboentities.rest.dto.SourceApplication;
import es.santander.scib.gboentities.rest.dto.TradingAccountIdentifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@JsonPropertyOrder({
  EntityUpdate.JSON_PROPERTY_STATUS,
  EntityUpdate.JSON_PROPERTY_INDUSTRY,
  EntityUpdate.JSON_PROPERTY_TRADING_ACCOUNT_IDENTIFIERS,
  EntityUpdate.JSON_PROPERTY_SOURCE_APPLICATION,
  EntityUpdate.JSON_PROPERTY_BOOKING_UNIT
})
/**
  * Data structure containing information about the Entity update.
  */

public class EntityUpdate  implements Serializable {
  
  public static final String JSON_PROPERTY_STATUS = "status";
  
  private EntityStatus status;

  public static final String JSON_PROPERTY_INDUSTRY = "industry";
  
  private Industry industry;

  public static final String JSON_PROPERTY_TRADING_ACCOUNT_IDENTIFIERS = "tradingAccountIdentifiers";
 /**
  * List of Trading Account Identifiers.
  */
  
  private List<@Valid TradingAccountIdentifier> tradingAccountIdentifiers = null;

  public static final String JSON_PROPERTY_SOURCE_APPLICATION = "sourceApplication";
  
  private SourceApplication sourceApplication;

  public static final String JSON_PROPERTY_BOOKING_UNIT = "bookingUnit";
 /**
  * Santander Bank Entity (Booking Unit) where the Entity is registered. This is used to route the creation.
  */
  
  private String bookingUnit;

  /**
   * Get status
   * @return status
   **/
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityStatus getStatus() {
    return status;
  }

  /**
   * Set status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public EntityUpdate status(EntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get industry
   * @return industry
   **/
  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Industry getIndustry() {
    return industry;
  }

  /**
   * Set industry
   */
  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndustry(Industry industry) {
    this.industry = industry;
  }

  public EntityUpdate industry(Industry industry) {
    this.industry = industry;
    return this;
  }

  /**
   * List of Trading Account Identifiers.
   * @return tradingAccountIdentifiers
   **/
  @JsonProperty(JSON_PROPERTY_TRADING_ACCOUNT_IDENTIFIERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid TradingAccountIdentifier> getTradingAccountIdentifiers() {
    return tradingAccountIdentifiers;
  }

  /**
   * Set tradingAccountIdentifiers
   */
  @JsonProperty(JSON_PROPERTY_TRADING_ACCOUNT_IDENTIFIERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradingAccountIdentifiers(List<@Valid TradingAccountIdentifier> tradingAccountIdentifiers) {
    this.tradingAccountIdentifiers = tradingAccountIdentifiers;
  }

  public EntityUpdate tradingAccountIdentifiers(List<@Valid TradingAccountIdentifier> tradingAccountIdentifiers) {
    this.tradingAccountIdentifiers = tradingAccountIdentifiers;
    return this;
  }

  public EntityUpdate addTradingAccountIdentifiersItem(TradingAccountIdentifier tradingAccountIdentifiersItem) {
    if (this.tradingAccountIdentifiers == null) {
      this.tradingAccountIdentifiers = new ArrayList<>();
    }
    this.tradingAccountIdentifiers.add(tradingAccountIdentifiersItem);
    return this;
  }

  /**
   * Get sourceApplication
   * @return sourceApplication
   **/
  @NotNull
  @JsonProperty(JSON_PROPERTY_SOURCE_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SourceApplication getSourceApplication() {
    return sourceApplication;
  }

  /**
   * Set sourceApplication
   */
  @JsonProperty(JSON_PROPERTY_SOURCE_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceApplication(SourceApplication sourceApplication) {
    this.sourceApplication = sourceApplication;
  }

  public EntityUpdate sourceApplication(SourceApplication sourceApplication) {
    this.sourceApplication = sourceApplication;
    return this;
  }

  /**
   * Santander Bank Entity (Booking Unit) where the Entity is registered. This is used to route the creation.
   * @return bookingUnit
   **/
  @NotNull
  @JsonProperty(JSON_PROPERTY_BOOKING_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBookingUnit() {
    return bookingUnit;
  }

  /**
   * Set bookingUnit
   */
  @JsonProperty(JSON_PROPERTY_BOOKING_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBookingUnit(String bookingUnit) {
    this.bookingUnit = bookingUnit;
  }

  public EntityUpdate bookingUnit(String bookingUnit) {
    this.bookingUnit = bookingUnit;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityUpdate {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    tradingAccountIdentifiers: ").append(toIndentedString(tradingAccountIdentifiers)).append("\n");
    sb.append("    sourceApplication: ").append(toIndentedString(sourceApplication)).append("\n");
    sb.append("    bookingUnit: ").append(toIndentedString(bookingUnit)).append("\n");
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

