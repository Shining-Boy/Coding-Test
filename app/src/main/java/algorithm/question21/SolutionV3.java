package algorithm.question21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class SolutionV3 {
    private boolean isPrime(int n){
        if(n <= 1) return false;

        for(int i=2; i<n; i++){
            if(n % i == 0) return false;
        }

        return true;
    }

    private Set<Integer> getPrimes(int acc, List<Integer> numbers, Boolean[] isUsed, Set<Integer> primes){
        if(isPrime(acc)) primes.add(acc);

        for(int i=0; i<numbers.size(); i++){
            if(isUsed[i]) continue;

            //List<Integer> newNumbers = new ArrayList<>(numbers);
            //newNumbers.remove(i);
            isUsed[i] = true;
            getPrimes(acc*10 + numbers.get(i).intValue(), numbers, isUsed, primes);
            isUsed[i] = false;
        }

        return primes;
    }

    public int solution(String numbers){
        List<Integer> convertedNumbers = new ArrayList<>();
        Set<Integer> primes = new HashSet<>();
        for(char c : numbers.toCharArray()){
            convertedNumbers.add(c - '0');
        }
        Boolean[] isUsed = new Boolean[convertedNumbers.size()];
        Arrays.fill(isUsed, false);
        getPrimes(0, convertedNumbers, isUsed, primes);

        return primes.size();
    }
}
