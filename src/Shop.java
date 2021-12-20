public class Shop {
    public static void main(String[] args) {

        Product product1 = new Product("Czekolada", "Milka");


        Offer offer1 = new Offer(product1, 3.99, true);

        offer1.printOffer();

//        Offer offer1 = new Offer(new Product("Czekolada mleczna", "Milka"), 3.99, true);
//
//        System.out.println(offer1.productOffer.nameProduct);
//        offer1.printOffer();
    }
}
