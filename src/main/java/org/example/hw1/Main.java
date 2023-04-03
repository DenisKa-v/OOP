package org.example.hw1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        HotWaterVendingMachine machineHotWater = new HotWaterVendingMachine();
        machineHotWater.addProduct(new HotWater("hot water 1l", 150.0, 1, 30));
        machineHotWater.addProduct(new HotWater("hot water 2l", 300.0, 2, 40));
        machineHotWater.addProduct(new HotWater("hot water 1l", 300.0, 2, 40));
        machineHotWater.addProduct(new HotWater("another hot water 2l", 300.0, 2, 35));
        machineHotWater.addProduct(new HotWater("hot water 3l", 350.0, 3, 50));

        ArrayList list2 = machineHotWater.getProduct("water", 2, 40);
        System.out.println(list2);
    }
}