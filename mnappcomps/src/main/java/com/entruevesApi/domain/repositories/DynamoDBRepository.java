package com.entruevesApi.domain.repositories;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.ConsistentReads;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.SaveBehavior;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import java.util.Optional;
import javax.inject.Inject;

public class DynamoDBRepository<I, O extends I> {

  private final DynamoDBMapper dynamoDBMapper;

  public DynamoDBRepository(DynamoDBMapper dynamoDBMapper) {
    this.dynamoDBMapper = dynamoDBMapper;
  }

  protected Optional<O> load(final O keyObject) {
    final DynamoDBMapperConfig mapperConfig = DynamoDBMapperConfig.builder().withConsistentReads(
        ConsistentReads.CONSISTENT).build();
    return Optional.ofNullable(dynamoDBMapper.load(keyObject));
  }

  protected void save(final I record, final DynamoDBSaveExpression dynamoDBSaveExpression) {
    DynamoDBMapperConfig mapperConfig =
        DynamoDBMapperConfig.builder().withSaveBehavior(SaveBehavior.UPDATE).build();
    if (dynamoDBSaveExpression != null) {
      dynamoDBMapper.save(record, dynamoDBSaveExpression, mapperConfig);
    } else {
      dynamoDBMapper.save(record, mapperConfig);
    }
  }
}
