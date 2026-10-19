// Java 示例：Person 类 + 简单的集合统计
// 编译：javac Main.java && java Main
import java.util.*;

public class Main {
    // 简单实体类
    static class Person {
        String name;
        int age;
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString() {
            return name + "(" + age + ")";
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 22));
        people.add(new Person("Bob", 25));
        people.add(new Person("Carol", 20));

        // 按年龄排序
        people.sort(Comparator.comparingInt(p -> p.age));
        System.out.println("按年龄排序: " + people);

        // 求平均年龄
        double avg = people.stream().mapToInt(p -> p.age).average().orElse(0.0);
        System.out.println("平均年龄: " + avg);
    }
}
