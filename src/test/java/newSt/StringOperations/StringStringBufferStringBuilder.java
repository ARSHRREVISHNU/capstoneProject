package newSt.StringOperations;

public class StringStringBufferStringBuilder {
    public void stringOperation(String s1){

        s1 = s1+"Its String";
        System.out.println("The string: "+s1);
    }

    public void stringBufferOperation(StringBuffer s1){

        s1 = s1.append("Its String buffer");
    }


    public void stringBuilderOperation(StringBuilder s1){

        s1 = s1.append("Its String Builder");
    }


    public static void main(String[] args) {
        String string = "Value";
        StringBuffer stringBuffer =  new StringBuffer("Value");
        StringBuilder stringBuilder = new StringBuilder("Value");

        StringStringBufferStringBuilder stringStringBufferStringBuilder = new StringStringBufferStringBuilder();

        stringStringBufferStringBuilder.stringOperation(string);
        System.out.println("The updated String is: "+ string);

        stringStringBufferStringBuilder.stringBufferOperation(stringBuffer);
        System.out.println("The updated string buffer is: "+stringBuffer);

        stringStringBufferStringBuilder.stringBuilderOperation(stringBuilder);
        System.out.println("The updated string builder is: "+stringBuilder);

    }

}
