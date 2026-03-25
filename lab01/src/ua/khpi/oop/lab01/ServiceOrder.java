package ua.khpi.oop.lab01;

/**
 * Клас описує заявку на ремонт техніки.
 * Містить інформацію про проблему, статус, результат,
 * клієнта та техніку.
 */
public class ServiceOrder {
    private String orderId;
    private String description; // початкова проблема
    private String status;
    private String result; // результат ремонту
    private Customer customer;
    private RepairItem item;

    /**
     * Створює нову заявку на ремонт.
     *
     * @param orderId ідентифікатор заявки
     * @param description опис проблеми
     * @param customer клієнт, який створив заявку
     * @param item техніка для ремонту
     */
    public ServiceOrder(String orderId, String description, Customer customer, RepairItem item) {
        this.orderId = orderId;
        this.description = description;
        this.customer = customer;
        this.item = item;
        this.status = "Нова";
        this.result = "Ще не виконано";
    }

    /**
     * Змінює статус заявки на "В процесі".
     */
    public void startRepair() {
        status = "В процесі";
    }

    /**
     * Завершує ремонт техніки.
     * Змінює статус заявки та встановлює результат.
     */
    public void finishRepair() {
        status = "Завершена";
        item.markAsFixed();
        result = "Пристрій відремонтовано та працює";
    }
    /**
     * Повертає текстове представлення заявки.
     *
     * @return рядок з інформацією про заявку
     */
    @Override
    public String toString() {
        return "ServiceOrder{" +
                "id='" + orderId + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", result='" + result + '\'' +
                ", customer=" + customer +
                ", item=" + item +
                '}';
    }
}