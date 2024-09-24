function solution(nums) {

    // nums에서 중복 제거한 값 추출
    const noDuplNum = new Set(nums).size;
    
    // 최대 선택 가능 값 N/2
    const maxSelect = nums.length / 2;
    
    // 이 둘 중 작은 값 선택
    const result = Math.min(noDuplNum, maxSelect);
    
    return result;

}
