import com.leapmotion.leap.*;

//Listener class which handles various events for the Controller
class SampleListener extends Listener {
    //method to handle the event of a Frame received from Controller
    public void onFrame(Controller controller) {
        // Get the most recent frame and report some basic information
        Frame frame = controller.frame();
        System.out.println("Frame id: " + frame.id() + ", hands: " + frame.hands().count()
    }
}

class Sample {
    public static void main(String[] args) {
        // Create leap motion controller instance
        Controller controller = new Controller();

        // Have the sample listener receive events from the controller
        controller.addListener(new SampleListener(););

        // Remove the sample listener when done
        controller.removeListener(listener);
    }
}
