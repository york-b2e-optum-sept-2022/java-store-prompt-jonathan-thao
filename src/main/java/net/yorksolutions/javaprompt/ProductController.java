package net.yorksolutions.javaprompt;

import org.apache.catalina.Store;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat.UUID;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;}

    @GetMapping ("/getproduct")
    public ArrayList<StoreProduct> getProduct(){
        return this.productService.getListOfProducts();
    }

    @PostMapping("/addproduct")
    public void addProduct(@RequestBody StoreProduct newProduct) {
        this.productService.addNewProduct(newProduct);

    }

    @DeleteMapping("/deleteproduct/{id}")
    public void removeProd (@PathVariable Integer id){
        this.productService.removeProd(id);
    }

    @PutMapping("/updateproduct/{id}")
    public void updateProd (@RequestBody StoreProduct newProd, @PathVariable Integer id){
        this.productService.updateProd(newProd, id);
    }









}
