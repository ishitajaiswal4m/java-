import java.lang.*;
class ThreeDArray{
	 public static void main(String args[]){
		 int i,j,k;
		 int a[][][]=new int [4][2][3];
		 for(i=0;i<4;i++)
			 for(j=0;j<2;j++)
				  for(k=0;k<3;k++)
					   a[i][j][k]=i*j*k;
  
  
        for(i=0;i<4;i++){
			 for(j=0;j<2;j++){
				  for(k=0;k<3;k++)
                        System.out.print(a[i][j][k] +" ");
  
            System.out.println();
			 }
	     System.out.println();
		}
	 }
}