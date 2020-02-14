package datasource;

/** MOCK SOME FRAMEWORK TO WRITE & READ STRING DATA */

public class DataAccess {

    private final String header = "MyFile: ";
    private String data;

    public String getData() {
        String result = header + data;
        return result;
    }

    public void appendData(String data) {

        if (this.data == null || this.data.isEmpty()) {
            this.data = data;
        }
        else {
            this.data = this.data + " + " + data;
        }
    }

}
