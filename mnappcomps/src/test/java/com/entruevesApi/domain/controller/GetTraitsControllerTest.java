package com.entruevesApi.domain.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.entruevesApi.domain.DaggerServiceComponent;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.entruevesApi.domain.ServiceComponent;
import com.entruevesApi.domain.model.TraitsRequest;
import com.entruevesApi.domain.model.TraitsResponse;

public class GetTraitsControllerTest {

  private ServiceComponent serviceComponent;
  private GetTraitsController getTraitsController;

  @BeforeEach
  public void setUp() throws Exception {
    serviceComponent = DaggerServiceComponent.create();
    getTraitsController = new GetTraitsController();
  }

  @Test
  @Ignore
  public void handleRequest() {
    TraitsRequest traitsRequest = new TraitsRequest();
    traitsRequest.setEntrueveCustomerId("DFDFD");
    traitsRequest.setEntrueveType("DFD");
    TraitsResponse traitsResponse=  getTraitsController.handleRequest(traitsRequest, null);
    System.out.println("traitsResponse = " + traitsResponse.getTraitsData());
    assertTrue(true);
  }
}