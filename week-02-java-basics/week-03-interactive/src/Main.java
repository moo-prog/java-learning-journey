public class Main {
    public static void main(String[] args) {
        int testAlter = 15; // عمر غير مسموح به، سيطلق خطأ!

        try {
            // نحاول استدعاء الدالة الخطيرة داخل حزام الأمان (try)
            AgeValidator.pruefeAlter(testAlter);
        }
        catch (InvalidAgeException e) {
            // هنا نكتب ماذا يحدث إذا تم اقتناص الخطأ:
            System.out.println("Es gibt einen Fehler: " + e.getMessage());
        }

        System.out.println("البرنامج لم ينهر ومستمر بنجاح!");
    }
}