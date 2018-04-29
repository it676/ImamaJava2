
interface Entry<K, V> {

    K getKey();

    V getValue();
}

class QueueEntry<K, V> implements Entry<K, V> {

    
    
    
    private K key;
    private V value;

    public QueueEntry() {

       
    }

    public QueueEntry(K key, V value) {

        this.key = key;
        this.value = value;

    }

    @Override
    public K getKey() {

        return key;
    }

    @Override
    public V getValue() {

        return value;
    }

}

class EntryExplorer {

    public void firstDisplayEntries(Entry<String, Integer>[] entries) {

        for (Entry entry : entries) {

            System.out.print("Key : " + entry.getKey() + "\t");
            System.out.println("Value : " + entry.getValue());
        }

    }

    public void secondDisplayEntries(Entry<String, ?>[] entries) {

        for (Entry entry : entries) {

            System.out.print("Key : " + entry.getKey() + "\t");
            System.out.println("Value : " + entry.getValue());
        }

    }

    public void thirdDisplayEntries(Entry<?, ?>[] entries) {

        for (Entry entry : entries) {

            System.out.print("Key : " + entry.getKey() + "\t");
            System.out.println("Value : " + entry.getValue());
        }

    }

    public boolean isAvaialble(Entry<?, ?>[] entries, Entry item) {

        for (Entry element : entries) {

            if (element.getKey().equals(item.getKey())) {

                if (element.getValue().equals(item.getValue())) {

                    return true;
                }
            }
        }

        return false;

    }

}

class EntryDemo {

    public static void main(String[] args) {

        EntryExplorer explorer = new EntryExplorer();

        Entry<String, Integer>[] entries = new Entry[2];
        
        entries[0] = new QueueEntry<>("Sara",10);
        entries[1] = new QueueEntry<>("Amal",20);
        explorer.firstDisplayEntries(entries);
        
        System.out.println(explorer.isAvaialble(
                entries, new QueueEntry<>("Rayan",10)));
        
        
    }
}
