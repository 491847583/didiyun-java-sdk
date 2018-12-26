// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/snap.proto

package com.didiyun.compute.v1;

public interface CreateSnapshotRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.CreateSnapshotRequest)
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
   * <pre>
   *根据DC2创建快照，与ebsUuid参数二选一
   * </pre>
   *
   * <code>string dc2Uuid = 2;</code>
   */
  java.lang.String getDc2Uuid();
  /**
   * <pre>
   *根据DC2创建快照，与ebsUuid参数二选一
   * </pre>
   *
   * <code>string dc2Uuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getDc2UuidBytes();

  /**
   * <pre>
   *根据EBS创建快照，与dc2Uuid参数二选一
   * </pre>
   *
   * <code>string ebsUuid = 3;</code>
   */
  java.lang.String getEbsUuid();
  /**
   * <pre>
   *根据EBS创建快照，与dc2Uuid参数二选一
   * </pre>
   *
   * <code>string ebsUuid = 3;</code>
   */
  com.google.protobuf.ByteString
      getEbsUuidBytes();

  /**
   * <pre>
   *快照名称
   * </pre>
   *
   * <code>string snapName = 4;</code>
   */
  java.lang.String getSnapName();
  /**
   * <pre>
   *快照名称
   * </pre>
   *
   * <code>string snapName = 4;</code>
   */
  com.google.protobuf.ByteString
      getSnapNameBytes();
}
