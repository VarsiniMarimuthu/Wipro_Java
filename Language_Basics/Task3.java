class Main{
    public static void main(String[] args){
        if (args.length != 2) {
            System.exit(1);
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = a + b;
        System.out.print("The sum of "+ a + " and " + b + " is " +c );
    }
}