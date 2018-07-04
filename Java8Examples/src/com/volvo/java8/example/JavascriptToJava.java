package com.volvo.java8.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavascriptToJava {
    public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("nashorn");
        // C:\Wksps\Java8\Java8Examples\src\com\volvo\java8\example\javascriptToJava.js
        scriptEngine.eval(new FileReader("C:/Wksps/Java8/Java8Examples/src/com/volvo/java8/example/javascriptToJava.js"));

        Invocable invocable = (Invocable) scriptEngine;
        System.out.println(invocable.invokeFunction("func1", "Sindhu"));
    }
}
