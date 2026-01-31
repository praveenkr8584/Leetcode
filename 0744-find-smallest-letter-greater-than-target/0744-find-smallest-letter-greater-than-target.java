class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int l = 0;
        int h = n - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (letters[mid] == target) {
                // if(letters[n-1] == target){
                //     return letters[0];
                // }else{
                //     while(letters[mid+1] == target){
                //         mid++;
                //     }
                //     return letters[(mid + 1) % n];
                // }
                 // Handle circular array case
                 l=mid+1;
            } else if (letters[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        // if(letters[0] > target){
        //     return letters[0];
        // }else{
            return letters[l%n];
        // }
        
    }
}