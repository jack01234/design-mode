package com.system.wmli.memory;

import java.nio.ByteBuffer;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/8/22 16:25
 */
public class AccessDirectBuffer {

    public void directAccess(){
        long startTime = System.currentTimeMillis();
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(500);

        for (int i=0;i<10000;i++) {
            for (int j=0;j<99;j++){
                byteBuffer.putInt(j);
            }
            byteBuffer.flip();

            for (int j=0;j<99;j++) {
                byteBuffer.getInt();
            }
            byteBuffer.clear();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("testDirectWrite: "+(endTime-startTime));
    }

    public void bufferAccess(){
        long startTime = System.currentTimeMillis();
        ByteBuffer byteBuffer = ByteBuffer.allocate(500);
        for (int i=0;i<10000;i++) {
            for (int j=0;j<99;j++){
                byteBuffer.putInt(j);
            }
            byteBuffer.flip();

            for (int j=0;j<99;j++) {
                byteBuffer.getInt();
            }
            byteBuffer.clear();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("testWrite: "+(endTime-startTime));
    }

    public static void main(String[] args) {
        AccessDirectBuffer directBuffer = new AccessDirectBuffer();
        directBuffer.bufferAccess();
        directBuffer.directAccess();

        directBuffer.bufferAccess();
        directBuffer.directAccess();
    }
}
