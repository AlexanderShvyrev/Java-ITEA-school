package Homework.OOP.MyDict;

public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> dict = new MyDictionary<>();

        dict.add(0, "zero");
        dict.add(1, "one");
        dict.add(2, "two");

        String valueOfOne = dict.get(1);
        System.out.println(valueOfOne);

        int dictSize = dict.getSize();
        System.out.println(dictSize);
    }
}
