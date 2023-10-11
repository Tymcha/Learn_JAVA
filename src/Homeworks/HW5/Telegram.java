package Homeworks.HW5;

public class Telegram implements Massenger{

    @Override
    public void sendMessage() {
        System.out.println("Send massege from Telegram");
    }

    @Override
    public void getMessage() {
        System.out.println("Get massege to Telegram");
    }
}
