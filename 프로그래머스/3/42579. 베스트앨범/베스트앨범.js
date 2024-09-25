function solution(genres, plays) {
 
    const countPerGenreMap  = new Map();
    const songData = [];
    
    genres.forEach((genre, index) => {
        
        const playCount = plays[index];
        
        countPerGenreMap.set(genre, (countPerGenreMap.get(genre) || 0) + playCount);
        songData.push({genre, playCount, index});
    });
    
    const sortedCountPerGenre = [...countPerGenreMap.entries()].sort((a, b) => b[1] - a[1]);
    
    const result = [];
    
    sortedCountPerGenre.forEach(([genre]) => {
        
        const songsInGenre = songData.filter(song => song.genre === genre);
        
        songsInGenre.sort((a, b) => b.playCount - a.playCount || a.index - b.index);
        
        result.push(...songsInGenre.slice(0, 2).map(song => song.index));
    });
    
    return result;

}