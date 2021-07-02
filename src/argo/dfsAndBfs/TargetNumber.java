package argo.dfsAndBfs;

import java.util.*;
/*https://programmers.co.kr/learn/courses/30/lessons/43165*/
/*
n개의 음이 아닌 정수가 있습니다. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.*/
public class TargetNumber {
    static int count;
    static int len;
    public int solution(int[] numbers, int target) {
        len = numbers.length;
        count = 0;
        countS(numbers, numbers[0], target, 0, numbers[0]);
        countS(numbers, numbers[0], target, 0, -numbers[0]);
        return count;
    }
    static void countS(int[] numbers,int cur, int target,int curInd, int sum){
        if(curInd>=len-1){
            if(sum == target) count++;
            return;
        }
        countS(numbers, numbers[curInd+1],target, curInd+1, sum+numbers[curInd+1]);
        countS(numbers, numbers[curInd+1],target, curInd+1, sum-numbers[curInd+1]);
    }
}