public class BuratinaAndApples {

    public static void main(String[] args) {
        final int amountApplesBuratina = 15;
        System.out.println("Количество яблок у Буратины: " + amountApplesBuratina);

        final int karabasBarabasTookApplesFromBuratina = 3;
        System.out.println("Карабас Барабас отобрал у Буратины " + karabasBarabasTookApplesFromBuratina + " яблока");

        final int leftApplesBuratina = amountApplesBuratina - karabasBarabasTookApplesFromBuratina;
        System.out.println("У Буратины осталось " + leftApplesBuratina + " яблок");

    }

}
