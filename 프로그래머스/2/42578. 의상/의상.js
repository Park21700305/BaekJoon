function solution(clothes) {
    
    const map = new Map();
    let result = 1;
    
    clothes.forEach(x => {
        const category = x[1];
        map.set(category,(map.get(category) || 0) + 1);
    }
    )
    
    map.forEach(count => {
        result *= (count + 1)
    })

    return result - 1; 
}