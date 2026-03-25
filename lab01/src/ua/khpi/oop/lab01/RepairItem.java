package ua.khpi.oop.lab01;

import java.util.Objects;

/**
 * Клас описує техніку, яка здається в ремонт.
 * Містить серійний номер та стан (відремонтовано чи ні).
 */
public class RepairItem {
    private final String serialNumber;
    private boolean isFixed;

    /**
     * Повний конструктор
     * Створює об'єкт техніки з заданим серійним номером та станом.
     *
     * @param serialNumber серійний номер пристрою
     * @param isFixed стан ремонту (true - відремонтовано, false - ні)
     */
    public RepairItem(String serialNumber, boolean isFixed) {
        this.serialNumber = serialNumber;
        this.isFixed = isFixed;
    }
    /**
     * Скорочений конструктор
     * Створює об'єкт техніки з серійним номером.
     * За замовчуванням техніка не відремонтована.
     *
     * @param serialNumber серійний номер пристрою
     */
    public RepairItem(String serialNumber) {
        this(serialNumber, false);
    }

    /**
     * Позначає техніку як відремонтовану.
     */
    public void markAsFixed() {
        isFixed = true;
    }
    /**
     * Повертає текстове представлення об'єкта.
     *
     * @return рядок з інформацією про техніку
     */
    @Override
    public String toString() {
        return "RepairItem{" +
                "serialNumber='" + serialNumber + '\'' +
                ", isFixed=" + isFixed +
                '}';
    }
    /**
     * Порівнює об'єкти за серійним номером.
     *
     * @param obj інший об'єкт
     * @return true, якщо серійні номери однакові
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof RepairItem other)) return false;
        return Objects.equals(serialNumber, other.serialNumber);
    }
    /**
     * Обчислює хеш-код на основі серійного номера.
     *
     * @return хеш-код об'єкта
     */
    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }
}