package coding_test.chapter_01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 전화번호 나타내기
 */
public class PhoneNumber {
    
    private final String phoneNumber;

    public PhoneNumber(String rawPhoneNumber) {
        this.phoneNumber = rawPhoneNumber.replaceAll("[^0-9]", "");
    }

    @Override
    public String toString() {
        return "PhoneNumber{" + "phoneNumber='" + phoneNumber + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof  PhoneNumber)) return false;
        return phoneNumber.equals(((PhoneNumber) obj).phoneNumber);
    }

    /**
     * 전화번호의 사람 나타내기
     */
    private static class Person {
        public final String name;
        public final List<PhoneNumber> numbers;

        public Person(String name) {
            this.name = name;
            numbers = new ArrayList<>();
        }

        public void addPhoneNumber(PhoneNumber number) {
            numbers.add(number);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", numbers=" + numbers +
                    '}';
        }


        public boolean hasPhoneNumber(PhoneNumber number) {
            return numbers.contains(number);
        }

        public static void main(String[] args) {
            Person person = new Person("홍길동");
            person.addPhoneNumber(new PhoneNumber("010-1234-5678"));
            person.addPhoneNumber(new PhoneNumber("010 1234 5678"));
            person.addPhoneNumber(new PhoneNumber("01012345678"));
            System.out.println(person);
            System.out.println(person.hasPhoneNumber(new PhoneNumber("01012345678")));
        }
    }

    /**
     * 전화번호부 나타내기
     */
    private static class PhoneBook {
        private final Set<Person> people;

        private PhoneBook() {
            people = new HashSet<>();
        }

        public void addPerson(Person person) {
            people.add(person);
        }

        @Override
        public String toString() {
            return "PhoneBook{" +
                    "people=" + people +
                    '}';
        }

        // 전화번호를 검색하는 메서드
        public Person search(PhoneNumber phoneNumber) {
            return people.stream()
                    .filter(p -> p.hasPhoneNumber(phoneNumber))
                    .findFirst()
                    .orElse(null);
            /**
             * Stream은 여러 반복문을 이용해서 구현해야 할 코드를 매우 간단하게 작성할수 있도록 해준다.
             * 이는 코딩할 시간도 단축해주고 실수할 학률도 낮추어 준다.
             */
        }

        public static void main(String[] args) {
            Person person1 = new Person("홍길동");
            person1.addPhoneNumber(new PhoneNumber("010-1234-5678"));
            person1.addPhoneNumber(new PhoneNumber("010-2345-6789"));

            Person person2 = new Person("김철수");
            person2.addPhoneNumber(new PhoneNumber("010-2468-0246"));

            Person person3 = new Person("이영희");
            person3.addPhoneNumber(new PhoneNumber("010-1357-9135"));

            PhoneBook phoneBook = new PhoneBook();
            phoneBook.addPerson(person1);
            phoneBook.addPerson(person2);
            phoneBook.addPerson(person3);

            System.out.println(phoneBook);
            /**
             * 이 코드의 문제점 -> 중복이 허용된다.
             * 해결책 -> Set<>으로 변경하면 해결 될 것 이다.
             * Set 과 Map은 중복을 제거하거나 Key-value 쌍을 관리하는데 매우 효울적인 자료 구조이다.
             */
            System.out.println();

            // 전화번호 검색
            System.out.println(phoneBook.search(new PhoneNumber("01023456789")));
            System.out.println(phoneBook.search(new PhoneNumber("01024680246")));
            System.out.println(phoneBook.search(new PhoneNumber("01013579135")));
            System.out.println(phoneBook.search(new PhoneNumber("01000000000")));
        }
    }

    public static void main(String[] args) {
        System.out.println(new PhoneNumber("010-1234-5678"));
        System.out.println(new PhoneNumber("010 1234 5678"));
        System.out.println(new PhoneNumber("01012345678"));
    }

}
