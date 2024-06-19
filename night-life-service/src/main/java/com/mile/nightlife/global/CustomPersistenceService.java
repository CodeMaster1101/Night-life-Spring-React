package com.mile.nightlife.global;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public final class CustomPersistenceService<T> {

  @PersistenceContext
  EntityManager em;

  public void persist(T entity) {
    try (Session session = em.unwrap(Session.class)) {
      session.persist(entity);
    }
  }

  public void update(T entity) {
    try (Session session = em.unwrap(Session.class)) {
      session.update(entity);
    }
  }
}
