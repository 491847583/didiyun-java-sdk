// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/sg.proto

package com.didiyun.compute.v1;

public interface CreateSgRuleInputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.CreateSgRuleInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *SGRule的类型，"Ingress"表示入方向，"Egress"表示出方向
   * </pre>
   *
   * <code>string type = 1;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   *SGRule的类型，"Ingress"表示入方向，"Egress"表示出方向
   * </pre>
   *
   * <code>string type = 1;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   *此SGRule支持的协议
   * </pre>
   *
   * <code>string protocol = 2;</code>
   */
  java.lang.String getProtocol();
  /**
   * <pre>
   *此SGRule支持的协议
   * </pre>
   *
   * <code>string protocol = 2;</code>
   */
  com.google.protobuf.ByteString
      getProtocolBytes();

  /**
   * <pre>
   *此规则允许端口从startPort值开始，需要在0-65535之间
   * </pre>
   *
   * <code>int64 startPort = 3;</code>
   */
  long getStartPort();

  /**
   * <pre>
   *此SGRule的允许端口从endPort结束，当等于startPort时，表示SGRule只对startPort的端口开放，需要在0-65535之间
   * </pre>
   *
   * <code>int64 endPort = 4;</code>
   */
  long getEndPort();

  /**
   * <pre>
   *此规则允许的网段地址，格式如"10.0.0.0/24"
   * </pre>
   *
   * <code>string allowedCidr = 5;</code>
   */
  java.lang.String getAllowedCidr();
  /**
   * <pre>
   *此规则允许的网段地址，格式如"10.0.0.0/24"
   * </pre>
   *
   * <code>string allowedCidr = 5;</code>
   */
  com.google.protobuf.ByteString
      getAllowedCidrBytes();
}
