public class AgeValidator {

    // الدالة تحذر أنها قد ترمي خطأ [cite: 59, 65]
    public static void pruefeAlter(int alter) throws InvalidAgeException {

        // 1. إذا كان العمر سالباً
        if (alter < 0) {
            // نطلق الخطأ عمداً هنا [cite: 61, 67]
            throw new InvalidAgeException("Das Alter darf nicht negativ sein!");
        }

        // 2. إذا كان العمر أصغر من 18
        if (alter < 18) {
            // نطلق الخطأ عمداً هنا [cite: 61, 67]
            throw new InvalidAgeException("Du bist zu jung fuer dieses Spiel!");
        }

        // إذا نجح الفحص ولم يُطلق أي خطأ، يستمر الكود طبيعي
        System.out.println("Zugriff erlaubt! Willkommen im Spiel.");
    }
