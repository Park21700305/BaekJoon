function solution(participant, completion) {
    var answer = '';
    
    const map = new Map();
    
    participant.forEach(name => {
        map.set(name, (map.get(name) || 0) + 1);
    }
    )
    
    completion.forEach(name => {
          map.set(name, map.get(name) - 1);
    })
    
    answer = [...map].find(([name, count]) => count > 0)[0];
    
    
    return answer;
}