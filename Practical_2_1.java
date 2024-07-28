import java.util.Scanner;
class Microsoft{
    private float Product_no,Product_price;
    private String ProdductName,activation_key;
    public Microsoft(float Product_no,float Product_price,String ProductName,String activation_key)
    {
        this.Product_no=Product_no;
        this.ProdductName=ProductName;
        this.Product_price=Product_price;
        this.activation_key=activation_key;
    }
    public String getProdductName()
    {

        return ProdductName;
    }
    public float getProduct_no() {
        return Product_no;
    }
    public float getProduct_price() {

        return Product_price;
    }
    public String getActivation_key() {

        return activation_key;
    }
    public void setActivation_key(String activation_key) {
        this.activation_key = activation_key;
    }
    public void display()
    {
        System.out.println("Product NO: "+Product_no);
        System.out.println("Product name: "+ProdductName);
        System.out.println("Product Price: "+Product_price+"$");
        System.out.println("Activation key: "+ activation_key);
    }
}

public class Practical_2_1 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        Microsoft[] Products = new Microsoft[5];
        for(int i=0;i<Products.length;i++)
        {
            System.out.println("Enter Product name,Product no,Product price and activation key: ");
            String name= scan.nextLine();
            float no= scan.nextFloat();
            float price= scan.nextFloat();
            scan.nextLine();
            String key= scan.nextLine();
            Products[i]= new Microsoft(no,price,name,key);
            Products[i].setActivation_key(key);
        }
        System.out.println("Enter which Product you want to search by name or No: ");
        String search_name = scan.nextLine();
        for(int i=0;i<Products.length;i++)
        {
            float Product_no=Products[i].getProduct_no();
            if(Products[i].getProdductName().equals(search_name))
            {
                Products[i].display();
                break;
            }
            else if (Product_no == Float.parseFloat(search_name) )
            {
                Products[i].display();
                break;
            } else if (i==Products.length-1) {
                System.out.println("No such element exists");
            }
        }
    }
}