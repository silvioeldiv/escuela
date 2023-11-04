
package org.web.entidad;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idalumno")
    private Integer idalumno;
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "alum",cascade = CascadeType.ALL)
    private List<Profesores> todosprofesores = new ArrayList<>();
    private List<Cursos> todoscursos= new ArrayList<>();

    public Alumno() {
    }

    public Alumno(Integer idalumno, String nombre) {
        this.idalumno = idalumno;
        this.nombre = nombre;
    }

    public Integer getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(Integer idalumno) {
        this.idalumno = idalumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Profesores> getTodosprofesores() {
        return todosprofesores;
    }

    public void setTodosprofesores(List<Profesores> todosprofesores) {
        this.todosprofesores = todosprofesores;
    }

    public List<Cursos> getTodoscursos() {
        return todoscursos;
    }

    public void setTodoscursos(List<Cursos> todoscursos) {
        this.todoscursos = todoscursos;
    }

    
    
                       
}
