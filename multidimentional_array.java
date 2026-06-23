
public interface multidimentional_array {
    public static void main(String[] args){
        int nums[][] = new int[3][];
        //Jagged arrays
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[3];
        //outer loop is for row
        for(int i=0; i<3; i++){
            //Inner loop is for columns
            for(int j=0; j<nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 100);
            }
        }
        for(int i=0; i<3; i++){
            //Inner loop is for columns
            for(int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        //for using Enhanched for loop array
        for(int n[] : nums){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
