package alex_pr;


public class CustomStringBuilder  {

    private StringBuilder stringBuilder;
    private Snapshot snapshot;

    public  CustomStringBuilder() {
        this.stringBuilder = new StringBuilder() ;
        this.snapshot = new Snapshot(stringBuilder);
        snapshot.save(stringBuilder);
    }

    private void autoSave() {
        snapshot.save(stringBuilder);
    }

    public void undo() {
        StringBuilder previousState = snapshot.undo();
        stringBuilder = new StringBuilder(previousState);

    }



    public CustomStringBuilder append(String str) {
        stringBuilder.append(str);
        autoSave();
        return this;
    }

    public CustomStringBuilder append(boolean b) {
        stringBuilder.append(b);
        return this;
    }

    public CustomStringBuilder append(char c) {
        stringBuilder.append(c);
        return this;
    }

    public CustomStringBuilder append(char[] str) {
        stringBuilder.append(str);
        return this;
    }

    public CustomStringBuilder append(char[] str, int offset, int len) {
        stringBuilder.append(str, offset, len);
        return this;
    }

    public CustomStringBuilder append(double d) {
        stringBuilder.append(d);
        return this;
    }

    public CustomStringBuilder append(float f) {
        stringBuilder.append(f);
        return this;
    }

    public CustomStringBuilder append(int i) {
        stringBuilder.append(i);
        return this;
    }

    public CustomStringBuilder append(long lng) {
        stringBuilder.append(lng);
        return this;
    }

    public CustomStringBuilder append(Object obj) {
        stringBuilder.append(obj);
        return this;
    }



    public CustomStringBuilder append(StringBuffer sb) {
        stringBuilder.append(sb);
        return this;
    }

    public CustomStringBuilder append(CharSequence s) {
        stringBuilder.append(s);
        return this;
    }

    public CustomStringBuilder append(CharSequence s, int start, int end) {
        stringBuilder.append(s, start, end);
        return this;
    }

    public CustomStringBuilder appendCodePoint(int codePoint) {
        stringBuilder.appendCodePoint(codePoint);
        return this;
    }

    // Прокси-методы для insert
    public CustomStringBuilder insert(int offset, boolean b) {
        stringBuilder.insert(offset, b);
        return this;
    }

    public CustomStringBuilder insert(int offset, char c) {
        stringBuilder.insert(offset, c);
        return this;
    }

    public CustomStringBuilder insert(int offset, char[] str) {
        stringBuilder.insert(offset, str);
        return this;
    }

    public CustomStringBuilder insert(int offset, char[] str, int str_offset, int len) {
        stringBuilder.insert(offset, str, str_offset, len);
        return this;
    }

    public CustomStringBuilder insert(int offset, double d) {
        stringBuilder.insert(offset, d);
        return this;
    }

    public CustomStringBuilder insert(int offset, float f) {
        stringBuilder.insert(offset, f);
        return this;
    }

    public CustomStringBuilder insert(int offset, int i) {
        stringBuilder.insert(offset, i);
        return this;
    }

    public CustomStringBuilder insert(int offset, long l) {
        stringBuilder.insert(offset, l);
        return this;
    }

    public CustomStringBuilder insert(int offset, Object obj) {
        stringBuilder.insert(offset, obj);
        return this;
    }

    public CustomStringBuilder insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        return this;
    }

    public CustomStringBuilder insert(int offset, CharSequence s) {
        stringBuilder.insert(offset, s);
        return this;
    }

    public CustomStringBuilder insert(int offset, CharSequence s, int start, int end) {
        stringBuilder.insert(offset, s, start, end);
        return this;
    }

    public CustomStringBuilder replace(int start, int end, String str) {
        stringBuilder.replace(start, end, str);
        return this;
    }

    public CustomStringBuilder delete(int start, int end) {
        stringBuilder.delete(start, end);
        return this;
    }

    public CustomStringBuilder deleteCharAt(int index) {
        stringBuilder.deleteCharAt(index);
        return this;
    }

    public CustomStringBuilder reverse() {
        stringBuilder.reverse();
        return this;
    }

    public int capacity() {
        return stringBuilder.capacity();
    }

    public CustomStringBuilder ensureCapacity(int minimumCapacity) {
        stringBuilder.ensureCapacity(minimumCapacity);
        return this;
    }

    public void setLength(int newLength) {
        stringBuilder.setLength(newLength);
    }

    public int length() {
        return stringBuilder.length();
    }

    public String substring(int start) {
        return stringBuilder.substring(start);
    }

    public String substring(int start, int end) {
        return stringBuilder.substring(start, end);
    }

    public char charAt(int index) {
        return stringBuilder.charAt(index);
    }

    public int codePointAt(int index) {
        return stringBuilder.codePointAt(index);
    }

    public int codePointBefore(int index) {
        return stringBuilder.codePointBefore(index);
    }

    public int codePointCount(int beginIndex, int endIndex) {
        return stringBuilder.codePointCount(beginIndex, endIndex);
    }

    public CustomStringBuilder trimToSize() {
        stringBuilder.trimToSize();
        return this;
    }

    public int indexOf(String str) {
        return stringBuilder.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return stringBuilder.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return stringBuilder.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return stringBuilder.lastIndexOf(str, fromIndex);
    }

    public CustomStringBuilder setCharAt(int index, char ch) {
        stringBuilder.setCharAt(index, ch);
        return this;
    }

    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        stringBuilder.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
