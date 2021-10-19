package com.entruevesApi.domain.services;


import com.entruevesApi.domain.model.TraitsData;

public interface TraitsService {

  public TraitsData getTraitsData(String entrueveCustomerId, String entrueveType);
}
