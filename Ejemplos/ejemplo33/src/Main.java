import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String... args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
        ScriptEngine e = new ScriptEngineManager().getEngineByName("nashorn");
        e.eval("print('Hola Mundo');");
        // e.eval(new FileReader("/Users/potty/Desktop/Quiz/src/hello.js"));

        //Invocable invocable = (Invocable) e;

        //Object resultado = invocable.invokeFunction("hello");
        //System.out.println(resultado);
    }
}
