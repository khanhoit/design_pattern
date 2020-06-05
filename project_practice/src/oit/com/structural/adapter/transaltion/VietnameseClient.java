package oit.com.structural.adapter.transaltion;

public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
//        client.send("xin chào");

        System.out.println("ok");
    }
}
