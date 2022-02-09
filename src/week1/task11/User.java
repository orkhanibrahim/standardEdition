package week1.task11;

/**
 * Task 11: password validation: bir dene User olsun, ad soyad yas ve password olsun. bir dene method yaz, passworda
 * validation olsun. Password 8 characterden yuxari olmalidi, 1dene boyuk, 1dene kicik, bir dene reqem olmalidi en azi.
 * Passwordun ichinde adin ilk 4herfi olmamalidi, ve yashi olmamalidi.

*/





public class User {
    private static String name;
    private static String surname;
    private static int age;



    public User(String name, String surname, int age) {
        User.name = name;
        User.surname = surname;
        User.age = age;

    }


    public static void passWordValidation(String password) {
        if (password.length() > 8) {

            lowerCaseRule(password);
            upperCaseRule(password);
            numberOfDigitsRule(password);
            nameContainsRule(password,name);
            ageContainsRule(password,age);


        } else {
            System.out.println("Password is less than 8 characters");
        }
    }



    public static void nameContainsRule(String password, String name) {
        char[] passwordArray = password.toCharArray();
        char[] nameArray = name.toCharArray();

        if(!(passwordArray.length>nameArray.length)) {
            System.out.println("password must be greater than name");
        }

        for (int i = 0; i < passwordArray.length; i++) {

            if(passwordArray[i] == nameArray[0] && passwordArray.length - i >= nameArray.length) {

                int mi = i;
                int counter = 0;

                for(char s : nameArray) {
                    if(passwordArray[mi] == s)  counter++;
                    mi++;
                }

                boolean b = counter == nameArray.length;
                System.out.println("Name contains rule  followed : "+!b);
            }

        }
    }

    public static void ageContainsRule(String password, int age) {
        char[] passwordArray = password.toCharArray();
        char[] ageArray = String.valueOf(age).toCharArray();

        if(!(passwordArray.length>ageArray.length)) {
            System.out.println("password must be greater than size of age");
        }

        for (int i = 0; i < passwordArray.length; i++) {

            if(passwordArray[i] == ageArray[0] && passwordArray.length - i >= ageArray.length) {

                int mi = i;
                int counter = 0;

                for(char s : ageArray) {
                    if(passwordArray[mi] == s)  counter++;
                    mi++;
                }

                boolean b = counter == ageArray.length;
                System.out.println("Age contains rule  followed : "+!b);
            }

        }
    }


    private static void numberOfDigitsRule(String password) {
        int countNumberOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            for (int j = 48; j <= 57; ++j) {
                if (password.charAt(i) == j) {
                    countNumberOfDigits++;
                }
            }
        }
        if (countNumberOfDigits >= 1) {
            System.out.println("Number of digits rule followed : "+true);
        } else {
            System.out.println("Number of digits rule not followed : "+false);
        }
    }

    private static void upperCaseRule(String password) {
        int countUpperCaseLetters = 0;
        for (int i = 0; i < password.length(); i++) {
            for (int j = 65; j <= 90; ++j) {
                if (password.charAt(i) == j) {
                    countUpperCaseLetters++;
                }
            }
        }
        if (countUpperCaseLetters >= 1) {
            System.out.println("Upper case letter rule followed : "+true);
        } else {
            System.out.println("Upper case letter rule not followed : "+false);
        }
    }

    private static void lowerCaseRule(String password) {
        int countLowerCaseLetters = 0;
        for (int i = 0; i < password.length(); i++) {
            for (int j = 97; j <= 122; ++j) {
                if (password.charAt(i) == j) {
                    countLowerCaseLetters++;
                }
            }
        }
        if (countLowerCaseLetters >= 1) {
            System.out.println("Lower case letter rule followed : "+true);
        } else {
            System.out.println("Lower case letter rule not followed : "+false);
        }
    }

    public static void main(String[] args) {
        User user = new User("sddF","Ibrahim",28);
        User.passWordValidation("sdFdgfertetf29");
    }
}
