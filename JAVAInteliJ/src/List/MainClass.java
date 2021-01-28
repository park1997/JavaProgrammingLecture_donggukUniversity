package List;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        //ArrayList 객체 생성
        ArrayList<String> list = new ArrayList<>();

        System.out.println("list.size() : "+list.size());

        //데이터 추가
        list.add("hello");
        list.add("Java");
        list.add("World");
        System.out.println("list.size : " + list.size());
        System.out.println("list : " + list);

        //해당 인덱스에 데이터 추가
        list.add(2, "programming");
        System.out.println("list : " + list);

        //해당 인덱스에 데이터 변경
        list.set(1, "C");
        System.out.println("list : " + list);

        //데이터 추출
        String str = list.get(2);
        System.out.println("list.get(2) : "+str);

        //데이터 제거
        str = list.remove(2);
        System.out.println("list.remove(2) : " + str);
        System.out.println("list : " + list);

        //데이터 전체제거
        list.clear();
        System.out.println("list : " + list);

        //데이터 유무
        boolean b = list.isEmpty();
        System.out.println("list.isEmpty() : "+b);

    }
}
