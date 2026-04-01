package ua.khpi.oop.lab02;

/**
 * Клас описує заявку на ремонт.
 * У цій роботі він пов'язує Клієнта та Техніку через агрегацію.
 */
public class ServiceOrder {
    private String orderId;
    private String description;
    private String status;

    private Customer customer;
    private RepairItem item;

    /**
     * Створює нову заявку на ремонт.
     *
     * @param orderId ідентифікатор заявки
     * @param description опис проблеми
     * @param customer клієнт
     * @param item техніка, що потребує ремонту
     */
    public ServiceOrder(String orderId, String description, Customer customer, RepairItem item) {
        this.orderId = orderId;
        this.description = description;
        this.customer = customer;
        this.item = item;
        this.status = "Нова";

        customer.addOrder(this);
    }
    /**
     * Змінює статус заявки на "В процесі".
     */
    public void startRepair() {
        this.status = "В процесі";
    }

    public void finishRepair() {
        this.status = "Завершена";
        item.markAsFixed();
    }

    @Override
    public String toString() {
        return String.format("Замовлення %s [%s]: %s | %s",
                orderId, status, description, item);
    }
}
