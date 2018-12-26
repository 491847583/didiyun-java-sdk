// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/eip.proto

package com.didiyun.compute.v1;

public interface GetEipByUuidResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.GetEipByUuidResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  boolean hasError();
  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  com.didiyun.base.v1.Error getError();
  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  com.didiyun.base.v1.ErrorOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   *eip列表
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.EipInfo data = 2;</code>
   */
  java.util.List<com.didiyun.compute.v1.EipInfo> 
      getDataList();
  /**
   * <pre>
   *eip列表
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.EipInfo data = 2;</code>
   */
  com.didiyun.compute.v1.EipInfo getData(int index);
  /**
   * <pre>
   *eip列表
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.EipInfo data = 2;</code>
   */
  int getDataCount();
  /**
   * <pre>
   *eip列表
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.EipInfo data = 2;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.EipInfoOrBuilder> 
      getDataOrBuilderList();
  /**
   * <pre>
   *eip列表
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.EipInfo data = 2;</code>
   */
  com.didiyun.compute.v1.EipInfoOrBuilder getDataOrBuilder(
      int index);
}
