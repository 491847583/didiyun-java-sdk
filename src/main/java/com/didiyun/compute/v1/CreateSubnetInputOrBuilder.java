// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/vpc.proto

package com.didiyun.compute.v1;

public interface CreateSubnetInputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.CreateSubnetInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *子网名称
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   *子网名称
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   *子网网段
   * </pre>
   *
   * <code>string cidr = 2;</code>
   */
  java.lang.String getCidr();
  /**
   * <pre>
   *子网网段
   * </pre>
   *
   * <code>string cidr = 2;</code>
   */
  com.google.protobuf.ByteString
      getCidrBytes();

  /**
   * <pre>
   *子网可用区
   * </pre>
   *
   * <code>string zoneId = 3;</code>
   */
  java.lang.String getZoneId();
  /**
   * <pre>
   *子网可用区
   * </pre>
   *
   * <code>string zoneId = 3;</code>
   */
  com.google.protobuf.ByteString
      getZoneIdBytes();
}
