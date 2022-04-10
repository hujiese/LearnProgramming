package com.study.netty.basic;

import com.study.utils.Logger;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import org.junit.Test;

public class SliceDemo {
    @Test
    public  void testSlice() {
        ByteBuf buffer = ByteBufAllocator.DEFAULT.buffer(9, 100);
        print("动作：分配 ByteBuf(9, 100)", buffer);
        buffer.writeBytes(new byte[]{1, 2, 3, 4});
        print("动作：写入4个字节 (1,2,3,4)", buffer);
        ByteBuf slice = buffer.slice();
        print("动作：切片 slice", slice);
    }

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

}