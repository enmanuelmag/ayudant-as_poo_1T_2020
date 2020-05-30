/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.newfeactures;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Enmanuel
 */
class Presidente {

  /**
   * 
   * @param date
   * @return String with the p`lan. If don't exist return Optional.empty()
   */
  Optional<String> getPlanCountry(String date) {

    String c = "Alemania";

    if (c.equals(date))
      return Optional.of("Tiene plan...");
    return Optional.empty();
  }

  /**
   * 
   * @param letra ha buscar en el nombre de las esposas
   * @return
   */
  public Optional<Wife> findWifeNew(String letra) {
    return Optional.empty();
  }

  public Wife findWifeOld(String string) {
    return null;
  }

  public Wife doWife(Object object) {
    return null;
  }

  public ArrayList<Wife> getWifes() {
    return new ArrayList<>();
  }

}
