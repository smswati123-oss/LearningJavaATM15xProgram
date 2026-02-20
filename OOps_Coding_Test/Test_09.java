interface Drawable {
    void draw(); // Methods in an interface are implicitly public and abstract.
}

// 2. Implement the Drawable interface in the Rectangle class
static class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

// 2. Implement the Drawable interface in the Circle class
static class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("drawing circle");
    }
}

// 3. Main class to create objects and call the draw() method
    public static void main(String[] args) {
        // Create objects of Circle and Rectangle
        Drawable d1 = new Circle();     // A variable of type Drawable can refer to any object
        Drawable d2 = new Rectangle();  // of a class that implements the interface.

        // Call the draw() method on each object
        d1.draw(); // Calls the draw() method implemented by Circle
        d2.draw(); // Calls the draw() method implemented by Rectangle
    }
