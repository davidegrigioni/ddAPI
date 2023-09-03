package cc.davyy.ddapi.utils.geometry;

import org.bukkit.util.Vector;

public class VectorUtils {

    /**
     * Add two vectors and return the result.
     *
     * @param vector1 The first vector.
     * @param vector2 The second vector.
     * @return The sum of the two vectors.
     */
    public static Vector add(Vector vector1, Vector vector2) {
        return vector1.clone().add(vector2);
    }

    /**
     * Subtract vector2 from vector1 and return the result.
     *
     * @param vector1 The vector to subtract from.
     * @param vector2 The vector to subtract.
     * @return The result of the subtraction.
     */
    public static Vector subtract(Vector vector1, Vector vector2) {
        return vector1.clone().subtract(vector2);
    }

    /**
     * Multiply a vector by a scalar value and return the result.
     *
     * @param vector The vector to multiply.
     * @param scalar The scalar value.
     * @return The result of the multiplication.
     */
    public static Vector multiply(Vector vector, double scalar) {
        return vector.clone().multiply(scalar);
    }

    /**
     * Divide a vector by a scalar value and return the result.
     *
     * @param vector The vector to divide.
     * @param scalar The scalar value.
     * @return The result of the division.
     */
    public static Vector divide(Vector vector, double scalar) {
        if (scalar == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return vector.clone().multiply(1.0 / scalar);
    }

}
