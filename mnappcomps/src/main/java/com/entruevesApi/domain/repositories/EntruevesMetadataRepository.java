package com.entruevesApi.domain.repositories;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.entruevesApi.domain.dynamodb.EntrueveMetadata;
import java.util.Optional;
import javax.inject.Inject;
import lombok.NonNull;

public class EntruevesMetadataRepository extends DynamoDBRepository<EntrueveMetadata, EntrueveMetadata> {

  @Inject
  public EntruevesMetadataRepository(
      DynamoDBMapper dynamoDBMapper) {
    super(dynamoDBMapper);
  }

  public Optional<EntrueveMetadata> loadRecord(@NonNull String entrueveType) {
    EntrueveMetadata entrueveMetadata =
        EntrueveMetadata.builder().entrueveType(entrueveType).sk(entrueveType).build();
    return load(entrueveMetadata);
  }
}
