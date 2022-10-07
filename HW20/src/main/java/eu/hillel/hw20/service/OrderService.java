package eu.hillel.hw20.service;

import eu.hillel.hw20.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getByNumber(String number);

    List<Order> getAllWithSumLesserOrEqualAndNumberNomenclature(double cost, int countNomenclature);

    List<Order> getAllContainingGivenNomenclature(String nameNomenclature);

    List<Order> getAllNotContainProductAndArrivedDuringCurrentDay(String nameNomenclature);

    Order createOfItemsCurrentDay(String number);

    Boolean deleteAllOrdersSpecifiedQuantityAndSpecifiedProduct(String nameNomenclature, int quantity);
}
