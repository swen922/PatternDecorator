import datasource.*;

/** Декоратор, также известен как: Wrapper, Обёртка, Decorator */

public class App {

    public static void main(String[] args) {

        DataAccess dataAccess = new DataAccess();
        demoData(dataAccess);

        DataSource source = new FileDataSource(dataAccess);
        source.writeData("simple raw data...");
        demoData(dataAccess);

        source = new CompressionDecorator(source);
        source.writeData("anotherData to compress...");
        demoData(dataAccess);

        source = new EncryptionDecorator(source);
        source.writeData("and this secrete data to encrypt...");
        demoData(dataAccess);

        DataAccess dataAccess2 = new DataAccess();
        DataSource source2 = new EncryptionDecorator(new CompressionDecorator(new FileDataSource(dataAccess2)));
        source2.writeData("write data to other access");
        demoData(dataAccess2);

    }

    private static void demoData(DataAccess dataAccess) {
        System.out.println("dataAccess.getData() = " + dataAccess.getData() + "\n");
    }
}
