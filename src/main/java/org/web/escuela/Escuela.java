package org.web.escuela;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.web.entidad.Alumno;
import org.web.entidad.Cursos;

public class Escuela {
    public static void main(String[] args) {
        // Crear un EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PUescuela");
        EntityManager em = emf.createEntityManager();

        // Crear un objeto Alumno
        Alumno alumno = new Alumno();

        // Usar Scanner para obtener el nombre del alumno desde el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno: ");
        String nombreAlumno = scanner.nextLine();
        alumno.setNombre(nombreAlumno);

        // Crear objetos Cursos y asignarlos al Alumno
        System.out.print("¿Cuántos cursos desea agregar? ");
        int numCursos = scanner.nextInt();
        scanner.nextLine(); // Limpiar el salto de línea

        for (int i = 1; i <= numCursos; i++) {
            Cursos curso = new Cursos();
            System.out.print("Nombre del curso " + i + ": ");
            String nombreCurso = scanner.nextLine();
            curso.setNombre(nombreCurso);
            curso.setAlumno(alumno);
            alumno.getTodoscursos().add(curso);
        }

        // Iniciar una transacción y registrar el Alumno en la base de datos
        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();

        // Cerrar el EntityManager y la fábrica de EntityManager
        em.close();
        emf.close();

        // Cerrar el Scanner
        scanner.close();
    }
}
