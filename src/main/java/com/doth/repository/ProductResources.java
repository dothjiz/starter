package com.doth.repository;

import com.doth.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductResources{

    @Autowired
    ProuctRepository productRepo;

    @GetMapping(value="/all")
    public List<Product> getAllProuct(){
        //testing git
        //testing github update
        return  productRepo.findAll();
    }

    @PostMapping(value="/save")
    public List<Product> saveProuct(@RequestBody final Product product){
        productRepo.save(product);
        return  productRepo.findAll();
    }

}