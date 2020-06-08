public class TeenNumberChecker {
    public static void main(String[] args) {

        boolean whetherItsTeen = isTeen(9);
        System.out.println(whetherItsTeen);

        boolean age = hasTeen(11,29,66);
        System.out.println(age);
    }

    public static boolean isTeen (int age){
        if (age >= 13 && age <= 19){
            return true;
        }
        return false;
    }

    public static boolean hasTeen (int firstAge, int secondAge, int thirdAge){
        if (isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge)){
            return true;
        }
        return false;
    }




}
