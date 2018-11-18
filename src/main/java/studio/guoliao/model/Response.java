package studio.guoliao.model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Response {

    private byte tag;

    private byte length;

    private byte[] buf;

    public Response(byte tag, byte length, byte[] buf) {
        this.tag = tag;
        this.length = length;
        this.buf = buf;
    }

    public byte[] format() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(this.tag);
        return out.toByteArray();
    }

    public byte getTag() {
        return tag;
    }

    public void setTag(byte tag) {
        this.tag = tag;
    }

    public byte getLength() {
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
