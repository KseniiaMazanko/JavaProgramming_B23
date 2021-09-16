package day49_Exception;




/*
unchecked exception inheretense Runtime
checked exception extend Exception
 */
public class BreakTimeException extends RuntimeException{

        public BreakTimeException(String message){
            super(message);
        }


        public BreakTimeException(){
            super("It's time for a break");
        }


}
