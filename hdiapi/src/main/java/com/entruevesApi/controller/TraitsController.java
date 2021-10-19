package com.entruevesApi.controller;


import com.entruevesApi.domain.DaggerServiceComponent;
import com.entruevesApi.domain.ServiceComponent;
import com.entruevesApi.domain.model.Trait;
import com.entruevesApi.domain.services.TraitsService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraitsController {

  final TraitsService traitsService;

  public TraitsController() {
    this(DaggerServiceComponent.create());

  }

  public TraitsController(ServiceComponent serviceComponent) {
    traitsService = serviceComponent.getTraitsService();
  }

  @GetMapping("/traits")
  List<Trait> all() {
    return traitsService.getTraitsData("Consortium", "Resume").getTraits();
  }
}
