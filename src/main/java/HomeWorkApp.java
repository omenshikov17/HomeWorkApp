public class HomeWorkApp {
    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 17;
        int b = 11;
        if(a + b >= 0){
            System.out.println("Сумма положительная");
        }
        if(a + b <= 0){
            System.out.println("Сума отрицательная");
        }
    }
    public static void printColor() {
        int value = 101;
        if (value <= 0){
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }
        else if (value >= 100){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 9;
        int b = 6;
        if (a >= b){
            System.out.println("a >= b");
        }
        else  {
            System.out.println("a < b");
        }
    }

}
