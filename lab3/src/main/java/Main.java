import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ProductBase pb = new ProductBase();
        Scanner in = new Scanner(System.in);
        for(int i = 0;i < 10; i++){
            System.out.println("Продукт "+ (i+1));
            Product p;
            try{ 
                p = new Product(in.nextLine(),
                    in.nextLine(),
                    in.nextLine(),
                    in.nextLine(),
                    Integer.parseInt(in.nextLine()),
                    Double.parseDouble(in.nextLine())
                );
            }
            catch(Exception e){
                System.out.println(e);
                i-=1;
                continue;
            }
            pb.addProduct(p);
        }
        System.out.print("Количество продукта ");
        System.out.println(pb.numberProducts(in.nextLine()));
        System.out.print("Общая стоимость продукта ");
        System.out.println(pb.getsumProduct(in.nextLine()));
        System.out.print("Адресс самого дешевого продукта ");
        System.out.println(pb.getMinPriceAddr(in.nextLine()));
        
        while(true){
            System.out.println("удалить все машины со стоимостью ");
            try{
                pb.delProductwithPrice(Double.parseDouble(in.nextLine()));        
                break;
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
}
