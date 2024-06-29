package jp.gr.java_conf.mkh.lab;

/**
 * デバッガデモ用の単純なプログラム。
 * @author HABU Miki.
 */
public class SampleClass {

    /**
     * 引数で受け取った値をそのまま返すメソッド。
     * 引数がnullか空文字の場合は、固定文言を返す。
     *
     * @param param 任意の文字列
     * @return 引数がnullか空文字ならば"The param is empty."、それ以外の場合は引数で渡された文字列。
     */
    public String returnStr(String param) {
        String ret;

        if (param.isEmpty()) {
            ret = "The param is empty.";
        } else {
            ret = param;
        }

        return ret;
    }
}
