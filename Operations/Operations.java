public class Operations {
    public static double calcul(double a,double b,char operator){
        double monResultat = 0;
        if (operator == '+'){
            monResultat = a+b;
        }
        if (operator == '-'){
            monResultat = a-b;
        }
        if (operator == '*'){
            monResultat = a*b;
        }
        if (operator == '/'){
            monResultat = a/b;
        }
        return monResultat;
    }
}
