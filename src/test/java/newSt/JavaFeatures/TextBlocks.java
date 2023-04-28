package newSt.JavaFeatures;

public class TextBlocks {

    public void textblocks(){

        String str = """
                {
                    "name" : "Shrrevishnu";
                     "age" : 25;
                }
                {
                      "name" : "Sailesh";
                       "age" : 26;
                }
                """;
        System.out.println(str);

    }


    public static void main(String[] args) {
        TextBlocks textBlocks = new TextBlocks();
        textBlocks.textblocks();
    }
}
