package com.study.netty.basic;

import com.study.utils.Logger;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import org.junit.Test;


public class WriteReadDemo {

    public void print(String action, ByteBuf b) {
        Logger.info("after ===========" + action + "============");
        Logger.info("1.0 isReadable(): " + b.isReadable());
        Logger.info("1.1 readerIndex(): " + b.readerIndex());
        Logger.info("1.2 readableBytes(): " + b.readableBytes());
        Logger.info("2.0 isWritable(): " + b.isWritable());
        Logger.info("2.1 writerIndex(): " + b.writerIndex());
        Logger.info("2.2 writableBytes(): " + b.writableBytes());
        Logger.info("3.0 capacity(): " + b.capacity());
        Logger.info("3.1 maxCapacity(): " + b.maxCapacity());
        Logger.info("3.2 maxWritableBytes(): " + b.maxWritableBytes());
    }

    @Test
    public void testWriteRead() {
        ByteBuf buffer = ByteBufAllocator.DEFAULT.buffer();
        print("动作：分配 ByteBuf", buffer);
        buffer.writeBytes(new byte[]{1, 2, 3, 4});
        print("动作：写入4个字节 (1,2,3,4)", buffer);
        Logger.info("start==========:get==========");
        getByteBuf(buffer);
        print("动作：取数据 ByteBuf", buffer);
        Logger.info("start==========:read==========");
        readByteBuf(buffer);
        print("动作：读完 ByteBuf", buffer);
    }

    //读取一个字节
    private void readByteBuf(ByteBuf buffer) {
        while (buffer.isReadable()) {
            Logger.info("读取一个字节:" + buffer.readByte());
        }
    }


    //读取一个字节，不改变指针
    private void getByteBuf(ByteBuf buffer) {
        for (int i = 0; i < buffer.readableBytes(); i++) {
            Logger.info("读取一个字节:" + buffer.getByte(i));
        }
    }

}
