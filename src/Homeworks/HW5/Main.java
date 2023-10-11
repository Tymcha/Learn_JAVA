package Homeworks.HW5;

public class Main {
    public static void main(String[] args) {

        Massenger[] massenger = new Massenger[2];
        massenger[0] = new Telegram();
        massenger[1] = new Viber();

        for(Massenger massenger1 : massenger){
            massenger1.getMessage();
            massenger1.sendMessage();
        }

    }

}
