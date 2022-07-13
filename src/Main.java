public class Main {
    public static void main(String[] args) {
        // Задание 1
     byte a = 10;
     short b = 18;
     int c = 188;
     long d = 45L;
     float airTemperature = 32.3f;
     double waterTemperature = 25.2;
     boolean hotWater = waterTemperature > 20;
     System.out.println (hotWater);
     char e = 86;
     System.out.println(e);

// Задание 2
     double weightBoxer1 = 78.2;
     double weightBoxer2 = 82.7;
     double weightTotalTwoBoxer = weightBoxer1 + weightBoxer2;
     double weightDifferenceTwoBoxer = weightBoxer2 - weightBoxer1;
     System.out.println ("Общий вес двух боксеров " + weightTotalTwoBoxer + "кг");
     System.out.println ("Разница в весе двух боксеров " + weightDifferenceTwoBoxer + "кг");

     // Задание 3
     byte bananas = 5;
     byte weightOneBanana = 80;
     int weightTotalBananas = bananas * weightOneBanana;
     short milk = 200;
     byte weight100mlMilk = 105;
     int weightTotalMilk = milk / 100 * weight100mlMilk;
     byte iceCream = 2;
     byte weightOneBriquetteIceCream = 100;
     int weightTotalIceCream = iceCream * weightOneBriquetteIceCream;
     byte eggs = 4;
     byte weightOneEgg = 70;
     int weightTotalEggs = eggs * weightOneEgg;
     int weightSportCocktail = weightTotalBananas + weightTotalMilk + weightTotalIceCream +weightTotalEggs;
     double weightSportCocktailKg = weightSportCocktail / 1000;
     System.out.println ("Общий вес спортивного затрака состовляет = " + weightSportCocktailKg + "кг");

     // Задача 4
     byte needToLoseWeight = 7;
     int needToLoseWeightKg = needToLoseWeight * 1000;
     short loseWeightFirstOption = 250;
     short loseWeightSecondOption = 500;
     int dayOfFirstOption = needToLoseWeightKg / loseWeightFirstOption;
     int dayOfSecondOption = needToLoseWeightKg / loseWeightSecondOption;
     System.out.println ("При использование первого варианта похудения, потребуется = " + dayOfFirstOption + " дней");
     System.out.println ("При использование второго варианта похудения, потребуется = " + dayOfSecondOption + " дней");

     //Задача 5
     int wageMaria = 67760;
     int wageDenis = 83690;
     int wageKristina = 76230;
     int salaryIncrease = 10;
     byte numberOfSalariesPerYear = 12;
     int salaryForTheYearBeforeTheIncreaseMaria = wageMaria * numberOfSalariesPerYear;
     int salaryForTheYearBeforeTheIncreaseDenis = wageDenis * numberOfSalariesPerYear;
     int salaryForTheYearBeforeTheIncreaseKristina = wageKristina * numberOfSalariesPerYear;
     int salaryAfterPromotionMaria = wageMaria /  salaryIncrease + wageMaria;
     int salaryAfterPromotionDenis = wageDenis  /  salaryIncrease + wageDenis;
     int salaryAfterPromotionKristina = wageKristina / salaryIncrease + wageKristina;
     int salaryForTheYearAfterTheIncreaseMaria = salaryAfterPromotionMaria * numberOfSalariesPerYear;
     int salaryForTheYearAfterTheIncreaseDenis = salaryAfterPromotionDenis * numberOfSalariesPerYear;
     int salaryForTheYearAfterTheIncreaseKristina = salaryAfterPromotionKristina *numberOfSalariesPerYear;
     int annualSalaryDifferenceMaria = salaryForTheYearAfterTheIncreaseMaria - salaryForTheYearBeforeTheIncreaseMaria;
     int annualSalaryDifferenceDenis = salaryForTheYearAfterTheIncreaseDenis - salaryForTheYearBeforeTheIncreaseDenis;
     int annualSalaryDifferenceKristina = salaryForTheYearAfterTheIncreaseKristina - salaryForTheYearBeforeTheIncreaseKristina;
     System.out.println ("Заработная плата Марии с учетов повышения составила = " + salaryAfterPromotionMaria + " рублей в месяц");
     System.out.println ("Разница зарплаты Марии после повышения составила = " + annualSalaryDifferenceMaria + " рублей в год");
     System.out.println ("Заработная плата Дениса с учетов повышения составила = " + salaryAfterPromotionDenis + " рублей в месяц");
     System.out.println ("Разница зарплаты Дениса после повышения составила = " + annualSalaryDifferenceDenis + " рублей в год");
     System.out.println ("Заработная плата Кристины с учетов повышения составила = " + salaryAfterPromotionKristina + " рублей в месяц");
     System.out.println ("Разница зарплаты Кристины после повышения составила = " + annualSalaryDifferenceKristina + " рублей в год");

    }
}