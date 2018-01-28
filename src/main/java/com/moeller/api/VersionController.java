package com.moeller.api;

import io.swagger.client.api.VersionApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bernd on 28.01.2018.
 *
 * Package com.moeller.api
 */
@RestController
public class VersionController {

  private VersionApi versionApi;

  @Autowired
  public VersionController(VersionApi versionApi){
    this.versionApi = versionApi;
  }

  @RequestMapping("/version")
  public ResponseEntity<String> getVersion(){
    return getVersion();
  }
}
