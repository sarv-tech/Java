// Passing arrays as argument:- It follows pass by reference value


public class Function_Arguments {

    public static void update(int marks[], int nonChangeable) {

        nonChangeable = 6;
        for(int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        
        int marks[] = {97, 98, 99};
        int nonChangeable = 5;
        update(marks, nonChangeable);
        System.out.println(nonChangeable);

        // Print our marks
        for(int i = 0; i < marks.length; i++) {

            System.out.print(marks[i] + " ");
        }

        System.out.println();
    }
}

// nonChangeable is not pass by reference
