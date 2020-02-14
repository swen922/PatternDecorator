package datasource;

public class EncryptionDecorator extends DataSourceDecorator {

    private final String ENCRYPTED = "ENCRYPTED DATA: ";

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        data = ENCRYPTED + data;
        super.writeData(data);
    }

    @Override
    public String readData() {
        return super.readData();
    }
}
