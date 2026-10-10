public class GetLoopy_Task5 {
    void main()
    {
        for(int row = 1; row <= 5; row++)
        {
            for(int column = 1; column <= row; column++)
            {
                IO.print("*");
            }
            IO.println("");
        }
    }

}
