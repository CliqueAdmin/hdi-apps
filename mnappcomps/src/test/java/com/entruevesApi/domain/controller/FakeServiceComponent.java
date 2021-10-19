package com.entruevesApi.domain.controller;

import com.entruevesApi.domain.ServiceComponent;
import com.entruevesApi.domain.services.TraitsService;
import static org.mockito.Mockito.mock;

public class FakeServiceComponent implements ServiceComponent {

  @Override
  public TraitsService getTraitsService() {
    return mock(TraitsService.class);
  }
}
