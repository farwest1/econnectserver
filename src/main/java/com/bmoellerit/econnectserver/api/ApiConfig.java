package com.bmoellerit.econnectserver.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Bernd on 04.02.2018.
 *
 * Package com.bmoellerit.econnectserver.api
 */
@Configuration
public class ApiConfig {

  @Bean
  public AuthorizationsApiDelegate getAuthorizationsApiDelegate(){
    return new AuthorizationsApiDelegateImpl();
  }

  @Bean
  public EventsApiDelegate getEventsApiDelegate(){
    return new EventsApiDelegateImpl();
  }

  @Bean
  public TransactionsApiDelegate getTransactionsApiDelegate(){
    return new TransactionsApiDelegateImpl();
  }

  @Bean
  public VersionApiDelegate getVersionApiDelegate(){
    return new VersionApiDelegateImpl();
  }

}
