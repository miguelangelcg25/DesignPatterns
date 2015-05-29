package factory;

import dao.BookDao;
import dao.impl.OracleDataBaseBook;

/**
 *
 * @author miguelangel
 */
public class FactoryImpl extends Factory {

    @Override
    public BookDao createDataBaseDao() {
        return new OracleDataBaseBook();
    }
    
}
