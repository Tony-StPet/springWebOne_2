
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа");
        Scanner reader = new Scanner(System.in);
        int garrikHit, lariHit, garrikMiss, lariMiss, targetAmount;
        garrikHit = reader.nextInt();
        lariHit = reader.nextInt();
        targetAmount = garrikHit + lariHit -1;
        garrikMiss = targetAmount - garrikHit; // =  lariHit -1
        lariMiss = targetAmount - lariHit;
        System.out.println(garrikMiss + " " + lariMiss);
        }
    }
