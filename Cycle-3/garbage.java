import java.util

class garbage 
{
   public static void main (String args[])
   
   {      
      	Runtime r=Runtime.getRuntime();
      	long mem1;
      	integer sameints[]=new Integer[1000];
      	 system.out.println("total memory="+r.totalMemory());
      	 mem1=r.freememory();
      	 System.out.println("the free memory before gc is called =+freememory);

   }
}
