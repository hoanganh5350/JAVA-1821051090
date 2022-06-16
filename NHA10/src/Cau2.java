public class Product
{
    private String ProductName;
    private String ProductID;
    private String UnitPrice;
 
    public Product()
    {
     
    }
    public Product(String ProductName,String ProductID,String UnitPrice)
    {
        this.ProductName=ProductName;
        this.ProductID=ProductID;
        this.UnitPrice=UnitPrice;
    }
    public void nhapThongTin() throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        this.ProductName=sc.nextLine();
        System.out.print("Nhap ma san pham :");
        this.ProductID=sc.nextLine();
        System.out.print("Nhap don gia: ");
        this.UnitPrice=sc.nextLine();
    }
    public void hienThongTin()
    {
        System.out.println("Ten san pham: "+this.ProductName);
        System.out.println("Ma san pham: "+this.ProductID);
        System.out.println("Gia tri san pham : "+this.UnitPrice);
    }
 
    public String getProductName()
    {
        return this.ProductName;
    }
    public String getProductID()
    {
        return this.ProductID;
    }
    public String getUnitPrice()
    {
        return this.UnitPrice;
    }
}