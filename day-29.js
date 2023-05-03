/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    var temparr=[];
    var i=0;
    var temp=init;
    if(nums){
        for(i=0;i<=nums.length;i++){
            if(i!=(nums.length)){
           temp=fn(temp,nums[i]);
           }
           else{
               return temp;
           }

        }
    }else{return init} 
};