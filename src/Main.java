import java.util.Scanner;
import java.util.ArrayList;
import Burger.BasicBurger;
import Burger.LuxBurger;
import Burger.Sides;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double orderPrice = 0;

        ArrayList<String> burgers = new ArrayList<String>();
        ArrayList <String> order = new ArrayList<String>();

        BasicBurger juustuBurger = new BasicBurger("juustuBurger");
        BasicBurger kanaBurger = new BasicBurger("kanaBurger");
        LuxBurger megaBurger = new LuxBurger("megaBurger");

        burgers.add(juustuBurger.getName());
        burgers.add(kanaBurger.getName());
        burgers.add(megaBurger.getName());

        String cont = "";

        while (true) {

            ArrayList<String> sides = new ArrayList<String>();
            System.out.println("Palun sisesta burgeri lisandid (peekon / juust / tomat)." +
                    " Kui oled valiku teinud, vajuta ENTER: ");
            String side = input.nextLine();

            while (!side.isBlank()) {
                sides.add(side);
                side = input.nextLine();
            }


            System.out.println("Täna menüüs: " + burgers);



            if (!sides.isEmpty() && sides.size() <= 4) {

                Sides sideCombo = new Sides(sides);
                System.out.print("Vali burger: ");
                String burgerOrder = input.nextLine();

                if (burgerOrder.equals("juustuBurger")) {

                    kanaBurger.burgerOrder(sideCombo);
                    orderPrice += kanaBurger.getPrice();
                    order.add(kanaBurger.toString());
                    System.out.println("Jätka? Vajuta ENTER, et jätkata tellimist. Kirjuta 'ei' kui oled tellimise lõpetanud: ");
                    cont = input.nextLine();


                } else if (burgerOrder.equals("kanaBurger")) {

                    juustuBurger.burgerOrder(sideCombo);
                    orderPrice += juustuBurger.getPrice();
                    order.add(juustuBurger.toString());
                    System.out.println("Jätka? Vajuta ENTER, et jätkata tellimist. Kirjuta 'ei' kui oled tellimise lõpetanud: ");
                    cont = input.nextLine();

                } else if (burgerOrder.equals("megaBurger")) {

                    megaBurger.orderLuxBurger(sideCombo);
                    orderPrice += megaBurger.getPrice();
                    order.add(megaBurger.toString());
                    System.out.println("Jätka? Vajuta ENTER, et jätkata tellimist. Kirjuta 'ei' kui oled tellimise lõpetanud: ");
                    cont = input.nextLine();

                } else {

                    System.out.println("Sellist burgerit kajuks menüüs pole");
                    System.out.println("Jätka? Vajuta ENTER, et jätkata tellimist. Kirjuta 'ei' kui oled tellimise lõpetanud: ");
                    cont = input.nextLine();
                }

            } else {

                Sides sideCombo = new Sides();
                System.out.println("Sisesta soovitud burgeri nimi: ");
                String burgerOrder = input.nextLine();

                if (burgerOrder.equals("juustuBurger")) {

                    kanaBurger.burgerOrder(sideCombo);
                    orderPrice += kanaBurger.getPrice();
                    order.add(kanaBurger.toString());
                    System.out.println("Jätka? Vajuta ENTER, et jätkata tellimist. Kirjuta 'ei' kui oled tellimise lõpetanud: ");
                    cont = input.nextLine();
                    

                } else if (burgerOrder.equals("kanaBurger")) {

                    juustuBurger.burgerOrder(sideCombo);
                    orderPrice += juustuBurger.getPrice();
                    order.add(juustuBurger.toString());
                    System.out.println("Jätka? Vajuta ENTER, et jätkata tellimist. Kirjuta 'ei' kui oled tellimise lõpetanud: ");
                    cont = input.nextLine();

                } else if (burgerOrder.equals("megaBurger")) {

                    megaBurger.orderLuxBurger(sideCombo);
                    orderPrice += megaBurger.getPrice();
                    order.add(megaBurger.toString());
                    System.out.println("Jätka? Vajuta ENTER, et jätkata tellimist. Kirjuta 'ei' kui oled tellimise lõpetanud: ");
                    cont = input.nextLine();

                } else {

                    System.out.println("Sellist burgerit kajuks menüüs pole");
                    System.out.println("Jätka? Vajuta ENTER, et jätkata tellimist. Kirjuta 'ei' kui oled tellimise lõpetanud: ");
                    cont = input.nextLine();

                }
            }

            if (cont.equals("ei") || (cont.equals("n"))) {
                break;
            }

        }
        System.out.println("Tellimus sisaldab: " + "\n" + order);
        System.out.println("Tellimuse maksumus: " + orderPrice + "€");
    }
}