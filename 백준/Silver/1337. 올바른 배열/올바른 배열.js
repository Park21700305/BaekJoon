const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const arr = input.slice(1).map(Number);

function solve(arr) {
    arr.sort((a, b) => a - b);
    let min = 5;
    
    for (let i of arr) {
        let cnt = 1;
        for (let j = 1; j < 5; j++) {
            if (arr.includes(i + j)) cnt++;
        }
        min = Math.min(min, 5 - cnt);
    }
    
    return min;
}

console.log(solve(arr));