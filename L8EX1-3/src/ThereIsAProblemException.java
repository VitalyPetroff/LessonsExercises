public class ThereIsAProblemException extends Exception {

    private String message;

    public ThereIsAProblemException(String message){
        this.message =  message;
    }

    public String getMessage() {
        return message;
    }
}
