class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> res = new ArrayList<>();
        String temp = "";
         dfs(n, res , "(",temp, 0,0);
         return res;
    }


    private void dfs(int n , List<String> res , String s, String temp,int open , int close){

        temp = temp + s;
        if(s.equals("(")) open++;
        else close++;

        if(open > n || close > open) return ;  
        if(temp.length() ==2*n) {
                 res.add(temp);
            return;
        }

        
        dfs(n,res,")",temp,open,close);

        //  temp = temp.substring(0, temp.length() - 1);
        //  close--;
         dfs(n,res,"(",temp,open,close);



    }
}
