package com.metodos.calcularnuevosprecios.controllers;

import com.metodos.calcularnuevosprecios.models.ProductoModel;
import com.metodos.calcularnuevosprecios.models.CalculoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.metodos.calcularnuevosprecios.feignclients.ProductoFeignClient;
import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

@RestController
@RequestMapping("/calculo")
public class CalculoController {
    @Autowired
    private ProductoFeignClient productoclient;

    @GetMapping("/all")
    public List<CalculoModel> getCalculoAll() {
        List<ProductoModel> productList = productoclient.getAllProductos();
        List<CalculoModel> calculoList = new ArrayList<>();
        for (ProductoModel producto : productList) {
            CalculoModel calculo = new CalculoModel();
            calculo.setId(producto.getId());
            calculo.setNombre(producto.getNombre());
            calculo.setPrecio(producto.getPrecio());
            float preciofloat = producto.getPrecio();
            calculo.setPrecioDolar(preciofloat/500);
            calculo.setPrecioEuro(preciofloat/1000);
            calculoList.add(calculo);
        }
        return calculoList;
    }

    @GetMapping("/byID")
    public CalculoModel getCalculobyId(int id) {
        ProductoModel product = productoclient.getProductbyID(id).stream().findFirst().orElse(null);
        CalculoModel calculo = new CalculoModel();
        calculo.setNombre(product.getNombre());
        calculo.setPrecio(product.getPrecio());
        float preciofloat = product.getPrecio();
        calculo.setPrecioDolar(preciofloat/500);
        calculo.setPrecioEuro(preciofloat/1000);
        return calculo;
    }

}
