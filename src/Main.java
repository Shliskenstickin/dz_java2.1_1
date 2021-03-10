public class Main {
    public static int bonus (int price){
        int bonusCoefficient = 20;
        int bonusMiles = price / bonusCoefficient;
        return bonusMiles;
    }
    public static void main (String[] args){
        System.out.println("Поздравляем! Вам начисленно " + bonus(23530) + " бонусных миль");
    }
}