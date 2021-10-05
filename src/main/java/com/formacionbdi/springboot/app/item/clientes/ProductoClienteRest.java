package com.formacionbdi.springboot.app.item.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.formacionbdi.springboot.app.item.models.Producto;

//Acá (en la interface algoClientRest) se se setea lo mismo que en el controlador del servicio que queremos llamar
// @FeignClient(name = "servicio-productos" url = "localhost:8001") //esto iría si no tuvieramos ribbon como balanceador de carga en application.properties
@FeignClient(name = "servicio-productos") //el nombre del servicio que estamos llamando que va en el applications.properties de aquel servicio
public interface ProductoClienteRest {
	
	@GetMapping("/listar")
	public List<Producto> listar();
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id);

}
