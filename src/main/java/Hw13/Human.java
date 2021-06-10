package Hw13;

import java.time.LocalDate;

public class Human {

    private String name, surname;

    private boolean isHaveDriverLicense;

    private DriverіLicense driverіLicense;

    LocalDate dateOfObtainsDrLicense;

    Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
        isHaveDriverLicense = false;
    }

    Human(String name, String surname, Categories[] categories, LocalDate data) {
        this.name = name;
        this.surname = surname;
        isHaveDriverLicense = true;
        driverіLicense = new DriverіLicense(categories, data);
        dateOfObtainsDrLicense = data;

    }

    public void soutDriverCategories() throws LicenseExpireException {
        if (!isHaveDriverLicense) {
            System.out.println("У человека" + name + " " + surname + "  нет водительского удостовирения ");
        } else if (!driverіLicense.isActiveLicense()) {
            throw new LicenseExpireException("Срок действия удостоверения истек", 801);
        } else {
            System.out.println("У водителя " + name + " " + surname + " имеються :");
            for (int i = 0; i < driverіLicense.getListOfCategory().size(); i++) {
                System.out.print(driverіLicense.getListOfCategory().get(i) + ", ");
            }
            System.out.println(" категории водительского удостоверения. ");
        }


    }

   class LicenseExpireException extends Exception {

        private int num ;
        public LicenseExpireException(String message,int num) {
            super(message);
            this.num  = num;
        }
    }
}
