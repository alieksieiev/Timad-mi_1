package is.ola10.tmd1;

/******************************************************************************
 *  Nafn    : Oleksii Alieksieiev 
 *  T-póstur: ola10@hi.is
 *
 *  Lýsing  : Skrifið Java forritið Daginn.java, sem les tvö nöfn af skipanalínunni
 *            (sjá forritið UseArgument.java úr bókinni) og skrifar þau út í kveðju,
 *            eins og hér að neðan. Endar á nýrri línu. Hér er dæmi um útttak þegar
 *            þið keyrið af skipanalínu eða með LIFT/Run Daginn with Arguments og
 *            gefið inntak
 *
 *            % java Daginn Siggi Gunna
 *            Góðan daginn Siggi og Gunna
 *
 *
 *****************************************************************************/
public class Daginn {

    public static void main(String[] args) {
        if (args.length>=2){ //Check lenggth array for get two parameters
            System.out.println("% java Daginn " + args[0] + " " + args[1]);
            System.out.print("Góðan daginn " + args[0] + " og " + args[1]);
        }

    }

}
