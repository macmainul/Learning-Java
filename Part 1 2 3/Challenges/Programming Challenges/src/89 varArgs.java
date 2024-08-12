import java.util.List;

class varArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("Mainul"));
        System.out.println(concatenate("Mainul", " Hasan"));
        System.out.println(concatenate("Mainu" ," Hasan"," (Mukul)" ));
    }

    public static String concatenate(String... str)   {
        StringBuilder sb = new StringBuilder();

        for (String s : str) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
}
