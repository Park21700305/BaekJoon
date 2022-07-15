#include <string>
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int solution(string skill, vector<string> skill_trees) {
    int answer = 0;
    if(skill.length()==1){
        for(int i=0; i<skill_trees.size(); i++){
            answer += 1;
        }
        return answer;
    }
    else{
    for(int i=0; i<skill_trees.size(); i++){
        int count = 0;
        for(int j=1; j<skill.length(); j++){
            for(int k=0; k<skill_trees[i].size(); k++){
                if(skill[j] == skill_trees[i][k]){
                    auto it = find(skill_trees[i].begin(),skill_trees[i].begin()+k,skill[j-1]);
                    if(it == skill_trees[i].begin()+k){
                        count--;
                    }
                }
            }
        }
        if(count == 0){
            answer++;
        }
    }
    }
    return answer;
}