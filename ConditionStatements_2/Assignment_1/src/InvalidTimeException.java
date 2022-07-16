public class InvalidTimeException extends Exception{
    InvalidTimeException(){
        super("Invalid Time Exception");
    }
    //Custom message constructor
    InvalidTimeException(String message){
        super(message);
    }

}
