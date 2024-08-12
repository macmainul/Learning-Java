class makeArray_stringBulilder {
    public static void main(String[] args) {

        String[] str = new String[]  {"This",
                "is", "the", "best", "and", "most",
                "detailed", "course", "on", "java", "on",
                "the", "internet" };

          StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s).append(" ");
        }
        System.out.println(sb);
    }
}
