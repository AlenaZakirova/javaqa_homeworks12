import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket o1, Ticket o2) {
        int time1 = o1.getTimeTo() - o2.getTimeTo();
        int time2 = o1.getTimeTo() - o2.getTimeTo();

        if (time1 < time2) {
            return -1;
        } else if (time1 < time2) {
            return 1;
        } else {
            return 0;
        }
    }
}