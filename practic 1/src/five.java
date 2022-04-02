//Найти двузначное число,равное квадрату числа его единиц,сложенному с кубом числа его десятков  128 задание

import jdk.internal.org.jline.terminal.Terminal;
public class five {
    public static void main(String[] args) {
    for (var i = 10; i <= 99; i++){
        Terminal WScript = null;
        if (i == Math.pow(i%10,2) + Math.pow(i/10,2) * (i/10) ) {
            boolean echo = WScript.echo(Math.floor(i));
        }
    }
}
}

