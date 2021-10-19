package com.entruevesApi.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Trait {
  private TraitType traitType;
  private String traitName;
  private String traitDescription;
}
