package prototype.four;

import java.util.Hashtable;

public class PrototypeManager {

    private Hashtable ht = new Hashtable();

    private PrototypeManager(){
        ht.put("far",new FAR());
        ht.put("srs",new SRS());
    }

    public void addOfficialDocument(String key,OfficialDocument doc){
        ht.put(key,doc);
    }

    /**
     * 浅克隆获取新的公文对象
     * @param key
     * @return
     */
    public OfficialDocument getOfficialDocument(String key){
        return ((OfficialDocument)ht.get(key)).clone();
    }

    public static PrototypeManager getPrototypeManager(){
        return PrototypeManagerHolder.pm;
    }

    private static class PrototypeManagerHolder{
        private static final PrototypeManager pm = new PrototypeManager();
    }
}
