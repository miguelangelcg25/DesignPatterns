package singleton;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author miguelangel
 */
public enum ShowEnum {

    INSTANCE;

    private final Set<String> availableSeats;

    private ShowEnum() {
        availableSeats = new HashSet<>();
        availableSeats.add("A1");
        availableSeats.add("A2");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    public static void main(String args[]) {
        ticketAgentBooks("A1");
        ticketAgentBooks("A1");
    }

    private static void ticketAgentBooks(String seat) {
        ShowEnum show = ShowEnum.INSTANCE;
        System.out.println(show.bookSeat(seat));
    }
}
