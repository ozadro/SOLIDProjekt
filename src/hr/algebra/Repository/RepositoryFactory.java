package hr.algebra.Repository;

public class RepositoryFactory {

    private RepositoryFactory() {
    }

    public static Repository getRepository() throws Exception {
        return new DataRepository();
    }
}
