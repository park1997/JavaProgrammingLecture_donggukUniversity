package OBJArr;
import java.util.*;
class Book{
	private String title, author;
	public Book() {
		//����Ʈ ������
	}
	public Book(String s,String a) {
		// TODO Auto-generated constructor stub
		this.title=s;
		this.author=a;
	}
	
	void show() {
		System.out.println("å ���� : "+title+", ���� : "+author);
		
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	
}




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" ��ü �迭 �ǽ� ");
		Book Oldman = new Book("���̾�","�켼");
		System.out.println(Oldman.getTitle());
		Oldman.setTitle("���ΰ� �ٴ�");
		System.out.println(Oldman.getTitle());
		
		Oldman.show();
		Book[] book = new Book[10];
		String title1,author1;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<2;i++) {
			System.out.print("���� >");
			title1=sc.nextLine();
			System.out.print("���� >");
			author1=sc.nextLine();
			book[i]=new Book(title1,author1);
			
		}
		for(int i=0; i<2;i++) {
			book[i].show();
		}
		
	}

}
