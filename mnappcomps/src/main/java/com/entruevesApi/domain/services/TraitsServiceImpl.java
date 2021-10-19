package com.entruevesApi.domain.services;

import com.google.common.collect.Lists;
import javax.inject.Inject;
import lombok.NonNull;
import com.entruevesApi.domain.model.Trait;
import com.entruevesApi.domain.model.TraitType;
import com.entruevesApi.domain.model.TraitsData;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class TraitsServiceImpl implements TraitsService {

//  private final EntruevesMetadataRepository entruevesMetadataRepository;

  @Inject
  public TraitsServiceImpl(
  ) {
//    this.entruevesMetadataRepository = entruevesMetadataRepository;
  }

  @Override
  public TraitsData getTraitsData(@NonNull String entrueveCustomerId,
      @NonNull String entrueveType) {
//    logger.info("Retrieving traits for customerId: {}");
    //todo: #fbc
//    EntrueveMetadata entrueveMetadata = entruevesMetadataRepository.loadRecord(entrueveType).get();
//    tempCheckSnakeYaml();
//    return DtoToModelMapper.INSTANCE.getTraitsData(entrueveMetadata);
    TraitsData traitsData = new TraitsData();
    traitsData.setTraits(
        Lists.newArrayList(Trait.builder().traitType(TraitType.Boolean).traitName("ddda").build()));
    return traitsData;
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
