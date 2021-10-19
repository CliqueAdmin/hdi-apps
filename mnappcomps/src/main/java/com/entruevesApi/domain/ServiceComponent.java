package com.entruevesApi.domain;

import com.entruevesApi.domain.modules.EntrueveApiModule;
import com.entruevesApi.domain.services.TraitsService;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = { EntrueveApiModule.class})
public interface ServiceComponent {

  TraitsService getTraitsService();

}
