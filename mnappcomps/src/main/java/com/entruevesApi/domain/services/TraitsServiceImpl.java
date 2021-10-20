package com.entruevesApi.domain.services;

import com.entruevesApi.domain.dynamodb.EntrueveMetadata;
import com.entruevesApi.domain.mapper.DtoToModelMapper;
import com.entruevesApi.domain.model.TraitsData;
import com.entruevesApi.domain.repositories.EntruevesMetadataRepository;
import javax.inject.Inject;
import lombok.NonNull;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class TraitsServiceImpl implements TraitsService {

  private final EntruevesMetadataRepository entruevesMetadataRepository;

  @Inject
  public TraitsServiceImpl(EntruevesMetadataRepository entruevesMetadataRepository) {
    this.entruevesMetadataRepository = entruevesMetadataRepository;
  }

  @Override
  public TraitsData getTraitsData(@NonNull String entrueveCustomerId,
      @NonNull String entrueveType) {
//    logger.info("Retrieving traits for customerId: {}");
    //todo: #fbc
    EntrueveMetadata entrueveMetadata = entruevesMetadataRepository.loadRecord(entrueveType).get();
//    tempCheckSnakeYaml();
    return DtoToModelMapper.INSTANCE.getTraitsData(entrueveMetadata);

  }

//  void tempCheckSnakeYaml() {
//    Yaml yaml = new Yaml();
//    Customer customer = yaml.load("!!org.mnappcomps.services.Customer\n"
//        + "firstName: \"John\"\n"
//        + "lastName: \"Doe\"\n"
//        + "age: 20");
//    System.out.println(customer);
//  }
}
