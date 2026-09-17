public class TestProduct {

    public static void main(String[] args) {
        Product product = new Product("Laptop", 1500.0, 10);

        System.out.println("Producto: " + product.getName()
                + " | Precio: " + product.getPrice()
                + " | Stock: " + product.getStock());

        boolean r1 = product.setPrice(1400.0);
        System.out.println("Actualizar precio a 1400.0 -> " + (r1 ? "Aceptado" : "Rechazado"));

        boolean r2 = product.setPrice(-10.0);
        System.out.println("Actualizar precio a -10.0 -> " + (r2 ? "Aceptado" : "Rechazado"));

        boolean r3 = product.setName("   ");
        System.out.println("Actualizar nombre a vacío -> " + (r3 ? "Aceptado" : "Rechazado"));

        boolean r4 = product.setStock(25);
        System.out.println("Actualizar stock a 25 -> " + (r4 ? "Aceptado" : "Rechazado"));

        boolean r5 = product.setStock(-5);
        System.out.println("Actualizar stock a -5 -> " + (r5 ? "Aceptado" : "Rechazado"));

        System.out.println("Estado final -> Nombre: " + product.getName()
                + " | Precio: " + product.getPrice()
                + " | Stock: " + product.getStock());
    }
}