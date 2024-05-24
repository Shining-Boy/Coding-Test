package algorithm.question21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    private boolean isPrime(int n){
        if(n <= 1) return false;

        for(int i=2; i<n; i++){
            if(n % i == 0) return false;
        }

        return true;
    }

    private Set<Integer> getPrimes(int acc, List<Integer> numbers){
        Set<Integer> primes = new HashSet<>();
        if(isPrime(acc)) primes.add(acc);

        for(int i=0; i<numbers.size(); i++){
            List<Integer> newNumbers = new ArrayList<>(numbers);
            newNumbers.remove(i);
            primes.addAll(getPrimes(acc*10 + numbers.get(i).intValue(), newNumbers));
        }

        return primes;
    }

    public int solution(String numbers){
        List<Integer> convertedNumbers = new ArrayList<>();
        for(char c : numbers.toCharArray()){
            convertedNumbers.add(c - '0');
        }

        return getPrimes(0, convertedNumbers).size();
    }
}
