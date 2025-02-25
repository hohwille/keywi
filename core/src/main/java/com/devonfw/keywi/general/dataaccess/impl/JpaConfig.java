package com.devonfw.keywi.general.dataaccess.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.devonfw.module.jpa.dataaccess.api.JpaInitializer;

/**
 * Spring {@link Configuration} for JPA.
 */
@Configuration
public class JpaConfig {

  /**
   * @return the {@link JpaInitializer} to register the {@link javax.persistence.EntityManager} and make
   *         {@link com.devonfw.module.jpa.dataaccess.api.JpaHelper} functional.
   */
  @Bean
  public JpaInitializer jpaInitializer() {

    return new JpaInitializer();
  }

}
