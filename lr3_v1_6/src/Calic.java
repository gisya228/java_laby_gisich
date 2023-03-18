public class Calic {
    public double calculatedShot;
    public Calic(int x, int n, int[] mas){
        calculatedShot = mas[n-1];
        for (int i = 0; i < n; i++){
            calculatedShot = x / calculatedShot;
            calculatedShot = calculatedShot + mas[n - i - 1];
        }
    }
    public double addition(Calic shot){
        return calculatedShot + shot.calculatedShot;
    }
    public double subtraction(Calic shot){
        return calculatedShot - shot.calculatedShot;
    }
    public double division(Calic shot){
        return calculatedShot / shot.calculatedShot;
    }
    public double multiplication(Calic shot){
        return calculatedShot * shot.calculatedShot;
    }
}