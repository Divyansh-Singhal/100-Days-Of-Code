
var createCounter = function(n) {
    var count=n-1
    return function() {
        count++;
        return count;
        
    };
};

