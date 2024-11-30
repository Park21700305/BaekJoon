function solution(array, n) {
    var answer = 0;
    let Array = array.filter((item) => item === n);
    answer = Array.length;

    return answer;
}