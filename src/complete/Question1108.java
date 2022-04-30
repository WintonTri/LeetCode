package complete;

// Attempt 1 Completed -> 04/29/2022
public class Question1108 {

    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }

}
