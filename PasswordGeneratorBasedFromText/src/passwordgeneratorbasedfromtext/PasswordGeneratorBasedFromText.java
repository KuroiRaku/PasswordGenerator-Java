/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgeneratorbasedfromtext;

import java.util.Random;

/**
 *
 * @author Le Cherng
 */
public class PasswordGeneratorBasedFromText {

    final static String[][][] book = {
{
{"ALICE was beginning to get very tired of sitting by her sister on the\n",
"bank, and of having nothing to do. Once or twice she had peeped into the\n",
"book her sister was reading, but it had no pictures or conversations in\n",
"it, \"and what is the use of a book,\" thought Alice, \"without pictures or\n",
"conversations?\"\n"},
{"So she was considering in her OWN mind (as well as she could, for the\n",
"day made her feel very sleepy and stupid), whether the pleasure of\n",
"making a daisy-chain would be worth the trouble of getting up and\n",
"picking the daisies, when suddenly a White Rabbit with pink eyes ran\n",
"close by her.\n"},
{"There was nothing so very remarkable in that, nor did Alice think it so\n",
"very much out of the way to hear the Rabbit say to itself, \"Oh dear! Oh\n",
"dear! I shall be too late!\" But when the Rabbit actually took a watch\n",
"out of its waistcoat-pocket and looked at it and then hurried on, Alice\n",
"started to her feet, for it flashed across her mind that she had never\n",
"before seen a rabbit with either a waistcoat-pocket, or a watch to take\n",
"out of it, and, burning with curiosity, she ran across the field after\n",
"it and was just in time to see it pop down a large rabbit-hole, under\n",
"the hedge. In another moment, down went Alice after it!"}
},
{
{"\"WHAT a curious feeling!\" said Alice. \"I must be shutting up like a\n",
"telescope!\"\n"},
{"And so it was indeed! She was now only ten inches high, and her face\n",
"brightened up at the thought that she was now the right size for going\n",
"through the little door into that lovely garden.\n"},
{"After awhile, finding that nothing more happened, she decided on going\n",
"into the garden at once; but, alas for poor Alice! When she got to the\n",
"door, she found she had forgotten the little golden key, and when she\n",
"went back to the table for it, she found she could not possibly reach\n",
"it: she could see it quite plainly through the glass and she tried her\n",
"best to climb up one of the legs of the table, but it was too slippery,\n",
"and when she had tired herself out with trying, the poor little thing\n",
"sat down and cried.\n"},
{"\"Come, there's no use in crying like that!\" said Alice to herself rather\n", 
    "sharply. \"I advise you to leave off this minute!\" She generally gave\n",
"herself very good advice (though she very seldom followed it), and\n",
"sometimes she scolded herself so severely as to bring tears into her\n",
"eyes.\n"},
{"Soon her eye fell on a little glass box that was lying under the table:\n",
"she opened it and found in it a very small cake, on which the words \"EAT\n",
"ME\" were beautifully marked in currants. \"Well, I'll eat it,\" said\n",
"Alice, \"and if it makes me grow larger, I CAN reach the key; and if it\n",
"makes me grow smaller, I can creep under the door: so either way I'll\n",
"get into the garden, and I don't care which happens!\"\n"},
{"She ate a little bit and said anxiously to herself, \"Which way? Which\n",
"way?\" holding her hand on the top of her head to feel which way she was\n",
"growing; and she was quite surprised to find that she remained the same\n",
"size. So she set to work and very soon finished off the cake."}
},
{
{"The King and Queen of Hearts were seated on their throne when they\n",
"arrived, with a great crowd assembled about them--all sorts of little\n",
"birds and beasts, as well as the whole pack of cards: the Knave was\n",
"standing before them, in chains, with a soldier on each side to guard\n",
"him; and near the King was the White Rabbit, with a trumpet in one hand\n",
"and a scroll of parchment in the other. In the very middle of the court\n",
"was a table, with a large DISH of tarts upon it. \"I wish they'd get the\n",
"trial done,\" Alice thought, \"and hand 'round the refreshments!\"\n"},
{"The judge, by the way, was the King and he wore his crown over his great\n",
"wig. \"That's the jury-box,\" thought Alice; \"and those twelve creatures\n",
"(some were animals and some were birds) I suppose they are the jurors.\"\n"},
{"Just then the White Rabbit cried out \"Silence in the court!\"\n"},
{"\"HERALD! read the accusation!\" said the King."}
}
};
    
