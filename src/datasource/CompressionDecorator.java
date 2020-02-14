package datasource;

public class CompressionDecorator extends DataSourceDecorator {

    private final String COMPRESSED = "COMPRESSED DATA: ";

    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        data = COMPRESSED + data;
        super.writeData(data);
    }

    @Override
    public String readData() {
        return super.readData();
    }
}
