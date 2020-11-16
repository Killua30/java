import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Note {

    public final List<String> notes = new ArrayList<String>();
    ReadWriteLock lock = new ReentrantReadWriteLock();
    public void addNote(int index, String note) {
        lock.readLock().lock();
        try {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
        } finally {
            lock.readLock().unlock();
        }

        lock.writeLock().lock();
        try {
            notes.add(index, note);
        } finally {
            lock.writeLock().unlock();
        }

        lock.readLock().lock();
        try {
            System.out.println("Уже добавлена заметка [" + note + "]");
        } finally {
            lock.readLock().unlock();
        }
    }

    public void removeNote(int index) {
        lock.readLock().lock();
        try {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
        } finally {
            lock.readLock().unlock();
        }

        String note;

        lock.writeLock().lock();
        try {
            note = notes.remove(index);
        } finally {
            lock.writeLock().unlock();
        }

        lock.readLock().lock();
        try {
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        } finally {
            lock.readLock().unlock();
        }
    }

    public void readNote(int index) {
        lock.readLock().lock();
        try {
            System.out.println("Сейчас будет прочтена заметка с позиции " + index);
        } finally {
            lock.readLock().unlock();
        }
        String note;

        lock.writeLock().lock();
        try {
            note = notes.get(index);
        } finally {
            lock.writeLock().unlock();
        }

        lock.readLock().lock();
        try {
            System.out.println("Прочтена заметка [" + note + "] с позиции " + index);
        } finally {
            lock.readLock().unlock();
        }
    }
}