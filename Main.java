import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static Movie movies[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Movie> stack = new Stack<Movie>();
        while (true) {
            Movie movie = new Movie();
            System.out.println("Select Choice ");
            System.out.println("1-Create Movie Data");
            System.out.println("2-Read Movie Data");
            System.out.println("3-Update Movie Data");
            System.out.println("4-Delete Movie Data");
            System.out.println("5-Order By Release Date");
            System.out.println("6-Exit");
            System.out.println("\nEnter Choice");
            int choice = sc.nextInt();
            String str1 = sc.nextLine();
            if (choice == 1) {
                System.out.println("Enter Name of movie");
                movie.name = sc.nextLine();
                System.out.println("Enter release Year of movie");
                movie.release_year = sc.nextInt();
                str1 = sc.nextLine();
                System.out.println("Enter Lead Actor of movie");
                movie.lead_actor = sc.nextLine();
                System.out.println("Enter IMDB Rating of movie");
                movie.rating = sc.nextFloat();
                str1 = sc.nextLine();
                stack.push(movie);
            } else if (choice == 2) {
                for (int i = 0; i < stack.size(); i++) {
                    System.out.println(i+1 + " : ");
                    movie.print(stack.get(i));
                }
            } else if (choice == 3) {
                for (int i = 0; i < stack.size(); i++) {
                    System.out.println(i+1 + " : ");
                    movie.print(stack.get(i));
                }
                System.out.println("Enter number to select movie record : ");
                int update_choice = sc.nextInt();
                movie.print(stack.get(update_choice-1));
                str1 = sc.nextLine();
                System.out.println("Enter name to change : ");
                String name = sc.nextLine();
                stack.get(update_choice-1).name = name;
                System.out.println("Enter Release Year to change : ");
                int release_year = sc.nextInt();
                stack.get(update_choice-1).release_year = release_year;
                str1 = sc.nextLine();
                System.out.println("Enter Lead Actor name to change : ");
                String lead_actor = sc.nextLine();
                stack.get(update_choice-1).lead_actor = lead_actor;
                System.out.println("Enter rating to change : ");
                float rating = sc.nextFloat();
                stack.get(update_choice-1).rating = rating;
                str1 = sc.nextLine();
                movie.print(stack.get(update_choice-1));
            }
            else if(choice == 4)
            {
                for (int i = 0; i < stack.size(); i++) {
                    System.out.println(i+1 + " : ");
                    movie.print(stack.get(i));
                }

                System.out.println("Enter number to delete movie record : ");
                int update_choice = sc.nextInt();
                str1 = sc.nextLine();
                stack.remove(update_choice-1);
                for (int i = 0; i < stack.size(); i++) {
                    System.out.println(i+1 + " : ");
                    movie.print(stack.get(i));
                }
            }
            else if(choice == 5)
            {
                int release[] = new int[stack.size()];
                for (int i = 0; i < stack.size(); i++) {
                    release[i] = stack.get(i).release_year;
                }
                Arrays.sort(release);
                for (int i = 0; i < release.length; i++) {
                    for (int k= 0; k < stack.size(); k++) {
                        if (release[i] == stack.get(k).release_year) {
                            movie.print(stack.get(k));
                            break;
                        }
                    }
                }
            }
            else
            {
                break;
            }
        }
    }
}
