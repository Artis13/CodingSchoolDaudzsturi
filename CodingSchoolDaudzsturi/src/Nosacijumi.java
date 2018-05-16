public class Nosacijumi {

   public double Laukums;
   public double Perimetrs;

   public void Laukums(){
       System.out.println("Laukums ir : " + Laukums);
   }
   public void Perimetrs(){
       System.out.println("Perimetrs ir : " + Perimetrs);
   }
   public static void CalculateAreaAndPerimeter(Nosacijumi x){
       x.Laukums();
       x.Perimetrs();
   }
}