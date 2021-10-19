package com.entruevesApi.domain.controller;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.entruevesApi.domain.DaggerServiceComponent;
import com.entruevesApi.domain.ServiceComponent;
import com.entruevesApi.domain.model.TraitsRequest;
import com.entruevesApi.domain.model.TraitsResponse;
import com.entruevesApi.domain.services.TraitsService;

public class GetTraitsController implements
    RequestHandler<TraitsRequest, TraitsResponse> {
  private final TraitsService traitsService;
////  private static final Logger logger = LoggerFactory.getLogger("GetTraitsController.class");
  public GetTraitsController() {
    this(DaggerServiceComponent.create());
  }
//
//
  public GetTraitsController(
      final ServiceComponent serviceComponent) {
    this.traitsService = serviceComponent.getTraitsService();
  }


  @Override
  public TraitsResponse handleRequest(TraitsRequest input, Context context) {
//    LambdaLogger logger = context.getLogger();
//    logger.log("Insite the lambda function");
//    TraitsData traitsData = traitsService.getTraitsData(input.getEntrueveCustomerId(),
//        input.getEntrueveType());

//    return TraitsResponse.builder().traitsData(traitsData.getTraits().get(0).getTraitName()).build();
    return TraitsResponse.builder().traitsData("traitsData.getTraits().get(0).getTraitName()").build();

  }
}
