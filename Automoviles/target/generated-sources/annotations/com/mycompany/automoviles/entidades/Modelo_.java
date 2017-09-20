package com.mycompany.automoviles.entidades;

import com.mycompany.automoviles.entidades.Automovil;
import com.mycompany.automoviles.entidades.Marca;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-05-23T14:48:29")
@StaticMetamodel(Modelo.class)
public class Modelo_ { 

    public static volatile SingularAttribute<Modelo, Integer> id;
    public static volatile ListAttribute<Modelo, Automovil> automovilList;
    public static volatile SingularAttribute<Modelo, String> descripcion;
    public static volatile SingularAttribute<Modelo, Integer> potencia;
    public static volatile SingularAttribute<Modelo, Marca> marcaId;

}