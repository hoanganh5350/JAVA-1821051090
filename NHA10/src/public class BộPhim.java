public class BộPhim
{
    private String TênPhim;
    private int NămSảnXuất;
    private double GíaVé;
    private int SốLượngVé;
 
    public BộPhim()
    {
     
    }
    public BộPhim(String TênPhim,int NămSảnXuất,double GíaVé,int SốLượngVé)
    {
        this.TênPhim=TênPhim;
        this.NămSảnXuất=NămSảnXuất;
        this.GíaVé=GíaVé;
        this.SốLượngVé=SốLượngVé;
    }
    public void nhapThongTin() throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ten phim: ");
        this.TênPhim=sc.nextLine();
        System.out.print("Nhap nam san xuat :");
        this.NămSảnXuất=sc.nextLine();
        System.out.print("Nhap gia ve: ");
        this.GíaVé=sc.nextLine();
        System.out.print("Nhap so luong ve: ");
        this.SốLượngVé=sc.nextLine();
    }
    public void hienThongTin()
    {
        System.out.println("Ten phim: "+this.TênPhim);
        System.out.println("Nam san xuat: "+this.NămSảnXuất);
        System.out.println("Gia ve : "+this.GíaVé);
        if(SốLượngVé >= 1){
            System.out.println("So luong ve : còn vé");
        }else{
            System.out.println("So luong ve : hết vé");
        }
    }
 
    public String getTênPhim()
    {
        return this.TênPhim;
    }
    public String getNămSảnXuất()
    {
        return this.NămSảnXuất;
    }
    public String getGíaVé()
    {
        return this.GíaVé;
    }
    public String getSốLượngVé()
    {
        return this.SốLượngVé;
    }
}