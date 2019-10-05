package app;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {

    private static void test(DoForMe doForMe, String msg) {
        doForMe.make(msg);
    }

    public static void main(String[] args) {
        test(System.out::println, "Hello world");
    }

}
