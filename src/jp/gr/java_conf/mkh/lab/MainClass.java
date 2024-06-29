package jp.gr.java_conf.mkh.lab;

/**
 * サンプル用のメインクラス
 *
 * @author HABU Miki
 */
public class MainClass {

    public static void main(String[] param) {
        SampleClass obj = new SampleClass();

        // StepIntoでSampleClass#returnStr()に入り、StepOutすれば、ここに戻ってくる。、
        // その時、コンソールにはなにか表示されるだろうか？
        System.out.println(obj.returnStr("Hello world!"));

        System.out.println("This program is finished.");
    }
}
