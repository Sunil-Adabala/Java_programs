import java.util.Scanner;

public class Details {
    Scanner scanner = new Scanner(System.in);
    public int n = 1;
    public String[] name = new String[n];
    public String[] branch = new String[n];
    public int[] age = new int[n];
    public int[] rollno = new int[n];
    public int[] marks = new int[3];
    public int[] total = {0};


    public void setData(){
        for(int i=0;i<n;i++) {
            System.out.println("Enter name of "+(i+1)+" student");
            name[i]=scanner.nextLine();
            System.out.println("\n please enter the branch of the "+(i+1)+"student");
            branch[i]= scanner.nextLine();
            System.out.println("\n please enter the rollno of the "+(i+1)+"student");
            rollno[i]= scanner.nextInt();
            System.out.println("\n please enter the age of the "+(i+1)+"student");
            age[i]= scanner.nextInt();

        }
        for(int j=0;j<3;j++){
            System.out.println("Enter marks of "+(j+1)+" subject ");
            marks[j]=scanner.nextInt();
        }
    }

    public void display(){
        for(int i=0;i<n;i++) {
            System.out.println("\n the name of the "+(i+1)+"student is:"+name[i]);
            System.out.println("\n the branch of the "+(i+1)+"student is:"+branch[i]);
            System.out.println("\n the rollno of the "+(i+1)+"student is:"+rollno[i]);
            System.out.println("\n the age of the "+(i+1)+"student is:"+age[i]);
            for(int j=0;j<3;j++) {
                System.out.println("the marks of the"+(i+1)+" student" + (j + 1) + "subject  " + marks[j]);
            }
        }
    }

    public void total()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
                total[i]=total[i]+marks[j];
        }
    }

}
//    public int n=1;
//    public String[] name=new String[n];
//    public String[] branch=new String[n];
//    public int[] age=new int[n];
//    public int[] rollno=new int[n];
//    public int[] marks =new int[3];
//    public int[] total=new int[n];
//    void setdata()
//    {
//        for(int i=0;i<n;i++)
//        {
//            System.out.println("\nplease enter the name of the "+(i+1)+"student");
//            name[i]= scanner.nextLine();
//            System.out.println("\n please enter the branch of the "+(i+1)+"student");
//            branch[i]= scanner.nextLine();
//            System.out.println("\n please enter the rollno of the "+(i+1)+"student");
//            rollno[i]= scanner.nextInt();
//            System.out.println("\n please enter the age of the "+(i+1)+"student");
//            age[i]= scanner.nextInt();
//            for(int j=0;j<3;j++)
//            {
//                System.out.println("\n please enter the marks of the "+(j+1)+"student");
//                marks[j]= scanner.nextInt();
//            }
//        }
//    }
//    void display()
//    {
//        for( int i=0;i<n;i++)
//        {
//            System.out.println("\n the name of the "+(i+1)+"student is:"+name[i]);
//            System.out.println("\n the branch of the "+(i+1)+"student is:"+branch[i]);
//            System.out.println("\n the rollno of the "+(i+1)+"student is:"+rollno[i]);
//            System.out.println("\n the age of the "+(i+1)+"student is:"+age[i]);
//            for(int j=0;j<3;j++)
//            {
//                System.out.println("the marks of the "+(j+1)+"student"+marks[j]);
//            }
//        }
//    }
//    void total()
//    {
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<3;j++)
//                total[i]+=marks[j];
//        }
//    }
//}

