
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author НАТАЛИ
 */
public class ProductBaseLoader {
    static public boolean save(ProductBase pb,String file){
            
            try(FileWriter writer = new FileWriter(file, false))
            {
                for(Product pr : pb.getGoods()){               
                writer.write(pr.getAddress());
                writer.append('\n');
                writer.write(pr.getCode());
                writer.append('\n');
                writer.write(pr.getNumber());
                writer.append('\n');
                writer.write(pr.getProduct());
                writer.append('\n');
                writer.write(pr.getShop());
                writer.append('\n');
                writer.write(Double.toString(pr.getPrice()));
                writer.append('\n');
                writer.flush();
                }
            }
            catch(IOException ex){
                return false;
            } 
            return true;
        };
    static public boolean save(ProductBase pb){
            return save(pb, "File.txt");
        };
    static public boolean load(ProductBase pb, String file){
            pb.Clear();
            try(FileReader reader = new FileReader(file))
            {
                Scanner scan = new Scanner(reader);
                while(scan.hasNextLine()){
                    Product pr = new Product();
                pr.setAddress(scan.nextLine());
                pr.setCode(scan.nextLine());
                pr.setNumber(Integer.parseInt(scan.nextLine()));
                pr.setProduct(scan.nextLine());
                pr.setShop(scan.nextLine());
                pr.setPrice(Double.parseDouble(scan.nextLine()));
                reader.close();
                }
            }
            catch(IOException ex){
                return false;
            } 
            return true;
        };
    static public boolean load(ProductBase pb){
            return load(pb, "File.txt");
        };;
}
