public class MirrorInverseArray1  
{  
//function that returns true if the array is mirror-inverse  
static boolean isMirrorInverse(int arr[])  
{  
for (int i = 0; i < arr.length; i++)   
{  
//if condition fails for any element  
if (arr[arr[i]] != i)  
return false;  
}  
//given array is mirror-inverse  
return true;  
}  
//driver code  
public static void main(Strin args[])  
{  
int arr[] = { 1, 2, 3, 0 }; 
//function calling  
if (isMirrorInverse(arr))  
System.out.println("Yes");  
else  
System.out.println("No");  
}  
}
