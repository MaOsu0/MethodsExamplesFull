public class Offer {
    Product productOffer;
    double priceOffer;
    boolean specialOffer;

    Offer (Product product, double price, boolean special){
        productOffer = product;
        priceOffer = price;
        specialOffer = special;
    }

    void printOffer (){
        System.out.println(productOffer.nameProduct + " marki " + productOffer.producerProduct + " w cenie " +
                priceOffer + " zł. Czy jest na promocji? " + specialOffer);
    }
}
