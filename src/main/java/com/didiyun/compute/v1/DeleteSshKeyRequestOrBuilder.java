// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/dc2.proto

package com.didiyun.compute.v1;

public interface DeleteSshKeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.DeleteSshKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  com.didiyun.base.v1.Header getHeader();
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>string pubKeyUuid = 2;</code>
   */
  java.lang.String getPubKeyUuid();
  /**
   * <code>string pubKeyUuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getPubKeyUuidBytes();
}
