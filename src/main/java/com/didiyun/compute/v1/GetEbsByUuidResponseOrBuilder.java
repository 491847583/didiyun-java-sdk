// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/ebs.proto

package com.didiyun.compute.v1;

public interface GetEbsByUuidResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.GetEbsByUuidResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  boolean hasError();
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  com.didiyun.base.v1.Error getError();
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  com.didiyun.base.v1.ErrorOrBuilder getErrorOrBuilder();

  /**
   * <code>repeated .didi.cloud.compute.v1.EbsInfo data = 2;</code>
   */
  java.util.List<com.didiyun.compute.v1.EbsInfo> 
      getDataList();
  /**
   * <code>repeated .didi.cloud.compute.v1.EbsInfo data = 2;</code>
   */
  com.didiyun.compute.v1.EbsInfo getData(int index);
  /**
   * <code>repeated .didi.cloud.compute.v1.EbsInfo data = 2;</code>
   */
  int getDataCount();
  /**
   * <code>repeated .didi.cloud.compute.v1.EbsInfo data = 2;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.EbsInfoOrBuilder> 
      getDataOrBuilderList();
  /**
   * <code>repeated .didi.cloud.compute.v1.EbsInfo data = 2;</code>
   */
  com.didiyun.compute.v1.EbsInfoOrBuilder getDataOrBuilder(
      int index);
}
