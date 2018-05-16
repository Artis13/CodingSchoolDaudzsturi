public class Trijsturis extends Nosacijumi {

    Trijsturis(int mala1,int mala2,int mala3){
        Perimetrs = mala1+mala2+mala3;
        double p = Perimetrs/2;
        Laukums = Math.sqrt(p*(p-mala1)*(p-mala2)*(p-mala3));
    }

}
