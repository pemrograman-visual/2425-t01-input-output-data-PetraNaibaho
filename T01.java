// 12S24028 - Rotua Immanuela Tampubolon
// 12S24002 - Petra Ignatius Pengayoman Naibaho
import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;
        String jUDUL;
        String pENULIS;
        int tAHUN;
        String pENERBIT;
        String fORMATBUKU;
        double hARGA;
        double mARGIN;
        int sTOK;
        double rATING;

        iSBN = input.nextLine();
        jUDUL = input.nextLine();
        pENULIS = input.nextLine();
        tAHUN = Integer.parseInt(input.nextLine());
        pENERBIT = input.nextLine();
        fORMATBUKU = input.nextLine();
        hARGA = Double.parseDouble(input.nextLine());
        mARGIN = Double.parseDouble(input.nextLine());
        sTOK = Integer.parseInt(input.nextLine());
        rATING = Double.parseDouble(input.nextLine());
        System.out.println(iSBN + "|" + jUDUL + "|" + pENULIS + "|" + tAHUN + "|" + pENERBIT + "|" + fORMATBUKU + "|" + hARGA + "|" + mARGIN + "|" + sTOK + "|" + rATING);
    }
}
