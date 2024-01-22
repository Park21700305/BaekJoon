public class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String tree : skill_trees) {
            String skillOrder = tree.chars()
                                    .mapToObj(c -> String.valueOf((char) c))
                                    .filter(skill::contains)
                                    .reduce("", String::concat);

            if (skill.startsWith(skillOrder)) {
                answer++;
            }
        }
        return answer;
    }
}
