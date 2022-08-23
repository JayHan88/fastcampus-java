package ch11;

public class MakeReport {

    StringBuffer stringBuffer = new StringBuffer();

    private String line = "====================================== \n";
    private String title = "이름\t   주소\t\t   전화번호   \n";

    private void makeHeader() {
        stringBuffer.append(line);
        stringBuffer.append(title);
        stringBuffer.append(line);
    }

    private void generateBody() {
        stringBuffer.append("Jay \t");
        stringBuffer.append("Seoul \t\t");
        stringBuffer.append("010 \n");

        stringBuffer.append("Tom \t");
        stringBuffer.append("Castle \t\t");
        stringBuffer.append("123 \n");
    }

    private void makeFooter() {
        stringBuffer.append(line);
    }

    public String getReport() {
        makeHeader();
        generateBody();
        makeFooter();

        return stringBuffer.toString();
    }
}
