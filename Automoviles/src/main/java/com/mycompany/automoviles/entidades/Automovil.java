/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.automoviles.entidades;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Automovil")
@NamedQueries({ @NamedQuery(name = "Automovil.findAll", query = "SELECT a FROM Automovil a") })
public class Automovil implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@GeneratedValue
	@NotNull
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "annoFabricacion")
	private Integer annoFabricacion;
	
	@Column(name = "annoModelo")
	private Integer annoModelo;
	
	@Size(max = 255)
	@Column(name = "observaciones")
	private String observaciones;
	
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "precio")
	private Float precio;
	
	@Column(name = "kilometraje")
	private Integer kilometraje;
	
	@JoinColumn(name = "modelo_id", referencedColumnName = "id")
	@ManyToOne
	private Modelo modeloId;

	public Automovil() {
	}

	public Automovil(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAnnoFabricacion() {
		return annoFabricacion;
	}

	public void setAnnoFabricacion(Integer annoFabricacion) {
		this.annoFabricacion = annoFabricacion;
	}

	public Integer getAnnoModelo() {
		return annoModelo;
	}

	public void setAnnoModelo(Integer annoModelo) {
		this.annoModelo = annoModelo;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Integer getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(Integer kilometraje) {
		this.kilometraje = kilometraje;
	}

	public Modelo getModeloId() {
		return modeloId;
	}

	public void setModeloId(Modelo modelo) {
		this.modeloId = modelo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Automovil)) {
			return false;
		}
		Automovil other = (Automovil) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.mycompany.automoviles.entidades.Automovil[ id=" + id + " ]";
	}

}
