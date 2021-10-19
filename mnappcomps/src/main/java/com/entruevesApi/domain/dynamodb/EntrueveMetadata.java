package com.entruevesApi.domain.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import java.util.Map;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@DynamoDBTable(tableName = "entrueve-specs")
@Builder
@NoArgsConstructor
@Data
@AllArgsConstructor
public class EntrueveMetadata {

  @DynamoDBHashKey(attributeName = "entrueveType")
  private String entrueveType;

  @DynamoDBRangeKey(attributeName = "sk")
  private String sk;

  @DynamoDBAttribute(attributeName = "entrueveCustomerId")
  private String entrueveCustomerId;

  @DynamoDBAttribute(attributeName = "mapVersion")
  private int mapVersion;

  //  @DynamoDBTypeConverted(converter = ObjectConverter.class)
  @DynamoDBAttribute(attributeName = "traits")
  private Map<String, Set<String>> traits;
//  @DynamoDBAttribute(attributeName = "modifiedDate")
//  private long modifiedDate;
//
//  @DynamoDBAttribute(attributeName = "modifiedDateUtc")
//  private String modifiedDateUtc;
}
