package factory;

import dao.BookDao;
import dao.impl.OracleDataBaseBook;
import dao.impl.InMemoryBook;

/**
 *
 * @author miguelangel
 */
public abstract class Factory {
    
    public BookDao createBookDao(){
        if(Util.isTestMode()){
            return new InMemoryBook();
        }else{
            return createDataBaseDao();
        }
    }
    
    public abstract BookDao createDataBaseDao();
}
