package com.entruevesApi.domain.modules;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Module
public class AwsModule  {

  private static final Logger logger = LoggerFactory.getLogger(AwsModule.class);

  @Provides
  @Singleton
  protected AmazonDynamoDB provideAmazonDynamoDB() {
    logger.info("AmazonDynamoDB");
    return AmazonDynamoDBClientBuilder.standard().build();
  }

  @Provides
  @Singleton
  protected DynamoDB providesDynamoDB(AmazonDynamoDB client) {
    logger.info("AmazonDynamoDB(client)->DynamoDB");
    return new DynamoDB(client);
  }


}
