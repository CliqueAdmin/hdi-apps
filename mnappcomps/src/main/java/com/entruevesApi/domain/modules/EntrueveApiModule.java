package com.entruevesApi.domain.modules;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.entruevesApi.domain.repositories.EntruevesMetadataRepository;
import com.entruevesApi.domain.services.TraitsService;
import com.entruevesApi.domain.services.TraitsServiceImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class EntrueveApiModule {

  @Provides
  @Singleton
  public TraitsService provideTraitsService(EntruevesMetadataRepository repository) {
    return new TraitsServiceImpl(repository);
  }

  @Provides
  @Singleton
  protected DynamoDBMapper providesDynamoDbMapper(AmazonDynamoDB dynamoDB) {
    return new DynamoDBMapper(dynamoDB);
  }

  @Provides
  @Singleton
  protected EntruevesMetadataRepository entruevesMetadataRepository(DynamoDBMapper dbMapper) {
    return new EntruevesMetadataRepository(dbMapper);
  }

}
