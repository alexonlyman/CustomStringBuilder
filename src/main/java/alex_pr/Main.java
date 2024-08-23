package alex_pr;




public class Main {
    public static void main(String[] args) {
        CustomStringBuilder customBuilder = new CustomStringBuilder();
        customBuilder.append("abc");
        customBuilder.append("asdasd");
        System.out.println(customBuilder);
        customBuilder.undo();
        System.out.println(customBuilder);

    }
}