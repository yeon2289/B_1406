import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //문자열 입력
        String input=sc.nextLine();
        //문자열을 LinkedList
        LinkedList str=new LinkedList();
        for(int i=0;i<input.length();i++){
            str.add(input.charAt(i));}
        //커서
        str.add(" ");


        //명령어 개수 입력
        int M=sc.nextInt();

        //명령어 개수대로 명령어 입력
        for(int i=0;i<M;i++){
            char x=sc.next().charAt(0);

            //L일때 커서를 왼쪽 한칸 옮김
            if(x=='L'){
               int position=str.indexOf(" ");
               if(position!=0){str.add(position-1, " ");
                   str.remove(position+1);}}

            //D일때 커서를 오른쪽으로 한 칸
            if(x=='D'){
                if(str.getLast()!=" "){int position=str.indexOf(" ");
                    str.remove(position);
                    str.add(position+1," ");}

            }

            //B일때 커서 왼쪽에 있는 문자 삭제
            if(x=='B'){

                int position=str.indexOf(" ");
                if(position!=0){str.remove(position-1);}}


            //P일때 커서 왼쪽에 문자 추가
            if(x=='P'){
                int position=str.indexOf(" ");
                char newCh=sc.next().charAt(0);
                str.add(position,newCh);

            }


        }
        str.remove(" ");
        for (int i = 0; i < str.size(); i++) {
            System.out.print(str.get(i));
        }
    }
}