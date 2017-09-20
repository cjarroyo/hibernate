package com.mycompany.automoviles.entidades;

import com.mycompany.automoviles.entidades.Modelo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-05-23T14:48:29")
@StaticMetamodel(Automovil.class)
public class Automovil_ { 

    public static volatile SingularAttribute<Automovil, Integer> id;
    public static volatile SingularAttribute<Automovil, Float> precio;
    public static volatile SingularAttribute<Automovil, Integer> annoFabricacion;
    public static volatile SingularAttribute<Automovil, Modelo> modeloId;
    public static volatile SingularAttribute<Automovil, Integer> annoModelo;
    public static volatile SingularAttribute<Automovil, String> observaciones;
    public static volatile SingularAttribute<Automovil, Integer> kilometraje;

}