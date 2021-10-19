package com.entruevesApi.domain.modules;

import com.entruevesApi.domain.services.TraitsService;
import com.entruevesApi.domain.services.TraitsServiceImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;


@Module
public class EntrueveApiModule {
//  private static final Logger logger = LoggerFactory.getLogger(EntrueveApiModule.class);
  @Provides
  @Singleton
  public TraitsService provideTraitsService() {
//    logger.info("EntruevesMetadataRepository -> TraitsService ");
    return new TraitsServiceImpl();
  }

//  @Provides
//  @Singleton
//  protected DynamoDBMapper providesDynamoDbMapper(AmazonDynamoDB dynamoDB) {
//    logger.info("AmazonDynamoDB-> DynamoDBMapper ");
//    return new DynamoDBMapper(dynamoDB);
//  }
//
//  @Provides
//  @Singleton
//  protected EntruevesMetadataRepository entruevesMetadataRepository(DynamoDBMapper dbMapper) {
//    logger.info("dbMapper-> EntruevesMetadataRepository ");
//    return new EntruevesMetadataRepository(dbMapper);
//  }

}
