package studio.guoliao.model;

import java.io.IOException;
import java.io.InputStream;

public class Request {

    private byte tag;

    private byte length;

    private byte[] buf;

    public Request(byte tag, byte length, byte[] buf) {
        this.tag = tag;
        this.length = length;
        this.buf = buf;
    }

    public static Request read(InputStream in) throws IOException {
        int tag = in.read();
        return new Request((byte)tag, (byte)0, null);
    }

    public byte getTag() {
        return tag;
    }

    public void setTag(byte tag) {
        this.tag = tag;
    }

    public int getLength() {
        return length;
    }

    public void setLength(byte length) {
        this.length = length;
    }

    public byte[] getBuf() {
        return buf;
    }

    public void setBuf(byte[] buf) {
        this.buf = buf;
    }
}
