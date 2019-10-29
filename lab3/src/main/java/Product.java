
public class Product{
    private String shop;
    private String address;
    private String code;
    private String product;
    private int number;
    private double price;
    private double sum;
    
    public Product(){
        this.shop="";
        this.address="";
        this.code="";
        this.product="";
        this.number=0;
        this.price=0;
        this.sum=0;
    };
    
    public Product(String shop, String address, String code, String product, int number, double price){
        this.shop=shop;
        this.address=address;
        this.code=code;
        this.product=product;
        this.number=number;
        this.price=price;
        this.sum=price*number;
    }
    
    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number<0)number = 0;
        this.number = number;
        sum = price*number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0)price = 0;
        this.price = price;
        sum = price*number;
    }

    public double getSum() {
        return sum;
    }
}
    