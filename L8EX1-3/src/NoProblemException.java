public class NoProblemException extends Exception{

    private String message;

    public NoProblemException(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}