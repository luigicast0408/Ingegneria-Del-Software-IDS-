public class Main {
    public static void main(String[] args) {
        CreatorPool pool = new CreatorPool();

        // Retrieving a Shape from the pool
        Shape shape1 = pool.getShape();
        shape1.draw(); // Output: Drawing a circle

        // Releasing the instance back to the pool
        pool.relaseShape(shape1);

        // Retrieving another Shape (reusing the object)
        Shape shape2 = pool.getShape();
        shape2.draw(); // Output: Drawing a circle (reused)
    }
}
