class NumArray {
    private int[] array;
    public NumArray(int[] nums) {
        array = new int[nums.length + 1];
        for (int i = 0; i < nums.length;i++) {
            array[i+1] = array[i] + nums[i];
        } 
    }
    
    public int sumRange(int left, int right) {
        
        return array[right + 1] - array[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */