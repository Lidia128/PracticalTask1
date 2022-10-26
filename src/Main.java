import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] number = {"один", "два", "три", "один", "два"};
        StringBuilder builder = new StringBuilder();
              for (int i = 0; i < number.length; i++) {
               String another = number [i];
               boolean dublicateFound = false;
               for (int j = i + 1; j < number.length; j++) {
               if (number[j].equals(number[i])) {
                   dublicateFound = true;
                   break;}
               }
               if (builder.length()>0) {
                   builder.append(' ');
               }
               if (!dublicateFound) {
                   builder.append(number[i]);
               }
              }
        System.out.println(builder);
    }}










