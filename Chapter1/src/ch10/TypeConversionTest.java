package ch10;

public class TypeConversionTest {

    public static void main(String[] args) {

        int iNum = 255;
        byte bNum = (byte) iNum;

        System.out.println(bNum);

        double dNum = 3.14;
        int iNum2 = (int) dNum;

        System.out.println(iNum2);

        double dNum2 = 1.2;
        float fNum = 0.9F;

        int iNum3 = (int) dNum2 + (int) fNum;
        int iNum4 = (int) (dNum2 + fNum);

        System.out.println(iNum3);
        System.out.println(iNum4);

    }
}
