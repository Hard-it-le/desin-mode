package com.design.mode.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**

 */
public abstract class BeautifulMan {

    private List<String> girlFriends = new ArrayList<>();


    void likeYou(String name) {
        girlFriends.add(name);
    }

    void sayBye(String name) {
        girlFriends.remove(name);
    }

    public Itr getIterator() {
        return new Iterator();
    }

    class Iterator implements Itr {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < girlFriends.size();

        }

        @Override
        public String next() {
            String s = girlFriends.get(cursor);
            cursor++;
            return s;
        }

        @Override
        public String firstLove() {
            return girlFriends.get(0);
        }

        @Override
        public String currentLove() {
            return girlFriends.get(girlFriends.size() - 1);
        }
    }

    interface Itr {
        boolean hasNext();

        String next();

        String firstLove();


        String currentLove();


    }


}
