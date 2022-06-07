package complete;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Attempt 1 Completed -> 06/06/2022
public class Question841 {

    // The trick for this problem is how any room can be visited as long
    // as there is a key for it
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms.size() == 0)
            return true;

        boolean[] roomsAbleToVisit = new boolean[rooms.size()];
        roomsAbleToVisit[0] = true;

        Queue<Integer> keys = new LinkedList<>();
        keys.addAll(rooms.get(0));

        while (!keys.isEmpty()) {
            int key = keys.poll();
            if (!roomsAbleToVisit[key])
                keys.addAll(rooms.get(key));
            roomsAbleToVisit[key] = true;
        }

        for (boolean b : roomsAbleToVisit)
            if (!b)
                return false;

        return true;
    }

}
