package ua.khpi.oop.lab01;

/**
 * Клас описує клієнта сервісного центру.
 * Містить ідентифікатор клієнта та його ім'я.
 */
public class Customer {
    private String customerId;
    private String fullName;

    /**
     * Створює об'єкт клієнта.
     *
     * @param customerId унікальний ідентифікатор клієнта
     * @param fullName повне ім'я клієнта
     */
    public Customer(String customerId, String fullName) {
        this.customerId = customerId;
        this.fullName = fullName;
    }

    /**
     * Повертає текстове представлення клієнта.
     *
     * @return рядок з інформацією про клієнта
     */
    @Override
    public String toString() {
        return "Customer{" +
                "id='" + customerId + '\'' +
                ", name='" + fullName + '\'' +
                '}';
    }
}