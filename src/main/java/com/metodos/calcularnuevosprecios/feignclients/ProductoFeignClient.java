package com.metodos.calcularnuevosprecios.feignclients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.metodos.calcularnuevosprecios.models.ProductoModel;
import java.util.List;
import java.util.Optional;

@FeignClient(name="product-service")
public interface ProductoFeignClient {

    @GetMapping("/producto/all")
    public List<ProductoModel> getAllProductos();

    @GetMapping("/producto/getbyID")
    public Optional<ProductoModel> getProductbyID(int id);

}
