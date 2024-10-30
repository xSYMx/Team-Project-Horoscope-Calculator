import java.util.Scanner;

public class ZodiacSignCalculator {

    private Scanner input = new Scanner(System.in);
    private Store store;

    public static void main(String[] args) {
        System.out.println("ZodiacSign Calculator V1.0");
        ZodiacSignCalculator calculator = new ZodiacSignCalculator();
        calculator.getZodiacSignAndStore();
    }

    public ZodiacSignCalculator(){
        this.store = new Store(10);
    }

    public static String getZodiacSign(int birthMonth, int birthDate) {
        String zodiacSign;

        if (birthMonth == 1) {
            if (birthDate >= 20) {
                zodiacSign = "Capricorn摩羯座";
            } else {
                zodiacSign = "Sagittarius射手座";
            }
        } else if (birthMonth == 2) {
            if (birthDate >= 19) {
                zodiacSign = "Pisces双鱼座";
            } else {
                zodiacSign = "Aquarius水瓶座";
            }
        } else if (birthMonth == 3) {
            if (birthDate >= 21) {
                zodiacSign = "Aries白羊座";
            } else {
                zodiacSign = "Pisces双鱼座";
            }
        } else if (birthMonth == 4) {
            if (birthDate >= 20) {
                zodiacSign = "Taurus金牛座";
            } else {
                zodiacSign = "Aries白羊座";
            }
        } else if (birthMonth == 5) {
            if (birthDate >= 21) {
                zodiacSign = "Gemini双子座";
            } else {
                zodiacSign = "Taurus金牛座";
            }
        } else if (birthMonth == 6) {
            if (birthDate >= 21) {
                zodiacSign = "Cancer巨蟹座";
            } else {
                zodiacSign = "Gemini双子座";
            }
        } else if (birthMonth == 7) {
            if (birthDate >= 23) {
                zodiacSign = "Leo狮子座";
            } else {
                zodiacSign = "Cancer巨蟹座";
            }
        } else if (birthMonth == 8) {
            if (birthDate >= 23) {
                zodiacSign = "Virgo处女座";
            } else {
                zodiacSign = "Leo狮子座";
            }
        } else if (birthMonth == 9) {
            if (birthDate >= 23) {
                zodiacSign = "Libra天秤座";
            } else {
                zodiacSign = "Virgo处女座";
            }
        } else if (birthMonth == 10) {
            if (birthDate >= 23) {
                zodiacSign = "Scorpio天蝎座";
            } else {
                zodiacSign = "Libra天秤座";
            }
        } else if (birthMonth == 11) {
            if (birthDate >= 22) {
                zodiacSign = "Sagittarius射手座";
            } else {
                zodiacSign = "Scorpio天蝎座";
            }
        } else if (birthMonth == 12) {
            if (birthDate >= 22) {
                zodiacSign = "Capricorn摩羯座";
            } else {
                zodiacSign = "Sagittarius射手座";
            }
        } else {
            zodiacSign = "Unknown未知";
        }

        return zodiacSign;
    }

    private void getZodiacSignAndStore() {
        System.out.print("Enter birth month (1-12): ");
        int birthMonth = input.nextInt();
        System.out.print("Enter birth date (1-31): ");
        int birthDate = input.nextInt();
        String zodiacSign = getZodiacSign(birthMonth, birthDate); // 调用静态方法并传递参数
        System.out.println("Your zodiac sign is: " + zodiacSign);

        Userinput user = new Userinput(name,birthMonth,birthDate,true);
        user.set
    }

    private void printUsers(){
        System.out.println(store.listUsers());
    }
}