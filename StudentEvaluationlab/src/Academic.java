public class Academic extends Details{
    float[] avg = new float[n];

    void average() {
        total();
        for (int i = 0; i < n; i++) {
            avg[i] = total[i];
            avg[i] = (avg[i])/3;
            System.out.println("avg is "+avg[i]);
        }
    }
    @Override
    public void display()
    {
        super.display();
        average();
        for(int i=0;i<n;i++)
        {
            System.out.println("\n the total marks ofthe "+(i+1)+"student is:"+total[i]);
            //System.out.println("\n the percentage of the "+(i+1)+"student is:"+avg[i]);
        }
    }
}