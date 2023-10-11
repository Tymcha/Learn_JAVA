package Homeworks.HW2;

public class Main {
    public static void main(String[] args) {
        String stringAll = "First,Second,Third,Fifth,Fourth,Sixth,Eighth,Seventh,Ninth";
        String[] stringArray = stringAll.split (",");
        String buff;

        buff = stringArray[3];
        stringArray[3] = stringArray[4];
        stringArray[4] = buff;

        buff = stringArray[6];
        stringArray[6] = stringArray[7];
        stringArray[7] = buff;

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

    }
}
