package ru.gb.lesson_2.inform_exp;

import ru.gb.lesson_2.solid.di.Item;

import java.util.List;

public abstract class Order {
    List<OrderItem> orderItems;

    public int getPrice() {
        return orderItems.stream()
                .mapToInt(OrderItem::getPrice)
                .sum();
    }

    public OrderItem addRow(int qt, Item item) {
        OrderItem orderItem = new OrderItem();
        //set
        orderItems.add(orderItem);
        return orderItem;
    }
}
