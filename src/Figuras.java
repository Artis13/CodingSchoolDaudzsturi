public class Figuras {

    public int cetrsturisLaukums(int mala1,int mala2)
    {
        return mala1*mala2;
    }
    public int cetrsturisPerimetrs(int mala1,int mala2)
    {
        return (mala1+mala2)*2;
    }
    public int kvadratsLaukums(int mala1)
    {
        return mala1*mala1;
    }
    public int kvadratsPerimetrs(int mala1)
    {
        return mala1*4;
    }
    public double trijsturaLaukums(int mala1,int mala2,int mala3)
    {
        double p = ((double)mala1+mala2+mala3)/2;
        double rez = Math.sqrt(p * (p-mala1)* (p-mala2)* (p-mala2));
        return rez;
    }
    public int trijsturaPerimetrs(int mala1,int mala2, int mala3)
    {
        return mala1+mala2+mala3;
    }


}
