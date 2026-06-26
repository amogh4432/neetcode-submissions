class Solution {

    public String encode(List<String> strs) {

        String str="";

        for(String s:strs){
            int len;
            len=s.length();
            str=str+len+'#'+s;
        }

        System.out.println(str);
        return str;
    }

    public List<String> decode(String str) {

        List<String> list= new ArrayList<>();

        int i=0;

        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
           int len= Integer.parseInt(str.substring(i,j));
            j++;

            String word = str.substring(j,j+len);
            list.add(word);

            i=j+len;

        }

        return list;
        
    }
}
