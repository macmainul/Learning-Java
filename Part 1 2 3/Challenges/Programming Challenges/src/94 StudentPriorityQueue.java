import java.util.Comparator;
import java.util.PriorityQueue;

class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getGrage() - t1.getGrage();
            }
        });

        queue.offer(new Student("Mainul",'A'));
        queue.offer(new Student("Taskin",'C'));
        queue.offer(new Student("jahid",'B'));
        queue.offer(new Student("Shafin",'A'));

        System.out.printf("Queue is : %s\n", queue);
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
    }

    private static class Student    {
        private final String name;
        private final char grage;

        public Student(String name, char grage) {
            this.name = name;
            this.grage = grage;
        }

        public String getName() {
            return name;
        }

        public char getGrage() {
            return grage;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", grage=" + grage +
                    '}';
        }
    }

}
