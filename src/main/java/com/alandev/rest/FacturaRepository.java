package com.alandev.rest;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class FacturaRepository {

    @PersistenceContext
    private EntityManager em;
    public List<Factura> buscarTodas(){
        return em.createQuery("select * from Facturas", Factura.class).getResultList();
    }
}
