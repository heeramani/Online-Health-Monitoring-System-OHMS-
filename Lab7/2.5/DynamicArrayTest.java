    import java.util.Scanner;
    import java.util.ArrayList;

    class DynamicArray{
            private ArrayList<String> arraylist;
            public DynamicArray() {
                arraylist = new ArrayList<String>();
                }
       
        public int size()

        {

            return arraylist.size();

        }   

        /** function to insert element **/

        public void insert(String key)

        {

            arraylist.add(key);

        }    

        /** function to remove element **/

        public void remove(String key)

        {

            arraylist.remove(key);

        } 

        /** function to display array **/

        public void print()

        {

            System.out.println("\nDynamic Array : "+ arraylist);

            System.out.println();

        }              

    }

     

    /** Class DynamicArrayTest **/

    public class DynamicArrayTest

    {

        public static void main(String[] args)

        {

            Scanner scan = new Scanner(System.in);

            System.out.println("Dynamic Array Test\n");   

     

            DynamicArray dynamicarray = new DynamicArray();

     

            char ch;

            /*  Perform Dynamic Array operations */

            do    

            {

                System.out.println("\nDynamic Array\n");

                System.out.println("1. insert ");

                
                System.out.println("2. remove by varraylist");


                System.out.println("3. size");
                System.out.println("4. print");

     

                int choice = scan.nextInt();            

                switch (choice) 

                {

                case 1 : 

                    System.out.println("Enter varraylist to insert");

                    dynamicarray.insert(scan.next() );                     

                    break;                          

                case 2 : 

                    System.out.println("remove");

                    dynamicarray.remove(scan.next() );

                    break;        

                
                case 3 : 

                    System.out.println("\nSize = "+ dynamicarray.size() );

                    break;

                case 4 :
                    System.out.println("\n Prints all elements of array:\t" +  dynamicarray.print());

                default : 

                    System.out.println("Wrong Entry \n ");

                    break;   

                }    

                

                System.out.println("\nDo you want to continue (Type y or n) \n");

                ch = scan.next().charAt(0);                        

            } while (ch == 'Y'|| ch == 'y');               

        }

    }