var cancellable = function(fn, args, t) {
    let timeoutId

    const cancelFn = () =>{
        clearTimeout(timeoutId)
    }

    timeoutId = setTimeout(()=>{
        const resut = fn(...args)
    }, t)
    return cancelFn
};