package ua.khpi.oop.lab02;

import java.util.ArrayList;
import java.util.List;
/**
 * Клас, що представляє клієнта сервісного центру.
 * Містить ідентифікатор, ім'я та список заявок.
 */
public class Customer {
    private final String customerId;
    private final String fullName;

    private List<ServiceOrder> orders = new ArrayList<>();
    /**
     * Створює об'єкт клієнта.
     *
     * @param customerId ідентифікатор клієнта
     * @param fullName повне ім'я клієнта
     */
    public Customer(String customerId, String fullName) {
        this.customerId = customerId;
        this.fullName = fullName;
    }
    /**
     * Додає заявку до списку заявок клієнта.
     *
     * @param order заявка на ремонт
     */
    public void addOrder(ServiceOrder order) {
        orders.add(order);
    }
    /**
     * Повертає список заявок клієнта.
     *
     * @return список заявок
     */
    public List<ServiceOrder> getOrders() {
        return new ArrayList<>(orders);
    }

    @Override
    public String toString() {
        return String.format("Клієнт: %s (ID: %s), Замовлень у базі: %d",
                fullName, customerId, orders.size());
    }
}
