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
        System.out.println("Dead: " + dead);
        System.out.println("Died: " + died);

        if (dead) {
            System.out.println("This cat has finally died");
        } else {
            System.out.println("This cat has only died " + died + " times.");
            died = died + 1;
            System.out.println("Died: " + died);
            // if (died == 2) {
            //     dead = true;
            // }
        }

    }

    public static void main(String[] args) {
        Cat curly = new Cat();
        curly.name = "Curly";
        curly.color = "Black";
        curly.age = 102;
        curly.died = 0;
        curly.stats();
    }
}