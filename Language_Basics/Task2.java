class Task2{
    public static void main(String[] args){
        if (args.length != 1) {
            System.exit(1);
        }
        String word1 = args[0];
        System.out.print("Welcome " +word1);
    }
}