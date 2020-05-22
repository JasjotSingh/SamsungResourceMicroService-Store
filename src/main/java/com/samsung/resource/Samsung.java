package com.samsung.resource;

import com.samsung.entity.ProductList;
import com.samsung.entity.Products;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/samsung")
public class Samsung {



    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public ProductList getProducts(){
        List<Products> prodList = new ArrayList<>();
        prodList.add(new Products(1001,"h1", "phone"));
        prodList.add(new Products(1002,"h2", "phone"));
        prodList.add(new Products(1003,"h3", "phone"));
        prodList.add(new Products(1004,"h4", "phone"));

        return new ProductList(prodList);
    }
}
