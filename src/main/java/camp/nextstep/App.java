package camp.nextstep;

public class App {
    public static void main(String[] args) throws Exception {
        final var tomcatStarter = new TomcatStarter();
        tomcatStarter.start();
        tomcatStarter.await();
    }
}
