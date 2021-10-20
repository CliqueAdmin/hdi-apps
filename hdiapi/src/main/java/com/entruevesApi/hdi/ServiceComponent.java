package com.entruevesApi.hdi;

import com.entruevesApi.domain.modules.AwsModule;
import com.entruevesApi.domain.modules.EntrueveApiModule;
import com.entruevesApi.domain.services.TraitsService;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {AwsModule.class, EntrueveApiModule.class})
public interface ServiceComponent {

  TraitsService getTraitsService();

}
