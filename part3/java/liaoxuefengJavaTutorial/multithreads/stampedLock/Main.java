package multithreads.stampedLock;
/**
 * StampedLock和ReadWriteLock相比，改进之处在于：
 *
 * 读的过程中也允许获取写锁后写入！
 * 这样一来，我们读的数据就可能不一致，
 * 所以，需要一点额外的代码来判断读的过程中是否有写入，这种读锁是一种乐观锁。
 *
 * 乐观锁的意思就是乐观地估计读的过程中大概率不会有写入，因此被称为乐观锁。
 * 反过来，悲观锁则是读的过程中拒绝有写入，也就是写入必须等待。显然乐观锁的并发效率更高，
 * 但一旦有小概率的写入导致读取的数据不一致，需要能检测出来，再读一遍就行。
 *
 * */
public class Main {

}
