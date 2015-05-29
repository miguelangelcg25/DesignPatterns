package singleton;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author miguelangel
 */
public class Show {

    private static Show INSTANCE;
    private final Set<String> availableSeats;

    public Show getInstance() {
        if (INSTANCE == null) {
            synchronized (Show.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Show();
                }
            }
        }
        return INSTANCE;
    }

    private Show() {
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
