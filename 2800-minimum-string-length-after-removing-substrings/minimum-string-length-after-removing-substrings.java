class Solution {
    public int minLength(String s) {
     char[] ch=s.toCharArray();
     int n=s.length();
     int write=0;
     for(int read=0;read<n;read++){
        if(write==0){
            ch[write]=ch[read];
            write++;
            continue;
        }
        if(ch[read]=='B' && ch[write-1]=='A')
            write--;
        else if(ch[read]=='D' && ch[write-1]=='C')
            write--;
        else{
            ch[write]=ch[read];
            write++;
        }
    }
    return write;
    }
}