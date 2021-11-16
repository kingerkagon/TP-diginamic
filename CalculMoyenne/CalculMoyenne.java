public class CalculMoyenne {
    static double[] monTableau = {1 , 2 , 2};

    public static double[] getMontableau() {
        return monTableau;
    }

    public static void ajout(double variableAjoute){
        double[] monnouveautableau = new double[monTableau.length+1];
        for (int i = 0; i < monnouveautableau.length; i++) {
            if (i < monnouveautableau.length-1) {
                monnouveautableau[i] = monTableau[i];
            }
            if (i == monnouveautableau.length-1){
                monnouveautableau[i] = variableAjoute;
            }
        }
        monTableau = monnouveautableau;
    }

    public static double calculMoyenne(){
        double maMoyenne = 0;
        for (int i = 0; i < monTableau.length; i++) {
            maMoyenne += monTableau[i];
        }
        maMoyenne /= monTableau.length;
        return maMoyenne;
    }
}