package complete;

// Attempt 1 -> 05/24/2022 (Had to look online for the regex)
public class Question1678 {

    public String interpret(String command) {
        return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
    }

}
