
public class Main {

    public static void main(String[] args){

       Figuras f = new Figuras(5);
       f.Laukums();
       f.Perimetrs();

        Taisnsturis tai = new Taisnsturis(4,5);
        tai.Laukums();
        tai.Perimetrs();

        Trijsturis tri = new Trijsturis(3,4,5);
        tri.Laukums();
        tri.Perimetrs();

        Nosacijumi.CalculateAreaAndPerimeter(f);
        Nosacijumi.CalculateAreaAndPerimeter(tai);
        Nosacijumi.CalculateAreaAndPerimeter(tri);
    }
}
