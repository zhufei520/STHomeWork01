package student;
import java.util.*;
public class SMTest {
  static StudentManager[] StudentManager=new StudentManager[21];
  static  int number=0;
  static Scanner scanner=new Scanner(System.in);

public static void main(String args[]){
  int choice;
  System.out.println("请选择操作：");
  while(true){
  System.out.println("*******************************************");  
  System.out.println("*                1 添加                                       *");
  System.out.println("*                2 查找                                       *");
  System.out.println("*                3 修改                                       *");
  System.out.println("*                4 删除                                       *");
  System.out.println("*                5 输出                                       *");  
  System.out.println("*                6 查询                                       *");
  System.out.println("*                7 退出                                       *");
  System.out.println("*******************************************");
  choice=scanner.nextInt();
  if(choice==7)break;
  switch(choice){
  case 1:     add(); break;//添加学生信息
  case 2:     show();break;//查询学生信息
  case 3:     change();break;//修改学生信息
  case 4:     delete();break;//删除学生信息
  case 5:     paixu();break;//对学生信息进行排序
  case 6:     query();break;//查询学生信息
  }       
}
  System.out.println("感谢您对本系统的使用，欢迎下次继续使用");
}

static void add(){//添加学生信息
  while(true){
  System.out.println("点击任意键继续添加学生信息，停止添加输入0");
  if(scanner.nextInt()==0)break;
  System.out.println("请输入该学生的学号，姓名，性别，年龄，成绩");
  StudentManager[number]=new StudentManager();
  StudentManager[number].setStuNum(scanner.next());
  StudentManager[number].setName(scanner.next());
  StudentManager[number].setGender(scanner.next());
  StudentManager[number].setAge(scanner.nextInt());
  StudentManager[number].setScore(scanner.nextInt());
  number++;
  System.out.println("添加成功");
  }
 }

  static void show(){
      System.out.println("*******************************************");
      System.out.println(" 学号             姓名                          性别              年龄                成绩");
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
      System.out.println("排序完成，选择”学生信息查看“进行查看");
  }

static void change(){
  System.out.println("请输入要修改信息的学生学号");
  String Stunumber=scanner.next();
  for(int i=0;i<number;i++)
  {
      if(Stunumber.equals(StudentManager[i].getStuNum()))
      {System.out.println("请输入要修改的学生的信息,学号，姓名，性别，年龄，分数");
      StudentManager[i].setStuNum(scanner.next());
      StudentManager[i].setName(scanner.next());
      StudentManager[i].setGender(scanner.next());
      StudentManager[i].setAge(scanner.nextInt());
      StudentManager[i].setScore(scanner.nextInt());
          break;
      }
      if(number==i)System.out.println("对不起查无此人");
 }
}

static void query(){
    System.out.println("请输入要查询的学生学号");
     String Stunumber=scanner.next();
     int i;
      for(i=0;i<number;i++)
      {
          if(Stunumber.equals(StudentManager[i].getStuNum())){
              System.out.println("*******************************************");
              System.out.println(" 学号             姓名                          性别              年龄                成绩");
              System.out.println(StudentManager[i].getStuNum()+"\t"+StudentManager[i].getName()+"\t"+"\t"+StudentManager[i].getGender()+"\t"+StudentManager[i].getAge()+"\t"+StudentManager[i].getScore());
              System.out.println("*******************************************");
          }
      } 
      if(number==i)System.out.println("对不起查无此人");
}

static void delete(){
  System.out.println("请输入要删除信息的学生学号");
  String Stunumber=scanner.next();
      int i;
      for(  i=0;i<number;i++)
      if(Stunumber.equals(StudentManager[i].getStuNum()))break;
      if(number==i)System.out.println("对不起查无此人");
  for(;i<number-1;i++)
	  StudentManager[i]=StudentManager[i+1];
       number--;
 System.out.println("删除完成");
}
}
