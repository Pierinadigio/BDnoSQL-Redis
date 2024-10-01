package TP1.factory;

import TP1.PersonaDAO;

public abstract class DAOfactory {
    public static final int MYSQL_JDBC = 1;
    public static final int DERBY_JDBC = 2;

    public abstract PersonaDAO getPersonaDAO();


    public static DAOfactory getDAOFactory(int whichFactory) {
        switch (whichFactory) {
            case MYSQL_JDBC:
                return new MySQLDAOFactory();
            case DERBY_JDBC:
                return new DerbyDAOFactory();
            default:
                return null;
        }
    }
}
