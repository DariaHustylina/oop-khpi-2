package ua.khpi.oop.lab02;

/**
 * Головний клас для демонстрації роботи програми.
 * Створює об'єкти та демонструє їх взаємодію.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== СИСТЕМА РЕМОНТУ ТЕХНІКИ ===");

        Customer customer = new Customer("C101", "Даша Густиліна");

        RepairItem laptop = new RepairItem("SN-LAP-777");
        ServiceOrder order1 = new ServiceOrder("ORD-001", "Ремонт екрану", customer, laptop);

        RepairItem phone = new RepairItem("SN-PHN-555");
        ServiceOrder order2 = new ServiceOrder("ORD-002", "Заміна батареї", customer, phone);

        System.out.println("\n--- Інформація про клієнта після реєстрації ---");
        System.out.println(customer);

        System.out.println("\n--- Перелік заявок ---");
        for (ServiceOrder order : customer.getOrders()) {
            System.out.println("- " + order);
        }

        System.out.println("\n--- Оновлення статусів заявок ---");
        order1.startRepair();
        order1.finishRepair();

        System.out.println("Статус першого замовлення: " + order1);
        System.out.println("Статус другого замовлення: " + order2);
    }
}
