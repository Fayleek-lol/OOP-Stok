public class Stock
{
    private String nameOfProduct;
    private double priceProduct;
    private boolean availabilityInStock;
    
	public void setNameOfProduct(String nameOfProduct)
    {
        if (nameOfProduct.length() > 0)
        {
            this.nameOfProduct = nameOfProduct.substring(0,1).toUpperCase() + nameOfProduct.substring(1);
        }
    }
    public String getNameOfProduct()
    {
        return nameOfProduct;
    }      
    
    public void setPriceProduct (int priceProduct)
    {
        if (priceProduct < 0)
        {
            System.out.println("Price can't be negative");    
        }   
        else
        {
            this.priceProduct = priceProduct;
        }
    }

    public double getPriceOfProduct()
    {
        return priceProduct;
    }
    
    public void setAvailabilityInStock(boolean availabilityInStock)
    {
        this.availabilityInStock = availabilityInStock;
    }
    
    public boolean getAvailbilityInStock()
    {
        return availabilityInStock;
    }

    public void printAboutObject()
    {
        System.out.println(nameOfProduct);
        System.out.println(priceProduct);
        System.out.println(availabilityInStock);
    }
}
