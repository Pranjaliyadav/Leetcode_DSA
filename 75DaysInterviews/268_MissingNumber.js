/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    //make new array of size n+1, so missing no. can be added, and fill it with -1, 
    const res = new Array(nums.length).fill(-1);
    //as num of nums can be used as an index also cuz we storing [0,n] no.s so put number at their own indexed location
    for(const num of nums){
        res[num] = num;
    }
    //now one will be left with -1 and you just return it using indexOf ez
    return res.indexOf(-1);
};