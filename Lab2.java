package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] DaysWeek = {"Mo", "Tu", "We", "Th", "Fr", "Sa", "Su"};
        int[] DaysNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        System.out.print("Введите номер дня недели, с которого будет начинаться неделя: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int poz = 0;

        if (a == 0) {           //Неделя начинается с понедельника
            poz = 2;
            System.out.println("January.");
            for (int i = 0; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
            }
            System.out.println();
            System.out.print("      ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 5;
            System.out.println("February.");
            for (int i = 0; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
            }
            System.out.println();
            System.out.print("               ");

            for (int i = 0; i < 29; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 6;
            System.out.println("March.");
            for (int i = 0; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
            }
            System.out.println();
            System.out.print("                  ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 2;
            System.out.println("April.");
            for (int i = 0; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
            }
            System.out.println();
            System.out.print("      ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 4;
            System.out.println("May.");
            for (int i = 0; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
            }
            System.out.println();
            System.out.print("            ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 0;
            System.out.println("June.");
            for (int i = 0; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
            }
            System.out.println();

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 2;
            System.out.println("July.");
            for (int i = 0; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
            }
            System.out.println();
            System.out.print("      ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 5;
            System.out.println("August.");
            for (int i = 0; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
            }
            System.out.println();
            System.out.print("               ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 1;
            System.out.println("September.");
            for (int i = 0; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
            }
            System.out.println();
            System.out.print("   ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 3;
            System.out.println("October.");
            for (int i = 0; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
            }
            System.out.println();
            System.out.print("         ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 6;
            System.out.println("November.");
            for (int i = 0; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
            }
            System.out.println();
            System.out.print("                  ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 1;
            System.out.println("December.");
            for (int i = 0; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
            }
            System.out.println();
            System.out.print("   ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
        } else if (a == 1) {            //Неделя начинается со вторника
            poz = 1;
            System.out.println("January.");
            for (int i = 1; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                    break;
                }
            }
            System.out.println();
            System.out.print("   ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 4;
            System.out.println("February.");
            for (int i = 1; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                    break;
                }
            }
            System.out.println();
            System.out.print("            ");

            for (int i = 0; i < 29; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 5;
            System.out.println("March.");
            for (int i = 1; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                    break;
                }
            }
            System.out.println();
            System.out.print("               ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 1;
            System.out.println("April.");
            for (int i = 1; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                    break;
                }
            }
            System.out.println();
            System.out.print("   ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 3;
            System.out.println("May.");
            for (int i = 1; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                    break;
                }
            }
            System.out.println();
            System.out.print("         ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 6;
            System.out.println("June.");
            for (int i = 1; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                    break;
                }
            }
            System.out.println();
            System.out.print("                  ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 1;
            System.out.println("July.");
            for (int i = 1; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                    break;
                }
            }
            System.out.println();
            System.out.print("   ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 4;
            System.out.println("August.");
            for (int i = 1; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                    break;
                }
            }
            System.out.println();
            System.out.print("            ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 0;
            System.out.println("September.");
            for (int i = 1; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                    break;
                }
            }
            System.out.println();

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 2;
            System.out.println("October.");
            for (int i = 1; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                    break;
                }
            }
            System.out.println();
            System.out.print("      ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 5;
            System.out.println("November.");
            for (int i = 1; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                    break;
                }
            }
            System.out.println();
            System.out.print("               ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 0;
            System.out.println("December.");
            for (int i = 1; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                    break;
                }
            }
            System.out.println();

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
        } else if (a == 2) {            //Неделя начинается со среды
            poz = 0;
            System.out.println("January.");
            for (int i = 2; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 1) break;
            }
            System.out.println();

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 3;
            System.out.println("February.");
            for (int i = 2; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 1) break;
            }
            System.out.println();
            System.out.print("         ");

            for (int i = 0; i < 29; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 4;
            System.out.println("March.");
            for (int i = 2; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 1) break;
            }
            System.out.println();
            System.out.print("            ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 0;
            System.out.println("April.");
            for (int i = 2; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 1) break;
            }
            System.out.println();

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 2;
            System.out.println("May.");
            for (int i = 2; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 1) break;
            }
            System.out.println();
            System.out.print("      ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 5;
            System.out.println("June.");
            for (int i = 2; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 1) break;
            }
            System.out.println();
            System.out.print("               ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 0;
            System.out.println("July.");
            for (int i = 2; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 1) break;
            }
            System.out.println();

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 3;
            System.out.println("August.");
            for (int i = 2; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 1) break;
            }
            System.out.println();
            System.out.print("         ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 6;
            System.out.println("September.");
            for (int i = 2; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 1) break;
            }
            System.out.println();
            System.out.print("                  ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 1;
            System.out.println("October.");
            for (int i = 2; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 1) break;
            }
            System.out.println();
            System.out.print("   ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 4;
            System.out.println("November.");
            for (int i = 2; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 1) break;
            }
            System.out.println();
            System.out.print("            ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 6;
            System.out.println("December.");
            for (int i = 2; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 1) break;
            }
            System.out.println();
            System.out.print("                  ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
        } else if (a == 3) {            //Неделя начинается с четверга
            poz = 6;
            System.out.println("January.");
            for (int i = 3; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 2) break;
            }
            System.out.println();
            System.out.print("                  ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 2;
            System.out.println("February.");
            for (int i = 3; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 2) break;
            }
            System.out.println();
            System.out.print("      ");

            for (int i = 0; i < 29; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 3;
            System.out.println("March.");
            for (int i = 3; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 2) break;
            }
            System.out.println();
            System.out.print("         ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 6;
            System.out.println("April.");
            for (int i = 3; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 2) break;
            }
            System.out.println();
            System.out.print("                  ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 1;
            System.out.println("May.");
            for (int i = 3; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 2) break;
            }
            System.out.println();
            System.out.print("   ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 4;
            System.out.println("June.");
            for (int i = 3; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 2) break;
            }
            System.out.println();
            System.out.print("            ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 6;
            System.out.println("July.");
            for (int i = 3; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 2) break;
            }
            System.out.println();
            System.out.print("                  ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 2;
            System.out.println("August.");
            for (int i = 3; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 2) break;
            }
            System.out.println();
            System.out.print("      ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 5;
            System.out.println("September.");
            for (int i = 3; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 2) break;
            }
            System.out.println();
            System.out.print("               ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 0;
            System.out.println("October.");
            for (int i = 3; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 2) break;
            }
            System.out.println();

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 3;
            System.out.println("November.");
            for (int i = 3; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 2) break;
            }
            System.out.println();
            System.out.print("         ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 5;
            System.out.println("December.");
            for (int i = 3; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 2) break;
            }
            System.out.println();
            System.out.print("               ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
        } else if (a == 4) {            //Неделя начинается с пятницы
            poz = 5;
            System.out.println("January.");
            for (int i = 4; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 3) break;
            }
            System.out.println();
            System.out.print("               ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 1;
            System.out.println("February.");
            for (int i = 4; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 3) break;
            }
            System.out.println();
            System.out.print("   ");

            for (int i = 0; i < 29; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 2;
            System.out.println("March.");
            for (int i = 4; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 3) break;
            }
            System.out.println();
            System.out.print("      ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 5;
            System.out.println("April.");
            for (int i = 4; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 3) break;
            }
            System.out.println();
            System.out.print("               ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 0;
            System.out.println("May.");
            for (int i = 4; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 3) break;
            }
            System.out.println();

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 3;
            System.out.println("June.");
            for (int i = 4; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 3) break;
            }
            System.out.println();
            System.out.print("         ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 5;
            System.out.println("July.");
            for (int i = 4; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 3) break;
            }
            System.out.println();
            System.out.print("               ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 1;
            System.out.println("August.");
            for (int i = 4; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 3) break;
            }
            System.out.println();
            System.out.print("   ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 4;
            System.out.println("September.");
            for (int i = 4; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 3) break;
            }
            System.out.println();
            System.out.print("            ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 6;
            System.out.println("October.");
            for (int i = 4; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 3) break;
            }
            System.out.println();
            System.out.print("                  ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 2;
            System.out.println("November.");
            for (int i = 4; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 3) break;
            }
            System.out.println();
            System.out.print("      ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 4;
            System.out.println("December.");
            for (int i = 4; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 3) break;
            }
            System.out.println();
            System.out.print("            ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
        } else if (a == 5) {            //Неделя начинается с субботы
            poz = 4;
            System.out.println("January.");
            for (int i = 5; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 4) break;
            }
            System.out.println();
            System.out.print("            ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 0;
            System.out.println("February.");
            for (int i = 5; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 4) break;
            }
            System.out.println();

            for (int i = 0; i < 29; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 1;
            System.out.println("March.");
            for (int i = 5; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 4) break;
            }
            System.out.println();
            System.out.print("   ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 4;
            System.out.println("April.");
            for (int i = 5; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 4) break;
            }
            System.out.println();
            System.out.print("            ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 6;
            System.out.println("May.");
            for (int i = 5; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 4) break;
            }
            System.out.println();
            System.out.print("                  ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 2;
            System.out.println("June.");
            for (int i = 5; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 4) break;
            }
            System.out.println();
            System.out.print("      ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 4;
            System.out.println("July.");
            for (int i = 5; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 4) break;
            }
            System.out.println();
            System.out.print("            ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 0;
            System.out.println("August.");
            for (int i = 5; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 4) break;
            }
            System.out.println();

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 3;
            System.out.println("September.");
            for (int i = 5; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 4) break;
            }
            System.out.println();
            System.out.print("         ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 5;
            System.out.println("October.");
            for (int i = 5; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 4) break;
            }
            System.out.println();
            System.out.print("               ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 1;
            System.out.println("November.");
            for (int i = 5; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 4) break;
            }
            System.out.println();
            System.out.print("   ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 3;
            System.out.println("December.");
            for (int i = 5; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 4) break;
            }
            System.out.println();
            System.out.print("         ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
        } else if (a == 6) {            //Неделя начинается с воскресенья
            poz = 3;
            System.out.println("January.");
            for (int i = 6; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 5) break;
            }
            System.out.println();
            System.out.print("         ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 6;
            System.out.println("February.");
            for (int i = 6; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 5) break;
            }
            System.out.println();
            System.out.print("                  ");

            for (int i = 0; i < 29; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 0;
            System.out.println("March.");
            for (int i = 6; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 5) break;
            }
            System.out.println();

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 3;
            System.out.println("April.");
            for (int i = 6; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 5) break;
            }
            System.out.println();
            System.out.print("         ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 5;
            System.out.println("May.");
            for (int i = 6; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 5) break;
            }
            System.out.println();
            System.out.print("               ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 1;
            System.out.println("June.");
            for (int i = 6; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 5) break;
            }
            System.out.println();
            System.out.print("   ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 3;
            System.out.println("July.");
            for (int i = 6; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 5) break;
            }
            System.out.println();
            System.out.print("         ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 6;
            System.out.println("August.");
            for (int i = 6; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 5) break;
            }
            System.out.println();
            System.out.print("                  ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 2;
            System.out.println("September.");
            for (int i = 6; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 5) break;
            }
            System.out.println();
            System.out.print("      ");

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 4;
            System.out.println("October.");
            for (int i = 6; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 5) break;
            }
            System.out.println();
            System.out.print("            ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 0;
            System.out.println("November.");
            for (int i = 6; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 5) break;
            }
            System.out.println();

            for (int i = 0; i < 30; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
            System.out.println();
            System.out.println();

            poz = 2;
            System.out.println("December.");
            for (int i = 6; i < 7; i++) {
                System.out.print(DaysWeek[i] + " ");
                if (i == 6) {
                    i = 0;
                    System.out.print(DaysWeek[i] + " ");
                }
                if (i == 5) break;
            }
            System.out.println();
            System.out.print("      ");

            for (int i = 0; i < 31; i++) {
                if (poz == 7) {
                    System.out.println();
                    poz = 0;
                }
                if (DaysNumber[i] < 10) {
                    System.out.print(" " + DaysNumber[i] + " ");
                    poz++;
                }
                if (DaysNumber[i] >= 10) {
                    System.out.print(DaysNumber[i] + " ");
                    poz++;
                }
            }
        }
    }
}
