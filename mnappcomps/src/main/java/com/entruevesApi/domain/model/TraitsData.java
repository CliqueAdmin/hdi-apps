package com.entruevesApi.domain.model;

import java.util.List;
import lombok.Data;

@Data
public class TraitsData {

  private String entrueveType;
  private Long modifiedDate;
  private String entrueveCustomerId;
  private int mapVersion;
  private List<Trait> traits;

}
