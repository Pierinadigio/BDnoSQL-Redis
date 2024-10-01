package TP1.factory;

import TP1.PersonaDAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DerbyDAOFactory extends DAOfactory {
    private EntityManagerFactory emf;

    public DerbyDAOFactory() {
        emf = Persistence.createEntityManagerFactory("derby_persistence_unit");
    }

    @Override
    public PersonaDAO getPersonaDAO() {
        return new PersonaDAO(emf);
    }
/*
    @Override
    public ProductoDAO getProductoDAO() {
        return new ProductoDAO(emf);
    }

    @Override
    public FacturaDAO getFacturaDAO() {
        return new FacturaDAO(emf);
    }

    @Override
    public Factura_ProductoDAO getFactura_ProductoDAO() {
        return new Factura_ProductoDAO(emf);
    }*/
}