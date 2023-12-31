/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    nums.forEach(num => {
        const idx = Math.abs(num);

        if(nums[idx - 1] > 0){
            nums[idx - 1] *= -1; 
        }
    })

    const result = [];
    for(let i = 0 ; i < nums.length; i++){
        if(nums[i] > 0){
            result.push(i+1);
        }
    }
    return result;
};