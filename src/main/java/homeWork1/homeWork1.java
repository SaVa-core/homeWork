package homeWork1;

public class homeWork1 {

    public static void main(String[] args) {

        {
        byte byteVal = 127;
        short shortVal = -32768;
        int intVal = -2147483648;
        long longVal = 800l;
        float floatVal = 81.25f;
        double doubleVal = 52.835;
        char charVal1 = '*';
        char charVal2 = '\u2242';
        boolean booleanVal1 = true;
        boolean booleanVal2 = false;

        System.out.println("byte " + byteVal);
        System.out.println("short " + shortVal);
        System.out.println("int " + intVal);
        System.out.println("long " + longVal);
        System.out.println("float " + floatVal);
        System.out.println("double " + doubleVal);
        System.out.println("char " + charVal1);
        System.out.println("char2 " + charVal2);
        System.out.println("boolean " + booleanVal1);
        System.out.println("boolean " + booleanVal2);}              // Задание 2

        System.out.println ( summ (5.25f, 3.78f, 25.52f, 5.36f ) );

        System.out.println ( from10to20 ( 11, 10 ) );

        moreLess (0 );

        System.out.println(negative ( -2 ) );

        name ("Мир");

        years (2020);
    }
    
    
    public static float summ(float a, float b, float c, float d)     // Задание 3
    {   
        return a * (b + (c / d));
    }
    public static boolean from10to20(int a1, int a2)                 // Задание 4
    {               
        int sum = a1 + a2;
        return (10 <= sum) && (sum <= 20);
    }
    public static void moreLess (int a3)                             // Задание 5
    {                           
        if (a3 >=0){
            System.out.println("Число положительное");
        }
        else
            System.out.println("Число отрицательное");
    }
    public static boolean negative (int a4)                          // Задание 6
    {                       
       if (a4 < 0) return true;
        return false;
    }
    public static void name (String str)                              // Задание 7
    {                          
        System.out.println("Привет, " + str + "!");
    }
    public static void years (int ofTheYear )                         // Задание 8
    {                      
        if ( ! (ofTheYear % 4 == 0) || ( ! ( ofTheYear % 400 == 0) &&  ( ofTheYear % 100 == 0 )))
            System.out.println(ofTheYear + " год не високосный");
        else System.out.println(ofTheYear + " год високосный");
    }
}
