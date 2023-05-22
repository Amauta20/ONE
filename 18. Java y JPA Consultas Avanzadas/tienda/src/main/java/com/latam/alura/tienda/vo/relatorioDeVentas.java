package com.latam.alura.tienda.vo;

import java.time.LocalDate;

public class relatorioDeVentas {
	
	private String NombreDelProducto;
	private Long CantidadDeProducto;
	private LocalDate FechaUltimaVenta;
	
	public relatorioDeVentas(String nombreDelProducto, Long cantidadDeProducto, LocalDate fechaUltimaVenta) {
		NombreDelProducto = nombreDelProducto;
		CantidadDeProducto = cantidadDeProducto;
		FechaUltimaVenta = fechaUltimaVenta;
	}

	public String getNombreDelProducto() {
		return NombreDelProducto;
	}

	public void setNombreDelProducto(String nombreDelProducto) {
		NombreDelProducto = nombreDelProducto;
	}

	public Long getCantidadDeProducto() {
		return CantidadDeProducto;
	}

	public void setCantidadDeProducto(Long cantidadDeProducto) {
		CantidadDeProducto = cantidadDeProducto;
	}

	public LocalDate getFechaUltimaVenta() {
		return FechaUltimaVenta;
	}

	public void setFechaUltimaVenta(LocalDate fechaUltimaVenta) {
		FechaUltimaVenta = fechaUltimaVenta;
	}

	@Override
	public String toString() {
		return "relatorioDeVentas [NombreDelProducto=" + NombreDelProducto + ", CantidadDeProducto="
				+ CantidadDeProducto + ", FechaUltimaVenta=" + FechaUltimaVenta + "]";
	}
	
	
	
	
	
}
