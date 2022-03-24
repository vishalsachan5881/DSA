class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int boat = 0;
        int f = 0 , l = n-1;
        while(f <= l){
            if(people[f] + people[l] <= limit)
            f++;
            l--;
            boat++;
            
        }
        return boat;
    }
}