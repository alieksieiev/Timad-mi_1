package is.ola10.tmd1;

/******************************************************************************
 *  Nafn    : Oleksii Alieksieiev 
 *  T-póstur: ola10@hi.is
 *
 *  Lýsing  : Skrifið Java forritið Reikna.java sem reiknar út eftirfarandi og
 *            prentar útkomuna og endar á nýrri línu. 5+5/3 Hér er dæmi um útttak
 *            þegar þið keyrið af skipanalínu eða með LIFT/Run Daginn with Arguments
 *            (ekkert inntak)
 *
 *            % java Reikna
 *            6
 *
 *
 *****************************************************************************/
public class Reikna {

    static int exp = 5+5/3; //Created variable integer, because we wait 6 without floating point

    public static void main(String[] args) {
        System.out.println("% java Reikna");
        System.out.print(exp);
    }

}
