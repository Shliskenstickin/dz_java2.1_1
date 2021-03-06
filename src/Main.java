public class Main {
    public static void main (String[] args){
        int price = 23530;
        int bonusCoefficient = 20;
        int bonusMiles = price / bonusCoefficient;
        System.out.println("Поздравляем! Вам начисленно " + bonusMiles + " бонусных миль");
    }
}