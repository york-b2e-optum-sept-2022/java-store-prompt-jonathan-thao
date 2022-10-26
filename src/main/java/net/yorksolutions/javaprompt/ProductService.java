package net.yorksolutions.javaprompt;

import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class ProductService {

    ProductService productService;

    public ArrayList<StoreProduct> getListOfProducts() {
        return listOfProducts;
    }

    private ArrayList<StoreProduct> listOfProducts;

    //    put product list into an array

    public ProductService() {
        this.listOfProducts = new ArrayList<StoreProduct>();
    }

    public void addNewProduct(StoreProduct storeProduct) {
        this.listOfProducts.add(storeProduct);
        //    add product
        //        .equals(id)
    }

    public void removeProd(int id) {
        for(StoreProduct storeProduct: listOfProducts){
            if(storeProduct.id == id){
                this.listOfProducts.remove(storeProduct);
                break;
//                break the loop (concurrent modification exception in console)
            }
        }

    }

    public void updateProd(StoreProduct newProd, int id) {
        for(StoreProduct storeProduct: listOfProducts){
            if(storeProduct.id == id){
                this.listOfProducts.set(listOfProducts.indexOf(storeProduct),newProd);
            }
        }
    }
}




//    replace product by id
//    product list over value
//    product list under value



