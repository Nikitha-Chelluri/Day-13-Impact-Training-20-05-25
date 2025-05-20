class BasicMethods {
    public static void main(String[] args) {
        String name = "Nikitha Chelluri";
        String name1 = new String("Nikitha Chelluri");
        String name2 = new String("Nikitha Chelluri");
        String variable = "Events";

        System.out.println("Length: "+name.length());
        System.out.println("Uppercase: "+name.toUpperCase());
        System.out.println("Starts with 'P': "+name.startsWith("P"));
        System.out.println("Contains 'Parul': "+name.contains("Parul"));
        System.out.println("Starts with 'P': "+name.charAt(2));
        System.out.println("Starts with 'P': "+name.substring(0, 5));
        System.out.println("Starts with 'P': "+name.equals(name1));
        System.out.println("Starts with 'P': "+name1.equals(name2));
        StringBuilder vamc = new StringBuilder(name);
        StringBuilder vamsi = new StringBuilder(variable);
        System.out.println(vamc.append(" n-block"));
        System.out.println(name.concat(" BLockk"));
    }
}