package datasource;


public class FileDataSource implements DataSource {

    private DataAccess dataAccess;

    public FileDataSource(DataAccess access) {
        this.dataAccess = access;
    }

    @Override
    public void writeData(String data) {
        dataAccess.appendData(data);
        System.out.println("FileDataSource write data to dataAccess.");
    }

    @Override
    public String readData() {
        return dataAccess.getData();
    }

}
