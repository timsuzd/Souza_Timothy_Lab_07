public class GetLoopy_Task6 {
    void main()
    {
        for(int row = 1; row <= 5; row++)
        {
            for(int column = 1; column <= 6 - row; column++)
            {
                IO.print("*");
            }
            IO.println("");
        }
    }

}
