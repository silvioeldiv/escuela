package org.web.entidad;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.web.entidad.Alumno;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-04T17:53:47", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Profesores.class)
public class Profesores_ { 

    public static volatile SingularAttribute<Profesores, String> nombre;
    public static volatile SingularAttribute<Profesores, Integer> idprofesores;
    public static volatile SingularAttribute<Profesores, Alumno> alum;

}