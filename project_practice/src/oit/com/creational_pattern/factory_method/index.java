package oit.com.creational_pattern.factory_method;

public class index {
    public static void main(String[] args) {
        Duck duckWhite = DuckFactory.getDuck(DuckType.WHITE);
        Duck duckBlack = DuckFactory.getDuck(DuckType.BLACK);
        System.out.println(duckWhite.getDuckName());
        System.out.println(duckBlack.getDuckName());
    }
}
