public class InvalidNumberEXC extends Exception{
    private static String ERROR = "გამოიყენეთ დადებითი რიცხვები";
    public InvalidNumberEXC(String msg) {
        super(msg);
    }
    public InvalidNumberEXC() {
        super(ERROR);
    }
}
