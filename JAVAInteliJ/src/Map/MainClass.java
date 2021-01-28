package Map;

import java.util.HashMap;

public class MainClass {
    public static void main(String[] args) {
        String str;
        boolean b;

        //key 를 이용한다
        //key 는 중복될 수 없다.
        //데이처 중복이 가능하다.
        //HashMap 객체 생성
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        System.out.println("map.size() : "+map.size());

        //데이터 추가
        map.put(5, "Hello");
        map.put(6, "Java");
        map.put(7, "World");
        System.out.println("map : " + map);
        System.out.println("map.size() : " + map.size());

        map.put(8, "!!");
        System.out.println("map : " + map);

        //데이터 교체
        map.put(6, "C");
        System.out.println("map : " + map);

        //데이터 추출
        str = map.get(5);
        System.out.println("map.get(5) : "+str);

        //데이터 제거
        map.remove(8);
        System.out.println("map : " + map);


        //특정 데이터 포함 유무
        b = map.containsKey(7);
        System.out.println("map.containsKey(7) : " + b);

        b = map.containsValue("World");
        System.out.println("map.containsValue(\"World\") : " + b);

        //데이터 전체제거
        map.clear();
        System.out.println("map : " + map);

        //데이터 유무
        b=map.isEmpty();
        System.out.println("map.isEmpty() : " + b);

    }
}
