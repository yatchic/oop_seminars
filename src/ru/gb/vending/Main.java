package ru.gb.vending;

import ru.gb.vending.vending.product.Bottle;
import ru.gb.vending.vending.product.Product;
import ru.gb.vending.vending.product.VendingMachine;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine=new VendingMachine();
        Product product1=new Product("twix",80);        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        Bottle product2=new Bottle("coca-cola",100,2);        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        Product product3=new Product("lays",90);        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);
        System.out.println(vendingMachine);

    }
}