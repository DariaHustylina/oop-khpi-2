package ua.khpi.oop.lab01;

/**
 * Головний клас для демонстрації роботи програми.
 * Створює об'єкти та демонструє їх взаємодію.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("=== СИСТЕМА РЕМОНТУ ТЕХНІКИ ===");

        Customer customer = new Customer("C1", "Густиліна Даша");

        RepairItem item1 = new RepairItem("SN-5544");

        ServiceOrder order = new ServiceOrder(
                "O-1",
                "Ноутбук не вмикається",
                customer,
                item1
        );

        System.out.println("\n--- Створення заявки ---");
        System.out.println(order);

        System.out.println("\n--- Початок ремонту ---");
        order.startRepair();
        System.out.println(order);

        System.out.println("\n--- Завершення ремонту ---");
        order.finishRepair();
        System.out.println(order);

        // перевірка equals/hashCode
        System.out.println("\n--- Перевірка equals() та hashCode() ---");

        RepairItem item2 = new RepairItem("SN-5544");

        System.out.println("item1.equals(item2): " + item1.equals(item2));
        System.out.println("hashCode item1: " + item1.hashCode());
        System.out.println("hashCode item2: " + item2.hashCode());
    }
}