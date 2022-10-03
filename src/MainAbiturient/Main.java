package MainAbiturient;

import java.util.Arrays;
import Abiturient.Abiturient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Abiturient[] ab = createAb();
        printListOfAbiturients(ab);
        PrintListOfGivenNames(ab);
        AbiturientsWithHigherMarks(ab);
        AbiturientsWithTheHighestMarks(ab);
        AverageMark(ab);
    }

    /**
     * Метод, який виводить список абітурієнтів із вказаним іменем
     * @param ab масив об'єктів класу Abiturient
     */
    public static void PrintListOfGivenNames(Abiturient[] ab){
        System.out.println("\na) список абітурієнтів із вказаним іменем");
        System.out.print("Введіть ім'я: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (Abiturient a : ab){
            if(a.getName().equals(name)){
                System.out.println(a);
            }
        }
    }

    /**
     * Метод, який виводить список абітурієнтів, середній бал у яких вище заданого
     * @param ab масив об'єктів класу Abiturient
     */
    public static void AbiturientsWithHigherMarks(Abiturient[] ab){
        System.out.println("\nb) список абітурієнтів, середній бал у яких вище заданого");
        System.out.print("Введіть бал: ");
        Scanner scanner = new Scanner(System.in);
        double mark = scanner.nextDouble();
        for (Abiturient a : ab){
            if(a.getMark() > mark){
                System.out.println(a);
            }
        }
    }

    /**
     * Метод, який виводить n абітурієнтів, що мають найвищий середній бал
     * @param ab масив об'єктів класу Abiturient
     */
    public static void AbiturientsWithTheHighestMarks(Abiturient[] ab){
        System.out.println("\nc) Абітурієнти, що мають найвищий середній бал");
        System.out.print("Введіть кількість абітурієнтів: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Arrays.sort(ab, Main::compare);
        for(int i = 0; i < n; i++){
            System.out.println(ab[i]);
        }
    }

    /**
     * Метод, який виводить список абітурієнтів, які отримають стипендію
     * @param ab масив об'єктів класу Abiturient
     */
    public static void AverageMark(Abiturient[] ab){
        double marks = 0.0;
        double av;
        System.out.println("Абітурієнти, які отримають стипендію: ");
        for (Abiturient a : ab){
            marks += a.getMark();
        }
        av = marks/ab.length;
        for (Abiturient a : ab){
            if(a.getMark() > av){
                System.out.println(a);
            }
        }
    }

    /**
     * Метод для порівняння середньої оцінки абітурієнта
     * @param a об'єкт класу Abiturient
     * @param b об'єкт класу Abiturient
     * @return -1, якщо сер.бал першого абітурієнта більший за сер.бал другого<p>
     * 0, якщо сер.бали рівні<p>
     * 1, якщо сер.бал першого абітурієнта менший за сер.бал другого<p>
     */
    public static int compare(Abiturient a, Abiturient b) {
        if ( a.getMark() > b.getMark() ) return -1;
        else if ( a.getMark() == b.getMark()) return 0;
        return 1;
    }

    /**
     * Метод, який виводить всі елементи масиву
     * @param ab масив об'єктів класу Abiturient
     */
    public static void printListOfAbiturients(Abiturient[] ab){
        System.out.println("Список всіх абітурієнтів: ");
        for(Abiturient abiturient : ab){
            System.out.println(abiturient);
        }
    }

    /**
     * Метод, який заповнює масив об'єктами
     * @return масив об'єктів типу Abiturient
     */
    public static Abiturient[] createAb(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть кількість елементів масиву: ");
        Abiturient[] arr = new Abiturient[scan.nextInt()];
        for (int i = 0; i < arr.length; i++){
            Abiturient ab = inputData();
            arr[i] = ab;
            System.out.println(" ");
        }
        return arr;
    }


    /**
     * Метод створення об'єкту типу Abiturient
     * @return об'єкт типу Abiturient
     */
    public static Abiturient inputData(){
        Scanner scan = new Scanner(System.in);
        Abiturient ab = new Abiturient();

        System.out.print("Введіть id абітурієнта: ");
        ab.setId(scan.nextInt());
        scan.nextLine();
        System.out.print("Введіть прізвище абітурієнта: ");
        ab.setSurname(scan.nextLine());

        System.out.print("Введіть ім'я абітурієнта: ");
        ab.setName(scan.nextLine());

        System.out.print("Введіть по батькові абітурієнта: ");
        ab.setPatronymic(scan.nextLine());

        System.out.print("Введіть адресу абітурієнта: ");
        ab.setAddress(scan.nextLine());

        System.out.print("Введіть телефон абітурієнта: ");
        ab.setPhone(scan.nextLine());

        System.out.print("Введіть середній бал абітурієнта: ");
        ab.setMark(scan.nextDouble());
        return ab;
    }
}



