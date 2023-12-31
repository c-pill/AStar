import java.util.*;
public class AStarDriver
{
    public static void main(String[] args)
    {
        System.out.println("Commands: ");
        System.out.println("\t- p: print normally\n\t- w: print wide\n\t- l: print long\n\t- d: print diagonal");
        Scanner in = new Scanner(System.in);
        String str;
        int mult = 0;
        char com;
        System.out.print("Enter command: ");
        com = in.nextLine().charAt(0);
        System.out.print("Enter string: ");
        str = in.nextLine();
        AStar star = new AStar(str);
        if (com == 'w' || com == 'l' || com == 'd')
        {
            System.out.print("Enter multiplier: ");
            mult = in.nextInt();
        }
            
        if (com == 'w')
            star.printWide(mult);
        else if (com == 'l')
            star.printLong(mult);
        else if (com == 'd')
            star.printDiag(mult);
        else if (com == 'p')
            star.print();
        in.close();
    }
}