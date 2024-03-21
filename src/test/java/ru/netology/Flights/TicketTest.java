package ru.netology.Flights;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class TicketTest {

    @Test
    public void comparisonPriceTicketNoMatches() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("London", "Paris", 1000, 2, 8);
        Ticket ticket2 = new Ticket("Berlin", "Moscow", 2560, 15, 16);
        Ticket ticket3 = new Ticket("London", "Paris", 5250, 21, 23);
        Ticket ticket4 = new Ticket("Berlin", "Moscow", 2200, 15, 19);
        Ticket ticket5 = new Ticket("London", "Moscow", 4360, 7, 13);
        Ticket ticket6 = new Ticket("London", "Paris", 2890, 15, 22);
        Ticket ticket7 = new Ticket("London", "Paris", 1950, 2, 10);
        Ticket ticket8 = new Ticket("Boston", "Moscow", 2500, 10, 21);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] actual = manager.search("London", "Berlin");
        Ticket[] expected = {};


        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void comparisonPriceTicketOneMatches() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("London", "Milan", 1000, 2, 8);
        Ticket ticket2 = new Ticket("Berlin", "Moscow", 2560, 15, 16);
        Ticket ticket3 = new Ticket("London", "Paris", 5250, 21, 23);
        Ticket ticket4 = new Ticket("Berlin", "Moscow", 2200, 15, 19);
        Ticket ticket5 = new Ticket("London", "Moscow", 4360, 7, 13);
        Ticket ticket6 = new Ticket("London", "Paris", 2890, 15, 22);
        Ticket ticket7 = new Ticket("London", "Paris", 1950, 2, 10);
        Ticket ticket8 = new Ticket("Boston", "Moscow", 2500, 10, 21);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] actual = manager.search("Boston", "Moscow");
        Ticket[] expected = {ticket8};


        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void comparisonPriceTicketMultipleMatches() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("London", "Milan", 1000, 2, 8);
        Ticket ticket2 = new Ticket("Berlin", "Moscow", 2560, 15, 16);
        Ticket ticket3 = new Ticket("London", "Paris", 5250, 21, 23);
        Ticket ticket4 = new Ticket("Berlin", "Moscow", 2200, 15, 19);
        Ticket ticket5 = new Ticket("London", "Moscow", 4360, 7, 13);
        Ticket ticket6 = new Ticket("London", "Paris", 2890, 15, 22);
        Ticket ticket7 = new Ticket("London", "Paris", 1950, 2, 10);
        Ticket ticket8 = new Ticket("Boston", "Moscow", 2500, 10, 21);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] actual = manager.search("London", "Paris");
        Ticket[] expected = {ticket7, ticket6, ticket3};


        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void comparisonPriceTicketNoMatchesComparator() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("London", "Paris", 1000, 2, 8);
        Ticket ticket2 = new Ticket("Berlin", "Moscow", 2560, 15, 16);
        Ticket ticket3 = new Ticket("London", "Paris", 5250, 21, 23);
        Ticket ticket4 = new Ticket("Berlin", "Moscow", 2200, 15, 19);
        Ticket ticket5 = new Ticket("London", "Moscow", 4360, 7, 13);
        Ticket ticket6 = new Ticket("London", "Paris", 2890, 15, 22);
        Ticket ticket7 = new Ticket("London", "Paris", 1950, 2, 10);
        Ticket ticket8 = new Ticket("Boston", "Moscow", 2500, 10, 21);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("London", "Berlin", comparator);
        Ticket[] expected = {};


        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void comparisonPriceTicketOneMatchesComparator() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("London", "Milan", 1000, 2, 8);
        Ticket ticket2 = new Ticket("Berlin", "Moscow", 2560, 15, 16);
        Ticket ticket3 = new Ticket("London", "Paris", 5250, 21, 23);
        Ticket ticket4 = new Ticket("Berlin", "Moscow", 2200, 15, 19);
        Ticket ticket5 = new Ticket("London", "Moscow", 4360, 7, 13);
        Ticket ticket6 = new Ticket("London", "Paris", 2890, 15, 22);
        Ticket ticket7 = new Ticket("London", "Paris", 1950, 2, 10);
        Ticket ticket8 = new Ticket("Boston", "Moscow", 2500, 10, 21);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("Boston", "Moscow", comparator);
        Ticket[] expected = {ticket8};


        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void comparisonPriceTicketMultipleMatchesComparator() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("London", "Milan", 1000, 2, 8);
        Ticket ticket2 = new Ticket("Berlin", "Moscow", 2560, 15, 16);
        Ticket ticket3 = new Ticket("London", "Paris", 5250, 21, 23);
        Ticket ticket4 = new Ticket("Berlin", "Moscow", 2200, 15, 19);
        Ticket ticket5 = new Ticket("London", "Moscow", 4360, 7, 13);
        Ticket ticket6 = new Ticket("London", "Paris", 2890, 15, 22);
        Ticket ticket7 = new Ticket("London", "Paris", 1950, 2, 10);
        Ticket ticket8 = new Ticket("Boston", "Moscow", 2500, 10, 21);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("London", "Paris", comparator);
        Ticket[] expected = {ticket3, ticket6, ticket7};


        Assertions.assertArrayEquals(actual, expected);
    }


}



