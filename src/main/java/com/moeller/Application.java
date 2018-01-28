package com.moeller;

/**
 * Created by Bernd on 01.11.2017.
 *
 * Package com.bmoellerit.raspi
 */

import io.swagger.client.ApiClient;
import io.swagger.client.api.AuthorizationsApi;
import io.swagger.client.api.EventsApi;
import io.swagger.client.api.TransactionsApi;
import io.swagger.client.api.VersionApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

  private static final Logger log = LoggerFactory.getLogger(Application.class);



  public static void main(String args[]) {
    SpringApplication.run(Application.class);
  }

  @Bean
  public VersionApi versionApi(){
    return new VersionApi(apiClient());
  }

  @Bean
  public AuthorizationsApi authorizationsApi(){
    return new AuthorizationsApi(apiClient());
  }

  @Bean
  public EventsApi eventsApi(){
    return new EventsApi(apiClient());
  }

  @Bean
  public TransactionsApi transactionsApi(){
    return new TransactionsApi(apiClient());
  }

  @Bean
  public ApiClient apiClient(){
    return new ApiClient();
  }




}