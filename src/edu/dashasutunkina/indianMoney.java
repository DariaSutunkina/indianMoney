package edu.dashasutunkina;

public class indianMoney {
        public static void main(String[] args) {
            double money = 24;
            System.out.println(indianMoney(money));
        }
        public static double indianMoney(double money) {
            int year = 2023-1626;
            for (int i = 0; i <year ; i++) {
                double profit = money * 0.05;
                money += profit;

            }
            return money;
        }
    }

