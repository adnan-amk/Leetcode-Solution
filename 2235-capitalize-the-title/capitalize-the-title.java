class Solution {
    public String capitalizeTitle(String title) {
      String arr[]=title.split(" ");
      for(int i=0;i<arr.length;i++)  
      {
          if(arr[i].length()>2)
          {
              arr[i]=Character.toUpperCase(arr[i].charAt(0))+arr[i].substring(1).toLowerCase();
          }
          if(arr[i].length()<=2)
          {
              arr[i]=arr[i].toLowerCase();
          }
      }
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<arr.length;i++)
      {
          sb.append(arr[i]).append(" ");
      }
      return sb.toString().trim();
    }
}