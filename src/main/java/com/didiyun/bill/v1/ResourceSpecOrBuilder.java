// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bill/v1/bill.proto

package com.didiyun.bill.v1;

public interface ResourceSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.bill.v1.ResourceSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.didi.cloud.bill.v1.Dc2Spec dc2Spec = 1;</code>
   */
  boolean hasDc2Spec();
  /**
   * <code>.didi.cloud.bill.v1.Dc2Spec dc2Spec = 1;</code>
   */
  com.didiyun.bill.v1.Dc2Spec getDc2Spec();
  /**
   * <code>.didi.cloud.bill.v1.Dc2Spec dc2Spec = 1;</code>
   */
  com.didiyun.bill.v1.Dc2SpecOrBuilder getDc2SpecOrBuilder();

  /**
   * <code>.didi.cloud.bill.v1.EipSpec eipSpec = 2;</code>
   */
  boolean hasEipSpec();
  /**
   * <code>.didi.cloud.bill.v1.EipSpec eipSpec = 2;</code>
   */
  com.didiyun.bill.v1.EipSpec getEipSpec();
  /**
   * <code>.didi.cloud.bill.v1.EipSpec eipSpec = 2;</code>
   */
  com.didiyun.bill.v1.EipSpecOrBuilder getEipSpecOrBuilder();

  /**
   * <code>.didi.cloud.bill.v1.EbsSpec ebsSpec = 3;</code>
   */
  boolean hasEbsSpec();
  /**
   * <code>.didi.cloud.bill.v1.EbsSpec ebsSpec = 3;</code>
   */
  com.didiyun.bill.v1.EbsSpec getEbsSpec();
  /**
   * <code>.didi.cloud.bill.v1.EbsSpec ebsSpec = 3;</code>
   */
  com.didiyun.bill.v1.EbsSpecOrBuilder getEbsSpecOrBuilder();
}
