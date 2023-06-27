package ru.geekbrains.lesson6.srp2;

public class Program {


    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("Николай", "Apple", 2, 10);
        order.inputFromConsole();
        Saver saver = new Saver("", "", 0, 0);
        saver.saveToJson();


    }

}
