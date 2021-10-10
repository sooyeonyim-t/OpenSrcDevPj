package OpenDevPj_2021.Chap05.Prac;
class TV{
    private int size;
    public TV(int size){
        this.size=size;
    }
    protected int getSize(){
        return size;
    }
}
class ColorTV extends TV{
    private int color;
    public ColorTV(int size, int color){
        super(size);
        this.color=color;
    }
    public void printProperty(){
        System.out.println(getSize()+"인치"+color+"컬러");
    }

}
class IPTV_02 extends ColorTV{
    private String adr;

    public IPTV_02(String adr, int size, int color){
        super(size,color);
        this.adr=adr;
    }
    public void printProperty(){
        System.out.print("나의 IPTV는 "+adr+"주소의 ");
        super.printProperty();
    }

    public static void main(String[] args) {
        IPTV_02 iptv_02 =new IPTV_02("192.1.1.2",32,2048);
        iptv_02.printProperty();
    }
}
