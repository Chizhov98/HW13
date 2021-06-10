package Hw13;

import java.time.LocalDate;

import static Hw13.Categories.*;

public class Main {

    public static void main(String[] args) throws Human.LicenseExpireException {
        Human fisrtHuman = new Human("Artem", "Chizhov", new Categories[]{A1, A, B, B1}, LocalDate.now());
        Human secondHuman = new Human("Max", "Shtiov");
        Human thirdHuman = new Human("Alex", "Kranina", new Categories[]{A, B, B1, D, T}, LocalDate.of(1978, 2, 2));

        fisrtHuman.soutDriverCategories();
        secondHuman.soutDriverCategories();
        thirdHuman.soutDriverCategories();


    }
}
