function dis(val) {
    document.getElementById("result").value += val
}
const myFunction = (event) => {
    const { key } = event;
};
const cal = document.getElementById("calcu");
cal.onkeyup = (event) => {
    if (event.keyCode === 13) {
        console.log("Enter");
        const x = document.getElementById("result").value;
        console.log(x);
        solve();
    }
};

    function solve() { 
        let x = document.getElementById("result").value 
        let y = math.evaluate(x) 
        document.getElementById("result").value = y 
        } 

    function clr() { 
        document.getElementById("result").value = "" 
        } 
