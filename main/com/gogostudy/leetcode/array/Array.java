package com.gogostudy.leetcode.array;

public class Array<E> {
    private E[] data;
    private int size;

    /**
     * 构造器：容量
     */
    public Array(int capacity){ data = (E[]) new Object[capacity]; size = 0; }

    /**
     * 无参构造器：默认容量10
     */
    public Array(){ this(10); }

    /**
     * 获取数组大小
     */
    public int getSize(){ return size; }

    /**
     * 获取容量大小
     */
    public int getCapacity(){ return data.length; }

    /**
     * 数组是否为空
     */
    public boolean isEmpty(){ return size==0; }

    /**
     * 数组最后添加元素
     */
    public void addLast(E e){ add(size,e); }
    /**
     * 数组前面添加元素
     */
    public void addFirst(E e){add(0,e);}
    /**
     * 向指定位置添加元素
     */
    public void add(int index, E e){
        rejectHandler(index,"Add failed");
        if (size == data.length)
            resize(2 * data.length);
        //从后往前至index挪元素
        for(int i = size-1; i>=index; i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    /**
     * 获取index位置的元素
     */
    public E get(int index){
        rejectHandler(index,"Get failed");
        return data[index];
    }

    /**
     * 修改index位置的元素
     */
    public void set(int index, E e){
        rejectHandler(index,"Update failed");
        data[index] = e;
    }

    /**
     * 查找数组中是否有元素e
     */
    public boolean contains(E e){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return true;
        }
        return false;
    }

    /**
     * 查找数组中元素对应的索引
     */
    public int find(E e){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return i;
        }
        return -1;
    }

    /**
     * 删除index元素
     */
    public E remove(int index){
        rejectHandler(index,"Remove failed");
        E temp = data[index];
        for (int i = index; i < size-1; i++) {
            data[i] = data[i+1];
        }
        size--;
        // 为了能够迅速被GC
        data[size]=null;
        // 动态缩容
        if (size == data.length/2){
            resize(data.length/2);
        }
        return temp;
    }

    /**
     * 删除第一个元素
     */
    public E removeFirst(){
        return remove(0);
    }

    /**
     * 删除最后一个元素
     */
    public E removeLast(){
        return remove(size-1);
    }

    /**
     * 从数组中删除元素e
     */
    public void removeElement(E e){
        int index = find(e);
        if (index != -1)
            remove(index);
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Array: size = %d, capacity = %d\n",size,data.length));
        stringBuilder.append('[');
        for (int i = 0; i < size; i++) {
            stringBuilder.append(data[i]);
            if (i != size-1){
                stringBuilder.append(",");
            }
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
    private void rejectHandler(int index ,String msg){
        if (index < 0 || index > size)
            throw new IllegalArgumentException(msg);
    }
}
