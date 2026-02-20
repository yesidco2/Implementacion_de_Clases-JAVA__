package com.example;

public class Main {
   public static void main(String[] args) {
        try {
            Product product1 = new Product();
            System.out.println("Producto 1:");
            product1.setId(1);
            product1.setNombre("Mouse");
            product1.setPrecio(25500);
            product1.setDescripcion("Mouse inalámbrico con alta precisión");

            System.out.println(product1);
            System.out.println();

            Product product2 = new Product(34, "Teclado", "Teclado mecánico con retroiluminación", 45000);
            System.out.println("Producto 2:");
            System.out.println(product2);
            System.out.println();

            System.out.println("¿Son iguales? " + product1.equals(product2));

        } catch (IllegalArgumentException e) {
            System.out.println("Error de validación: " + e.getMessage());
        }
    }
}