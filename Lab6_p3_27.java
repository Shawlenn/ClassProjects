/**
 * File name: Lab6_p3_27.java
 * Short description: Class to detemine
 * IST 140 Assignment:  Enter Assignment # here
 *
 * @author Shawlen
 * @version 1.01 9/28/2021
 * date of last revision:
 * details of the revision: none
 */

import java.util.Scanner;

public class Lab6_p3_27 {
    public static void main(String[] args) {
        // Program description
        System.out.println(" Shawlen Nahar\n This program calculate and display\n"
                + "the number of days in a given month\n");

        // Declaring the variables: types and names
        int month;
        String days = "";
        Scanner input = new Scanner(System.in);

        // Variable initialization: getting the input from the user
        System.out.println("Enter the month number: ");
        month = input.nextInt();


        // Calculations
        if (month ==4 || month == 6 || month == 9 || month ==11) {
            days = "30";
        }
        else if (month == 1 || month == 3 || month == 5
                || month == 7 || month == 8 || month == 10 || month ==12) {
            days = "31";
        }
        else if (month ==2) {
            days = "28 or 29";
        }
        else {
            System.out.print("Invalid Month Entered");
            System.exit(1);
        }

        // Display the results
        System.out.println("The month entered has " + days + " days in it.");
    }

}

/*
"C:\Program Files\Java\jdk1.8.0_171\bin\java.exe" "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.1.3\lib\idea_rt.jar=58900:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_171\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\rt.jar;X:\My Documents\Week_6_Lab\out\production\Week_6_Lab" Lab6_p3_27
 Shawlen Nahar
 This program and display
the number of days ina given month

Enter the month number:
9
The month entered has 30 days in it.

Process finished with exit code 0

 */

