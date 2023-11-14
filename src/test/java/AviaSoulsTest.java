import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

class AviaSoulsTest {
    @Test
    public void testSortingBasedOnThePriceOfSeveralTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Санкт-петербург", 3_000, 13, 15); //2
        Ticket ticket2 = new Ticket("Москва", "Казань", 3_500, 15, 19); //4
        Ticket ticket3 = new Ticket("Санкт-петербург", "Москва", 3_000, 16, 19);  //3
        Ticket ticket4 = new Ticket("Москва", "Санкт-петербург", 4_000, 2, 7); //5
        Ticket ticket5 = new Ticket("Москва", "Сочи", 4_000, 8, 11);  //3
        Ticket ticket6 = new Ticket("Москва", "Санкт-петербург", 2_000, 12, 18);//6
        Ticket ticket7 = new Ticket("Москва", "Дубай", 10_000, 8, 15); //7
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("Москва", "Санкт-петербург");
        Ticket[] expected = {ticket6, ticket1, ticket4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortingBasedOnThePriceOfOneTicket() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Санкт-петербург", 3_000, 13, 15); //2
        Ticket ticket2 = new Ticket("Москва", "Казань", 3_500, 15, 19); //4
        Ticket ticket3 = new Ticket("Санкт-петербург", "Москва", 3_000, 16, 19);  //3
        Ticket ticket4 = new Ticket("Москва", "Санкт-петербург", 4_000, 2, 7); //5
        Ticket ticket5 = new Ticket("Москва", "Сочи", 4_000, 8, 11);  //3
        Ticket ticket6 = new Ticket("Москва", "Санкт-петербург", 2_000, 12, 18);//6
        Ticket ticket7 = new Ticket("Москва", "Дубай", 10_000, 8, 15); //7
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("Москва", "Сочи");
        Ticket[] expected = {ticket5};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortingBasedOnThePriceOfZeroTicket() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Санкт-петербург", 3_000, 13, 15); //2
        Ticket ticket2 = new Ticket("Москва", "Казань", 3_500, 15, 19); //4
        Ticket ticket3 = new Ticket("Санкт-петербург", "Москва", 3_000, 16, 19);  //3
        Ticket ticket4 = new Ticket("Москва", "Санкт-петербург", 4_000, 2, 7); //5
        Ticket ticket5 = new Ticket("Москва", "Сочи", 4_000, 8, 11);  //3
        Ticket ticket6 = new Ticket("Москва", "Санкт-петербург", 2_000, 12, 18);//6
        Ticket ticket7 = new Ticket("Москва", "Дубай", 10_000, 8, 15); //7
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("Москва", "Сша");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testSortingBasedOnTheTimeOfSeveralTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Санкт-петербург", 3_000, 13, 15); //2
        Ticket ticket2 = new Ticket("Москва", "Казань", 3_500, 15, 19); //4
        Ticket ticket3 = new Ticket("Санкт-петербург", "Москва", 3_000, 16, 19);  //3
        Ticket ticket4 = new Ticket("Москва", "Санкт-петербург", 4_000, 2, 7); //5
        Ticket ticket5 = new Ticket("Москва", "Сочи", 4_000, 8, 11);  //3
        Ticket ticket6 = new Ticket("Москва", "Санкт-петербург", 2_000, 12, 18);//6
        Ticket ticket7 = new Ticket("Москва", "Дубай", 10_000, 8, 15); //7
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("Москва", "Санкт-петербург", comparator);
        Ticket[] expected = {ticket1, ticket4, ticket6};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortingBasedOnTheTimeOfOneTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Санкт-петербург", 3_000, 13, 15); //2
        Ticket ticket2 = new Ticket("Москва", "Казань", 3_500, 15, 19); //4
        Ticket ticket3 = new Ticket("Санкт-петербург", "Москва", 3_000, 16, 19);  //3
        Ticket ticket4 = new Ticket("Москва", "Санкт-петербург", 4_000, 2, 7); //5
        Ticket ticket5 = new Ticket("Москва", "Сочи", 4_000, 8, 11);  //3
        Ticket ticket6 = new Ticket("Москва", "Санкт-петербург", 2_000, 12, 18);//6
        Ticket ticket7 = new Ticket("Москва", "Дубай", 10_000, 8, 15); //7
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("Москва", "Казань", comparator);
        Ticket[] expected = {ticket2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortingBasedOnTheTimeOfZeroTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Санкт-петербург", 3_000, 13, 15); //2
        Ticket ticket2 = new Ticket("Москва", "Казань", 3_500, 15, 19); //4
        Ticket ticket3 = new Ticket("Санкт-петербург", "Москва", 3_000, 16, 19);  //3
        Ticket ticket4 = new Ticket("Москва", "Санкт-петербург", 4_000, 2, 7); //5
        Ticket ticket5 = new Ticket("Москва", "Сочи", 4_000, 8, 11);  //3
        Ticket ticket6 = new Ticket("Москва", "Санкт-петербург", 2_000, 12, 18);//6
        Ticket ticket7 = new Ticket("Москва", "Дубай", 10_000, 8, 15); //7
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("Москва", "Москва", comparator);
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

}