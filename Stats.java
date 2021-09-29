package paket;
import java.util.Date;
import java.util.ArrayList;

public class Stats {
	
    private int favgenre; // ������� ���� (���� ���, ����� ����� ����� ����������� �����
                          // ������� �� ������)
    private int pages, books, hours; // ����������: ��������, ����� � ����
    private double avg; // Average - ������� �������� ������

    public Stats(String favgenre, int pages, int books, int hours, double avg) {
       this.favgenre = 0; //�������� �� ������, ����� �����
       this.pages = 0;
       this.books = 0;
       this.hours = 0;
       this.avg = 0;
   }
    //������� � ��� �����

    public int getfavgenre(){         // ��������
        return favgenre;
   } 
   
   public void setfavgenre(int a){    // ��������
	   favgenre = a;
   }
   
   
   public int getpages(){
        return pages;
   } 
   
   public void setpages(int pages){
        this.pages = pages;
   }
   
   
   public int getbooks(){
       return books;
  } 
  
  public void setbooks(int books){
       this.books = books;
  }
  
  
  public int gethours(){
      return hours;
 } 
 
 public void sethours(int hours){
      this.hours = hours;
 }
 
 public double avg(){
     return avg;
} 

public void setavg(double avg){
     this.avg = avg;
}


//� ������ ������


public void counthours () 
{
	
	Date start = new Date();
}


// ����� ����� �������������� �� ������� ������ "��������� ��������"
public void countpages () 
{
	setpages(getpages()+1);
}
 

// ����� ����� �������������� �� ������� ������ "���������" � ����� �����
public void countbooks () 
{
	setbooks(getbooks()+1);
}
 
// ���� ����� ����� �������������� ������ ��� ������ ����������
public void countavg()
{
	setavg(getpages()/gethours());
}
  
// ���� ����� ����� ����� ����������� ��� ������ ����������
public int countfavgenre(Library library)
{
	// � ���� �� ��������, ��� ������� ��� ����� ��������, �� ����� ���� ����� 3
	// ��������, ��� 0 - �����, 1 - ����, 2 - ������ (��� ��� ��� �����)
	int count[] = new int[3];
	for (int i : count)
	{
		count[i] = 0;
	}
	
	for (Book i : library.bookLibrary) 
	{
		int genre = library.bookLibrary[i].getGenre();
		count[genre] = count[genre] + 1;
	}
	int max = 0;
	for (int i : count)
	{
		if (count[i] > max)
		{
			max = count[i];
		}
	}
	return max;
}
  
   
}