class Solution {
    public String interpret(String command) {
        String s=new String();
        for(int i=0;i<command.length();i++)
        {
           if(command.charAt(i)=='G')
               {s+="G";}
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')')
                {s+="o";
                    i++;
                }
            else if(command.charAt(i)=='(' && command.charAt(i+1)=='a')
            {
                s+="al";
                i+=2;
            }
        }
        return s;
    }
}