// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/sg.proto

package com.didiyun.compute.v1;

public interface ListSgRuleConditionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.ListSgRuleCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *查看此SG下的SGRule列表
   * </pre>
   *
   * <code>string sgUuid = 1;</code>
   */
  java.lang.String getSgUuid();
  /**
   * <pre>
   *查看此SG下的SGRule列表
   * </pre>
   *
   * <code>string sgUuid = 1;</code>
   */
  com.google.protobuf.ByteString
      getSgUuidBytes();

  /**
   * <pre>
   *查看此DC2遵循的SGRule列表
   * </pre>
   *
   * <code>string dc2Uuid = 2;</code>
   */
  java.lang.String getDc2Uuid();
  /**
   * <pre>
   *查看此DC2遵循的SGRule列表
   * </pre>
   *
   * <code>string dc2Uuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getDc2UuidBytes();

  /**
   * <pre>
   *要查询的SGRule类型，"Ingress"为入方向，"Egress"为出方向
   * </pre>
   *
   * <code>string type = 3;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   *要查询的SGRule类型，"Ingress"为入方向，"Egress"为出方向
   * </pre>
   *
   * <code>string type = 3;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();
}
