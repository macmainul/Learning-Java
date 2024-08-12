class studentToString {

    String name;
    int age;
    String rollNum;
    String house;

    public studentToString(String name, int age, String rollNum, String house) {
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.house = house;
    }

    @Override
    public String toString() {
        return "studentToString{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNum='" + rollNum + '\'' +
                ", house='" + house + '\'' +
                '}';
    }

    public static void main(String[] args) {
        studentToString std = new studentToString("Mainul",22,"1021","YKSG 1");
        System.out.println(std);
    }
}