    public static void main (String[]args){
        Random random = new Random();
        System.out.println("Welcome to Random password generator program :"+ ')');
        //welcome message
        int passcount=0;
        //declaring the number of time password of generated
        for(int total=1; total<=10000; total++){
            // the password generator will generate 10000 password before it stop
        int fail_l= 0;
        //number of time for length failure
        int fail_s= 0;
        //numer of time for single character failure
        int fail_n =0;
        // number of time for newline error
        int fail_e =0;
        //number of time for equal word error
        int fail_U =0;
        //number of time for Uppercase error
        int fail_L =0;
        //number of time for lowercase error
        int fail_A =0;
        //number of time for non-alphanumberic error
        int var =0;
        //this is for compareto function in later section
        String passwords= "";
        //declaring passwords to be used later
        String singlewords="";
        //declaring each singlewords to be used later on
        String[] str = new String[3];
        //declaring new string
        for(int count=0; count<3;count++){
            //for creating three words
        while (true){
            //this while loop is important for the software to keep finding words that are not new line or single character
        int i = random.nextInt(3);
        //this message has 3 pages
        // It will random between three pages
        int j= random.nextInt(book[i].length);
        //u can find out how many paragraph the specific page has by using book[i].length
        // it will random between paragraphs
        int k = random.nextInt(book[i][j].length);
        //now u can find out how many lines for each different paragraph have
        //It will random between different lines
        /*
        System.out.println(book[i][j][k]);
        System.out.println(book[i][j].length);
        */
        
        String[] words = book[i][j][k].split(" "); 
        //this split the sentence they find into single words
        int x = random.nextInt(words.length);
        //the words.length is to ensure the words are in range of the total amount of the words the sentence have
        singlewords = words[x];
        int Length = singlewords.length();
       if (Length<=1){
        fail_s ++;   
        //when the word is a single character, it will continue the loops
       }else if(singlewords.contains("\n")){
           //if the word contain newline, it will continue the loop
            fail_n ++;
        }else{
           //if the character doesn't contain either of those, it will break from the loop thus getting the first word
                break;
                }
    }
        passwords += singlewords;
        //when the loop finish, all three words will be add together
        str[count]= singlewords;
        //this is important so that we can compare each string to other string by using array
        if (count==2){
            //when the password is compose of three words, these will get executed
            boolean lowerCase = !passwords.equals(passwords.toUpperCase());
            //This is to show whether the password contain at least one uppercase letter
            boolean upperCase = !passwords.equals(passwords.toLowerCase());
            //this is to show whether the password contain at least one lowercase letter
            String check = passwords.replaceAll("[a-zA-Z]", "");
            //This will get rid of alphanumeric letters so we can check non alphanumeric letters
            for (int a=0;a<2;a++){
                //this for loop is for checking the string
                for (int b=a+1;b<3; b++ ){
                var= str[a].compareTo(str[b]);
                //it will show zero if there are repeated words
                }
            }
            if (passwords.length()<8 || passwords.length()>16){
                //the password cannot be too short or too long
                count=-1;
                //count become -1 is IMPORTANT since the loop will +1 in the end
                //if count is 1 instead of -1, the password won't add two times 
                //because the loops count is 1 when the time everything is ended
                fail_l++;
                //the fail count for length will add
                passwords="";
                //reset the password since is invalid and the program will compile it again
            }if (var <1){
                //if var<1 means there are repeated words
                count=-1;
                fail_e ++;
                passwords="";
                //same
            }if(!upperCase){
                //this is when the password doesn't have uppercase letter
                count=-1;
                fail_U++;
                passwords="";
                //same
            }if(!lowerCase){
                //this is when the password doesn't have lowercase letter
                total = 10000;
                //when there's a lowercase error, we make the loop count to 10000 so after forming the final password, it will stop
                count=-1;
                fail_L++;
                passwords="";
                //same
            }if (check.length()!=1){
                //when special characters are not equal to 1, it will get executed again
                count=-1;
                fail_A++;
                passwords="";
            }
        }
        if(count==2){
            // the sequence is important, since the passcount will only increase when the password are form
            // this is because if there's any error in the password, the count are-1
        passcount ++;
        }
        }
        
        System.out.printf("Passwords:%-16s %-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s \n",
                passwords, "Single:", fail_s , " Newline:", fail_n, " Equal:", fail_e, "Length:",fail_l, "Uppercase:",fail_U ,
                "Lowercase:", fail_L, " Alphanumeric:", fail_A);
        //we use printf so that it look nice after formatting
    }
        System.out.println("\nPassword generated: "+ passcount);
        System.out.println("\nThank you for using the password generator game. Good bye.");
        //closing message!!! 
    }
}