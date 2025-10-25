public class BatchChanging {
    public static void main(String[] args) {
        int[] weights = {198, 190, 188, 187, 190, 198, 201, 250, 203, 210, 205, 170, 180, 200, 203, 210, 180};

        for (int i=0; i<weights.length;i++){
            int weight = weights[i];
            if (weight>2020){
                weights[i] = 198;
            }
        }
        for(int weight: weights){
            System.out.println(weight);
        }
    }
}
