package student;
import java.util.*;
public class SMTest {
  static StudentManager[] StudentManager=new StudentManager[21];
  static  int number=0;
  static Scanner scanner=new Scanner(System.in);

public static void main(String args[]){
  int choice;
  System.out.println("��ѡ�������");
  while(true){
  System.out.println("*******************************************");  
  System.out.println("*                1 ���                                       *");
  System.out.println("*                2 ����                                       *");
  System.out.println("*                3 �޸�                                       *");
  System.out.println("*                4 ɾ��                                       *");
  System.out.println("*                5 ���                                       *");  
  System.out.println("*                6 ��ѯ                                       *");
  System.out.println("*                7 �˳�                                       *");
  System.out.println("*******************************************");
  choice=scanner.nextInt();
  if(choice==7)break;
  switch(choice){
  case 1:     add(); break;//���ѧ����Ϣ
  case 2:     show();break;//��ѯѧ����Ϣ
  case 3:     change();break;//�޸�ѧ����Ϣ
  case 4:     delete();break;//ɾ��ѧ����Ϣ
  case 5:     paixu();break;//��ѧ����Ϣ��������
  case 6:     query();break;//��ѯѧ����Ϣ
  }       
}
  System.out.println("��л���Ա�ϵͳ��ʹ�ã���ӭ�´μ���ʹ��");
}

static void add(){//���ѧ����Ϣ
  while(true){
  System.out.println("���������������ѧ����Ϣ��ֹͣ�������0");
  if(scanner.nextInt()==0)break;
  System.out.println("�������ѧ����ѧ�ţ��������Ա����䣬�ɼ�");
  StudentManager[number]=new StudentManager();
  StudentManager[number].setStuNum(scanner.next());
  StudentManager[number].setName(scanner.next());
  StudentManager[number].setGender(scanner.next());
  StudentManager[number].setAge(scanner.nextInt());
  StudentManager[number].setScore(scanner.nextInt());
  number++;
  System.out.println("��ӳɹ�");
  }
 }

  static void show(){
      System.out.println("*******************************************");
      System.out.println(" ѧ��             ����                          �Ա�              ����                �ɼ�");
      for(int i=0;i<number;i++)
     System.out.println(StudentManager[i].getStuNum()+"\t"+StudentManager[i].getName()+"\t"+"\t"+StudentManager[i].getGender()+"\t"+StudentManager[i].getAge()+"\t"+StudentManager[i].getScore());
      System.out.println("*******************************************");
  System.out.println();
}

  static void paixu(){
      int j;
      StudentManager temp=new StudentManager();
      for(int i=0;i<number;i++)
      {
          for(j=i+1;j<number;j++)
          if(StudentManager[i].getScore()>StudentManager[j].getScore())
          {temp=StudentManager[i];StudentManager[i]=StudentManager[j];StudentManager[j]=temp;}
      }
      System.out.println("������ɣ�ѡ��ѧ����Ϣ�鿴�����в鿴");
  }

static void change(){
  System.out.println("������Ҫ�޸���Ϣ��ѧ��ѧ��");
  String Stunumber=scanner.next();
  for(int i=0;i<number;i++)
  {
      if(Stunumber.equals(StudentManager[i].getStuNum()))
      {System.out.println("������Ҫ�޸ĵ�ѧ������Ϣ,ѧ�ţ��������Ա����䣬����");
      StudentManager[i].setStuNum(scanner.next());
      StudentManager[i].setName(scanner.next());
      StudentManager[i].setGender(scanner.next());
      StudentManager[i].setAge(scanner.nextInt());
      StudentManager[i].setScore(scanner.nextInt());
          break;
      }
      if(number==i)System.out.println("�Բ�����޴���");
 }
}

static void query(){
    System.out.println("������Ҫ��ѯ��ѧ��ѧ��");
     String Stunumber=scanner.next();
     int i;
      for(i=0;i<number;i++)
      {
          if(Stunumber.equals(StudentManager[i].getStuNum())){
              System.out.println("*******************************************");
              System.out.println(" ѧ��             ����                          �Ա�              ����                �ɼ�");
              System.out.println(StudentManager[i].getStuNum()+"\t"+StudentManager[i].getName()+"\t"+"\t"+StudentManager[i].getGender()+"\t"+StudentManager[i].getAge()+"\t"+StudentManager[i].getScore());
              System.out.println("*******************************************");
          }
      } 
      if(number==i)System.out.println("�Բ�����޴���");
}

static void delete(){
  System.out.println("������Ҫɾ����Ϣ��ѧ��ѧ��");
  String Stunumber=scanner.next();
      int i;
      for(  i=0;i<number;i++)
      if(Stunumber.equals(StudentManager[i].getStuNum()))break;
      if(number==i)System.out.println("�Բ�����޴���");
  for(;i<number-1;i++)
	  StudentManager[i]=StudentManager[i+1];
       number--;
 System.out.println("ɾ�����");
}
}
