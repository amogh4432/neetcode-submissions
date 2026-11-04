class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

        while (start < end) {
            char c = s.charAt(start);
            char e=s.charAt(end);
            System.out.println(c);
            System.out.println(e);
            if (((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))) {
                if (((e >= 'A' && e <= 'Z') || (e >= 'a' && e <= 'z') || (e >= '0' && e <= '9'))){
                    if (Character.toLowerCase(c) == Character.toLowerCase(e)) {
                        start++;
                        end--;
                        continue;
                    }else{
                        return false;
                    }

                }else{
                    end--;
                }
            }else{
                start++;
            }
        }
        return true;
    }
}
