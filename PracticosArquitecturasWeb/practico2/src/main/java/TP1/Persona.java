package TP1;
import javax.persistence.*;

@Entity
@Table(name = "Tabla_Persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Nombre", nullable = false)
    private String nombre;


    public Persona() {
        super();
    }
    public Persona(String nombre) {
        super();
        this.nombre = nombre;
    }

    // Getters y setters
    public int getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", Nombre=" + nombre + '}';

    }
}