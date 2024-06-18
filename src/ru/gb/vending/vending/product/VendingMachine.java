package ru.gb.vending.vending.product;

import ru.gb.vending.vending.product.Product;

import java.util.ArrayList;
import java.util.List;
public class VendingMachine {
 List<Product> productList;

 public VendingMachine() {
  productList = new ArrayList<>();
 }

 public void addProduct(Product product) {
  productList.add(product);

 }

 public Product findProductByName(String nameProduct) {
  for (Product product : productList) {
   if (product.getName().equalsIgnoreCase(nameProduct)) {
    return product;
   }
}
  return null;
 }


 @Override
 public String toString() {
  StringBuilder stringBuilder=new StringBuilder();
  stringBuilder.append("Список продуктов:\n");
          for(Product product:productList){
           stringBuilder.append(product+"\n");

          }
  return stringBuilder.toString();
 }
}