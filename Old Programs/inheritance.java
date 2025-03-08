class Aeroplane
{
    public void fly()
    {
        System.out.println("Aeropalne flies at specific height....");
    }
    public void carry()
    {
        System.out.println("Aeroplane carry passenger...");
    }
}
class cargoplane extends Aeroplane
{

}
public class inheritance {
    public static void main(String[] args) {
       Aeroplane obj = new cargoplane();
       obj.fly();
       obj.carry();
    }
}
