package com.bmoellerit.econnectserver.api;

import com.bmoellerit.econnectserver.api.model.EventList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Created by Bernd on 04.02.2018.
 *
 * Package com.bmoellerit.econnectserver.api
 */
public class EventsApiDelegateImpl implements EventsApiDelegate {

  @Override
  public ResponseEntity<Void> putEvents(EventList eventList) {
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
