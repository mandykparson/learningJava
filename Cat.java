class Cat{
    int key;
    String name;
    String color;
    int age;
    boolean dead;
    int died;

    void stats(){
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);

        if (dead) {
            System.out.println("This cat has finally died");
        } else if (died == 0) {
            System.out.println("This cat has never died!");
            died = died + 1;
        } else if (died == 1) {
            System.out.println("This cat died 1 time.");
            died = died + 1;
            dead = true;
        }
    }

    public static void main(String[] args) {
        Cat curly = new Cat();
        curly.name = "Curly";
        curly.color = "Black";
        curly.age = 102;
        curly.died = 0;
        curly.stats();
        curly.stats();
        curly.stats();
    }
}