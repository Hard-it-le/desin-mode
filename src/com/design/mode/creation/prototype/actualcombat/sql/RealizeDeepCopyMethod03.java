package com.design.mode.creation.prototype.actualcombat.sql;

import java.util.HashMap;
import java.util.List;

/**
 **/
public class RealizeDeepCopyMethod03 {
    private HashMap<String, SearchWord> currentKeywords = new HashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        //ShallowCopy
        HashMap<String, SearchWord> newKeywords = (HashMap<String, SearchWord>) currentKeywords;

        //从数据库中取出更新时间 >lastUpdateTime 的数据，放入到newKeywords 中
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        long maxNewUpdatedTime = lastUpdateTime;
        assert toBeUpdatedSearchWords != null;
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }
            if (newKeywords.containsKey(searchWord.getKeyword())) {
                newKeywords.remove(searchWord.getKeyword());
            }
            newKeywords.put(searchWord.getKeyword(), searchWord);
        }
        lastUpdateTime = maxNewUpdatedTime;
        currentKeywords = newKeywords;
    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
//TODO:从数据库中取出更新时间 >lastUpdateTime 的数据
        return null;
    }
}
