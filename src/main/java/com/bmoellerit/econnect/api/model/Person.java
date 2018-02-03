package com.bmoellerit.econnect.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Bernd on 02.02.2018.
 *
 * Package com.bmoellerit.econnect.api.model
 */
@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.NONE)
public class Person {

  public long id;
  public String name;

  public Person(){
    this(1, "Bernd");
  }

  public Person(long id, String name){
    this.id = id;
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
