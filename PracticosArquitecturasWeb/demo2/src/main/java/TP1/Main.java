package TP1;
import TP1.factory.DAOfactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        DAOfactory factory = DAOfactory.getDAOFactory(2);

        PersonaDAO dao = factory.getPersonaDAO();

        // Crear e insertar personas
       Persona p = new Persona("Pepa33");
       Persona p1 = new Persona("PepaPig2");
      dao.save(p);
       dao.save(p1);

        // Consultar y mostrar personas
        System.out.println("Personas UNO: ");

        Persona p2 = new Persona("Pierona33");
        Persona p3 = new Persona("Pepita");
        dao.save(p2);
        dao.save(p3);


        Persona p5 = new Persona("PepaPig2");
        dao.save(p5);
        dao.findAll();
        // Encontrar persona por ID
         Persona foundPerson = dao.findById(2);
         System.out.println("Persona encontrada: " + foundPerson);

        // Eliminar persona
    //    dao.delete(p1);

        // Verificar eliminación
      //  List<Persona> remainingPersons = dao.findAll();
      //  for (Persona p : remainingPersons) {
       //     System.out.println(p);
      //  }

        // Cerrar el DAO
        dao.close();
    }
}
