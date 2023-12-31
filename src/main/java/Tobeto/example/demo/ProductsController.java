package Tobeto.example.demo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("api/products")
public class ProductsController {
    private List<Products> productsList = new ArrayList<>();

    @GetMapping
    public List<Products> getAll() {
        return productsList;
    }

    @PostMapping
    public String add(@RequestBody Products products){
        productsList.add(products);
        return "Added";
    }
}
