
import java.util.Scanner;

class Workout {
    String type;
    int duration;

    void showWorkout() {
        System.out.println("Workout: " + type);
        System.out.println("Duration: " + duration + " minutes");
    }
}

class RunningWorkout extends Workout {
    double distance;

    void showDetails() {
        System.out.println("--- Workout Summary ---");
        showWorkout();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Calories burned: " + (distance * 60));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        RunningWorkout workout = new RunningWorkout();

        System.out.print("Enter workout type: ");
        workout.type = input.nextLine();

        System.out.print("Enter duration (minutes): ");
        workout.duration = input.nextInt();

        System.out.print("Enter distance (km): ");
        workout.distance = input.nextDouble();

        workout.showDetails();

        input.close();
    }
}
