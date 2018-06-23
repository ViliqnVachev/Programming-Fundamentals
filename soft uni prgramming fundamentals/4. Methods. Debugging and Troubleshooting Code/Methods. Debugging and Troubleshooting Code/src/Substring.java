import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);



        String text = s.nextLine();
        int jump = Integer.parseInt(s.nextLine());

		 char Search = 'p';
        boolean hasMatch = false;

        for (int i = 0; i < text.length(); i++)
        {
           if (text.charAt(i) == Search)
            {
                hasMatch = true;

                int endIndex = jump+1;

                if (endIndex+i > text.length())
                {
                    endIndex = text.length()-i;
                }

                String matchedString = text.substring(i, endIndex);
                System.out.println(matchedString);
                i += jump;
            }
        }

        if (!hasMatch)
        {
            System.out.println("no");
        }
    }
}
