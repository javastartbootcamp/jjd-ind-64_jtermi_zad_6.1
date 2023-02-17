package pl.javastart.task;

public class Logic {
    public boolean checkRange(int var) {
        boolean result = false;
        if (var < 100) {
            System.out.println("podana liczba jest za mała");
            result = false;
        } else if (var > 200) {
            System.out.println("podana liczba jest za duża");
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    public boolean checkDivisionByThree(int var) {
        boolean result = false;
        if ((var % 3 == 0)) {
            result = true;
        } else {
            System.out.println("liczba nie jest podzielna przez 3");
        }
        return result;
    }
}
