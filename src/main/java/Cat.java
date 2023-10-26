import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration



public class Cat {

private String message;

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message=message;
    }
}
