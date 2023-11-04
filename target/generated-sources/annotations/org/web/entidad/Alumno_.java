package org.web.entidad;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.web.entidad.Cursos;
import org.web.entidad.Profesores;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-04T17:53:47", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile SingularAttribute<Alumno, Integer> idalumno;
    public static volatile ListAttribute<Alumno, Profesores> todosprofesores;
    public static volatile SingularAttribute<Alumno, String> nombre;
    public static volatile ListAttribute<Alumno, Cursos> todoscursos;

}