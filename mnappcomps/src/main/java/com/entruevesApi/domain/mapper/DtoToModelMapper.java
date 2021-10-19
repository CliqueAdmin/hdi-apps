package com.entruevesApi.domain.mapper;

import com.entruevesApi.domain.dynamodb.EntrueveMetadata;
import com.entruevesApi.domain.model.Trait;
import com.entruevesApi.domain.model.TraitType;
import com.entruevesApi.domain.model.TraitsData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public abstract class DtoToModelMapper {

  public static final DtoToModelMapper INSTANCE = Mappers.getMapper(DtoToModelMapper.class);

  @Mapping(target = "entrueveType", source = "entrueveType")
  @Mapping(target = "entrueveCustomerId", source = "entrueveCustomerId")
  @Mapping(target = "traits", expression = "java(convertMapToList(entrueveMetadata.getTraits()))")
  public abstract TraitsData getTraitsData(EntrueveMetadata entrueveMetadata);

  public List<Trait> convertMapToList(Map<String, Set<String>> traitMap) {
    List<Trait> result = new ArrayList<>();
    for (Entry<String, Set<String>> traitEntry : traitMap.entrySet()) {
      Trait.TraitBuilder builder = Trait.builder();
      builder.traitName(traitEntry.getKey());
      for (String traitAttrib : traitEntry.getValue()) {
        String[] keyVals = getAttributeKeyVal(traitAttrib);

        if (keyVals[0].equals("Desc")) {
          builder.traitDescription(keyVals[1]);
        }

        if (keyVals[0].equals("Type")) {
          builder.traitType(TraitType.valueOf(keyVals[1]));
        }
      }

      Trait trait = builder.build();
      result.add(trait);

    }
    return result;
  }

  private String[] getAttributeKeyVal(String keyValStr) {
    return keyValStr.split("\\|",2);
  }
}
