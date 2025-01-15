package org.example;

import org.example.model.Product;

import java.util.*;

public class Basics {
    private static int option;
    private static final List<Product> products = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public Product addProduct() {
        try {
            System.out.println("Enter Product Name");
            String name = scanner.nextLine();

            System.out.println("Enter Price");
            int price = scanner.nextInt();
            UUID uuid = UUID.randomUUID();
            return new Product(uuid, name, price);
        } catch (Exception e) {
            if( e instanceof  InputMismatchException){
                System.out.println("Invalid Number");
            }
            System.out.println("Something went wrong!");
        }
        return null;
    }

    public void listProducts() {
        if (products.toArray().length == 0) {
            System.out.println("Products list empty!");
        } else {
            System.out.println("Id\t|Name\t|Price");
            for (int i = 0; i < products.toArray().length; i++) {
                Product productDesc = products.get(i);
                System.out.println(productDesc.getId() + "\t|" + productDesc.getName() + "\t|" + productDesc.getPrice());
            }
        }
    }

    public void removeProduct() {
        System.out.println("Enter a valid product Id \n");
        UUID productId = UUID.fromString(scanner.nextLine());

        Optional<Product> product = products.stream().filter(p -> Objects.equals(p.getId(), productId)).findAny();

        if (product.isEmpty()) {
            System.out.println("Invalid Product! ");
        } else {
            products.remove(product.get());
            System.out.println("Removed Product ");
        }
    }

    public static void main(String[] args) {
        Basics basics = new Basics();

        products.add(new Product(UUID.randomUUID(), "Product A", 8500));
        products.add(new Product(UUID.randomUUID(), "Product B", 1500));

        while (option != 4) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" 1.Add Product\n 2.Remove Product \n 3.List Products\n Enter an option!\n ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    Product product = basics.addProduct();

                    if (product != null) {
                        products.add(product);
                        System.out.println("Product added successfully!");
                    }

                    break;
                case 2:
                    basics.removeProduct();
                    break;
                case 3:
                    System.out.println("Products \n");
                    basics.listProducts();
                    break;
                case 4:
                    System.out.println("Exiting application");
            }
        }
    }
}
