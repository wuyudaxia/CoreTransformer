package MyTorch.tensor;

import MyTorch.exception.MatrixMultiplicationException;

import java.util.ArrayList;
import java.util.Iterator;

public class Tensor<E extends Number, T extends Iterable<E>>{
    private T data;
    private int[] shape;

    /**
     * A constructor of Tensor class
     * @param data  An iterable data, array would be good
     * @param shape The shape of the data
     */
    public Tensor(T data, int... shape){
        this.data = data;
        this.shape = shape;

    }

    /**
     * Get the shape of the Tensor
     * @return The shape of the Tensor
     */
    public int[] getShape() {
        return shape.clone(); // return a copy to keep the shape immutable
    }


    /**
     * Get the data of the tensor class
     * @return return the data of tensor
     */
    public T getData() {return data;}


    /**
     * A static method letting two tensor for a cross product
     * @param <E> A numeric data type
     * @param <T> An iterable data type
     * @param tensorA Tensor A
     * @param tensorB Tensor B
     * @return A linear result
     */
    public static <E extends Number,T extends Iterable<E>> Iterable<E> crossProduct(Tensor<E,T> tensorA, Tensor<E,T> tensorB){
        int[] shapeTensorA = tensorA.getShape();
        int[] shapeTensorB = tensorB.getShape();
        if(shapeTensorA[shapeTensorA.length-1] == shapeTensorB[shapeTensorB.length-2]){
            throw new MatrixMultiplicationException("Invalid tensor shapes for multiplication");
        }
        ArrayList<E> result = new ArrayList<>();
        return result;

    }

}
