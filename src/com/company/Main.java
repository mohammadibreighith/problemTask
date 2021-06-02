package com.company;

public class Main {

    public static void getAnswer(String [] words){
        int maxStars =0;
        for(int i = 0 ; i < words.length;i++){
            if(words[i].length() > maxStars)
                maxStars = words[i].length();
        }
        maxStars +=4;
        print_stars(maxStars);
        for(int i = 0; i < words.length;i++){
            System.out.print("* ");
            System.out.print(words[i]);
            print_spaces(maxStars-4 - words[i].length());
            System.out.println(" *");
        }
        print_stars(maxStars);
    }

    public static void print_stars(int starsNum){
        for(int i = 0 ; i < starsNum;i++)
            System.out.print('*');
        System.out.println();
    }

    public static void print_spaces(int starsNum){
        for(int i = 0 ; i < starsNum;i++)
            System.out.print(' ');
    }

    public static void main(String[] args) {
        String [] words = {"Hello","from","the","other","side"};
        getAnswer(words);
    }
}
