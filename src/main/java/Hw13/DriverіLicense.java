package Hw13;

import java.time.LocalDate;
import java.util.ArrayList;

public class DriverіLicense {


    private LocalDate dataOfExpire;

    private ArrayList<Categories> listOfCategory = new ArrayList<>();


    DriverіLicense() {
    }

    DriverіLicense(Categories[] categories, LocalDate data) {
        for (Categories elem : categories) {
            listOfCategory.add(elem);
        }
        dataOfExpire = data.plusYears(25);
    }

    public void addCategory(Categories category) {
        listOfCategory.add(category);
    }

    public LocalDate getDataOfExpire() {
        return dataOfExpire;
    }

    public void setDataOfExpire(LocalDate dataOfExpire) {
        this.dataOfExpire = dataOfExpire;
    }

    public ArrayList<Categories> getListOfCategory() {
        return listOfCategory;
    }


    public boolean isActiveLicense() {
        if (dataOfExpire.getYear() < LocalDate.now().getYear()) {
            return false;
        }
        if (dataOfExpire.getYear() > LocalDate.now().getYear()) {
            return true;
        } else if (dataOfExpire.getMonthValue() > LocalDate.now().getMonthValue()) {
            return true;
        } else if (dataOfExpire.getDayOfMonth() >= LocalDate.now().getDayOfMonth() && dataOfExpire.getMonthValue() == LocalDate.now().getMonthValue()) {
            return true;
        }
        return false;
    }


}
