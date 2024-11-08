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
import es.santander.scib.gboentities.rest.dto.Country;
import es.santander.scib.gboentities.rest.dto.EntityStatus;
import es.santander.scib.gboentities.rest.dto.EntityType;
import es.santander.scib.gboentities.rest.dto.Industry;
import es.santander.scib.gboentities.rest.dto.LocalAlias;
import es.santander.scib.gboentities.rest.dto.SourceApplication;
import es.santander.scib.gboentities.rest.dto.TradingAccountIdentifier;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@JsonPropertyOrder({
  Entity.JSON_PROPERTY_ID,
  Entity.JSON_PROPERTY_GLCS,
  Entity.JSON_PROPERTY_NAME,
  Entity.JSON_PROPERTY_TYPE,
  Entity.JSON_PROPERTY_INDUSTRY,
  Entity.JSON_PROPERTY_RESIDENCE_COUNTRY,
  Entity.JSON_PROPERTY_BOOKING_UNIT,
  Entity.JSON_PROPERTY_STATUS,
  Entity.JSON_PROPERTY_LOCAL_ALIASES,
  Entity.JSON_PROPERTY_TRADING_ACCOUNT_IDENTIFIERS,
  Entity.JSON_PROPERTY_SOURCE_APPLICATION
})
/**
  * Data structure containing information about the Entity registration.
  */

public class Entity  implements Serializable {
  
  public static final String JSON_PROPERTY_ID = "id";
 /**
  * Unique identifier of the operational entity.
  */
  
  private BigDecimal id;

  public static final String JSON_PROPERTY_GLCS = "glcs";
 /**
  * GLCS (Global Limit Code System). Internal and global unique reference of the Legal Entity.
  */
  
  private String glcs;

  public static final String JSON_PROPERTY_NAME = "name";
 /**
  * Full name of the Entity.
  */
  
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  
  private EntityType type;

  public static final String JSON_PROPERTY_INDUSTRY = "industry";
  
  private Industry industry;

  public static final String JSON_PROPERTY_RESIDENCE_COUNTRY = "residenceCountry";
  
  private Country residenceCountry;

  public static final String JSON_PROPERTY_BOOKING_UNIT = "bookingUnit";
 /**
  * Santander Bank Entity (Booking Unit) where the Entity is registered. This is used to route the creation.
  */
  
  private String bookingUnit;

  public static final String JSON_PROPERTY_STATUS = "status";
  
  private EntityStatus status;

  public static final String JSON_PROPERTY_LOCAL_ALIASES = "localAliases";
 /**
  * List of local aliases for a given operational entity.
  */
  
  private List<@Valid LocalAlias> localAliases = null;

  public static final String JSON_PROPERTY_TRADING_ACCOUNT_IDENTIFIERS = "tradingAccountIdentifiers";
 /**
  * List of Trading Account Identifiers.
  */
  
  private List<@Valid TradingAccountIdentifier> tradingAccountIdentifiers = null;

  public static final String JSON_PROPERTY_SOURCE_APPLICATION = "sourceApplication";
  
  private SourceApplication sourceApplication;

  public Entity() {
  }

 @JsonCreator
  public Entity(
    @JsonProperty(value = JSON_PROPERTY_ID, required = true) BigDecimal id, 
    @JsonProperty(value = JSON_PROPERTY_GLCS, required = true) String glcs, 
    @JsonProperty(value = JSON_PROPERTY_TRADING_ACCOUNT_IDENTIFIERS) List<@Valid TradingAccountIdentifier> tradingAccountIdentifiers
  ) {
    this.id = id;
    this.glcs = glcs;
    this.tradingAccountIdentifiers = tradingAccountIdentifiers;
  }
  
  /**
   * Unique identifier of the operational entity.
   * @return id
   **/
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getId() {
    return id;
  }


  /**
   * GLCS (Global Limit Code System). Internal and global unique reference of the Legal Entity.
   * @return glcs
   **/
  @JsonProperty(JSON_PROPERTY_GLCS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getGlcs() {
    return glcs;
  }


  /**
   * Full name of the Entity.
   * @return name
   **/
  @NotNull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  /**
   * Set name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }

  public Entity name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @NotNull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityType getType() {
    return type;
  }

  /**
   * Set type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(EntityType type) {
    this.type = type;
  }

  public Entity type(EntityType type) {
    this.type = type;
    return this;
  }

  /**
   * Get industry
   * @return industry
   **/
  @NotNull
  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Industry getIndustry() {
    return industry;
  }

  /**
   * Set industry
   */
  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIndustry(Industry industry) {
    this.industry = industry;
  }

  public Entity industry(Industry industry) {
    this.industry = industry;
    return this;
  }

  /**
   * Get residenceCountry
   * @return residenceCountry
   **/
  @NotNull
  @JsonProperty(JSON_PROPERTY_RESIDENCE_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Country getResidenceCountry() {
    return residenceCountry;
  }

  /**
   * Set residenceCountry
   */
  @JsonProperty(JSON_PROPERTY_RESIDENCE_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResidenceCountry(Country residenceCountry) {
    this.residenceCountry = residenceCountry;
  }

  public Entity residenceCountry(Country residenceCountry) {
    this.residenceCountry = residenceCountry;
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

  public Entity bookingUnit(String bookingUnit) {
    this.bookingUnit = bookingUnit;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @NotNull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityStatus getStatus() {
    return status;
  }

  /**
   * Set status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public Entity status(EntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * List of local aliases for a given operational entity.
   * @return localAliases
   **/
  @JsonProperty(JSON_PROPERTY_LOCAL_ALIASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid LocalAlias> getLocalAliases() {
    return localAliases;
  }

  /**
   * Set localAliases
   */
  @JsonProperty(JSON_PROPERTY_LOCAL_ALIASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocalAliases(List<@Valid LocalAlias> localAliases) {
    this.localAliases = localAliases;
  }

  public Entity localAliases(List<@Valid LocalAlias> localAliases) {
    this.localAliases = localAliases;
    return this;
  }

  public Entity addLocalAliasesItem(LocalAlias localAliasesItem) {
    if (this.localAliases == null) {
      this.localAliases = new ArrayList<>();
    }
    this.localAliases.add(localAliasesItem);
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

  public Entity sourceApplication(SourceApplication sourceApplication) {
    this.sourceApplication = sourceApplication;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    glcs: ").append(toIndentedString(glcs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    residenceCountry: ").append(toIndentedString(residenceCountry)).append("\n");
    sb.append("    bookingUnit: ").append(toIndentedString(bookingUnit)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    localAliases: ").append(toIndentedString(localAliases)).append("\n");
    sb.append("    tradingAccountIdentifiers: ").append(toIndentedString(tradingAccountIdentifiers)).append("\n");
    sb.append("    sourceApplication: ").append(toIndentedString(sourceApplication)).append("\n");
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

