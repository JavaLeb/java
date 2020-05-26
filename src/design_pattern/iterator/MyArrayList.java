package design_pattern.iterator;

import java.util.Arrays;

/**
 * Created by leboop on 2020/5/24.
 */
public class MyArrayList<T> implements MyCollection<T> {
    //    数组列表大小
    private int size;
    //    数组列表结构，数据列表真正存储的数据
    private Object[] elementData;
    //    空的数据列表
    private static final Object[] EMPTY_ELEMENTDATA = {};
    //    数组列表的容量
    private static final int DEFAULT_CAPACITY = 10;
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    public MyArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    //    构造方法
    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        }
    }

    /**
     * 数组列表扩容，最后的容量如下确定：
     * （1）如果实际容量没有超过容器容量，不扩容；
     * （2）如果实际容量已经超过容器容量，进行扩容
     * 扩容方法：总容量=原来容量二进制表示后右移1位表示的容量+原来容器容量
     * 如果扩容后容量不够，则直接使用实际容量作为容器容量
     * 如果扩容后容量巨大，超过允许的最大容量，容器容量直接设置为最大容量
     * （3）将原容器的数据拷贝到扩容后的容器中
     *
     * @param minCapacity 实际容量
     */
    private void ensureCapacity(int minCapacity) {
//        如果数据列表是空的，实际容量设置为默认容量10和最小容量的最大值，比如最小容量=5，实际容量为10
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        // 实际容量minCapacity已经超过容器容量，则扩容
        if (minCapacity - elementData.length > 0) {
            int oldCapacity = elementData.length;
//            扩容，比如现在容量是10,二进制为1010，扩容101=5，变为15
            int newCapacity = oldCapacity + (oldCapacity >> 1);
//            扩容后容量比实际容量还小，实际容量设置为扩容后的容量，也就是不使用扩容容量
            if (newCapacity - minCapacity < 0)
                newCapacity = minCapacity;
//            扩容容量超过最大限制
            if (newCapacity - MAX_ARRAY_SIZE > 0) {
                if (minCapacity < 0) // overflow
                    throw new OutOfMemoryError();
                newCapacity = (minCapacity > MAX_ARRAY_SIZE) ?
                        Integer.MAX_VALUE :
                        MAX_ARRAY_SIZE;
            }
            // 拷贝
            elementData = Arrays.copyOf(elementData, newCapacity);
        }

    }

    /**
     * 添加一个元素：首先检查容量，如果容量不够，则进行扩容，扩容后将新元素添加进去
     *
     * @param e 新增元素
     * @return
     */
    public boolean add(T e) {
        // 容量保证
        ensureCapacity(size + 1);

        this.elementData[size++] = e;

        return true;
    }

    public T get(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

        return (T) elementData[index];
    }

    /**
     * 获取数组列表元素个数
     *
     * @return
     */
    public int size() {
        return size;
    }

    @Override
    public MyIterator<T> myIterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements MyIterator<T> {
        private int currentIndex = 0;

        @Override
        public T next() {
            T o = (T) elementData[currentIndex];
            currentIndex++;

            return o;
        }

        @Override
        public boolean hasNext() {
            if (currentIndex >= size) return false;
            else return true;
        }
    }
}
