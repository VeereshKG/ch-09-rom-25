class RiverRunner {
    public static void main(String[] river) {

        String name = River.name();
        System.out.println("River Name " + name);

        String origin = River.source();
        System.out.println("Origin of river kaveri" + origin);

        double length = River.length();
        System.out.println("Length " + length + "km");

        String state = River.riverState();
        System.out.println("states " + state);

        String mouth = River.riverMouth();
        System.out.println("river mouth is " + mouth);
    }
}
