package com.rxy.demo.Demo01;



import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
    public static void main(String[] args) {

//        filter();
//        distinct();
//        distinct();
//        limit();
//        skip();
//        map();
//        flatmap();
//        map2flatMap();
//        sorted();
//        anyMatch();
//        allMatch();
//        noneMatch();
//        findAny();
//        findFirst();
//        forEach();
//        collect();
//        reduce();
        count();
    }

    public static void filter(){

//        strings.parallelStream();//并行
//        strings.stream();//串行
        List<String> strings= Arrays.asList("abc","f","adfc","ase","","abc","");
        List<String> filter = strings.stream().filter(str -> str.contains("f")).collect(Collectors.toList());
        System.out.println(filter);
    }
    public static void distinct(){
        List<String> strings= Arrays.asList("abc","f","adfc","ase","","abc","");
        List<String> distincted = strings.stream().distinct().collect(Collectors.toList());
        System.out.println(distincted);
        //-------------------------------------

        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("鹿晗",21));
        students.add(new Student("鹿晗",21));
        students.add(new Student("吴亦凡",22));
        students.add(new Student("吴亦凡",23));

        List<Student> distinctedStudent = students.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctedStudent);
    }
    public static void limit(){
        List<String> strings= Arrays.asList("abc","f","adfc","ase","","abc","");
        List<String> limited = strings.stream().limit(2).collect(Collectors.toList());
        System.out.println(limited);
    }
    public static void skip(){
        List<String> strings= Arrays.asList("abc","f","adfc","ase","","abc","");
        List<String> skiped = strings.stream().skip(2).collect(Collectors.toList());
        System.out.println(skiped);
    }
    public static void map(){
        List<String> strings= Arrays.asList("abc","f","adfc","ase","","abc","");
        List<String> mapped = strings.stream().map(str -> str.concat("mapped")).collect(Collectors.toList());
        System.out.println("后缀:");
        System.out.println(mapped);
        List<String> mappedd = strings.stream().map(str -> "mapped" + str).collect(Collectors.toList());
        System.out.println("前缀:");
        System.out.println(mappedd);
    }
    public static void flatmap(){
        List<String> strings= Arrays.asList("abc","f","adfc","ase","","abc","");
        List<Character> flatMaped = strings.stream().flatMap(str -> DemoStream.getCharacterBySream(str)).collect(Collectors.toList());
        System.out.println(flatMaped);
    }
    public static void map2flatMap(){
        //map返回一个值，flatMap返回一个流
        List<String> strings= Arrays.asList("abc","f","adfc","ase","","abc","");
        List<Character> flatMaped = strings.stream().flatMap(str -> DemoStream.getCharacterBySream(str)).collect(Collectors.toList());

        flatMaped.forEach(s-> System.out.print(s));
        //        (1)[a,b,c],[f],[a,d,f,c]...[a,b,c],[]
        //        (2)[a,b,c...a,b,c, ]
        List<String> strings1= Arrays.asList("abc","f","adfc","ase","","abc","");
        List<Stream<Character>> mapped = strings1.stream().map(str -> DemoStream.getCharacterBySream(str)).collect(Collectors.toList());
        mapped.forEach(stream->{stream.forEach(character->{ System.out.println(character); });});
        //        (1)[a,b,c],[f],[a,d,f,c]...[a,b,c],[]
    }
    public static Stream<Character> getCharacterBySream(String str){
        List<Character> characterList=new ArrayList<>();
        for (Character character:str.toCharArray()){
            characterList.add(character);
        }
        return characterList.stream();
    }
    public static void sorted(){
//        ------------------字幕排序----------------------
        List<String> strings= Arrays.asList("abc","f","dac","ase","","abc","");
        List<String> sorted = strings.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);
//        ------------------数字排序----------------------
        List<Integer> nums=Arrays.asList(10,2,3,4,5,6,10);
        List<Integer> sortednum = nums.stream().sorted().collect(Collectors.toList());
        System.out.println(sortednum);
//        ------------------汉字排序----------------------
        List<String> strings1= Arrays.asList("你好","好","排序","汉字","试试","赵");
        List<String> sortedh = strings1.stream().sorted(Collections.reverseOrder(Collator.getInstance(Locale.CHINA))).collect(Collectors.toList());
        System.out.println(sortedh);
    }
    //------------------------------------------------------------------------------
    public static void anyMatch(){
        List<String> strings= Arrays.asList("abc","f","dac","ase","","abc","");
        boolean yesno = strings.stream().anyMatch(s -> s.contains("bc"));
        System.out.println(yesno);
    }
    public static void allMatch(){
        List<String> strings= Arrays.asList("abc","f","dac","ase","","abc","");
        boolean yesno = strings.stream().allMatch(s -> s.length()>0);
        System.out.println(yesno);
    }
    public static void noneMatch(){
        List<String> strings= Arrays.asList("abc","f","dac","ase","","abc","");
        boolean yesno = strings.stream().noneMatch(s -> s=="bc");
        System.out.println(yesno);
    }
    public static void findAny(){
        List<String> strings= Arrays.asList("abc","f","dac","ase","abc");

        for (int i = 0; i < 100; i++) {
            Optional<String> any = strings.stream().findAny();//stream串型，每次都拿第一个
//            Optional<String> any = strings.parallelStream().findAny();//parallelStream并行，随机
            if (any.isPresent()) System.out.println(any.get());
        }

    }
    public static void findFirst(){
        List<String> strings= Arrays.asList("abc","f","dac","ase","abc");

        for (int i = 0; i < 100; i++) {
            Optional<String> any = strings.stream().findFirst();//stream串型,parallelStream并行，每次都拿第一个
//            Optional<String> any = strings.parallelStream().findAny();
            if (any.isPresent()) System.out.println(any.get());
        }

    }
    public static void forEach(){
        List<String> strings= Arrays.asList("abc","f","dac","ase","abc");
        strings.stream().forEach(s->System.out.println(s));
    }
    public static void collect(){
        List<String> strings= Arrays.asList("abc","f","dac","ase","abc");
        Set<String> collect = strings.stream().collect(Collectors.toSet());
        System.out.println(collect);
        Map<String, String> collect1 = strings.stream().collect(Collectors.toMap(v -> "prod_"+v, v -> v, (oldvalue, newvalue) -> newvalue));
        System.out.println(collect1);

    }
    public static void reduce(){
        List<String> strings= Arrays.asList("abc","f","dac","ase","abc");
        Optional<String> reduce = strings.stream().reduce((acc, item) -> { return (acc + item).replace("a","A"); });
        if (reduce.isPresent())System.out.println(reduce.get());
        String reduce1 = strings.stream().reduce("abd", (acc, item) -> { return (acc + item).replace("a", "A"); });
        System.out.println(reduce1);
    }
    public static void count(){
        List<String> strings= Arrays.asList("abc","f","dac","ase","abc");
        long count = strings.stream().count();
        System.out.println(count);
    }
}
