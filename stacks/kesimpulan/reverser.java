package stacks.kesimpulan;

public class reverser {
    private String input;

    public reverser (String input){
        this.input = input;
    }

    public String reverse(){
        int size = input.length();
        stack st = new stack(size);

        for (int i = 0; i < input.length(); i++) {
            st.push(input.charAt(i));
        }

        String reversed = "";
        while (!st.isEmpty()) {
            reversed += st.pop();
        }
        return reversed;
    }
}
