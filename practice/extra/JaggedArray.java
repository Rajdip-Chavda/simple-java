class JaggedArray{
    public static void main(String args[])
    {
        //Declaring 2-D array
        int arr[][]=new int[2][];
        
        //First row has 3 columns
        arr[0]=new int [3];
        
        //second row  has 2 columns
        arr[1]=new int [2];
        
        //Initializing Array
        int count=0;
        for(int i =0;i<arr.length;i++)
            for(int j=0;j<arr[i].length;j++)
                arr[i][j]=count++;

        //Display the value of 2d jagged array
        System.out.println("Contents of 2d jagged Array");
        for(int i =0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
                System.out.println(arr[i][j]+" ");
            System.out.println();
        
        }
            
    }

}