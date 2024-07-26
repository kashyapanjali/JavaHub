import java.util.*;
class Book {
      int accno;
      String title;
      String author;
      int price;
      int tbooks;
      Scanner sc= new Scanner (System.in);
      void setDetails(){
         System.out.println("Enter the Accession Number , Title, Author, and Price");
         accno=sc.nextInt();
         sc.nextLine();
         title=sc.nextLine();
         author=sc.nextLine();
         price=sc.nextInt();
         tbooks=sc.nextInt();
      }

      void showDetails(){
         System.out.println("Accession Number:"+accno);
         System.out.println("Title of the book:"+title);
         System.out.println("Author of the book:"+author);
         System.out.println("Price of this books:"+price);
      }

      void searchBooks(Book book[],int accno){
        boolean status=false;
         for(Book b:book){
            if(b.accno == accno){
                status=true;
                System.out.println("Book is Available in this List...");
                b.showDetails();
            }
         }

         if(!status){
            System.out.println("The Book is not Available in this list...");
         }
      }
      void listAllBooks(){

      }
}

class BookMain{
    public static void main(String args[]){
        Book bk[]=new Book[5];
        Book book =new Book();       
        bk[0]=new Book();
        bk[1]=new Book();
        bk[0].setDetails();
        bk[1].setDetails();
        bk[0].showDetails();
        bk[1].showDetails();
        book.searchBooks(bk, 100);
    }
}
