# 树

## 1. 查找
- 静态查找
- 动态查找: 集合中的记录是动态变化的

### 1.1 查找算法
- 顺序查找（遍历数组）
```
int search(List l, Type k) {
    int i;
    l -> element[0] = k; // 哨兵
    for (i = l->length; l->element[i] != k; i--) {
        return i;
    }
}
```
时间复杂度O(n

- 二分查找
必须有序存放
在数组里
```java
class BinarySearch {
    int search(Comparable[] a, Comparable k) {
        int N = a.length;

        int lo = 0;
        int hi = N;

        while (hi >= lo) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid].compareTo(k) == 0) {
                return mid;
            } else if (a[mid].compareTo(k) > 0) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }
}
```
算法复杂度`O(lgN)`
为什么取mid 是不对的，而是要取`mid+1` 或者 `mid-1`

1. 每个节点要查找的次数刚好为该节点所在的层数
2. 查找成功时的查找次数不会超过判定数的深度
3. N 个节点的判定数的深度 `lgN + 1`;

----------

## 2. 树
树
:   n个节点构成的有限的集合

n = 0 时，空树
n > 0 时，特点：
1. 有一个称为`根`的特殊节点
2. 其余n-1 个节点构成M 个不相交的子集，每个子集又是一个树，称为`子树`

- 子树是不相交的
- 除了根节点外，每个子树仅仅只有一个父节点
- N个节点的子树，有N-1条边 

基本术语
1. 节点的度：节点的子树个数
2. 树的度：所有节点中最大的度数
3. 叶节点：度为0的节点
4. 父节点：有子树的节点是其子树根节点的父节点
5. 子节点：A是B的父节点，则B是A的子节点
6. 兄弟节点：同一个父节点的节点
7. 路径和路径长度：
8. 祖先节点
9. 子孙节点：
10. 节点的层次：
11. 树的高度：

### 2.1 树的表示：
#### 儿子兄弟表示法
旋转45度 -> 形成二叉树  (Left, Right)

### 2.2 二叉树
空 或者 根节点和左右子树
度为2的树，但是节点有左右之分

1. 斜二叉树：
2. 完美二叉树：
3. 完全二叉树：节点的编号和在完美二叉树中一致

重要性质：
1. 第i层的最大节点数 2^(i-1)
2. 深度k的二叉树最大节点总数 2^k -1
3. 任何非空二叉树，m叶子节点的个数， n度为2的节点个数 则 m = n + 1;

数据对象集：
操作集：
#### 2.2.1 二叉树的存储结构
 顺序存储结构

完全二叉树：按从上到下从左到右顺序存储，特点
- 非根节点（i）的父节点[i/2] (向下取整)
- 节点(i)的左子节点 2i， 右子节点2i+1

一般二叉树也可以，以空来填充不存在的节点， 但会造成空间浪费

链表存储
Left Data Right

#### 2.2.2 二叉树的遍历

先序遍历
>先访根节点，先序遍历左子树， 先序遍历右子树

中序遍历
> 中序遍历左子树，访问根节点， 中序遍历右子树
```
void InOrder(BinTree bt) {
    if (bt) {
        InOrder(bt -> left);
        printf("%d", bt-Data);
        InOrder(bt -> right)
    }
}
```

后序遍历
> 后序遍历左子树，后序遍历右子树，访问根节点

链表存储
Left Data Right

用递归的方法实现。
> 经过节点的路线是一样的，只是访问个各节点数据的时机不一样。


二叉树的非递归遍历
> 使用堆栈

1. 遇到一个节点，就入栈，遍历左子树
2. 左子树遍历结束后，此节点从栈顶出栈并访问
3. 遍历该节点的右子树

```
void inorder(BinTree bt) {
    Node node = bt;
    Stack s = createStack(maxSize);
    while(node || !s.isEmpty()) {
        while(node) {
            s.push(node); // no.1 遇到
            node = node -> left;
        }
        
        if (!s.isEmpty()){
            node = s.pop(); // no.2 遇到
            printf("%d", bt-Data);
            node = node -> left;
        }
    }       
}
```









