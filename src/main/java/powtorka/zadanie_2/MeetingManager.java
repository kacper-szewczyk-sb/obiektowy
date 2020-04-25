package powtorka.zadanie_2;

import java.util.Random;

public class MeetingManager {

    public static void main(String[] args) {
        scheduleOneMeeting();
        System.out.println();
        scheduleMeetingsList();
    }

    private static void scheduleMeetingsList() {
        Random rand = new Random();
        Meeting[] meetings = {new Meeting("spotkanie 1", "Wrocław"), new Meeting("spotkanie 2", "Wrocław")};
        for (Meeting meet: meetings) {
            meet.setSize(rand.nextInt(30) + 50);
        }
        for (Meeting meet: meetings) {
            System.out.println(meet.meetingDetails());
        }
    }

    private static void scheduleOneMeeting() {
        Meeting meeting = new Meeting("spotkanie 1", "Wrocław");
        System.out.println(meeting.meetingDetails());
        meeting.delayMeeting(3);
        System.out.println(meeting.meetingDetails());
    }
}
