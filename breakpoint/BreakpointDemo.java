package breakpoint;

class CustomObject {
    private int value;

    public CustomObject(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "breakpoint.CustomObject with value: " + value;
    }

    public void incrementValue(int step) {
        this.value += step; // Set breakpoint here
    }

    public int getValue() {
        return value;
    }
}

public class BreakpointDemo {

    public static void main(String[] args) {
        // 1. Create some objects
        CustomObject obj1 = new CustomObject(5); // Set a breakpoint here?
        CustomObject obj2 = new CustomObject(10);

        // 2. Sequential execution
        System.out.println(obj1);  // Set breakpoint here
        System.out.println(obj2);  // Set breakpoint here

        // 3. Call some methods
        incrementObject(obj1, 3);

        // 4. Loop with if-else
        for (int i = 0; i < 2; i++) {  // Set breakpoint here
            if (i % 2 == 0) {  // Set breakpoint here
                System.out.println("Even iteration: " + i);  // Set breakpoint here
            } else {
                System.out.println("Odd iteration: " + i);   // Set breakpoint here
            }

            // Modify object in the loop
            obj1.incrementValue(i);  // Set breakpoint here
            System.out.println("obj1 value after increment: " + obj1.getValue());  // Set breakpoint here
        }
    }

    public static void incrementObject(CustomObject obj, int step) {
        // 6. Ensure we work with the absolute value of the step (standard library call)
        int positiveStep = Math.abs(step);  // Set breakpoint here

        // 7. More complex logic with if-else
        if (obj.getValue() % 2 == 0) {  // Set breakpoint here
            System.out.println("Even value, incrementing by step: " + positiveStep);  // Set breakpoint here
            obj.incrementValue(positiveStep);
        } else {
            System.out.println("Odd value, incrementing by step: " + (positiveStep * 2));  // Set breakpoint here
            obj.incrementValue(positiveStep * 2);
        }

        System.out.println("Incremented object: " + obj);  // Set breakpoint here
    }
}