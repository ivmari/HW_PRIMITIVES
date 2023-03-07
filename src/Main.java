public class Main {
    public static void main(String[] args) {

        int price = 5000; // стоимость билета

        int numberofrublesforonebonusmile = 20; // количество рублей для одной бонусной мили

        System.out.println("Количество бонусных миль:");
        System.out.println((price / numberofrublesforonebonusmile) + " бонусных миль");
    }
}