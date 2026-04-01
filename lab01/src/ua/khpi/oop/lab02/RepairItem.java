package ua.khpi.oop.lab02;

import java.util.Objects;

/**
 * Клас описує техніку, яка здається в ремонт.
 * У цій роботі він виступає об'єктом асоціації для ServiceOrder.
 */
public class RepairItem {
    private final String serialNumber;
    private boolean isFixed;
    /**
     * Створює об'єкт техніки.
     *
     * @param serialNumber серійний номер пристрою
     */
    public RepairItem(String serialNumber) {
        this.serialNumber = serialNumber;
        this.isFixed = false;
    }
    /**
     * Встановлює стан пристрою як відремонтований.
     */
    public void markAsFixed() {
        isFixed = true;
    }

    @Override
    public String toString() {
        return "Пристрій (S/N: " + serialNumber + ", Стан: " + (isFixed ? "Готово" : "В ремонті") + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof RepairItem other)) return false;
        return Objects.equals(serialNumber, other.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }
}
