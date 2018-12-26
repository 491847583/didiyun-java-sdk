// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/common.proto

package com.didiyun.compute.v1;

public interface EbsInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.EbsInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string ebsUuid = 2;</code>
   */
  java.lang.String getEbsUuid();
  /**
   * <code>string ebsUuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getEbsUuidBytes();

  /**
   * <pre>
   *种类（SSD、NVMe）
   * </pre>
   *
   * <code>string type = 3;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   *种类（SSD、NVMe）
   * </pre>
   *
   * <code>string type = 3;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   *属性（数据盘、根盘）
   * </pre>
   *
   * <code>string attr = 4;</code>
   */
  java.lang.String getAttr();
  /**
   * <pre>
   *属性（数据盘、根盘）
   * </pre>
   *
   * <code>string attr = 4;</code>
   */
  com.google.protobuf.ByteString
      getAttrBytes();

  /**
   * <pre>
   *标签
   * </pre>
   *
   * <code>repeated string ebsTags = 5;</code>
   */
  java.util.List<java.lang.String>
      getEbsTagsList();
  /**
   * <pre>
   *标签
   * </pre>
   *
   * <code>repeated string ebsTags = 5;</code>
   */
  int getEbsTagsCount();
  /**
   * <pre>
   *标签
   * </pre>
   *
   * <code>repeated string ebsTags = 5;</code>
   */
  java.lang.String getEbsTags(int index);
  /**
   * <pre>
   *标签
   * </pre>
   *
   * <code>repeated string ebsTags = 5;</code>
   */
  com.google.protobuf.ByteString
      getEbsTagsBytes(int index);

  /**
   * <pre>
   *region信息
   * </pre>
   *
   * <code>.didi.cloud.base.v1.RegionAndZoneInfo region = 6;</code>
   */
  boolean hasRegion();
  /**
   * <pre>
   *region信息
   * </pre>
   *
   * <code>.didi.cloud.base.v1.RegionAndZoneInfo region = 6;</code>
   */
  com.didiyun.base.v1.RegionAndZoneInfo getRegion();
  /**
   * <pre>
   *region信息
   * </pre>
   *
   * <code>.didi.cloud.base.v1.RegionAndZoneInfo region = 6;</code>
   */
  com.didiyun.base.v1.RegionAndZoneInfoOrBuilder getRegionOrBuilder();

  /**
   * <pre>
   *设备名（盘符）
   * </pre>
   *
   * <code>string deviceName = 7;</code>
   */
  java.lang.String getDeviceName();
  /**
   * <pre>
   *设备名（盘符）
   * </pre>
   *
   * <code>string deviceName = 7;</code>
   */
  com.google.protobuf.ByteString
      getDeviceNameBytes();

  /**
   * <pre>
   *创建时间
   * </pre>
   *
   * <code>int64 createTime = 8;</code>
   */
  long getCreateTime();

  /**
   * <pre>
   *更新时间
   * </pre>
   *
   * <code>int64 updateTime = 9;</code>
   */
  long getUpdateTime();

  /**
   * <pre>
   *任务
   * </pre>
   *
   * <code>.didi.cloud.base.v1.JobInfo job = 10;</code>
   */
  boolean hasJob();
  /**
   * <pre>
   *任务
   * </pre>
   *
   * <code>.didi.cloud.base.v1.JobInfo job = 10;</code>
   */
  com.didiyun.base.v1.JobInfo getJob();
  /**
   * <pre>
   *任务
   * </pre>
   *
   * <code>.didi.cloud.base.v1.JobInfo job = 10;</code>
   */
  com.didiyun.base.v1.JobInfoOrBuilder getJobOrBuilder();

  /**
   * <pre>
   *与EBS绑定的DC2信息
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.Dc2Info dc2 = 11;</code>
   */
  boolean hasDc2();
  /**
   * <pre>
   *与EBS绑定的DC2信息
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.Dc2Info dc2 = 11;</code>
   */
  com.didiyun.compute.v1.Dc2Info getDc2();
  /**
   * <pre>
   *与EBS绑定的DC2信息
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.Dc2Info dc2 = 11;</code>
   */
  com.didiyun.compute.v1.Dc2InfoOrBuilder getDc2OrBuilder();
}
