import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        git
        Scanner scanner = new Scanner(System.in);
        Figuras fig = new Figuras();
        System.out.println("Kādai figūrai vēlaties aprēķināt laukumu un perimetru? "
         + "k - kvadrats, t - trijsturis , c - cetrsturis");
        String atbilde = scanner.next();

        if(atbilde.equals("k")){
            System.out.println("Ievadiet malas garumu ");
            int x = scanner.nextInt();
            System.out.println("Perimetrs ir : " + fig.kvadratsPerimetrs(x));
            System.out.println("Laukums ir : " + fig.kvadratsLaukums(x));
        }
        else if(atbilde.equals("t")){
            System.out.println("Ievadiet 3 malu garumu ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            System.out.println("Perimetrs ir : " + fig.trijsturaPerimetrs(x,y,z));
            System.out.println("Laukums ir : " + fig.trijsturaLaukums(x,y,z));
        }
        else if(atbilde.equals("c")){
            System.out.println("Ievadiet abu malu garumus ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println("Perimetrs ir : " + fig.cetrsturisPerimetrs(x,y));
            System.out.println("Laukums ir : " + fig.cetrsturisLaukums(x,y));
        }
        else {
            System.out.println("Figura netika atrasta ");
        }
    }
}
