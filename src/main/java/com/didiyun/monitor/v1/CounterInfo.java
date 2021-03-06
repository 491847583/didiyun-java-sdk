// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: monitor/v1/counter.proto

package com.didiyun.monitor.v1;

/**
 * Protobuf type {@code didi.cloud.monitor.v1.CounterInfo}
 */
public  final class CounterInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.monitor.v1.CounterInfo)
    CounterInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CounterInfo.newBuilder() to construct.
  private CounterInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CounterInfo() {
    dstype_ = "";
    step_ = 0;
    monitorTags_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CounterInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            dstype_ = s;
            break;
          }
          case 16: {

            step_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            monitorTags_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_CounterInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_CounterInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.monitor.v1.CounterInfo.class, com.didiyun.monitor.v1.CounterInfo.Builder.class);
  }

  public static final int DSTYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object dstype_;
  /**
   * <pre>
   *数据类型，"GAUGE"或者"COUNTER"等
   * </pre>
   *
   * <code>string dstype = 1;</code>
   */
  public java.lang.String getDstype() {
    java.lang.Object ref = dstype_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dstype_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *数据类型，"GAUGE"或者"COUNTER"等
   * </pre>
   *
   * <code>string dstype = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDstypeBytes() {
    java.lang.Object ref = dstype_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dstype_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STEP_FIELD_NUMBER = 2;
  private int step_;
  /**
   * <pre>
   *数据步长，单位为秒
   * </pre>
   *
   * <code>int32 step = 2;</code>
   */
  public int getStep() {
    return step_;
  }

  public static final int MONITORTAGS_FIELD_NUMBER = 3;
  private volatile java.lang.Object monitorTags_;
  /**
   * <pre>
   *查询的监控tag名称
   * </pre>
   *
   * <code>string monitorTags = 3;</code>
   */
  public java.lang.String getMonitorTags() {
    java.lang.Object ref = monitorTags_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      monitorTags_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *查询的监控tag名称
   * </pre>
   *
   * <code>string monitorTags = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMonitorTagsBytes() {
    java.lang.Object ref = monitorTags_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      monitorTags_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getDstypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dstype_);
    }
    if (step_ != 0) {
      output.writeInt32(2, step_);
    }
    if (!getMonitorTagsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, monitorTags_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDstypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dstype_);
    }
    if (step_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, step_);
    }
    if (!getMonitorTagsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, monitorTags_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.didiyun.monitor.v1.CounterInfo)) {
      return super.equals(obj);
    }
    com.didiyun.monitor.v1.CounterInfo other = (com.didiyun.monitor.v1.CounterInfo) obj;

    boolean result = true;
    result = result && getDstype()
        .equals(other.getDstype());
    result = result && (getStep()
        == other.getStep());
    result = result && getMonitorTags()
        .equals(other.getMonitorTags());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DSTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDstype().hashCode();
    hash = (37 * hash) + STEP_FIELD_NUMBER;
    hash = (53 * hash) + getStep();
    hash = (37 * hash) + MONITORTAGS_FIELD_NUMBER;
    hash = (53 * hash) + getMonitorTags().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.monitor.v1.CounterInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.monitor.v1.CounterInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.CounterInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.monitor.v1.CounterInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.CounterInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.monitor.v1.CounterInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.CounterInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.monitor.v1.CounterInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.CounterInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.monitor.v1.CounterInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.CounterInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.monitor.v1.CounterInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.didiyun.monitor.v1.CounterInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code didi.cloud.monitor.v1.CounterInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.monitor.v1.CounterInfo)
      com.didiyun.monitor.v1.CounterInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_CounterInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_CounterInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.monitor.v1.CounterInfo.class, com.didiyun.monitor.v1.CounterInfo.Builder.class);
    }

    // Construct using com.didiyun.monitor.v1.CounterInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      dstype_ = "";

      step_ = 0;

      monitorTags_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_CounterInfo_descriptor;
    }

    @java.lang.Override
    public com.didiyun.monitor.v1.CounterInfo getDefaultInstanceForType() {
      return com.didiyun.monitor.v1.CounterInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.monitor.v1.CounterInfo build() {
      com.didiyun.monitor.v1.CounterInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.monitor.v1.CounterInfo buildPartial() {
      com.didiyun.monitor.v1.CounterInfo result = new com.didiyun.monitor.v1.CounterInfo(this);
      result.dstype_ = dstype_;
      result.step_ = step_;
      result.monitorTags_ = monitorTags_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.didiyun.monitor.v1.CounterInfo) {
        return mergeFrom((com.didiyun.monitor.v1.CounterInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.monitor.v1.CounterInfo other) {
      if (other == com.didiyun.monitor.v1.CounterInfo.getDefaultInstance()) return this;
      if (!other.getDstype().isEmpty()) {
        dstype_ = other.dstype_;
        onChanged();
      }
      if (other.getStep() != 0) {
        setStep(other.getStep());
      }
      if (!other.getMonitorTags().isEmpty()) {
        monitorTags_ = other.monitorTags_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.didiyun.monitor.v1.CounterInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.monitor.v1.CounterInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dstype_ = "";
    /**
     * <pre>
     *数据类型，"GAUGE"或者"COUNTER"等
     * </pre>
     *
     * <code>string dstype = 1;</code>
     */
    public java.lang.String getDstype() {
      java.lang.Object ref = dstype_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dstype_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *数据类型，"GAUGE"或者"COUNTER"等
     * </pre>
     *
     * <code>string dstype = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDstypeBytes() {
      java.lang.Object ref = dstype_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dstype_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *数据类型，"GAUGE"或者"COUNTER"等
     * </pre>
     *
     * <code>string dstype = 1;</code>
     */
    public Builder setDstype(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dstype_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *数据类型，"GAUGE"或者"COUNTER"等
     * </pre>
     *
     * <code>string dstype = 1;</code>
     */
    public Builder clearDstype() {
      
      dstype_ = getDefaultInstance().getDstype();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *数据类型，"GAUGE"或者"COUNTER"等
     * </pre>
     *
     * <code>string dstype = 1;</code>
     */
    public Builder setDstypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dstype_ = value;
      onChanged();
      return this;
    }

    private int step_ ;
    /**
     * <pre>
     *数据步长，单位为秒
     * </pre>
     *
     * <code>int32 step = 2;</code>
     */
    public int getStep() {
      return step_;
    }
    /**
     * <pre>
     *数据步长，单位为秒
     * </pre>
     *
     * <code>int32 step = 2;</code>
     */
    public Builder setStep(int value) {
      
      step_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *数据步长，单位为秒
     * </pre>
     *
     * <code>int32 step = 2;</code>
     */
    public Builder clearStep() {
      
      step_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object monitorTags_ = "";
    /**
     * <pre>
     *查询的监控tag名称
     * </pre>
     *
     * <code>string monitorTags = 3;</code>
     */
    public java.lang.String getMonitorTags() {
      java.lang.Object ref = monitorTags_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        monitorTags_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *查询的监控tag名称
     * </pre>
     *
     * <code>string monitorTags = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMonitorTagsBytes() {
      java.lang.Object ref = monitorTags_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        monitorTags_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *查询的监控tag名称
     * </pre>
     *
     * <code>string monitorTags = 3;</code>
     */
    public Builder setMonitorTags(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      monitorTags_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询的监控tag名称
     * </pre>
     *
     * <code>string monitorTags = 3;</code>
     */
    public Builder clearMonitorTags() {
      
      monitorTags_ = getDefaultInstance().getMonitorTags();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询的监控tag名称
     * </pre>
     *
     * <code>string monitorTags = 3;</code>
     */
    public Builder setMonitorTagsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      monitorTags_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:didi.cloud.monitor.v1.CounterInfo)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.monitor.v1.CounterInfo)
  private static final com.didiyun.monitor.v1.CounterInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.monitor.v1.CounterInfo();
  }

  public static com.didiyun.monitor.v1.CounterInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CounterInfo>
      PARSER = new com.google.protobuf.AbstractParser<CounterInfo>() {
    @java.lang.Override
    public CounterInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CounterInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CounterInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CounterInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.monitor.v1.CounterInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

