/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...str) {
        return "Hello World";
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */