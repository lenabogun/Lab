import java.util.ArrayList;
import java.util.List;
    public class ProductBase {
        private List<Product> goods;
        public ProductBase(){
            goods=new ArrayList<Product>();
        }
        public void addProduct(Product pr){
            goods.add(pr);
        }
        public void delProductwithPrice(double price){
            int i = 0;
            while( i<goods.size())
            //for(Product pr : goods)
                if(goods.get(i).getPrice()==price){
                    goods.remove(i);
                    i--;
                }else i++;
        }
        public String getMinPriceAddr(String s){
            Product min = null;
            for(Product pr : goods)
                if(pr.getProduct().equals(s)){
                    min = pr;
                    break;
                }
            for(int i = 0; i < goods.size(); i++){
                if((goods.get(i).getPrice()<=min.getPrice())&&goods.get(i).getProduct().equals(s))
                    min = goods.get(i);
            }
            if(min != null)
                return min.getAddress();
            else
                return null;
        };
        public List<Product> getGoods(){
            return goods;
        };
        public double getsumProduct(String s){
            double sum = 0;
            for(Product pr : goods){
                if(pr.getProduct().equals(s))
                    sum+= pr.getSum();
            }
            return sum;
        };
        public int numberProducts(String s){
            int number = 0;
            for(Product pr : goods){
                if(pr.getProduct().equals(s))
                    number+= pr.getNumber();
            }
            return number;
        };
        public void Clear(){
            goods.clear();
        };
    }
