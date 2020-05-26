package design_pattern.iterator;


/**
 * Created by leboop on 2020/5/24.
 */
public class MyLinkedList<T> implements MyCollection<T>{
    /**
     * 链表的构成：多个节点
     * （1）使用size表示节点的数量
     * （2）使用first表示链表的第一个节点
     * （3）使用last表示链表的最后一个节点
     * 因为节点之间通过Node类中的prev和next进行链接，
     * 所以无论从first节点还是last节点都可以遍历整个链表
     */
    private int size;
    private Node<T> first;
    private Node<T> last;

    public MyLinkedList() {
    }

    public boolean add(T e) {
        /**
         * 创建新的节点：节点构成：
         * （1）数据：e；
         * （2）指向前一个节点的指针prev，指向链表的最后一个节点last
         * （3）指向后一个节点的指针next，后面没有节点，指向null
         */
        final Node<T> prev = last;
        final Node<T> newNode = new Node<>(prev, e, null);
        // 重置链表的last节点，更新为新增的节点
        last = newNode;
        // 如果添加新节点前的链表是空链表,将新节点newNode作为链表的第一个节点
        // 如果添加新节点前的链表不空链表,将原来的最后一个节点的next指针指向新的节点。
        if (prev == null)
            first = newNode;
        else
            prev.next = newNode;

        size++;

        return true;
    }

    public T get(int index) {
//        参数检查
        if (index < 0 && index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
//        遍历节点：
//        （1）如果index没有超过链表的大小的一半，从first向后遍历
//        （2）如果index超过了链表大小的一半，从last向前遍历
//        （3）最后返回节点的数据item
        if (index < (size >> 1)) {
            Node<T> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x.item;
        } else {
            Node<T> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x.item;
        }
    }

    public int size() {
        return size;
    }

    /**
     * 节点的构成：
     * （1）数据
     * （2）指向前一个节点的指针prev;
     * （3）指向后一个节点的指针next；
     *
     * @param <T> 节点的数据类型
     */
    private static class Node<T> {
        //        节点中的数据
        T item;
        //        节点中的指针，指向洗下一个节点
        Node<T> next;
        //        节点中的指针，指向后一个节点
        Node<T> prev;

        //节点初始化
        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public MyIterator<T> myIterator() {
        return new MyIterator<T>(){
            Node currentNode = first;

            @Override
            public T next() {
                T o = (T)currentNode.item;
                currentNode = currentNode.next;

                return o;
            }

            @Override
            public boolean hasNext() {
                if(currentNode==null) return false;
                else return true;
            }
        };
    }
}
