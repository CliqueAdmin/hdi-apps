package com.entruevesApi.domain.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@DynamoDBTable(tableName = "entrueves-templates")
@Builder
@NoArgsConstructor
@Data
@AllArgsConstructor
public class EntruevesTemplateData {
  @DynamoDBHashKey(attributeName = "PK")
  private String zipCode;

  @DynamoDBRangeKey(attributeName = "sk")
  private String sk;

  @DynamoDBAttribute(attributeName = "entrueveCustomerId")
  private String entrueveCustomerId;

  @DynamoDBAttribute(attributeName = "mapVersion")
  private int mapVersion;
}
