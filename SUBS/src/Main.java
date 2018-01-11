public class Main {
    public static void main(String[] args){
        DataInput input = new DataInput();
        System.out.println("Enter string t:");
        String t = input.input();
        System.out.println("Enter string s:");
        String s = input.input();
            if (t.contains(s)){
                System.out.println(t.indexOf(s));

            }

    }
}
