import tensor.Tensor;

import java.util.ArrayList;

public class mainTensor {
    public static void main(String[] args){
        ArrayList<Integer> data = new ArrayList();
        
        Tensor<Integer, ArrayList<Integer>> matrix = new Tensor<>(data,new int[]{1,2});
    }
}
