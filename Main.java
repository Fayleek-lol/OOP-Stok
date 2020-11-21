class Main {
    public static void main(String [] args){
        Stock stock = new Stock();
        
        stock.setNameOfProduct ("книга");
        stock.setPriceProduct (500);
        stock.setAvailabilityInStock (true);
        stock.printAboutObject();
    }
}