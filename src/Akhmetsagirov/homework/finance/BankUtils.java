package Akhmetsagirov.homework.finance;

public class BankUtils {

    public static int finalAge = 60;

    public static String deposit(){
        String name = "Диана";
        int startAge = 20;
        int amount = 50_000;
        double rate = 0.034;
        int years = finalAge - startAge;

        double deposit = (amount * rate) * years;
        String result = String.format("%.2f",deposit);
        return "Сумма которую получит" + " " + name + " " + "к концу периода вклада: " + result;
    }
}

