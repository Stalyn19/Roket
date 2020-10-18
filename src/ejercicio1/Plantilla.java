package ejercicio1;

public class Plantilla {

    //Metodo para un paolindromo
    public static String invertida(String palabra) {
        int a;
        String inversa="";
        for(a=palabra.length() ; a != 0 ; a--){
            inversa += palabra.substring(a-1,a);
        }
        return inversa;
    }

     //Metodo para un paolindromo
    public static void palindromo(String palabra) {
        
        if(invertida(palabra).compareTo(palabra)==0){
            System.out.println("La palabra "+palabra+" es un Palindromo");
        }
        else{
            System.out.println("La palabra" +palabra+" No es Palindromo");
        }
    }
    
    //Metodo para calculadora
    public static void calculadora(double a, String c, double b) {

        switch (c) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
        }

    }

    //Metodo par verificar si un numero es primo
    public static void isPrimo(int num) {
        int numero=num;
        int vector = num - 1;

        while (num != 1 && vector != 1) {

            if (num % vector == 0) {
                num = 1;

            }else{
            vector--;
            }
        }
        if (vector == 1) {
           System.out.println("El numero "+numero+" es primo");
        }

        else if(num<=0){
            System.out.println("Los numeros negativos no pueden ser evaluados");
        }
        else {
            System.out.println("El numero "+numero+" no es primo");
        }

    }

//    public static void validaEmail(String email){
//         
//        char a;
//        for(int i=0;i<email.length();i++){
//         if(email.charAt(a)){
//             
//         }
//
//        }
//        
//    }
}
